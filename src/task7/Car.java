package task7;

public class Car {
    public enum Brand {
        MAZDA, SKODA, VOLVO, BMW
    };
    private String regNumber;
    private Brand brand;
    public Car(String regNumber, Car.Brand brand){
        this.regNumber = regNumber;
        this.brand = brand;
    }
    public String getRegNumber(){
        return regNumber;
    }
    @Override
    public java.lang.String toString() {
        return brand + " " + regNumber;
    }
}
