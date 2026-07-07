package com.shimano.guilherme.controller;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.shimano.guilherme.model.Partida;
import com.shimano.guilherme.repository.PartidaRepository;

@SpringBootTest
@AutoConfigureMockMvc
class PartidaControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PartidaRepository partidaRepository;

    @BeforeEach
    void limparBanco() {
        partidaRepository.deleteAll();
    }

    @Test
    void deveCriarPartidaComDadosValidos() throws Exception {
        mockMvc.perform(post("/partidas")
                        .param("nomeJogadorX", "Ana")
                        .param("nomeJogadorO", "Bruno"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.jogadorX.nome").value("Ana"))
                .andExpect(jsonPath("$.jogadorX.simbolo").value("X"))
                .andExpect(jsonPath("$.jogadorO.nome").value("Bruno"))
                .andExpect(jsonPath("$.jogadorO.simbolo").value("O"))
                .andExpect(jsonPath("$.turnoAtual").value("X"))
                .andExpect(jsonPath("$.status").value("EM_ANDAMENTO"));
    }

    @Test
    void deveRejeitarNomeVazio() throws Exception {
        mockMvc.perform(post("/partidas")
                        .param("nomeJogadorX", " ")
                        .param("nomeJogadorO", "Bruno"))
                .andExpect(status().isBadRequest());
    }

    @Test
    void primeiraJogadaDeveSerRealizadaPorX() throws Exception {
        long id = criarPartida();

        mockMvc.perform(post("/partidas/{id}/jogadas", id)
                        .param("simbolo", "X")
                        .param("linha", "0")
                        .param("coluna", "0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.tabuleiro[0][0]").value("X"))
                .andExpect(jsonPath("$.turnoAtual").value("O"));
    }

    @Test
    void deveAlternarCorretamenteOsTurnos() throws Exception {
        long id = criarPartida();
        jogar(id, "X", 0, 0);

        mockMvc.perform(post("/partidas/{id}/jogadas", id)
                        .param("simbolo", "O")
                        .param("linha", "1")
                        .param("coluna", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.turnoAtual").value("X"));
    }

    @Test
    void deveRejeitarLinhaOuColunaInvalida() throws Exception {
        long id = criarPartida();

        mockMvc.perform(post("/partidas/{id}/jogadas", id)
                        .param("simbolo", "X")
                        .param("linha", "3")
                        .param("coluna", "0"))
                .andExpect(status().isBadRequest());
    }

    @Test
    void deveRejeitarPosicaoOcupada() throws Exception {
        long id = criarPartida();
        jogar(id, "X", 0, 0);

        mockMvc.perform(post("/partidas/{id}/jogadas", id)
                        .param("simbolo", "O")
                        .param("linha", "0")
                        .param("coluna", "0"))
                .andExpect(status().isConflict());
    }

    @Test
    void deveRejeitarJogadaForaDoTurno() throws Exception {
        long id = criarPartida();

        mockMvc.perform(post("/partidas/{id}/jogadas", id)
                        .param("simbolo", "O")
                        .param("linha", "0")
                        .param("coluna", "0"))
                .andExpect(status().isConflict());
    }

    @Test
    void deveReconhecerVitoriaEmLinha() throws Exception {
        long id = criarPartida();
        jogar(id, "X", 0, 0);
        jogar(id, "O", 1, 0);
        jogar(id, "X", 0, 1);
        jogar(id, "O", 1, 1);

        mockMvc.perform(post("/partidas/{id}/jogadas", id)
                        .param("simbolo", "X")
                        .param("linha", "0")
                        .param("coluna", "2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("VITORIA"));
    }

    @Test
    void deveReconhecerVitoriaEmColuna() throws Exception {
        long id = criarPartida();
        jogar(id, "X", 0, 0);
        jogar(id, "O", 0, 1);
        jogar(id, "X", 1, 0);
        jogar(id, "O", 1, 1);

        mockMvc.perform(post("/partidas/{id}/jogadas", id)
                        .param("simbolo", "X")
                        .param("linha", "2")
                        .param("coluna", "0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("VITORIA"));
    }

    @Test
    void deveReconhecerVitoriaNaDiagonalPrincipal() throws Exception {
        long id = criarPartida();
        jogar(id, "X", 0, 0);
        jogar(id, "O", 0, 1);
        jogar(id, "X", 1, 1);
        jogar(id, "O", 0, 2);

        mockMvc.perform(post("/partidas/{id}/jogadas", id)
                        .param("simbolo", "X")
                        .param("linha", "2")
                        .param("coluna", "2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("VITORIA"));
    }

    @Test
    void deveReconhecerVitoriaNaDiagonalSecundaria() throws Exception {
        long id = criarPartida();
        jogar(id, "X", 0, 2);
        jogar(id, "O", 0, 0);
        jogar(id, "X", 1, 1);
        jogar(id, "O", 1, 0);

        mockMvc.perform(post("/partidas/{id}/jogadas", id)
                        .param("simbolo", "X")
                        .param("linha", "2")
                        .param("coluna", "0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("VITORIA"));
    }

    @Test
    void deveReconhecerEmpate() throws Exception {
        long id = criarPartida();
        jogar(id, "X", 0, 0);
        jogar(id, "O", 0, 1);
        jogar(id, "X", 0, 2);
        jogar(id, "O", 1, 1);
        jogar(id, "X", 1, 0);
        jogar(id, "O", 1, 2);
        jogar(id, "X", 2, 1);
        jogar(id, "O", 2, 0);

        mockMvc.perform(post("/partidas/{id}/jogadas", id)
                        .param("simbolo", "X")
                        .param("linha", "2")
                        .param("coluna", "2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("EMPATE"));
    }

    @Test
    void deveRejeitarJogadaAposEncerramento() throws Exception {
        long id = criarPartida();
        jogar(id, "X", 0, 0);
        jogar(id, "O", 1, 0);
        jogar(id, "X", 0, 1);
        jogar(id, "O", 1, 1);
        jogar(id, "X", 0, 2);

        mockMvc.perform(post("/partidas/{id}/jogadas", id)
                        .param("simbolo", "O")
                        .param("linha", "2")
                        .param("coluna", "2"))
                .andExpect(status().isConflict());
    }

    @Test
    void deveRetornarNotFoundAoConsultarPartidaInexistente() throws Exception {
        mockMvc.perform(get("/partidas/{id}", 9999))
                .andExpect(status().isNotFound());
    }

    @Test
    void deveListarTodasAsPartidas() throws Exception {
        criarPartida();
        criarPartida();

        mockMvc.perform(get("/partidas"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)));
    }

    @Test
    void deveExcluirPartida() throws Exception {
        long id = criarPartida();

        mockMvc.perform(delete("/partidas/{id}", id))
                .andExpect(status().isNoContent());

        mockMvc.perform(get("/partidas/{id}", id))
                .andExpect(status().isNotFound());
    }

    private long criarPartida() throws Exception {
        mockMvc.perform(post("/partidas")
                        .param("nomeJogadorX", "Ana")
                        .param("nomeJogadorO", "Bruno"))
                .andExpect(status().isCreated());

        List<Partida> partidas = partidaRepository.findAll();
        return partidas.get(partidas.size() - 1).getId();
    }

    private void jogar(long id, String simbolo, int linha, int coluna) throws Exception {
        mockMvc.perform(post("/partidas/{id}/jogadas", id)
                        .param("simbolo", simbolo)
                        .param("linha", String.valueOf(linha))
                        .param("coluna", String.valueOf(coluna)))
                .andExpect(status().isOk());
    }
}
