/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio25t5;
import java.util.InputMismatchException;
import java.util.Scanner; //Importo el Scanner y la excepcion
/**
 *
 * @author ÁLVARO
 */

public class Ejercicio25T5 {

    /**
     * @param args the command line arguments
     */
    public static int opcionesProcesador() { //Metodo para mostrar las opciones
        int opcion;
        System.out.println("1. Intel Core i5-12400F");
        System.out.println("2. Intel Core i7-12700K");
        System.out.println("3. AMD Ryzen 5 5600X");
        System.out.println("4. AMD Ryzen 7 5800X");

        Scanner entrada = new Scanner(System.in);

        opcion = entrada.nextInt();

        return opcion; //Devuelvo la opcion
    }

    public static void main(String[] args) { //Esta seria la clase test
        //ATRIBUTOS OBJETO ORDENADOR
        int ram1, ram2;
        int disco1, disco2;
        //Inicializo la variable para el bucle 
        disco1 = 0;
        disco2 = 0;
        String procesador1, procesador2;
        //Inicio vatiables 
        procesador1 = "";
        procesador2 = "";
        String grafica1, grafica2;
        float precio1, precio2;
        //Inicializo las variables para el bucle
        precio1 = 0;
        precio2 = 0;
        int opcion = 0;

        //ATRIBUTOS PARA EL OBJETO SERVIDOR
        int monitor1;
        String teclado1;
        String raton1;

        int monitor2;
        String teclado2;
        String raton2;

        //ATRIBUTOS PARA PORTATIL
        String marca1;
        int tamaño1;
        int peso1;

        String marca2;
        int tamaño2;
        int peso2;
        //SCANNER
        Scanner entrada = new Scanner(System.in);

        //ORDENADOR 1
        try { //Control de excepciones
            do {

                System.out.println("========= Ordenador 1 ==========");
                System.out.println("Cantidad de memoria RAM : ");
                ram1 = entrada.nextInt();
                System.out.println("Capacidad del disco duro : ");
                disco1 = entrada.nextInt();
                System.out.println("Modelo del procesador : ");
                opcion = opcionesProcesador(); //LLamo al metodo que muestra las opciones
                switch (opcion) {
                    case 1:
                        procesador1 = "Intel Core i5-12400F";
                        break;
                    case 2:
                        procesador1 = "Intel Core i7-12700K";
                        break;
                    case 3:
                        procesador1 = "AMD Ryzen 7 5600X";
                        break;
                    case 4:
                        procesador1 = "AMD Ryzen 7 5800X";
                        break;
                    default:
                        System.out.println("Introduce un valor entre 1 y 4");
                        procesador1 = "";
                }
                entrada.nextLine();
                System.out.println("Modelo de la tarjeta grafica : ");
                grafica1 = entrada.nextLine();
                System.out.println("El precio total es : ");
                precio1 = entrada.nextFloat();

                Ordenador ord1 = new Ordenador(ram1, disco1, procesador1, grafica1, precio1);

                System.out.println(ord1.toString());

            } while (disco1 % 5 != 0 || precio1 <= 0); //Condicion del bucle

            //ORDENADOR 2
            do {

                System.out.println("========= ordenador 2 ==========");
                System.out.println("Cantidad de memoria RAM : ");
                ram2 = entrada.nextInt();
                System.out.println("Capacidad del disco duro : ");
                disco2 = entrada.nextInt();
                System.out.println("Modelo del procesador : ");
                opcion = opcionesProcesador(); //Llamo al metodo
                switch (opcion) { //Menu de opciones para el procesador
                    case 1:
                        procesador2 = "Intel Core i5-12400F";
                        break;
                    case 2:
                        procesador2 = "Intel Core i7-12700K";
                        break;
                    case 3:
                        procesador2 = "AMD Ryzen 7 5600X";
                        break;
                    case 4:
                        procesador2 = "AMD Ryzen 7 5800X";
                        break;
                    default:
                        System.out.println("Introduce un valor entre 1 y 4");
                        procesador1 = "";
                }
                entrada.nextLine(); //Limpio el buffer
                System.out.println("Modelo de la tarjeta grafica : ");
                grafica2 = entrada.nextLine();
                System.out.println("El precio total es : ");
                precio2 = entrada.nextFloat();

                Ordenador ord2 = new Ordenador(ram2, disco2, procesador2, grafica2, precio2); //Objeto con constructor parametrizado

                System.out.println(ord2.toString()); //Imprimo

            } while (disco2 % 5 != 0 || precio2 <= 0); //Condicion del bucle

            //SERVIDOR 1
            do {

                System.out.println("========== SERVIDOR 1 ==========");
                System.out.println("Tamaño del monitor: ");
                monitor1 = entrada.nextInt();
                entrada.nextLine(); //Limpio buffer
                System.out.println("Modelo del teclado: ");
                teclado1 = entrada.nextLine();
                System.out.println("Modelo del raton");
                raton1 = entrada.nextLine();

                Servidor server1 = new Servidor(monitor1, teclado1, raton1); //Creo objeto con constructor parametrizado
                System.out.println(server1.toString()); //Imprimo

            } while (monitor1 < 14); //Condicion del bucle

            //SERVIDOR2 - Constructor por defecto
            Servidor server2 = new Servidor();

            System.out.println("========== SERVIDOR 2 ==========");
            System.out.println("Tamaño del monitor: ");
            server2.setTamañoMonitor(entrada.nextInt()); //Tomo los valores del usuario con el constructor por defecto
            entrada.nextLine(); //Limpio buffer
            System.out.println("Modelo del teclado: ");
            server2.setTeclado(entrada.nextLine());
            System.out.println("Modelo del raton");
            server2.setRaton(entrada.nextLine());

            System.out.println(server2.toString()); //Imprimo por pantalla

            //PORTATIL 1
            System.out.println("========== PORTATIL 1 ==========");
            System.out.println("Marca del portatil: ");
            marca1 = entrada.nextLine();
            System.out.println("Tamaño de la pantalla: ");
            tamaño1 = entrada.nextInt();
            System.out.println("El peso es : ");
            peso1 = entrada.nextInt();

            Portatil port1 = new Portatil(marca1, tamaño1, peso1); //Creo objeto con constructor parametrizado
            System.out.println(port1.toString());

            //PORTATIL 2 -  constructores por defecto
            Portatil port2 = new Portatil(); //Creo el objeto

            System.out.println("========== PORTATIL 2 ==========");
            System.out.println("Marca del portatil");
            port2.setMarca(entrada.nextLine()); //Tomo los valores del usuario con el constructor por defecto
            entrada.next();
            System.out.println("Tamaño de la pantalla");
            port2.setTamaño(entrada.nextInt());
            System.out.println("El peso es : ");
            port2.setPeso(entrada.nextInt());

            System.out.println(port2.toString()); //Imprimo por pantalla

        } catch (InputMismatchException e) { //Control de excepciones
            System.out.println("Introduce un valor correcto");

        }
    }

}