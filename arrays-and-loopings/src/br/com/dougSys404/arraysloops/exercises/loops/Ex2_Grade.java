package br.com.dougSys404.arraysloops.exercises.loops;

import java.util.Scanner;
/*
* Faça um programa que peça uma nota, entre 0 e 10.
* Mostre uma mensagem caso o valor seja inválido e continue pedindo
* até que o usuário informe um valor válido;
*
* */
public final class Ex2_Grade {


    public static void getGrade(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Calling method getGrade!");
        System.out.println();

        System.out.print("Enter grade (0 to 10): ");
        int grade = sc.nextInt();

        while (grade < 0 || grade > 10){
            System.out.print("Invalid input! Enter grade (0 to 10): ");
            grade = sc.nextInt();
        }

        System.out.println("Exit program.....");
    }
}
