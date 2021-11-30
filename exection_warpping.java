public class exection_warpping {

    public static void main(String[] args) {
        // warpping

        Integer x = 100;
        Character name  = 'a';
        String value = x.toString();
        System.out.println(value.length());
        // printing values from warpping
        System.out.println("this is from normal" + x);
        System.out.println("this is from the warpping class"+x.intValue() + " and for string " +  name.charValue());



        // try and catach book

        int number = 2;

        try{
            // finding splits if 0 comes it will through error as 0 cant be in denominator 
            int moneyDivide = 200 / number;
            System.out.println("for "+ number +" of people split money is "+ moneyDivide);
        }catch (Exception e){
            // cating the e with data type exception
            System.out.println("who will pay the money , if ZERO people is there.\nYou clever person !!");
            System.out.println(e);
        }
        
    }
    
}
