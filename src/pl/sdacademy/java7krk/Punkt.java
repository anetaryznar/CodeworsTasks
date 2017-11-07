package pl.sdacademy.java7krk;

public class Punkt {


    int x = 5;
    int y = 6;


    int pobierzX() {
        return x;
    }

    int pobierzY() {
        return y;
    }

    void ustWsp(int wspX, int wspY) {
        x = wspX;
        y = wspY;
    }

    Punkt pobWsp() {
        Punkt punkt = new Punkt();

        punkt.x = x;
        punkt.y = y;

        return punkt;

    }

}
