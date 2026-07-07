package com.shimano.guilherme.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErroResposta> tratarDadosInvalidos(IllegalArgumentException exception) {
        ErroResposta erro = new ErroResposta(400, "Requisição inválida", exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }

    @ExceptionHandler(JogadaInvalidaException.class)
    public ResponseEntity<ErroResposta> tratarJogadaInvalida(JogadaInvalidaException exception) {
        ErroResposta erro = new ErroResposta(409, "Conflito", exception.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
    }

    @ExceptionHandler(PartidaEncerradaException.class)
    public ResponseEntity<ErroResposta> tratarPartidaEncerrada(PartidaEncerradaException exception) {
        ErroResposta erro = new ErroResposta(409, "Conflito", exception.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
    }

    @ExceptionHandler(PartidaNaoEncontradaException.class)
    public ResponseEntity<ErroResposta> tratarPartidaNaoEncontrada(PartidaNaoEncontradaException exception) {
        ErroResposta erro = new ErroResposta(404, "Não encontrado", exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<ErroResposta> tratarParametroAusente(MissingServletRequestParameterException exception) {
        ErroResposta erro = new ErroResposta(400, "Requisição inválida", "Parâmetro obrigatório não informado");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ErroResposta> tratarParametroInvalido(MethodArgumentTypeMismatchException exception) {
        ErroResposta erro = new ErroResposta(400, "Requisição inválida", "Parâmetro informado é inválido");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }
}
