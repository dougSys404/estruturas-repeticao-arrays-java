package br.com.dougSys404.arraysloops.exercises.arrays;

import java.util.Random;
import java.util.Scanner;

/*
* Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) e armazene-os em um vetor
* Ao final mostre os números e seus sucessores
* */
public class Ex9_RandomNumbers {

    public static void getRandomNumbers(){
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int[] randomNumbers = new int[20];

        for (int i = 0; i < randomNumbers.length; i++){
            int number = random.nextInt(100);
            randomNumbers[i] = number;
        }

        System.out.print("Numbers randomly generated: ");

        for (int number : randomNumbers){
            System.out.print("[" + number + "] ");
        }

        System.out.print("\nPredecessor numbers of the randomly generated ones: ");

        for (int number : randomNumbers){
            System.out.print("[" + (number - 1) + "] ");
        }


        System.out.print("\nSuccessors numbers of the randomly generated ones: ");

        for (int number : randomNumbers){
            System.out.print("[" + (number + 1) + "] ");
        }


    }

}
