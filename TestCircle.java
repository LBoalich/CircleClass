/*
 * Name: Circle
 * Author: Leah Boalich
 * Date: September 8, 2024
 * Assignment: Module 3 Chapter 13 Exercise 9
 * Description: This program creates a Circle class that extends Geometric Object and implements the Comparable interface.  The Object class equals method is overridden.  Three Circle Objects are created to test the compareTo and equals methods with the results displayed to the user.
 */

/*Test the compareTo and equals Circle methods */
public class TestCircle {
    public static void main(String[] args) {
        //Create two Circles
        Object c1 = new Circle(1);
        Object c2 = new Circle(2);
        Object c3 = new Circle(1);
        //Compare the circles
        System.out.println("c1 compared to c2: " + ((Circle)c1).compareTo((Circle)c2));
        System.out.println("c1 compared to c3: " + ((Circle)c1).compareTo((Circle)c3));
        //Check if circles are equal
        System.out.println("c1 equals c2: " + ((Circle)c1).equals(c2));
        System.out.println("c1 equals c3: " + ((Circle)c1).equals(c3));
    }
}
