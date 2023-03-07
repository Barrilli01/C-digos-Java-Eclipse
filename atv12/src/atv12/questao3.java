package atv12;

import java.util.Random;

public class questao3 {

    public static void main(String[] args) {
        Random random = new Random();
        int matrizA[][] = new int[4][4];
        int matrizB[][] = new int[4][4];
        int matrizC[][] = new int[4][4];
        int cont = 0;
        
        System.out.println("Matriz A");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = random.nextInt(10);
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }    

        System.out.println("");
        System.out.println("Matriz B");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = random.nextInt(10);
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }
        //X
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    cont += matrizA[i][k] * matrizB[k][j];

                }
                matrizC[i][j] = cont;
                cont = 0;

            }

        }
        System.out.println("Matriz resultado");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = random.nextInt(10);
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
