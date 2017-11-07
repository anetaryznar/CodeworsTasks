package pl.sdacademy.java7krk;

public class Rental {

    /* You will need a rental car in order for you to get around in your vacation.
    The manager of the car rental makes you some good offers.
Every day you rent the car costs $40.
If you rent the car for 7 or more days, you get $50 off your total.
Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
Write a code that gives out the total amount for different days(d).
*/

    public float rental(float costDay , int days){
        if(days>=7){
            return (costDay*days)*0.5f;
        }
        if (days>=3){
            return (costDay*days)*0.8f;
        }
        return costDay*days;

    }

}
