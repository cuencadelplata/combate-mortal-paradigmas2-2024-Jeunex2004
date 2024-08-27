package com.example.demo;

public class Ejercito {
    
    private int soldado;
    private int tanque;
    private int buque;
    private int daño;
    private int escudo;
    private int vida;
    

    

    public void valoresVariables (){

        vida=1;
        escudo=1;

    }


    public void recibriDisparo( int daño){
         
        if (escudo == 0) {
            
            setVida(getVida() - daño);

        }else if (escudo > 0) {
            
            setEscudo(getEscudo() - daño);

        }


    }

    public boolean estaVivo(){

        return getVida() > 0;

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    
    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }


    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getBuque(int getVida , int getdaño) {
        return buque;
    }

    public void setBuque(int buque) {
        this.buque = buque;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }


    public Ejercito(int soldado) {
        this.soldado = soldado;
    }

    public int getSoldado() {
        return soldado;
    }

    public void setSoldado(int soldado) {
        this.soldado = soldado;
    }

}
