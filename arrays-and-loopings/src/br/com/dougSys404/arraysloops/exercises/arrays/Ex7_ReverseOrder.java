package br.com.dougSys404.arraysloops.exercises.arrays;


/*
* Crie um array de 6 números inteiros
* e mostre-os na ordem inversa
* */

import java.util.Scanner;

public final class Ex7_ReverseOrder {


    public static void showReverseOrder(){

        Scanner sc = new Scanner(System.in);

        int[] arrayNumbers = {0, -5, 15, 50, 8, 4};

        System.out.println("Show vector with FOR loop (Without reversing): ");
        for (int i = 0; i < arrayNumbers.length; i++ ){
            System.out.print("[" + arrayNumbers[i] + "] ");
        }

        System.out.println();
        System.out.println();
        int count = arrayNumbers.length -1;
        System.out.println("Show vector with WHILE loop (With reversing): ");
        while (count >= 0){
            System.out.print("[" + arrayNumbers[count] + "] ");
            count--;
        }
    }
}
