/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.exemplogoogleguice.linkedbindings.dao;

/**
 *
 * @author romulo
 */
public class CalculaDaoImpl implements CalculaDao {

    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double dividir(double a, double b) {
        return a / b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

}
