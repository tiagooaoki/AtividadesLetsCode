package com.letscode.ecommerce.services;

import java.util.List;
import java.util.Optional;

import com.letscode.ecommerce.models.Produto;

public interface ProdutoService {
    List<Produto> listarTodosProdutos();

    Optional<Produto> buscarProdutoPorID(long id);

    boolean novoProduto(Produto produto);

    boolean atualizarProduto(Produto produto);

    boolean removerProduto(long id);
}
