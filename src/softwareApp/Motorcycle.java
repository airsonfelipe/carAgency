package softwareApp;

public class Motorcycle implements MotorVehicle {
    private String make;
    private String model;
    private int year;
    private int wheelsNumbers;
    private String motorcycleType;

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
    public int getWheelsNumbers() {
        return wheelsNumbers;
    }

    @Override
    public void setWheelsNumbers(int wheels) {
        this.wheelsNumbers = wheels;
    }

    @Override
    public String getMotorcycleType() {
        return motorcycleType;
    }

    @Override
    public void setMotorcycleType(String type) {
        this.motorcycleType = type;
    }
}
