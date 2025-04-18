package TresEnRaya;

import java.util.Scanner;

public class Coordenada {
    private int fila;
    private int columna;

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    /*public static Coordenada pedirPorTeclado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce fila (0 - 1 - 2");
        int fila = sc.nextInt();

    }*/
}
