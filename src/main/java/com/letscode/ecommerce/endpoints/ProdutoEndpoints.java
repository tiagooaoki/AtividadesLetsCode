package com.letscode.ecommerce.endpoints;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.letscode.ecommerce.models.Produto;
import com.letscode.ecommerce.rest.RestClient;
import com.letscode.ecommerce.services.ProdutoService;

@RestController
public class ProdutoEndpoints {

    @Autowired
    ProdutoService produtoService;

    @Autowired
    RestClient rest;

    @RequestMapping(path="/produtos", method = RequestMethod.GET,
    produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getAllCategories() {
        return ResponseEntity.ok(rest.findAll());
    }

    // CRUD produto
    @RequestMapping(path = "/produto", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Produto>> getAllProducts() {
        List<Produto> productList = produtoService.listarTodosProdutos();

        return ResponseEntity.ok(productList);
    }

    @RequestMapping(path = "/produto/{id}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Produto>> getProductById(@PathVariable long id) {
        Optional<Produto> productList = produtoService.buscarProdutoPorID(id);

        return ResponseEntity.ok(productList);
    }

    @RequestMapping(path = "/produto", method = RequestMethod.POST)
    public ResponseEntity<Produto> cadastraProduto(@RequestBody Produto _produto) {
        boolean sucesso = produtoService.novoProduto(_produto);

        if (sucesso) {
            return new ResponseEntity("Produto criado com sucesso!", HttpStatus.CREATED);
        } else {
            return new ResponseEntity("Criacao do produto falhou!", HttpStatus.BAD_REQUEST);
        }
    }

   

    @RequestMapping(path = "/produto", method = RequestMethod.PUT)
    public ResponseEntity<Produto> atualizarCliente(@RequestBody Produto produto) {
        boolean sucesso = produtoService.atualizarProduto(produto);

        if (sucesso) {
            return new ResponseEntity("Produto atualizado com sucesso!", HttpStatus.CREATED);
        } else {
            return new ResponseEntity("Atualizacao do produto falhou!", HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(path = "/produto/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Produto> removerCliente(@PathVariable long id) {
        boolean sucesso = produtoService.removerProduto(id);

        if (sucesso) {
            return new ResponseEntity("Produto deletado com sucesso!", HttpStatus.OK);
        } else {
            return new ResponseEntity("Remocao do produto falhou!", HttpStatus.BAD_REQUEST);
        }
    }
}
