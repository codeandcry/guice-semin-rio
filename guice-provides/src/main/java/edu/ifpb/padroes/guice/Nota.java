/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.padroes.guice;

/**
 *
 * @author lyndemberg
 */
public class Nota {
    private int id;
    private String titulo;
    private String descricao;

    public Nota() {
    }

    public int getId() {
        return id;
    }

    public Nota(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Nota{" + "id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + '}';
    }
    
}
