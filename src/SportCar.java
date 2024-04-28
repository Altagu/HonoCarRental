public class SportCar extends Car{


    public SportCar(String brandModel, String fuelType, String plate, String registrationDate, int km){
        super(brandModel, fuelType, plate, registrationDate, km);

        this.info = "manual  gear, > 200 h";
    }

}
