package com.mindsaka;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class Schema {
    ArrayList<Elementas> elementai = new ArrayList(); //dedam elementas tipo objektus

    public void pridetiInput() { //pridedam inputus, schemos pradzia
        elementai.add(new Input());


    }

    public void pridetiAndelementa() {
        elementai.add(new AND());

    }
    public void pridetiXORelementa() {
        elementai.add(new XOR());

    }

    public void pridetiORelementa() {
        elementai.add(new OR());

    }

    public void pridetiNOTelementa() {
        elementai.add(new NOT());

    }

    public void sujungti(int nuo, int iki) { //nuo kokio iki kokio elemento
                                        //Sujungimas butent ir bus inputo pridejimas

        Elementas in = null,  sis = null;

        for (Elementas e : elementai) {  //varom per visa lista ir ziurim ar atitnka id

            if (e.id == nuo) {

                in = e;
            } else if (e.id == iki) {

                sis = e;
            }
        }

        if (in!= null && sis != null){
            sis.pridetiInput(in); // sis(iki) gauna inputa in objekta
        }else{

            System.out.println("tokiu elementu nera arba bent vieno is ju");
        }
    }



    public boolean gautiRezultata(int id){

        Elementas in = null;

        for (Elementas e : elementai) {

            if (e.id == id) {

                in = e;  //tas in tai yra tam tikras elementas
            }
        }

        if (in != null ){
            return in.gautiRezultata();
        }else{

            System.out.println("tokiu elementu nera ");
        }
        return false;
    }

    public void nustatytiReiksme(int id, boolean r ) { // pagal id pasirenkam elementa ir jam nustatom
                                                       //reiksme true arba false

        Elementas in = null;

        for (Elementas e : elementai) {

            if (e.id == id) {

                in = e;
            }
        }

        if (in != null) {
            if (in.getClass().equals(Input.class)) {  //Vyksta tikrinima ar tai input klases elementas
                                                        //jei ne input, tai negalesim priskirt reiksmes
                in.output = r;   //outputas tampa priskirta reiksme, nes tai pirmieji inputai
                                    //jie neturi i save einanciu reiksmiu
            }
        } else {

            System.out.println("tokiu elementu nera ");

        }
    }

    public void salintiElementa(int id) {

        Elementas in = null;

        for (Elementas e : elementai) {

            if (e.id == id) {

                in = e;
            }
        }

        if (in != null) {
            elementai.remove(in);
            for (Elementas el : elementai) {
                el.input.remove(in);


            }
        }
    }

    public void salintiSujungima(int nuo, int iki){

        Elementas in = null,  sis = null;

        for (Elementas e : elementai) {  //varom per visa lista ir ziurim ar atitnka id

            if (e.id == nuo) {

                in = e;
            } else if (e.id == iki) {

                sis = e;
            }
        }

        if (in!= null && sis != null){
            sis.salintiInput(in); // sis(iki) salina input in - nuo
        }else{

            System.out.println("Sie elementai nera sujungti");
        }
    }

    public void print(){

        for(Elementas e: elementai){

            System.out.println("ID:"+e.id+" " + e.getClass()+" "+ "Output "+e.gautiRezultata()+" jis sujungtas su");
            if(e.input.size()>0) {
                for (Elementas in : e.input) { //tik sio elemento inputai
                    System.out.println("\t" +"ID:"+ in.id+" " + in.getClass());


                }
            }else{

                System.out.println("NERA");
            }
        }
    }
}
