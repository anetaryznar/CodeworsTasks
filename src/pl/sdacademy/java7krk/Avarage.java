package pl.sdacademy.java7krk;

import java.util.List;

public class Avarage {

    public float average(List<Integer> liczby) {
        int suma = 0;
        int iloscLiczb = liczby.size();
        for (Integer i : liczby) {
            suma += i;
        }
        return suma/iloscLiczb;
    }


}
