package com.example.brillodefoco;

import java.util.Arrays;

public class Foco {

    private int voltaje = 0;
    private int lumens = 1;

    private final int[] valoresVoltaje = {15, 25, 40, 60, 75, 100};
    private final int[] valoresLumens = {125, 215, 500, 880, 1000, 1675};

    public Foco() {
    }

    public Foco(int voltaje) {
        this.setVoltaje(voltaje);
    }

    public boolean setVoltaje(int voltaje) {
        boolean encontrado = Arrays.stream(valoresVoltaje).anyMatch(i -> i == voltaje);

        this.voltaje = (encontrado) ? voltaje : 0;
        this.setLumens(voltaje, encontrado);

        return encontrado;
    }

    private void setLumens(int voltaje, boolean encontrado) {
        int pos;

        if (!encontrado) {
            this.lumens = 1;
        } else {
            for (pos = 0; pos < valoresVoltaje.length; pos++) {
                if (valoresVoltaje[pos] == voltaje) break;
            }
            this.lumens = valoresLumens[pos];
        }
    }

    public int getVoltaje() {
        return voltaje;
    }

    public int getLumens() {
        return lumens;
    }

}
