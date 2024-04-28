public class FamilyCar extends Car{


    public FamilyCar(String brandModel, String fuelType, String plate, String registrationDate, int km){
        super(brandModel, fuelType, plate, registrationDate, km);
        this.info = "manual gear, air condition, some with cruise control, 7 seats or more";
    }
}
