/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Menin
 */
public class CompraVO {

    private int id_compra, parcelas, tb_cliente_id;
    private Date data;
    private float precoTotal;

    public CompraVO(int id_compra, int parcelas, int tb_cliente_id, Date data, float precoTotal) {
        this.id_compra = id_compra;
        this.parcelas = parcelas;
        this.tb_cliente_id = tb_cliente_id;
        this.data = data;
        this.precoTotal = precoTotal;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public int getTb_cliente_id() {
        return tb_cliente_id;
    }

    public void setTb_cliente_id(int tb_cliente_id) {
        this.tb_cliente_id = tb_cliente_id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    @Override
    public String toString() {
        return "CompraVO{" + "id_compra=" + id_compra + ", parcelas=" + parcelas + ", tb_cliente_id=" + tb_cliente_id + ", data=" + data + ", precoTotal=" + precoTotal + '}';
    }

}
