/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.intervalos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Seven
 */
public class ObtenerCategoriaTest {

    @Test
    public void testObtenerCategoria() {
        assertEquals("Intervalo A", ObtenerCategoria.ObtenerCategoria(-10)); // Debe retornar Intervalo A
        assertEquals("Intervalo B", ObtenerCategoria.ObtenerCategoria(0));   // Debe retornar Intervalo B
        assertEquals("Intervalo C", ObtenerCategoria.ObtenerCategoria(10));  // Debe retornar Intervalo C
    }
}