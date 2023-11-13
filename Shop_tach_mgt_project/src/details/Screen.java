package details;

import Enumerations.ScreenType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Screen {
    //methodes
    private int performance_type;
    private double taille ;
    private double ScreenPerformance ;
    private ScreenType Type=ScreenType.other;
    //attributes
    public void setPerformance_type(){
        if(Type==ScreenType.super_amoled)
            performance_type=60;
        if(Type==ScreenType.retina)
            performance_type=50;
        if(Type==ScreenType.LED)
            performance_type=30;
        if(Type==ScreenType.amoled)
            performance_type=40;
        if(Type==ScreenType.LCD)
            performance_type=20;
        else
            performance_type=10;
    }
    public void SetScreenPerformance(){

        ScreenPerformance=(0.3*taille)+(0.7*performance_type);
    }
}
