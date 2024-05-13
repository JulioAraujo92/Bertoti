package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstoqueTest {

    private Estoque estoque;
    private Produto produto1;
    private Produto produto2;

    @BeforeEach
    public void setUp() {
        List<Produto> produtos = new LinkedList<>();
        produto1 = new Produto("123456", new Caracteristica("Marca1", "Nome1", "Departamento1"));
        produto2 = new Produto("654321", new Caracteristica("Marca2", "Nome2", "Departamento2"));
        produtos.add(produto1);
        produtos.add(produto2);
        estoque = new Estoque(produtos);
    }

    @Test
    public void testCadastrarProduto() {
        Produto novoProduto = new Produto("789012", new Caracteristica("Marca3", "Nome3", "Departamento3"));
        estoque.cadastrarProduto(novoProduto);
        assertEquals(3, estoque.getProdutos().size());
        assertTrue(estoque.getProdutos().contains(novoProduto));
    }

    @Test
    public void testBuscarProdutoPorCaracteristica() {
        Caracteristica caract = new Caracteristica("Marca1", "Nome1", "Departamento1");
        List<Produto> produtosEncontrados = estoque.buscarProdutoPorCaracteristica(caract);
        assertEquals(1, produtosEncontrados.size());
        assertTrue(produtosEncontrados.contains(produto1));
    }

    @Test
    public void testBuscarProdutoPorCodigo() {
        Produto produtoEncontrado = estoque.buscarProdutoPorCodigo("123456");
        assertEquals(produto1, produtoEncontrado);

        produtoEncontrado = estoque.buscarProdutoPorCodigo("111111");
        assertNull(produtoEncontrado);
    }
}
