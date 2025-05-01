package br.com.dougSys404.arraysloops.exercises.loops;

import java.util.Scanner;


/*
* Desenvolva um gerador de tabuada
* capz de gerar a tabuada de qualquer número inteiro de 1 a 10.
* O usuário deve informar de qual número ele deseja ver a tabuada.
*
* A saída deve ser conforme o exemplo abaixo:
*
* 5 X 1 = 5
* 5 X 2 = 10
* ....
* 5 X 10 = 50
* */
public final class Ex5_MultiplicationTable {

    public static void multiply(){
        System.out.println("Calling method multiply!");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to muliply: ");
        int number = sc.nextInt();

        System.out.println();
        System.out.println("Multiplication table of: " + number + " started.....");
        for (int i = 1; i <= 10; i++){
            System.out.println( number + " X " + i + " = " + (number * i));
        }
    }
}
