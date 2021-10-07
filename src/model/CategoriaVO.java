/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Menin
 */
public class CategoriaVO {
    private int idCategoria;
    private String NomeCategoria;

    private ArrayList <CategoriaVO> categorias = new ArrayList<>();
    
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

    public ArrayList<CategoriaVO> getCategorias() {
        return categorias;
    }
    
    public void setCategorias (ArrayList<CategoriaVO> categorias) {
        this.categorias = categorias;
    }

    public void addCategorias(CategoriaVO categorias) {
        this.categorias.add(categorias);
    }

    public CategoriaVO(int idCategoria, String NomeCategoria) {
        this.idCategoria = idCategoria;
        this.NomeCategoria = NomeCategoria;
    }

    public CategoriaVO() {
    }

    @Override
    public String toString() {
        return "CategoriaVO{" + "idCategoria=" + idCategoria + ", NomeCategoria=" + NomeCategoria + '}';
    }

}
