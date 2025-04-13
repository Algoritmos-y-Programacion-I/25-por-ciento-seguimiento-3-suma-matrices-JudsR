package model;

public class MatrizNumerica {

    private int[][] matriz; // Declaro
    private int cantFilas;
    private int cantColumnas;

    public MatrizNumerica(int filas, int columnas) {
        cantFilas = filas;
        cantColumnas = columnas;
        this.matriz = new int[filas][columnas]; // Inicializo
    }

    public void insertarValor(int i, int j, int valor) {
        matriz[i][j] = valor;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public int getCantFilas() {
        return cantFilas;
    }

    public int getCantColumnas() {
        return cantColumnas;
    }
}