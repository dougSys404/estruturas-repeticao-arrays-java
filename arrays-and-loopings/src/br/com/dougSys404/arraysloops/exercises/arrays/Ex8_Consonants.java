package br.com.dougSys404.arraysloops.exercises.arrays;

import java.util.Scanner;

/*
* Faça um programa que leia um vetor de 6 caracteres,
* e diga quantas consoantes foram lidas
* Imprima as consoantes
* */
public final class Ex8_Consonants {

    public static void showConsonants(){
        System.out.println("Calling method showConsonants");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        String[] consonants = new String[6];

        int consonantsCounter = 0;

        int count = 0;
        do {

            System.out.print("Enter a letter: ");
            String letter = sc.next();

            if (!(letter.equalsIgnoreCase("a") |
                    letter.equalsIgnoreCase("e") |
                    letter.equalsIgnoreCase("i") |
                    letter.equalsIgnoreCase("o") |
                    letter.equalsIgnoreCase("u"))
            ){
                consonants[count] = letter;
                consonantsCounter++;
                count++;
            }

        } while (count < consonants.length);

        System.out.println("Quantity of consonants: " + consonantsCounter);

        System.out.println("Consonants inputed: ");

        for(String consonant : consonants){
            if (consonant != null) System.out.print("[" + consonant + "] ");
        }

    }
}
