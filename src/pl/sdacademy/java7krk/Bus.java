package pl.sdacademy.java7krk;

public class Bus {


    public int autobus (int cap, int on, int wait){
         if (cap-on>wait){
             return 0;
         }else{
             return cap-on;
         }


    }

}
