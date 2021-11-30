// importing the date 
import java.time.LocalDate;
import java.util.Scanner;


public class dateandScanner
{

public static void main(String[] args) {

  LocalDate time = LocalDate.now();
  System.out.println("enter name"); 
  Scanner input =  new Scanner(System.in);
  String name = input.nextLine();
  System.out.println("your input name " + name + "with to time " + time);

}

} 