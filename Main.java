package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int yil;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        yil = input.nextInt();

        if(yil%400==0 || yil%4==0){
            System.out.println(yil + " artık yıldır");
        }
        else
            System.out.println(yil +" artık yıl değildir");
    }
}
