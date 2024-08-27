package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BuqueTest {
    
    @Test
    void Generar_Buque() {
        Buque buq1 =new Buque(0, 0);
        assert buq1.getVida() == 0;
        assert buq1.getBala() == 0;
     }

     @Test
     void Buque_Vivo(){
        Buque buq1 =new Buque(100, 10);
        assert buq1.getVivo();


     }

     @Test
     void Buque_Muerto(){
        Buque buq1 =new Buque(0, 10);
        assert buq1.getMuerto();


     }


     @Test
     void Buque_Ataca_a_otro_buque(){
        Buque buq1 =new Buque(1, 1);
        Buque buq2 =new Buque(1, 1);
        buq1.atacar(buq2);    
        assert(buq2.getVida() == 0);

     }

     @Test
     void Buque_Ataca_a_otro_buque_y_lo_mata(){
        Buque buq1 =new Buque(1, 1);
        Buque buq2 =new Buque(1, 1);
        buq1.atacar(buq2);    
        assert(buq2.getMuerto());

     }

     @Test
     void Buque_Ataca_a_otro_buque_con_escudo(){
        Buque buq1 =new Buque(1, 3);
        Buque buq2 =new Buque(10, 1);
        buq2.setEscudo(1);
        buq1.atacar(buq2);  
        assert(buq2.getVida() == 8.5); 

     }
     
     
     



}
