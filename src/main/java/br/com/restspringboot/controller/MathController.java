package br.com.restspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.restspringboot.Greeting;
import br.com.restspringboot.exception.UnsupportedMathOperationException;

@RestController
public class MathController {

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Greeting greeting(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
            throws Exception {
        if (!Calc.isNumeric(numberOne) || !Calc.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Não é suportado operações com caracteres não numéricos");
        }
        Double sum = Calc.sum(numberOne, numberTwo);
        return new Greeting(1, sum);
    }
}
