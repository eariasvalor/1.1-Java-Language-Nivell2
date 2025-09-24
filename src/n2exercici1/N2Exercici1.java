package n2exercici1;

public class N2Exercici1 {
    public static void main(String[] args) {
        SmartPhone iPhone = new SmartPhone("iPhone", "14 Pro");

        System.out.println(iPhone.telCall("659747876"));
        System.out.println(iPhone.takePhoto());
        System.out.println(iPhone.alarm());
    }
}
