package br.com.dougSys404.arraysloops;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the lecture:");
        System.out.println();
        System.out.println("Enter 1 for Loops");
        System.out.println("Enter 2 for Arrays");
        System.out.print("Enter Option: ");
        int option = sc.nextInt();

        switch (option){
            case 1 -> MiddleWareCaller.showLoopsExercises();
            case 2 -> MiddleWareCaller.showArraysVectorExercise();
        }


    }
}