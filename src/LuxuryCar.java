public class LuxuryCar extends Car{


    public LuxuryCar(String brandModel, String fuelType, String plate, String registrationDate, int km){
        super(brandModel, fuelType, plate, registrationDate, km);
        this.info = ">3000 ccm, automatic gear, air condition, cruise control, leather seats";
    }
}
