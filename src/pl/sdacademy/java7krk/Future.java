package pl.sdacademy.java7krk;

public class Future {
    /*Your task is to write a function that takes two parameters:
     the year of birth and the year to count years in relation to.
      As Philip is getting more curious every day he may soon
      want to know how many years it was until he would be born,
       so your function needs to work with both dates in the future and in the past.
Provide output in this format: For dates in the future: "You are ... year(s) old."
For dates in the past: "You will be born in ... year(s)."
 If the year of birth equals the year requested return: "You were born this very year!"*/



    public String future(int yearOfBirth, int yearInRelationTo){

        if (yearOfBirth<yearInRelationTo){
            int res = yearInRelationTo-yearOfBirth;
            return "You are "+ res +" year(s) old" ;

        }
        if(yearOfBirth>yearInRelationTo){
            int will = yearOfBirth-yearInRelationTo;
            return "You will be born in" +will +" year(s).";

        }
        return "You were born this very year!";

    }

}
