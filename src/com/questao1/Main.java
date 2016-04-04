package com.questao1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    /*
    Fazer um programa que recebe 3 valores não inteiros do usuário
    e mostra o maior deles, o menor deles e a média
    */
    public static void main(String[] args) {
        // Scanner para fazer a leitura do teclado
        Scanner leitor = new Scanner(System.in);
        // Array com os valores
        float [] valores = new float[3];
        // Boleando para fazer um controle, e finalizar somente se tudo feito corretamente
        boolean concluido = false;
        while (!concluido){
            // Utilizando try-catch para ter certo controle de alguns erros
            try{

                //Digitando valores
                for (int i = 0; i < valores.length; i++) {
                    System.out.println("Digite o numero " + (i + 1) + ": ");
                    valores[i] = leitor.nextFloat();
                }

                // Utilizando o metodo sort() da Classe Arrays para ordenar os
                // valores, desta maneira pegando o menor e o maior valor
                Arrays.sort(valores);

                // Imprimindo o maior valor
                System.out.println("O maior valor é: " + valores[2]);
                // Imprimindo o menor valor
                System.out.println("O menor valor é: " + valores[0]);
                // Imprimindo a média dos valores
                System.out.println("A média dos três valores é: " + (valores[0] + valores[1] + valores[2])/3);

                // setando true para sair do while
                concluido = true;
            }catch (InputMismatchException ex){
                // Prevendo que o usuario pode digitar algo que não seja um número, utilizei a Exception acima
                // e reiniciando o leitor e o array
                System.out.println("Digite somente números !\nReiniciando...\n");
                valores = new float[3];
                leitor = new Scanner(System.in);
            }
        }
    }
}
