package br.com.dougSys404.arraysloops.exercises.loops;

/*
* Faça um programa que peça N números inteiros
* Calcule e mostre a quantidade de números pares
* E a quantidade de números impares
*
* */


import java.util.Scanner;

public final class Ex4_EvenAndOdd {


    public static void showEvenAndOdd(){

        Scanner sc = new Scanner(System.in);

        int numberQuantity;
        int count = 0;
        int evenQuantity = 0, oddQuantity = 0;

        System.out.println("Calling method showEvenAndOdd");
        System.out.println();
        System.out.print("How many numbers you want to perform? ");
        numberQuantity = sc.nextInt();

        do{

            System.out.print("Enter a number:");
            int number = sc.nextInt();

            if (number % 2 == 0) evenQuantity++;
            else oddQuantity++;

            count++;

        } while (count < numberQuantity);

        System.out.println("Quanties: Even numbers -> " + evenQuantity + " | Odd numbers -> " + oddQuantity);

    }
}
