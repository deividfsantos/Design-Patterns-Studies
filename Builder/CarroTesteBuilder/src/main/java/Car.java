public class Car {

    private String color;
    private String licensePlate;
    private String brand;
    private String model;
    private int year;

    public Car(){

    }

    public Car(String color, String licensePlate, String brand, String model, int year) {
        this.color = color;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "\n\nCar{" +
                "\ncolor='" + color + '\'' +
                "\nlicensePlate='" + licensePlate + '\'' +
                "\nbrand='" + brand + '\'' +
                "\nmodel='" + model + '\'' +
                "\nyear=" + year +
                '}';
    }
}
