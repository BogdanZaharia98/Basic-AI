package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Mmind {

    int n,m,k;
    ArrayList<Integer> state=new ArrayList<>();


    public Mmind(int n, int m, int k, int p){
        if(p==1)
            this.init(n,m,k);
        else

            this.init2(n,m,k);

    }
    public void init2(int n,int m,int k) {
        this.n=n;
        this.m=m;
        this.k=k;
    }
    public ArrayList<Integer> init(int n,int m,int k)
    {ArrayList<Integer> list=new ArrayList<>();
        this.n=n;
        this.m=m;
        this.k=k;
        Random rand=new Random();
        int c;
        for(int j = 0; j<k; j++) {
            c = rand.nextInt(n-1);
            int s = 0;
            for (int l = 0; l < j; l++) {

                if (c == list.get(l))
                    s++;
                if (s > m) {
                    c = rand.nextInt(n-1);
                    l = 0;
                }
            }

            list.add(c);
        }
        state=list;
        return list;
    }




    public int nrMatches(ArrayList<Integer> state){
        int s=0;

        for(int i=0;i<k;i++)
            if(state.get(i)==this.state.get(i))
                s++;

        return s;
    }

    public int runda(ArrayList<Integer> list){
        int p=0;
        if(list.size()<k)
            System.out.println("Prea putine alegeri");
        else
        return nrMatches(list);


        return p;
    }


    public int start(int nr){
        Scanner keyboard = new Scanner(System.in);
        int p=-1;
        if (nr==2){
            System.out.println("Jucatorul 1 introduce "+k+" culori:");
            ArrayList<Integer> list=new ArrayList<>();
            for (int i=0;i<k;i++){
                int s=0;
                int X=keyboard.nextInt();
                if(i>1)
                    for(int j=0;j<i-1;j++){
                        if(X==list.get(j))
                            s++;
                        if(s>m){
                            System.out.println("Nu mai avet voie sa introduceti culoarea "+X);
                            j=0;s=0;
                            X=keyboard.nextInt();
                        }
                    }
                list.add(X);
            }
            state=list;


        System.out.println("Jucatorul 2 introduce "+k+" culori:");
        list=new ArrayList<>();
        for (int i=0;i<k;i++){
            int s=0;

            int X=keyboard.nextInt();
            if(i>1)
                for(int j=0;j<i-1;j++){
                    if(X==list.get(j))
                        s++;
                    if(s>m){
                        System.out.println("Nu mai avet voie sa introduceti culoarea "+X);
                        j=0;s=0;
                        X=keyboard.nextInt();
                    }
                }
            list.add(X);
        }
        int s=0;
        while(runda(list)<k&&s<2*n){
            s++;
            System.out.println(runda(list)+" culori ghicite.");
            System.out.println("Jucatorul 2 introduce "+k+" culori:");
            list=new ArrayList<>();
            for (int i=0;i<k;i++){
                s=0;
                int X=keyboard.nextInt();
                if(i>1)
                    for(int j=0;j<i-1;j++){
                        if(X==list.get(j))
                            s++;
                        if(s>m){
                            System.out.println("Nu mai avet voie sa introduceti culoarea "+X);
                            j=0;s=0;
                            X=keyboard.nextInt();
                        }
                    }
                list.add(X);
            }
        }
        if(runda(list)==k)
            p=2;
        else p=1;
        }
        else
            if(nr==1) {
                System.out.println("Jucatorul 2 introduce "+k+" culori:");
                ArrayList<Integer> list=new ArrayList<>();
                for (int i=0;i<k;i++){
                    int s=0;
                    int X=keyboard.nextInt();
                    if(i>1)
                        for(int j=0;j<i-1;j++){
                            if(X==list.get(j))
                                s++;
                            if(s>m){
                                System.out.println("Nu mai avet voie sa introduceti culoarea "+X);
                                j=0;s=0;
                                X=keyboard.nextInt();
                            }
                        }
                    list.add(X);
                }
                int s=0;
                while(runda(list)<k&&s<2*n){
                    s++;
                    System.out.println(runda(list)+" culori ghicite.");
                    System.out.println("Jucatorul 2 introduce "+k+" culori:");
                    list=new ArrayList<>();
                    for (int i=0;i<k;i++){
                        s=0;
                        int X=keyboard.nextInt();
                        if(i>1)
                            for(int j=0;j<i-1;j++){
                                if(X==list.get(j))
                                    s++;
                                if(s>m){
                                    System.out.println("Nu mai avet voie sa introduceti culoarea "+X);
                                    j=0;s=0;

                                    X=keyboard.nextInt();
                                }
                            }
                        list.add(X);
                    }
                }
                if(runda(list)==k)
                    p=2;
                else p=1;

            }
            else
            {
                p=minimax();

            }


        return p;
    }

    public int minimax(){
        int p=-1;


        return p;
    }




}
