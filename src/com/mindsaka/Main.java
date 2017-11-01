package com.mindsaka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Schema s = new Schema();
        //s.print();
        System.out.println("---------");
        s.pridetiInput();
        s.pridetiInput();
        s.pridetiInput();
        s.pridetiInput();
        s.pridetiNOTelementa();
        s.pridetiAndelementa();
        s.pridetiORelementa();
        s.pridetiXORelementa();

        System.out.println("--------");
        s.nustatytiReiksme(1, false);
        s.nustatytiReiksme(2, true);
        s.nustatytiReiksme(3, true);
        s.nustatytiReiksme(4, false);
        System.out.println("----------");
        s.sujungti(1,5);
        s.sujungti(1,6);
        s.sujungti(2,6);
        s.sujungti(3, 6);
        s.sujungti(3, 7);
        s.sujungti(4,7);
        s.sujungti(5,8);
        s.sujungti(6,8);
        s.sujungti(7,8);
        s.print();
        System.out.println("---------");


    }
}
