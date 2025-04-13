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
        System.out.println("\nRecuerde que para poder sumar las matrices deben de tener la misma cantidad de filas y columnas!!");

        for  (int x = 1; x < 3; x++) {
            System.out.println("\nIngrese el numero de filas que tendra la matriz #"+x+": ");
            int filas = escaner.nextInt();
            escaner.nextLine();

            System.out.println("Ingrese el numero de columnas para la matriz #"+x+": ");
            int columnas = escaner.nextInt();
            escaner.nextLine();

            if (x == 1) {
                cont.inicializaMatriz1(filas, columnas);
                cont.inicializaMatrizSuma(filas, columnas);
                System.out.println("\nLa matriz 1 y matriz suma ya esta inicializada.");
            } else {
                cont.inicializaMatriz2(filas, columnas);
                System.out.println("\nLa matriz 2 ya esta inicializada.");
            }

            System.out.println("\nInserte los numeros que conformaran a la matriz "+x+": ");
            for(int i = 0; i < filas; i++) {
                int filaActual = i+1;
                for(int j = 0; j < columnas; j++) {
                    int columnaActual = j+1;
                    System.out.println("Insertar dato en fila " + filaActual + " y columna " + columnaActual + ": ");
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

        if (cont.getMatriz1().getCantFilas() == cont.getMatriz2().getCantFilas() || cont.getMatriz1().getCantColumnas() == cont.getMatriz2().getCantColumnas()) {
            System.out.println("\nAhora bien, procederemos a sumar las matrices #1 y #2.");
            System.out.println("Este es el resultado de la suma:");

            for(int y = 0; y < cont.getMatriz1().getCantFilas(); y++) {
                for(int z = 0; z < cont.getMatriz1().getCantColumnas(); z++) {
                    int suma = cont.getMatriz1().getMatriz()[y][z] + cont.getMatriz2().getMatriz()[y][z];
                    cont.getMatrizSuma().insertarValor(y, z, suma);
                }
            }

            System.out.println();
            for (int i = 0; i < cont.getMatrizSuma().getCantFilas(); i++) {
                for (int j = 0; j < cont.getMatrizSuma().getCantColumnas(); j++) {
                    System.out.print(cont.getMatrizSuma().getMatriz()[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Fin del programa.");

        } else {
            System.out.println("\nDebido a que la cantidad de espacios en ambas matrices no son iguales no se puede realizar una suma.");
            System.out.println("Fin del programa.");
        }

        /*if (cont.getMatriz1().getCantFilas() > cont.getMatriz2().getCantFilas()) {
            if (cont.getMatriz1().getCantColumnas() > cont.getMatriz2().getCantColumnas()) {
                cont.inicializaMatrizSuma(cont.getMatriz1().getCantFilas(), cont.getMatriz1().getCantColumnas());
            } else {
                cont.inicializaMatrizSuma(cont.getMatriz1().getCantFilas(), cont.getMatriz2().getCantColumnas());
            }
        } else {
            if (cont.getMatriz1().getCantColumnas() > cont.getMatriz2().getCantColumnas()) {
                cont.inicializaMatrizSuma(cont.getMatriz2().getCantFilas(), cont.getMatriz1().getCantColumnas());
            } else {
                cont.inicializaMatrizSuma(cont.getMatriz2().getCantFilas(), cont.getMatriz2().getCantColumnas());
            }
        }
        System.out.println("La matriz de suma ya esta inicializada.");

        
        if (cont.getMatriz1().getCantFilas() > cont.getMatriz2().getCantFilas()) {
            for(int y = 0; y < cont.getMatriz1().getCantFilas(); y++) {

                if (cont.getMatriz1().getCantColumnas() > cont.getMatriz2().getCantColumnas()) {
                    for(int z = 0; z < cont.getMatriz1().getCantColumnas(); z++) {
                        int sumaFila = cont.getMatriz1().getMatriz()[y][z] + cont.getMatriz2().getMatriz()[i][j]
                        cont.getMatrizSuma().insertarValor(i, j, valor);
                    }

                } else {
                    for(int z = 0; z < cont.getMatriz2().getCantColumnas(); z++) {

                    }

                }
            }
        } else {
            for(int i = 0; i < cont.getMatriz2().getCantFilas(); y++) {

                if (cont.getMatriz1().getCantColumnas() > cont.getMatriz2().getCantColumnas()) {
                    for(int z = 0; z < cont.getMatriz1().getCantColumnas(); z++) {
                    }

                } else {
                    for(int z = 0; z < cont.getMatriz2().getCantColumnas(); z++) {
                    }
                    
                }
            }
        }

        for(int y = 0; y < cont.getMatriz1().getCantFilas() && y < cont.getMatriz2().getCantColumnas(); y++) {
                for(int z = 0; z < cont.getMatriz2().getCantFilas() && z < cont.getMatriz2().getCantColumnas(); z++) {
                    System.out.println("xxx");
                    
                }
            }*/
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