package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TanqueTest {
    
    @Test
    void Generar_Tanque() {
        Tanque tanq1 = new Tanque(0, 0);
        assert tanq1.getVida() == 0;
        assert tanq1.getBala() == 0;
     }

     @Test
     void Tanque_Vivo(){
        Tanque tanq1 = new Tanque(100, 10);
        assert tanq1.getVivo();
    
     }

     @Test
     void Tanque_Muerto(){
        Tanque tanq1 =new Tanque(0, 10);
        assert tanq1.getMuerto();
     }


     @Test
     void Tanque_Ataca_a_otro_soldado(){
        Tanque tanq1 =new Tanque(1, 1);
        Soldado sold2 =new Soldado(1, 1);
        tanq1.atacar(sold2);    
        assert(sold2.getVida() == 0);

     }

     @Test
     void Soldado_Ataca_a_un_tanque_y_lo_mata(){
        Soldado sold1 =new Soldado(1, 1);
        Tanque tanq1 =new Tanque(2, 1);
        sold1.atacar(tanq1); 
        sold1.atacar(tanq1);   
        assert(tanq1.getMuerto());

     }

     @Test
     void Tanque_Ataca_a_un_buque_con_escudo(){
        Tanque tanq1 =new Tanque(1, 6);
        Buque buq1=new Buque(10, 1);
        buq1.setEscudo(1);
        tanq1.atacar(buq1);  
        assert(buq1.getVida() == 7.0); 

     }




}
