package com.mindsaka;

public class XOR extends Elementas {

    @Override
    public void pridetiInput(Elementas in){

        input.add(in);


    }

    @Override
    public boolean gautiRezultata(){

        int count = 0;
        int numberOfTrue = 0;
        System.out.println("Skaiciuojam output AND elementui");
        if(input.isEmpty()){

            return false; // jei neturejo iejimo, tai reiskias pagal nutylejima yra false,

        }else{

            for (Elementas in : input ) {

                Boolean bol = input.get(count).gautiRezultata();

                if(bol == true){
                    numberOfTrue++;
                }

                count++;
            }

            if( numberOfTrue % 2 == 0){
                return false;
            }
        }

       return true;
    }

    }

