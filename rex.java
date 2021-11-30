/* There are two package 


    1. pattern      
    2. matcher

    the matcher returnm the bool data type
    which indicated match as True and Flase if no match
    

*/
// imports

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class rex {


    public static void main(String[] args) {


        // pattern
        Pattern toSeaerch = Pattern.compile(".^w3|school$",Pattern.CASE_INSENSITIVE);

        // matcher
        //  we have to use . operator on the variable use in pattern data type

        Matcher sentence =  toSeaerch.matcher("i have w3 lerned stuffs from f3 school");


        // find if found or not

        if(sentence.find()){

            System.out.println("We found a match " +  toSeaerch.toString());
        }
        else{
            System.out.println("No match");
        }



        
        
    }
    
}
