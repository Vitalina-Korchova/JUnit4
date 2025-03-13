package edu.korchova;

/*
    @author Віталіна
    @project Default (Template) Project
    @class ${NAME}
    @version 1.0.0
    @since 13.03.2025 - 16-56
*/

public class Main {
    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid(10,6,5,7,7);

        System.out.println( trapezoid.getAngleBetweenSides());
    }
}