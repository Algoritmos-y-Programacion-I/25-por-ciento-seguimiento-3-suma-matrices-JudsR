package ui;

import java.util.Scanner; // Importar Scanner
import model.Controller;


public class Executable {

    //private Scanner reader;
    private Controller cont;
    private Scanner escaner; // Ponner Scanner como atributo

    /**
     * Constructor de la clase Executable para inicializar el lector de entrada y el
     * controlador.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se inicializan el lector de
     *       entrada y el controlador.
     */
    public Executable() {
        //reader = new Scanner(System.in);
        cont = new Controller();
        escaner = new Scanner(System.in); // Inicializar Scanner
    }

    /**
     * Ejecuta el programa principal de gestión de colegios.
     *
     * @pre El método debe ser llamado dentro de un contexto válido.
     * @post El programa se ejecuta y permite al usuario interactuar con las
     *       opciones disponibles.
     * @return void Este método no retorna ningún valor.
     */

    public void run() {

        System.out.println("Bienvenido a la creacion y suma de matrices numericas!:");

        for  (int x = 1; x < 3; x++) {
            System.out.println("\nIngrese el numero de filas que tendra la matriz #"+x+": ");
            int filas = escaner.nextInt();
            escaner.nextLine();

            System.out.println("Ingrese el numero de columnas para la matriz #"+x+": ");
            int columnas = escaner.nextInt();
            escaner.nextLine();

            if (x == 1) {
                cont.inicializaMatriz1(filas, columnas);
                System.out.println("La matriz 1 ya estaba inicializada.");
            } else {
                cont.inicializaMatriz2(filas, columnas);
                System.out.println("La matriz 2 ya estaba inicializada.");
            }

            System.out.println("\nInserte los numeros que conformaran a la matriz "+x+": ");
            for(int i = 0; i < filas; i++) {
                for(int j = 0; j < columnas; j++) {
                    System.out.println("Insertar dato en fila " + i + " y columna " + j + ": ");
                    int valor = escaner.nextInt();
                    escaner.nextLine();
                    if (x == 1) {
                        cont.getMatriz1().insertarValor(i, j, valor);
                    } else {
                        cont.getMatriz2().insertarValor(i, j, valor);
                    }
                }
            }
    
            System.out.println();
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (x == 1) {
                        System.out.print(cont.getMatriz1().getMatriz()[i][j] + " ");
                    } else {
                        System.out.print(cont.getMatriz2().getMatriz()[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }

        System.out.println("Ahora bien, procederemos a sumar las matrices #1 y #2.");
        System.out.println("Este es el resultado de la suma:");

        if (cont.getMatriz1().getCantFilas() > cont.getMatriz2().getCantFilas()) {

            for(int i = 0; i < cont.getMatriz1().getCantFilas(); y++) {
                if (cont.getMatriz1().getCantColumnas() > cont.getMatriz2().getCantColumnas()) {

                } else {

                }
            }
        } else {

            for(int i = 0; i < cont.getMatriz1().getCantFilas(); y++) {
                if (cont.getMatriz1().getCantColumnas() > cont.getMatriz2().getCantColumnas()) {

                } else {
                    
                }
            }
        }

        for(int y = 0; y < cont.getMatriz1().getCantFilas() && y < cont.getMatriz2().getCantColumnas(); y++) {
                for(int z = 0; z < cont.getMatriz2().getCantFilas() && z < cont.getMatriz2().getCantColumnas(); z++) {
                    System.out.println("xxx");
                    
                }
            }
    }

    /**
     * Método principal (main) para iniciar la ejecución del programa.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se ejecuta el programa principal.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             caso).
     */
    public static void main(String[] args) {

        Executable mainApp = new Executable();
        mainApp.run();

    }

}