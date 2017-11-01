package com.mindsaka;

import java.util.ArrayList;

//tai vienas is kvadrateliu ligineje scheoje. Tiek input, tiek kazkoks ir ar xor
//Visi jie turi savo id

public class Elementas {

        int id;
        static int nr = 1; //statinis yra sukuriamas tik karta ir paskui nuolatos
                        //didinamas, kitu atveju sukurus nauja elementa jis vis gautu
                        //pradine reiksme, tai yra 1.
        boolean output; //reiksme, kuri iseina is elemento

        Elementas(){

                id = nr;
                nr++;
                System.out.println("Sukurtas elementas su id: " + id);
        }

        ArrayList<Elementas> input = new ArrayList(); //elementas siejasi su kitu elementu
                              //mes paduodam pati elementa ir taip galim pasiziuret, su kuo
                                //jungiasi ir t.t

        public boolean gautiRezultata(){

                return output;

        }

        public void pridetiInput(Elementas in){ //pasirenkam elementa ir ji sujungiam
                                                //su kitu elementu, taip pridedam input

                input.add(in);

        }

        public void salintiInput(Elementas in){

                input.remove(in);

        }
}
