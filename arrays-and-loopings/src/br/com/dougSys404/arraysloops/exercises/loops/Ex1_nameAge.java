package br.com.dougSys404.arraysloops.exercises.loops;

import java.util.Scanner;

/*
*Faça um programa que leia conjuntos de dois valores
*O primeiro representa o o nome do aluno e o segundo representando a idade
* (Pare o program inserindo 0 no campo nome
 */
public final class Ex1_nameAge {

  public static void readNameAndAge(){


        Scanner sc = new Scanner(System.in);

        System.out.println("Exercise: Name and age!");
        System.out.println();

        while (true){

            System.out.print("Enter name or 0 to quit: ");
            String name = sc.next();
            if (name.equals("0")) break;
            System.out.print("Enter age: ");
            int age = sc.nextInt();
        }

      System.out.println("Exit program.....");
    }
}
