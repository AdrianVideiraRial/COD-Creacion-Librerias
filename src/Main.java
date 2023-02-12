public class Main {
    public static void main(String[] args) {

        boolean isOK_consola = false;
        boolean isOK_ventana = false;

       EntradaSalida.entradaTexto("Cuales tu nombre?");
       EntradaSalida.salidaTexto();
       EntradaSalida.entradaEntero("¿Cuantos años tienes?");
       EntradaSalida.salidaEntero();
       EntradaSalida.operacionesMatematicas(8.754f,5.662f);








        /*isOK_consola = EntradaSalida.salida(EntradaSalida.entrada() EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Hello world", EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");*/




    }


}