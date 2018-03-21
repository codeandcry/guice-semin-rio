/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.exemplogoogleguice.linkedbindings.controlador;

import com.google.inject.Inject;
import com.ifpb.exemplogoogleguice.linkedbindings.service.CalculaService;
import java.util.List;

/**
 *
 * @author romulo
 */
public class CalculaController {

    private final CalculaService calculaService;

    @Inject
    public CalculaController(CalculaService calculaService) {
        this.calculaService = calculaService;
    }

    public double somar(double a, double b){
        return calculaService.getDao().somar(a, b);
    }

    public double subtrair(double a, double b){
        return calculaService.getDao().subtrair(a, b);
    }

    public double dividir(double a, double b){
        return calculaService.getDao().dividir(a, b);
    }

    public double multiplicar(double a, double b){
        return calculaService.getDao().multiplicar(a, b);
    }

}
