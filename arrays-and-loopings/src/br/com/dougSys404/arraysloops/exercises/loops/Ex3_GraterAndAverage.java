package br.com.dougSys404.arraysloops.exercises.loops;

import java.util.Scanner;

/*
* Faça um programa que leia 5 números
* e informe o maior número
* e a média desses números
* */
public final class Ex3_GraterAndAverage {


    public static void getNumbers(){
        System.out.println("Calling method getNumbers");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int number;
        int greater = 0;
        int sum = 0;
        int count = 0;

        do{
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            if (number> greater) greater = number;
            System.out.println();
            sum = sum + number;
            count++;
        } while (count < 5);

        System.out.println("Loop ended!");
        System.out.println("The greatest number is: " + greater);
        System.out.println("The average is: " + (sum / count));
    }
}
