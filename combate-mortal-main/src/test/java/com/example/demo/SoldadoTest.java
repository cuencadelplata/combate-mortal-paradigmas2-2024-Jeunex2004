package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SoldadoTest {
    
    @Test
    void Generar_Soldado() {
        Soldado sold1 = new Soldado(0, 0);
        assert sold1.getVida() == 0;
        assert sold1.getBala() == 0;
     }

     @Test
     void Soldado_Vivo(){
        Soldado sold1 = new Soldado(100, 10);
        assert sold1.getVivo();


     }

     @Test
     void Soldado_Muerto(){
        Soldado sold1 =new Soldado(0, 10);
        assert sold1.getMuerto();
     }


     @Test
     void Soldado_Ataca_a_otro_soldado(){
        Soldado sold1 =new Soldado(1, 1);
        Soldado sold2 =new Soldado(1, 1);
        sold1.atacar(sold2);    
        assert(sold2.getVida() == 0);

     }

     @Test
     void Soldado_Ataca_a_otro_soldado_y_lo_mata(){
        Soldado sold1 =new Soldado(1, 1);
        Soldado sold2 =new Soldado(1, 1);
        sold1.atacar(sold2);    
        assert(sold2.getMuerto());

     }

     @Test
     void Soldado_Ataca_a_un_buque_con_escudo(){
        Soldado sold1 =new Soldado(1, 10);
        Buque buq1=new Buque(10, 1);
        buq1.setEscudo(1);
        sold1.atacar(buq1);  
        assert(buq1.getVida() == 5); 

     }






}
