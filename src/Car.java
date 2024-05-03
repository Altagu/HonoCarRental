public class Car {
    private String brandModel;
    private String fuelType;
    private String nrPlate;
    private String regDate;
    private int kmDriven;
    public String info = " ";

    private int id;
    public Car(String brandModel, String fuelType, String nrPlate, String regDate, int kmDriven, int id) {
        this.brandModel = brandModel;
        this.fuelType = fuelType;
        this.nrPlate = nrPlate;
        this.regDate = regDate;
        this.kmDriven = kmDriven;
        this.id = id;
    }
    public String getBrandModel() {
        return brandModel;
    }
    @Override
    public String toString() {
        return id + ", " + brandModel + ", " + fuelType + ", " + nrPlate + ", " + regDate + ", " + kmDriven;
    }
    public String getFuelType(){
        return this.fuelType;
    }
    public String getNrPlate(){
        return this.nrPlate;
    }
    public String getRegDate(){
        return this.regDate;
    }
    public int getKmDriven(){
        return this.kmDriven;
    }
    public int getId() {
        return id;
    }
}
