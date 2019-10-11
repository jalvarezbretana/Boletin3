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
public class Boletin3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Consumo consume = new Consumo();
        consume.setLitros(50);
        consume.setPGas(1.57f);
        Consumo consumo = new Consumo(350f, 100f, 120f, 140f);
        System.out.println("Litros cada 100km = " + consumo.consumoMedio() + " l");
        consumo.setLitros(200f);
        System.out.println("Velocidade media = " + consumo.getVMed());
        System.out.println("Cambiando el valor: \nLitros cada 100 km = " + consumo.consumoMedio() + " l");

    }

}
