package pl.sdacademy.java7krk;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //zadanie1();
        //zadanie2();
        //bmi();
        //premia();
        //bus();
        //avarage();
        //future();
        //rental();
        //miles();
        convert();


    }

    public static void convert(){
        ConvertToNumber convertToNumber = new ConvertToNumber();
        int i = convertToNumber.convert("123456");
        System.out.println(i);
    }

    public static void miles(){
        Miles miles = new Miles();
        double disp = miles.mile(2222.349555);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(disp));
    }


    static void rental(){
        Rental rental = new Rental();
        Float payment =rental.rental(40,8);
        System.out.println(payment);
    }

    static void future() {
        Future future = new Future();
        String wiek = future.future(2004,2004);
        System.out.println(wiek);
    }


    static void avarage() {
        Avarage avarage = new Avarage();
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(8);
        float sred = avarage.average(list);

        System.out.println(sred);
    }

    static void bus() {
        Bus bus = new Bus();
        int liczba = bus.autobus(40, 25, 40);

        System.out.println(liczba);
    }


    static void premia() {
        Premia premia = new Premia();
        String wartosc = premia.wyplata(23, true);
        System.out.println(wartosc);


    }


    static void bmi() {
        BMI bmi = new BMI();
        System.out.println(bmi.bmi1);

    }

    static void zadanie2() {

        Punkt punkt = new Punkt();
        Punkt pomocniczyPunkt;


        pomocniczyPunkt = punkt.pobWsp();

        punkt.ustWsp(4, 6);
        System.out.println("wsp x " + pomocniczyPunkt.x);
        System.out.println("wsp y " + pomocniczyPunkt.y);
    }

    static void zadanie1() {
        /*You have to write a function that accepts three parameters:
        cap is the amount of people the bus can hold excluding the driver,
         on is the number of people on the bus, and wait is the number of people waiting to get on to the bus.
         If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.
                */
        int autobus = 45; //wielkosc autobusu
        int siedza = 0; //ilosc juz w autobusie
        int czekaja = autobus - siedza; // ilosc na przystanku


        for (int i = 0; i < autobus; i++) {
            for (int j = 0; j < autobus; j++) {
                siedza++;
                if (siedza < autobus) {
                    System.out.println("ile jeszcze wolnych miejsc przystanek  " + (autobus - siedza));
                    System.out.println("ile juz siedzi" + siedza++);
                }
            }


        }


    }
}