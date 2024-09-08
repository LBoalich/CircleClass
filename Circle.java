/*Circle class with 3 constructors */
public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
        " and the radius is " + radius);
    }

    //Implement the compareTo method defined in Comparable
    @Override 
    public int compareTo(Circle o) {
        if (getArea() > o.getArea()) 
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    //Override the Object class equals method
    @Override 
    public boolean equals(Object o) {
        //Check that o is an instance of Circle
        if (o instanceof Circle) {
            //Explicit downcasting
            Circle c = (Circle)o;
            if (this.radius == c.getRadius())
                return true;
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
