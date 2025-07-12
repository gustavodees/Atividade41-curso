package principal;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contarPar, pares;
        System.out.println("Quantos numeros você vai digitar? ");
        int n = input.nextInt();
        int[] par = new int[n];

        for (int i = 0; i < par.length; i++) {
            System.out.println("Digite um número");
            par[i] = input.nextInt();
        }
        contarPar = 0;
        for (int i = 0; i < par.length; i++) {
            if (par[i] % 2 == 0) {
                contarPar++;

            }
        }

        for (int i = 0; i < par.length; i++) {
            if (par[i] % 2 == 0) {
                System.out.println("Numeros pares: " + par[i]);
            }
        }

        System.out.println("Quantidade de pares: " + contarPar);


    }
}