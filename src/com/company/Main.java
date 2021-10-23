package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Numarul de playeri: ");
        int P=keyboard.nextInt();

        System.out.println("Numarul de culori n: ");
        int N=keyboard.nextInt();

        System.out.println("Numarul de alegeri k: ");
        int K=keyboard.nextInt();

        System.out.println("Numarul maxim de culori care pot fi alese m: ");
        int M=keyboard.nextInt();


        Mmind joc=new Mmind(N,M,K,P);
        System.out.println("A castigat jucatorul "+ joc.start(P));
    }
}
