package br.com.dougSys404.arraysloops.exercises.arrays;

import java.util.Random;

/*
* Gere e imprima uma matriz M de 4x4 com valores aleatórios entre 0-9
* */
public class Ex10_MultidimensionalArray {

    public static void showMatrix(){
        Random random = new Random();

        int[][] matrix = new int[4][4];


        for (int line = 0; line < matrix.length; line++){

            for (int column = 0; column < matrix[line].length; column++){

                matrix[line][column] = random.nextInt(9);

            }
        }

        System.out.println("Printing matrix: ");
        for (int[] line : matrix){
            for(int column : line){
                System.out.print("[" + column + "] ");
            }
            System.out.println();
        }
    }
}
