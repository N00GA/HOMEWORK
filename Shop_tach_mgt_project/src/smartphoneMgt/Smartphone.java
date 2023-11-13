package smartphoneMgt;

import Enumerations.EquipementState;
import Equipements.Equipement;
import details.Constructor;
import details.MicroProcesseur;
import details.Screen;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//Smartphone is a child of Equipement
//Smartphone is a subclass of Equipement

public class Smartphone extends Equipement {

    private Screen screen;
    private String battery ;
    private double memoryCapacity;
    private int stockingCapacity;

    //methods
    public void print(){
        System.out.println("screen :"+screen);
        System.out.println("battery :"+battery);
        System.out.println("memory capacity :"+memoryCapacity);
        System.out.println("stocking capacity :"+stockingCapacity);
    }

}
