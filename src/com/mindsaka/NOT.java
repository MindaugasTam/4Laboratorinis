package com.mindsaka;

import com.sun.org.apache.xpath.internal.SourceTree;

public class NOT extends Elementas {

    @Override
    public void pridetiInput(Elementas in){
            if(input.size() == 0 ){ //not gali tureti tik viena input, tai tikrinam ar jis
                                    //neturi esamu input pries pridedant nauja
                input.add(in);
            }else{

                System.out.println("Negaliu sujungti, kol nepasalinsite esamo sujungimo");
            }

    }

    @Override
    public boolean gautiRezultata(){
        System.out.println("Skaiciuojam output NOT elementui");
        if(input.isEmpty()){

            return true; // jei neturejo iejimo, tai reiskias pagal nutylejima yra false,
                            //bet not keicia i priesinga ir gaunasi true
        }
        return !input.get(0).gautiRezultata();

    }


}
