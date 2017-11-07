package pl.sdacademy.java7krk;

public class Premia {

    /*Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.
If bonus is true, the salary should be multiplied by 10. If bonus is false,
the fatcat did not make enough money and must receive only his stated salary.
Return the total figure the individual will receive as a string prefixed with '£' (JS and Java) */


    public String wyplata(int salary, boolean bonus) {
        if (bonus == true) {

            String value = "$" + salary*10;
            return value;
        } else {
            String value = "$"+salary;
            return value;
        }

    }

}
