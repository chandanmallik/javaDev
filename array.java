import java.util.Random;

public class array{


    public static void main(String[] args) {
        double x = 10 * Math.random(); //random function
        int[] number ={0,1,2,3,4,5,6};
        String[] days = {"sun", "mon","tue" ,"wed" ,"thus","fri","sat"};
        
        for (int i = 0 ; i <days.length;i++){
           System.out.println(days[i]);
           if (i == number[number.length-1]){         
                System.out.println("weekend is here");
           } 
        }
        System.out.println("random "+(int)x);


    }
}