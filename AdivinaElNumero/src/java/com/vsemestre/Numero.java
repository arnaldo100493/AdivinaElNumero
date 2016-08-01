/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vsemestre;

import java.util.Random;

/**
 *
 * @author FABAME
 */
public class Numero {

    int respuesta;
    boolean adivino;
    String pista;
    int numIntentos;

    public Numero() {

    }

    public void setNumero(String numero) {
        numIntentos++;
        int g;

        try {
            g = Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            g = -1;
        }
        if (g == respuesta) {
            adivino = true;
        } else if (g == -1) {
            pista = "un número";
        } else if (g < respuesta) {
            pista = "uno más grande";
        } else if (g > respuesta) {
            pista = "uno más chico";
        }
    }

    public boolean getAdivino() {
        return adivino;
    }

    public String getPista() {
        return "" + pista;
    }

    public int getNumIntentos() {
        return numIntentos;
    }

    public void reset() {
        respuesta = Math.abs(new Random().nextInt() % 100) + 1;
        adivino = false;
        numIntentos = 0;
    }

}
