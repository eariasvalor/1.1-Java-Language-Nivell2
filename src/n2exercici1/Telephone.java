package n2exercici1;

public class Telephone {
    private String brand;
    private String model;

    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String telCall(String telNumber) {
        return "Trucant al número " + telNumber;
    }
}
