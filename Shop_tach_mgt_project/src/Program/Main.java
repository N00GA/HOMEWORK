package Program;

import Equipements.Equipement;
import PcMgt.Computer;
import PrinterMgt.Printer;
import smartphoneMgt.Smartphone;

public class Main {
    public static void main(String[] args) {
        Equipement E =new Equipement();
        Computer C=new Computer();
        E.print();
        C.print();
        Smartphone S=new Smartphone();
        E.print();
        S.print();
        Printer P=new Printer();
        E.print();
        P.print();

    }

}