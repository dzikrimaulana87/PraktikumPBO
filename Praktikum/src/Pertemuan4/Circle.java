/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author dzikr
 */
public class Circle {

    double x, y, r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;

    }

    public Circle(double a, double r) {
        this.x = a;
        this.y = r;
        this.r = 1;
    }

    public double keliling() {
        return 2 * 3.14 * r;
    }

    public double luas() {
        return 3.14 * r * r;
    }

}
