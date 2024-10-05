package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProdutoTest {

    @Test
    public void testGettersAndSetters() {
        Caracteristica caract = new Caracteristica("Marca1", "Nome1", "Departamento1");
        Produto produto = new Produto("123456", caract);

        assertEquals("123456", produto.getCodigoBarra());
        assertEquals(caract, produto.getCaract());

        Caracteristica novaCaract = new Caracteristica("Marca2", "Nome2", "Departamento2");
        produto.setCodigoBarra("654321");
        produto.setCaract(novaCaract);

        assertEquals("654321", produto.getCodigoBarra());
        assertEquals(novaCaract, produto.getCaract());
    }
}
