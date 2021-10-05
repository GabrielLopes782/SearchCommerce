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
            
    public void CadastrarProdutos(ProdutoVO pVO) throws SQLException{
        ProdutoDAO pDAO=DAOFactory.getProdutoDAO();
        pDAO.cadastrarProduto(pVO);
    
}
    public ArrayList<ProdutoVO> buscarProduto() throws SQLException{
        ProdutoDAO pDAO= DAOFactory.getProdutoDAO();
        return pDAO.buscarProdutos();
              
    }
    public void deletarProduto(int idProduto) throws SQLException{
        ProdutoDAO pdao=DAOFactory.getProdutoDAO();
        pdao.DeletarProdutos(idProduto);
        
    }
    public void alterarProduto(ProdutoVO pVO) throws SQLException{
        ProdutoDAO pdao=DAOFactory.getProdutoDAO();
        pdao.alterarProduto(pVO);
    }
}
