package n2exercici1;

public class SmartPhone extends Telephone implements Camera, Clock {
    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    public String takePhoto() {
        return "S'està fent una foto.";
    }

    public String alarm() {
        return "Està sonant l'alarma.";
    }

}
