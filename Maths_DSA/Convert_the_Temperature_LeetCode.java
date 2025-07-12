package Maths_DSA;

import java.util.Arrays;

public class Convert_the_Temperature_LeetCode {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.50)));
    }

    static double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}


//You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
//
//You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
//
//Return the array ans. Answers within 10-5 of the actual answer will be accepted.
//
//Note that:
//
//Kelvin = Celsius + 273.15
//Fahrenheit = Celsius * 1.80 + 32.00