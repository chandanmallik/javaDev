public class fizzBuzz {
    
    public static void main(String[] argv){
        int range = 30; 
        for (int i = 1; i<range+1; i++){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + "FizzBuzz");

            }else{
            if (i % 3 == 0){
                System.out.println(i+"Fizz");
            }
            if( i % 5 == 0){
                System.out.println(i+"Buzz");
            }else{
            }
        }
            
        }
    }
}
