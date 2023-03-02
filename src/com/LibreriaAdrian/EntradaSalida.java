package com.LibreriaAdrian;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class EntradaSalida {
        //VARIABLES
        /**
         * opción de uso de la consola para imprimir un mensaje
         */
        public static final int SALIDA_CONSOLA = 1;
        /**
         * opción de uso de utilizar una ventana en el escritorio para sacar un mensaje
         */
        public static final int SALIDA_WINDOW = 2;

        /**
         * Variables para almacenar textos introducidos por el usuario.
         */
        private static String mensaje;

        /**
         *
         */
        private static int entero;


    //---------------------------------------------------------------------------------------//
        //CONSTRUCTOR

        private void EntradaSalida(){

        }

        //---------------------------------------------------------------------------------------//
        //METODOS
        /**
         * Salida por ventana o consala de un mensaje
         * @param msj cadena que queremos imprimir
         * @param device dispositivo de salida<br>consola: SALIDA_CONSOLA<br>ventana:SALIDA_VENTANA
         * @return si es true: correcto si no false
         */
        public static boolean salida(String msj, int device) {
            switch (device) {
                case SALIDA_CONSOLA:
                    try {
                        System.out.println("Consola: " + msj);
                        return true;
                    } catch (Exception e) {
                        return false;
                    }

                case SALIDA_WINDOW:
                    try {
                        JOptionPane.showMessageDialog(null,"Sale por un ventana " + msj);
                        return true;
                    } catch(Exception e) {
                        System.out.println(e.getMessage());
                        return false;
                    }
                default:
                    return false;
            }
        }

    /**
     * Metodo de entrada de texto introducida por el usuario.
     * @param comentario
     * @author Adrian Videira
     */

    public static void entradaTexto (String comentario){ //Getter
            try{
                Scanner m1 = new Scanner(System.in);
                System.out.println(comentario);
                mensaje = m1.nextLine();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        public static String salidaTexto(){
            try{
                System.out.println("Consola: "+mensaje);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            return "";
        }

    /**
     * Metodo de entrada de entero introducida por el usuario.
     * @param comentario
     * @author Adrian Videira
     */

    public static void entradaEntero (String comentario){ //Setter
        try {
            Scanner m1 = new Scanner(System.in);
            System.out.println(comentario);
            entero = m1.nextInt();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static int salidaEntero(){ //Getter
        try {
            System.out.println("Consola: " + entero);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    /**
     * Metodo Operaciones básicas maetemáticas.
     * @param n1
     * @param n2
     * @return
     */

        public static float operacionesMatematicas (float n1, float n2) {
            Scanner memoria = new Scanner(System.in);
            int selectOperacion = 0;

            System.out.println("Selecciona operacion: ");
            System.out.println(" 1 - SUMA / 2-RESTA / 3-MULTIPLICACION / 4-DIVISION");

            selectOperacion = memoria.nextInt();

            try{
                if (selectOperacion <= 4) {

                switch (selectOperacion) {
                    case 1:
                        float suma = n1 + n2;
                        System.out.println("El resultado es: " + suma);
                        break;

                    case 2:
                        float resta = n1 - n2;
                        System.out.println("El resultado es: " + resta);
                        break;

                    case 3:
                        float multiplicacion = n1 * n2;
                        System.out.println("El resultado es: " + multiplicacion);
                        break;

                    case 4:
                        float division = n1 / n2;
                        System.out.println("El resultado es: " + division);
                        break;
                }

            } else {

                System.out.println("null");
                System.out.println("Ha habido un error");
            }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            return 0.0f;
        }

    /**
     * Metodo para calcular raiz cuadrada o cúbica
     */

    public static double raizCuadrada (double radicando){
        Scanner memoria = new Scanner(System.in);
        double raiz;
        int selectRaiz = 0;
        int indiceRaiz;
        System.out.println("Selecciona operacion: ");
        System.out.println(" 0- Raiz Cuadrada / 1- Raiz Cúbica / 2- Raiz de n");
        selectRaiz = memoria.nextInt();

        try {
            if (selectRaiz <= 2) {

                switch (selectRaiz) {
                    case (0):
                        raiz = Math.sqrt(radicando);
                        System.out.println("La raiz cuadrada es: " + raiz);
                        break;
                    case (1):
                        raiz = Math.cbrt(radicando);
                        System.out.println("La raiz cúbica es: " + raiz);
                        break;
                    case (2):
                        System.out.println("Indica un numero entero como indice para realizar la operacion");
                        indiceRaiz = memoria.nextInt();
                        raiz = Math.pow(radicando, (1.0/indiceRaiz));
                        System.out.println("La raiz con inice " + indiceRaiz + " es igual a: " + raiz);
                        break;
                    default:
                        System.out.println("Ha ocurrido un error");
                }

            } else {
                System.out.println("Error");
                System.out.println("Por favor introduce un numero entero entre 0 y 2");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0.0;
    }


}
