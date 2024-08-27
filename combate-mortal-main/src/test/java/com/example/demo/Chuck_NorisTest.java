package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Chuck_NorisTest {
    
    @Test
    void Generar_Chuck_Noris() {
        Chuck_Noris chuck1 =new Chuck_Noris(10000000, 10000000);
        assert chuck1.getVida() == 10000000;
        assert chuck1.getBala() == 10000000;
     }

     @Test
     void Chuck_Noris_Vivo(){
        Chuck_Noris chuck1 =new Chuck_Noris(10000000, 110000000);
        assert chuck1.getVivo();


     }

     @Test
     void Chuck_Noris_NO_muerto(){
        Chuck_Noris chuck1 =new Chuck_Noris(10000000, 110000000);
        assert chuck1.getVivo();


     }


     @Test
     void Chuck_Noris_Ataca_a_un_buque(){
        Chuck_Noris chuck1 =new Chuck_Noris(10000000, 1);
        Buque buq2 =new Buque(1, 1);
        chuck1.atacar(buq2);    
        assert(buq2.getVida() == 0);

     }

     @Test
     void Chuck_Noris_Ataca_a_un_soldado_y_lo_mata(){
        Chuck_Noris chuck1 =new Chuck_Noris(10000000, 10000000);
        Soldado sold1 =new Soldado(1, 1);
        chuck1.atacar(sold1);    
        assert(sold1.getMuerto());

     }

     @Test
     void Chuck_Noris_Ataca_a_Chuck_Noris_sin_escudo(){
        Chuck_Noris chuck1 =new Chuck_Noris(10000000, 10000000);
        Chuck_Noris chuck2 =new Chuck_Noris(10000000, 10000000);
        chuck1.setEscudo(0);
        chuck2.atacar_n1(chuck1);  
        assert(chuck1.getVida() == 10000000); 

     }

}
