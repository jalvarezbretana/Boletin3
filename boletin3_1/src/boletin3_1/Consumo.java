/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

/**
 *
 * @author jalvarezbretana
 */
public class Consumo {

    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    public Consumo(float kilm, float lit, float med, float gas) {
        km = kilm;
        litros = lit;
        vMed = med;
        pGas = gas;

    }

    public Consumo() {

    }

    public float getTempo() {
        float tempo = km / vMed;
        return tempo;
    }

    public float consumoMedio() {
        float consumoM = litros / km * 100;
        return consumoM;
    }

    public float consumoEuros() {
        float consumoE = km / pGas * 100;
        return consumoE;
    }

    public void setKms(float kilm) {
        km = kilm;

    }

    public void setLitros(float lit) {
        litros = lit;
    }

    public void setVMed(float med) {
        vMed = med;
    }

    public void setPGas(float gas) {
        pGas = gas;
    }

    public float getVMed(){
        return vMed;
        
    }

}
