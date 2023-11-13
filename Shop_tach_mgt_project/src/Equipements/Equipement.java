package Equipements;

import Enumerations.EquipementState;
import details.Constructor;
import details.MicroProcesseur;

//Equipement is a superClass of Computer,Smartphone,Printer
//Equipement is a Parent of Computer,Smartphone,Printer
//Equipement is a base class of Computer,Smartphone,Printer
public class Equipement {
    private long id ;
    private String name ;
    private double price ;
    private MicroProcesseur processeur ;
    private Constructor constructor;
    private EquipementState state=EquipementState.IN_STOCK;

    //methods
    //print all the details of equipement

    public void print(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("price:"+price);
        System.out.println("processeur:"+processeur);
        System.out.println("constructor:"+constructor);
        System.out.println("state:"+state);
    }
}
