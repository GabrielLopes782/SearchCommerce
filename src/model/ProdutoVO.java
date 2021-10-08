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
public class ProdutoVO {

    private int idProduto;
    private float preco;
    private String nomeProduto;
    private String caracteristicas;
    private String nomeCategoria;
    private int idCategoria;

    private ArrayList<ProdutoVO> produtos = new ArrayList<>();

    public ProdutoVO() {
    }

    public ProdutoVO(int idProduto, float preco, String nomeProduto, String caracteristicas, String nomeCategoria, int idCategoria) {
        this.idProduto = idProduto;
        this.preco = preco;
        this.nomeProduto = nomeProduto;
        this.caracteristicas = caracteristicas;
        this.nomeCategoria = nomeCategoria;
        this.idCategoria = idCategoria;
    }
    
    

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public ArrayList<ProdutoVO> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<ProdutoVO> produtos) {
        this.produtos = produtos;
    }

    public void addProdutos(ProdutoVO produtos) {
        this.produtos.add(produtos);
    }

    @Override
    public String toString() {
        return "ProdutoVO{" + "idProduto=" + idProduto + ", preco=" + preco + ", nomeProduto=" + nomeProduto + ", caracteristicas=" + caracteristicas + ", nomeCategoria=" + nomeCategoria + ", idCategoria=" + idCategoria + '}';
    }

}
