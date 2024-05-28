package ControleFluxo;

public class ParametrosInvalidosException extends RuntimeException {
        ParametrosInvalidosException() {
          super("O segundo parametro deve ser maior que o primeiro.");
        }
      }