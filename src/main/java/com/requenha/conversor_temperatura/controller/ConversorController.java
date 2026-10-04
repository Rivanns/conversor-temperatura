package com.requenha.conversor_temperatura.controller;

import com.requenha.conversor_temperatura.dto.ConversorRequisicao;
import com.requenha.conversor_temperatura.dto.ConversorResposta;
import com.requenha.conversor_temperatura.service.ConversorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    private final ConversorService conversorService;

    public ConversorController(ConversorService conversorService) {
        this.conversorService = conversorService;

    }

    @PostMapping("/converter")
    public ConversorResposta converter(@RequestBody ConversorRequisicao conversorRequisicao){
        double ValorConvertido = conversorService.Converter(
                conversorRequisicao.getTemperatura(),
                conversorRequisicao.getDe(),
                conversorRequisicao.getPara()
        );

        String textoUnidade = "Desconhecido";
        if(conversorRequisicao.getPara() == 1)
            textoUnidade = "Celcius";
        else if (conversorRequisicao.getPara() == 2)
            textoUnidade = "Fahrenheit";
        else if (conversorRequisicao.getPara() == 3)
            textoUnidade = "Kelvin";

        return new ConversorResposta(textoUnidade, ValorConvertido);

    }

}
