package com.example.demo;

public class Militar {

    double vida;
    private int dano;
    int escudo;
    private boolean vivo;


    public Militar(int vida, int dano) {
        this.vida = vida;
        this.dano = dano;
        
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getBala() {
        return dano;
    }

    public void setBala(int dano) {
        this.dano = dano;
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
        return getVida() >0 ;
    }

    public boolean setVivo(){
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
