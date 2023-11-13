package details;

import Enumerations.Processortype;

public class MicroProcesseur {
    //attributes
    private double vitesse;
    private double NbreCorps;
    private int performacemarque;
    private double ProcessorPerformance;
    private final Processortype Marque=Processortype.other;
    // methode
    public void SetMarqueperformance(){
        if(Marque==Processortype.dragon)
            performacemarque=50;
        if (Marque==Processortype.intel)
            performacemarque=40;
        if (Marque==Processortype.AMD)
            performacemarque=30;
        if (Marque==Processortype.celeron)
            performacemarque=20;
        else
            performacemarque=10;
    }
    public void ProcessorPerformance(){

        ProcessorPerformance=(0.6*vitesse*NbreCorps)+(0.4*performacemarque);
    }

}
