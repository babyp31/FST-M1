package activities;

public class Car {
    String  color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public Car( String color, String transmission, int make)
    {
        this.tyres=4;
        this.doors=4;
        this.color = color;
        this.transmission = transmission;
        this.make = make;
    }

    public void displayCharacteristics( )

    {
       System.out.println("display car colour " + color);
        System.out.println("display car  transmission " + transmission);
        System.out.println("display car mak e" + make);
        System.out.println("display car tyre " + tyres);
        System.out.println("display car door " + doors);

    }

    public void accelarate(){
        System.out.println("Car is moving forward");
    }

    public void brake()
    {
        System.out.println("Car has stopped");
    }
}
