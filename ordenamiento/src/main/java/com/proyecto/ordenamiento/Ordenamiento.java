
package com.proyecto.ordenamiento;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ordenamiento {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         Random rand = new Random();

        System.out.print("¿Cuantos datos desea ingresar? ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100); // números entre 0 y 99
        }


        ordenar(arr);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));
    }

    private static void ordenar(int v[]) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
            }
        }
    }
}