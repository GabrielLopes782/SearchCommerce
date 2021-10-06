/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Menin
 */
public class CategoriaVO {
private int idCategoria;
private String NomeCategoria;

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return NomeCategoria;
    }

    public void setNomeCategoria(String NomeCategoria) {
        this.NomeCategoria = NomeCategoria;
    }

    public CategoriaVO(int idCategoria, String NomeCategoria) {
        this.idCategoria = idCategoria;
        this.NomeCategoria = NomeCategoria;
    }

    @Override
    public String toString() {
        return "CategoriaVO{" + "idCategoria=" + idCategoria + ", NomeCategoria=" + NomeCategoria + '}';
    }

}
