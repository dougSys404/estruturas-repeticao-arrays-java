package br.com.dougSys404.arraysloops.exercises.loops;


import java.util.Scanner;

/*
* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
* Ex: 5! = 120
* */
public final class Ex6_Factorial {


    public static void showFactorial(){
        System.out.println("Calling method showFactorial!");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to take the factorial: ");
        int factorialNumber = sc.nextInt();

        int factorialResult = 1;

        for (int i = factorialNumber ; i >= 1 ; i--){

            factorialResult = factorialResult * i;

        }

        System.out.println("Factorial result of " + factorialNumber + "! = " + factorialResult);
    }
}
