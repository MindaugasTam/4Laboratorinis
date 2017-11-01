package com.mindsaka;

public class OR extends Elementas {

    @Override
    public void pridetiInput(Elementas in){

            input.add(in);

    }

    @Override
    public boolean gautiRezultata(){

        int count = 0;
        System.out.println("Skaiciuojam output OR elementui");
        if(input.isEmpty()){

            return false; // jei neturejo iejimo, tai reiskias pagal nutylejima yra false,

        }else{

            for (Elementas in : input ) {

                Boolean bol = input.get(count).gautiRezultata();

                if(bol == true){

                    return true;
                }
                count++;
            }
        }

            return false;
    }


}
