package PcMgt;

import Enumerations.ComputerBrand;
import Enumerations.EquipementState;
import Equipements.Equipement;
import details.Constructor;
import details.MicroProcesseur;
import details.Screen;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //generates getters for all fields in the runtime
@Setter  //generates setters for all fields in the runtime
@AllArgsConstructor  //generate a constructor with parameters in the runtime
@NoArgsConstructor   //generate a constructor without parameters in the runtime

//Computer is a child of Equipement
//Computer is a subclass of Equipement
public class Computer extends Equipement {

    private Screen screen ;
    private String battery ;
    private ComputerBrand brand ;


    //methods
    public void print(){
        System.out.println("screen:"+screen);
        System.out.println("battery:"+battery);
        System.out.println("brand:"+brand);
    }
}
