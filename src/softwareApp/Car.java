package softwareApp;

public class Car implements CarVehicle {
    private String make;
    private String model;
    private int year;
    private int doorNumbers;
    private String fuelType;

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int getDoorNumbers() {
        return doorNumbers;
    }

    @Override
    public void setDoorNumbers(int doors) {
        this.doorNumbers = doors;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    @Override
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
