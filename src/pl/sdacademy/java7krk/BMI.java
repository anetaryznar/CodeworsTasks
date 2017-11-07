package pl.sdacademy.java7krk;

public class BMI {

    /*Write function bmi that calculates body mass index (bmi = weight / height ^ 2).
    waga / (wzrost w metrach x wzrost w metrach)

if bmi <= 18.5 return "Underweight"
if bmi <= 25.0 return "Normal"
if bmi <= 30.0 return "Overweight"
if bmi > 30 return "Obese" */


    float weight = 70f;
    float height = 1.82f;
    float iloczyn = height * 2;
    float bmi1 = weight / iloczyn;


    void oblicz() {
        BMI bmi = new BMI();
        bmi.height = iloczyn;
        bmi.weight = weight;

        System.out.println(bmi1);


    }

}
