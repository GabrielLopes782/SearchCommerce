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
public class CPVO {
   private int idCompra, idProd,qtd;

    public CPVO(int idCompra, int idProd, int qtd) {
        this.idCompra = idCompra;
        this.idProd = idProd;
        this.qtd = qtd;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "CPVO{" + "idCompra=" + idCompra + ", idProd=" + idProd + ", qtd=" + qtd + '}';
    }
   
}
