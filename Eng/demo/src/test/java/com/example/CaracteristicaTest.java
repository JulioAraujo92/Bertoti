package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CaracteristicaTest {

    @Test
    public void testGettersAndSetters() {
        Caracteristica caract = new Caracteristica("Marca1", "Nome1", "Departamento1");

        assertEquals("Marca1", caract.getMarca());
        assertEquals("Nome1", caract.getNome());
        assertEquals("Departamento1", caract.getDepartamento());

        caract.setMarca("NovaMarca");
        caract.setNome("NovoNome");
        caract.setDepartamento("NovoDepartamento");

        assertEquals("NovaMarca", caract.getMarca());
        assertEquals("NovoNome", caract.getNome());
        assertEquals("NovoDepartamento", caract.getDepartamento());
    }

    @Test
    public void testComparar() {
        Caracteristica caract1 = new Caracteristica("Marca1", "Nome1", "Departamento1");
        Caracteristica caract2 = new Caracteristica("Marca1", "Nome1", "Departamento1");
        Caracteristica caract3 = new Caracteristica("Marca2", "Nome2", "Departamento2");

        assertTrue(caract1.comparar(caract2));
        assertFalse(caract1.comparar(caract3));
    }
}
