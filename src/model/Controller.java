package model;

import model.SalaCine;
import model.MatrizNumerica;


public class Controller {

    private SalaCine cinemark; // Declarando sala de cine
    private MatrizNumerica matriz1;
    private MatrizNumerica matriz2;
    private MatrizNumerica matrizSuma;

    /**
     * Constructor de la clase Controller para inicializar 
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller 
     */
    /*public Controller() {
        matriz1 = new MatrizNumerica(2,2);
        matriz2 = new MatrizNumerica(2,2);
    }*/

    public void inicializaMatriz1(int i, int j) {
        matriz1 = new MatrizNumerica(i,j);
    }

    public void inicializaMatriz2(int i, int j) {
        matriz2 = new MatrizNumerica(i,j);
    }

    public void inicializaMatrizSuma(int i, int j) {
        matrizSuma = new MatrizNumerica(i,j);
    }

    public void inicialiceSala() {
        cinemark = new SalaCine(7,7);
    }

    public String mostrarSala() {
        return cinemark.toString();
    }

    public void comprarSilla(int fila, int asientoEnFila) {
        cinemark.reservarAsiento(fila, asientoEnFila);
    }

    public int cantidadFilas() {
        return cinemark.retornarCantFilas();
    }

    public int cantidadColumnas() {
        return cinemark.retornarCantColumnas();
    }

    public MatrizNumerica getMatriz1() {
        return matriz1;
    }

    public MatrizNumerica getMatriz2() {
        return matriz2;
    }

    public MatrizNumerica getMatrizSuma() {
        return matrizSuma;
    }




}
