package PrinterMgt;

import Enumerations.EquipementState;
import Enumerations.PrinterBrand;
import Enumerations.PrinterType;
import Equipements.Equipement;
import details.Constructor;
import details.MicroProcesseur;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//Printer is a subclass of equipement
//Printer is a child of equipement

public class Printer extends Equipement {

    private int printSpeed ;
    private int MaxPaperCapacity;
    private PrinterBrand brand=PrinterBrand.HP;
    private PrinterType type=PrinterType.LASER;


    //methods
    public void print (){
        System.out.println("PrintSpeed :"+printSpeed);
        System.out.println("MaxPaperCapacity:"+MaxPaperCapacity);
        System.out.println("PrinterBrand:"+brand);
        System.out.println("PrinterType"+type);
    }



}
