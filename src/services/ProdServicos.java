/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DAOFactory;
import dao.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ProdutoVO;

/**
 *
 * @author Menin
 */
public class ProdServicos {
    private static ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
    
    public void CadastrarProdutos(ProdutoVO pVO) throws SQLException{
        pDAO.cadastrarProduto(pVO);
    
}
    public ArrayList<ProdutoVO> buscarProduto() throws SQLException{
        return pDAO.buscarProdutos();
              
    }
    public void deletarProduto(int idProduto) throws SQLException{
        pDAO.DeletarProdutos(idProduto);
        
    }
    public void alterarProduto(ProdutoVO pVO) throws SQLException{
        pDAO.alterarProduto(pVO);
    }
    
    public ArrayList<ProdutoVO> filtrarProdutoNome(String nome) throws SQLException{
        return pDAO.filtraProdutoNome(nome);
    }
    
    public ArrayList<ProdutoVO> filtrarProdutoCB(int idCategoria) throws SQLException{
        return pDAO.filtraProdutoCB(idCategoria);
    }
    
    public ArrayList<ProdutoVO> filtrarProdutoNomeCB(String nome, int idCategoria) throws SQLException{
        return pDAO.filtraProdutoNomeCB(nome, idCategoria);
    }
}
