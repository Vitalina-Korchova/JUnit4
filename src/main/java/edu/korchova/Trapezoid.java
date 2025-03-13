package edu.korchova;

/*
    @author Віталіна
    @project JUnit4
    @class Trapezoid
    @version 1.0.0
    @since 13.03.2025 - 16-57
*/

public class Trapezoid {

    private double baseFirst; // перша основа
    private double baseSecond; // друга основа
    private double height; // висота
    private double sideFirst; // перша сторона
    private double sideSecond; // друга сторона

    public Trapezoid(double baseFirst, double baseSecond, double height, double sideFirst, double sideSecond) {
        this.baseFirst = baseFirst;
        this.baseSecond = baseSecond;
        this.height = height;
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
    }

    public double getBaseFirst() {
        return baseFirst;
    }

    public void setBaseFirst(double baseFirst) {
        this.baseFirst = baseFirst;
    }

    public double getBaseSecond() {
        return baseSecond;
    }

    public void setBaseSecond(double baseSecond) {
        this.baseSecond = baseSecond;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideFirst() {
        return sideFirst;
    }

    public void setSideFirst(double sideFirst) {
        this.sideFirst = sideFirst;
    }

    public double getSideSecond() {
        return sideSecond;
    }

    public void setSideSecond(double sideSecond) {
        this.sideSecond = sideSecond;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "baseFirst=" + baseFirst +
                ", baseSecond=" + baseSecond +
                ", height=" + height +
                ", sideFirst=" + sideFirst +
                ", sideSecond=" + sideSecond +
                '}';
    }


    //площа
    public double getArea() {
        return ((baseFirst + baseSecond) / 2) * height;
    }

    //периметр
    public double getPerimeter() {
        return baseFirst + baseSecond + sideFirst + sideSecond;
    }

    //перевірка чи є трапеція рівнобічна
    public boolean isIsosceles() {
        return sideFirst == sideSecond;
    }

    //перевірка чи є трапеція прямокутною
    public boolean isRightAngled() {
        return (height * height) + (baseSecond - baseFirst) * (baseSecond - baseFirst) == sideFirst * sideFirst ||
                (height * height) + (baseSecond - baseFirst) * (baseSecond - baseFirst) == sideSecond * sideSecond;
    }

    // Обчислення середньої лінії (середини між основами)
    public double getMidSegment() {
        return (baseFirst + baseSecond) / 2;
    }

    //  перевірка чи є трапеція рівносторонньою
    public boolean isEquilateral() {
        return baseFirst == baseSecond && sideFirst == sideSecond && height == sideFirst;
    }

    //  діагональ трапеції
    public double getDiagonal() {
        return Math.sqrt(Math.pow(baseSecond - baseFirst, 2) + Math.pow(height, 2));
    }

    // обчислення кута між основами (якщо трапеція прямокутна)
    public double getBaseAngle() {
        if (isRightAngled()) {
            return Math.toDegrees(Math.atan(height / (baseSecond - baseFirst)));
        }
        return -1;
    }

    //  обчислення кута між сторонами трапеції
    public double getAngleBetweenSides() {
        double cosTheta = (Math.pow(sideFirst, 2) + Math.pow(baseFirst - baseSecond, 2) -
                Math.pow(sideSecond, 2)) / (2 * sideFirst * (baseFirst - baseSecond));
        return Math.toDegrees(Math.acos(cosTheta));
    }

    //обчислення кута між діагоналями трапеції
    public double getDiagonalAngle() {
        double cosTheta = (Math.pow(baseFirst - baseSecond, 2) + Math.pow(sideFirst, 2) -
                Math.pow(sideSecond, 2)) / (2 * (baseFirst - baseSecond) * sideFirst);
        return Math.toDegrees(Math.acos(cosTheta));
    }

}
