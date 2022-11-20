import java.lang.constant.Constable;

public class EEG {
    Float price;
    Float heartRate;
    Float electricalConductivity;

    public EEG(Float price, Float heartRate, Float electricalConductivity) {
        this.price = price;
        this.heartRate = heartRate;
        this.electricalConductivity = electricalConductivity;
    }
}//if u want price and heart rate and elect conductivity as subclasses here it is.

 class price extends Courses {
    Float price;
    public price(Float price) {
        this.price = price;
    }
}

     class heartRate extends Courses {
        Float heartRate;
        public heartRate(Float heartRate) {
            this.heartRate = heartRate;
        }

         Constable heartRate() { //just means it's a constant but can change it if u have other ideas and as on.
            return heartRate;
         }
     }
     class electricalConductivity extends heartRate {
        Float electricalConductivity;
        public electricalConductivity(Float electricalConductivity) {
            super(electricalConductivity);
            this.electricalConductivity = electricalConductivity;
        }
    }
