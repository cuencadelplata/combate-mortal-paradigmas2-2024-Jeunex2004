package com.example.demo;

public class Chuck_Noris  {

    private int vida;
    private int dano;
    private int escudo;
    private int vivo;

    public Chuck_Noris(int vida, int dano) {
        this.vida = vida;
        this.dano = dano;
        
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getBala() {
        return dano;
    }

    public void setBala(int dano) {
        this.dano = dano;
    }


    public void atacar_n1( Chuck_Noris chuck1){
        double ataque = this.dano;
        if(chuck1.escudo >0 ){
            escudo-=dano;
            if(escudo <= 0){
                double reducion= ataque/2;
                chuck1.vida-=0;
                escudo=0;
            }

        }else{
            
            chuck1.vida-=0;

        }if(getVida() <= 0){
            setVivo();
         }else{
            setVivo();
         }
        
       
    }

    public void atacar( Militar i){
        double ataque = this.dano;
        if(i.escudo >0 ){
            escudo-=dano;
            if(escudo <= 0){
                double reducion= ataque/2;
                i.vida-=reducion;
                escudo=0;
            }

        }else{
            
            i.vida-=ataque;

        }if(getVida() <= 0){
            setMuerto();
         }else{
            setVivo();
         }
        
       
    }



    public boolean vida_de_inicio(int vida){
        setVida(getVida()+vida);
        return false;
    }

    public boolean getVivo(){
        return getVida()>0;
    }

    public int setVivo(){
        return vivo;
    }
    

    public boolean getMuerto(){
        return getVida() <= 0;
    }

    public int setMuerto(){
        return 0;
    }


    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }


}

    

