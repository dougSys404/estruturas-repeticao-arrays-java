package br.com.dougSys404.arraysloops;

import br.com.dougSys404.arraysloops.exercises.arrays.Ex10_MultidimensionalArray;
import br.com.dougSys404.arraysloops.exercises.arrays.Ex7_ReverseOrder;
import br.com.dougSys404.arraysloops.exercises.arrays.Ex8_Consonants;
import br.com.dougSys404.arraysloops.exercises.arrays.Ex9_RandomNumbers;
import br.com.dougSys404.arraysloops.exercises.loops.*;

import java.util.Scanner;

public final class MiddleWareCaller {


    public static void showLoopsExercises(){


        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the exercise:");
        System.out.println("Enter 1 for - Name and Age.");
        System.out.println("Enter 2 for - Grade.");
        System.out.println("Enter 3 for - Greater and average.");
        System.out.println("Enter 4 for - Even and odd.");
        System.out.println("Enter 5 for - Multiplication table");
        System.out.println("Enter 6 for - Factorial");
        System.out.println("Enter 0 to quit.");
        System.out.println();
        System.out.print("Option: ");
        int option = sc.nextInt();

        System.out.println();
        switch (option){
            case 1 -> Ex1_nameAge.readNameAndAge();
            case 2 -> Ex2_Grade.getGrade();
            case 3 -> Ex3_GraterAndAverage.getNumbers();
            case 4 -> Ex4_EvenAndOdd.showEvenAndOdd();
            case 5 -> Ex5_MultiplicationTable.multiply();
            case 6 -> Ex6_Factorial.showFactorial();
            default -> System.out.println("Invalid option!");
        }
    }

    public static void showArraysVectorExercise(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the exercise:");
        System.out.println("Enter 1 for - Reverse Order.");
        System.out.println("Enter 2 for - Consonants.");
        System.out.println("Enter 3 for - Random numbers.");
        System.out.println("Enter 4 for - Multidimensional Array.");

        System.out.println("Enter 0 to quit.");
        System.out.println();
        System.out.print("Option: ");
        int option = sc.nextInt();

        System.out.println();
        switch (option) {
            case 1 -> Ex7_ReverseOrder.showReverseOrder();
            case 2 -> Ex8_Consonants.showConsonants();
            case 3 -> Ex9_RandomNumbers.getRandomNumbers();
            case 4 -> Ex10_MultidimensionalArray.showMatrix();
            default -> System.out.println("Invalid option!");
        }
    }
}
