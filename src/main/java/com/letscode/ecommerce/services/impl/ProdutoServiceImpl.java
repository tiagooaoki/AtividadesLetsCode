package com.letscode.ecommerce.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letscode.ecommerce.dao.ProdutoDao;
import com.letscode.ecommerce.models.Produto;
import com.letscode.ecommerce.services.ProdutoService;


@Service
public class ProdutoServiceImpl implements ProdutoService {
    @Autowired
    ProdutoDao produtoDao;

    @Override
    public List<Produto> listarTodosProdutos() {
        return produtoDao.findAll();
    }

    @Override
    public Optional<Produto> buscarProdutoPorID(long id) {
        
        return produtoDao.findById(id);
    }

    @Override
    public boolean novoProduto(Produto _produto) {
        try{
            // Produto produto = new Produto(_produto.getNome(), _produto.getPreco(), _produto.getDescricao());
            // System.out.println(produto);
            produtoDao.save(_produto);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizarProduto(Produto produto) {
        try{
            produtoDao.save(produto);
        return true;
        } catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean removerProduto(long id) {
       try{
        produtoDao.deleteById(id);
        return true;
       } catch(Exception e){
        return false;
       }
    }
}
