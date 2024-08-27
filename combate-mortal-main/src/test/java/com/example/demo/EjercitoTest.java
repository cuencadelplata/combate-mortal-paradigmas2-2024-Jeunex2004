package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EjercitoTest {

@Test
void test_soldado_muerto_de_un_disparo(){
Ejercito soldado = new Ejercito(1);
soldado.setVida(1);
assertTrue(soldado.estaVivo());
soldado.recibriDisparo(1);
assertFalse(soldado.estaVivo());
}

@Test
void test_soldado_vivo_despues_de_un_disparo_por_el_escudo(){

Ejercito soldado = new Ejercito(1);
soldado.setVida(1);
assertTrue(soldado.estaVivo());
soldado.setEscudo(1);
soldado.recibriDisparo(1);
assertTrue(soldado.estaVivo());

}

}