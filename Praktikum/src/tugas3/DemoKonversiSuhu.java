/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author dzikr
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();

        double celsius = 25.0;
        double fahrenheit = 77.0;

        System.out.println(celsius + " derajat Celsius ke Fahrenheit: " + konversiSuhu2.celciusToFahrenheit(celsius));
        System.out.println(celsius + " derajat Celsius ke Reamur: " + konversiSuhu2.celciusToReamur(celsius));
        System.out.println(fahrenheit + " derajat Fahrenheit ke Reamur: " + konversiSuhu2.fahrenheitToReamur(fahrenheit));
    }
}