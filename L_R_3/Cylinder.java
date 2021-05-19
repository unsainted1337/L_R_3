
public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        height = 3.5;
    }

    public Cylinder (double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }


    public double getVolume() {
        return getArea() * height;
    }

    public String toString() {
        return "The cylinder with height: " + getHeight() + ", color: "+ getColor() +  ". And radius: " + getRadius() +
                ". Also him value of volume equals to: " + getVolume();
    }
}
