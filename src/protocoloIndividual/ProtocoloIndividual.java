/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package protocoloIndividual;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class ProtocoloIndividual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("===== ACTIVIDADES DE ARREGLOS =====");
        
        //1. Declaracion y creacion de un arreglo
        System.out.println("\n--- 1. Declaracion e Inicializacion ---");

        int[] arreglo = new int[10];
        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100);
        }
        
        //2. Recorrido e mostrar
        System.out.println("\n--- 2. Recorrido con FOR ---");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        
        System.out.println("\n--- Recorrido con FOR-EACH ---");
        for (int num : arreglo) {
            System.out.println(num);
        }
        
        //3. Modificacion
        System.out.println("\n--- 3. Modificacion ---");
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 != 0) {
                arreglo[i] = 0;
            }
        }
        System.out.println("Impares cambiados por 0");
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] * i;
        }
        System.out.println("Valores multiplicados por su indice");
        System.out.println("\n--- Arreglo despues de modificacion ---");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        
        //4. Busqueda
        System.out.println("\n--- 4. Busqueda Lineal ---");
        
        int valorBuscado = 50;
        boolean encontrado = false;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                System.out.println("Encontrado en posicion: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro el valor");
        }
        
        System.out.println("\n===== ACTIVIDADES DE MATRICES =====");
        
        //1. Declaracion e inicializacion
        System.out.println("\n--- 1. Declaracion e Inicializacion ---");
        
        int[][] matriz = new int[3][3];

        int valor = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = valor++;
            }
        }
        
        //2. Recorrido
        System.out.println("\n--- 2. Matriz en forma de tabla ---");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n--- Recorrido por columnas ---");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        //3. Operaciones
        System.out.println("\n--- 3. Operaciones ---");
        
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma += matriz[i][j];
            }
        }
        
        System.out.println("Suma total: " + suma);
        
        for (int j = 0; j < 3; j++) {
            int temp = matriz[0][j];
            matriz[0][j] = matriz[2][j];
            matriz[2][j] = temp;
        }
        
        System.out.println("Filas intercambiadas");
        System.out.println("\n--- Matriz despues de intercambiar filas ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n===== EJERCICIO 21: PELUQUERIA =====");
        
        //1. Arreglo de horarios disponibles
        System.out.println("\n--- Horarios disponibles ---");
        
        String[] horarios = {
            "08:00", "09:00", "10:00", "11:00",
            "12:00", "13:00", "14:00", "15:00"
        };
        
        for (int i = 0; i < horarios.length; i++) {
            System.out.println(i + " - " + horarios[i]);
        }

        boolean[] ocupado = new boolean[horarios.length];
        
        //2. Registrar citas ocupadas
        System.out.println("\n--- Reservar cita ---");
        
        Scanner sc = new Scanner(System.in);

        for (int intento = 1; intento <= 2; intento++) {

            System.out.print("Ingrese la posicion del horario (0 a 7): ");
            int pos = sc.nextInt();

            if (pos >= 0 && pos < horarios.length) {
                if (!ocupado[pos]) {
                    ocupado[pos] = true;
                    System.out.println("Cita reservada correctamente.");
                } else {
                    System.out.println("Este horario se encuentra ocupado.");
                }
            } else {
                System.out.println("Posicion invalida.");
            }
        }
        
        //3. Mostrar horarios
        System.out.println("\n--- Estado de horarios ---");
        
        for (int i = 0; i < horarios.length; i++) {
            if (ocupado[i]) {
                System.out.println(horarios[i] + " - Ocupado");
            } else {
                System.out.println(horarios[i] + " - Libre");
            }
        }
        
        sc.close();
    }
}