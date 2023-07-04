package com.exemple;

import java.util.Scanner;

public class Lista {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String produto1, produto2, produto3;
        double  preco1, preco2, preco3, menor;

        System.out.println("Escreva o nome do produto");
        produto1 = entrada.next();
        System.out.println("Escreva o nome do produto");
        produto2 = entrada.next();
        System.out.println("Escreva o nome do produto");
        produto3 = entrada.next();


        System.out.println("Escreva o preço do produto");
        preco1 = entrada.nextDouble();
        System.out.println("Escreva o preço do produto");
        preco2 = entrada.nextDouble();
        System.out.println("Escreva o preço do produto");
        preco3 = entrada.nextDouble();


        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("O produto de menor preço é:" +
                    "Produto:"+ produto1 +
                    "Preço:"+ preco1);
        } else if(preco2 < preco1 && preco2 < preco3) {
            System.out.println("O produto de menor preço é:" +
                    "Produto:" + produto2 +
                    "Preço:" + preco2);
        } else if (preco3 < preco2 && preco3 < preco1) {
            System.out.println("O produto de menor preço é:" +
                    "/n Produto: " + produto3 +
                    "/n Preço: " + preco3);
        }


    }
}
