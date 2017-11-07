package pl.sdacademy.java7krk;

public class ConvertToNumber {

    /*  We need a function that can transform a string into a number. What ways of achieving this do you know?
Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
*/

    public int convert(String number) {

        //return Integer.parseInt(number);



        int ret=0;
        for (int i = 0; i < number.length(); i++) {
           char c =number.charAt(i);
           if(c == '1'){
               ret= ret+1*mult(number.length()-i);
           } else if(c == '2'){
               ret= ret+2*mult(number.length()-i);
           } else if(c == '3'){
                ret= ret+3*mult(number.length()-i);
            } else if(c == '4'){
                ret= ret+4*mult(number.length()-i);
            } else if(c == '5'){
               ret= ret+5*mult(number.length()-i);
           } else if(c == '6'){
               ret= ret+6*mult(number.length()-i);
           } else if(c == '7'){
               ret= ret+7*mult(number.length()-i);
           } else if(c == '8'){
                ret= ret+8*mult(number.length()-i);
            } else if(c == '9'){
                ret= ret+9*mult(number.length()-i);
            } else if(c == '0'){
               ret= ret+0*mult(number.length()-i);
           } else {
                return -100;
           }
        }
        return ret;
    }

    private int mult(int mul){
        int ret =1;
        for(int i=1;i<mul;i++){
            ret*=10;
        }
        return ret;
    }

}
