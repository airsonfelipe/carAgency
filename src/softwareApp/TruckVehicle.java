package softwareApp;

public interface TruckVehicle extends Vehicle {
    double getCargoCapacity();
    void setCargoCapacity(double capacity);
    String getTransmissionType();
    void setTransmissionType(String type);
}
