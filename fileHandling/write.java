
import java.io.File;
import java.util.Scanner;
// importing the FileWriter
import java.io.FileWriter;

public class write {

    static void readingFromFile(File myFile){
        try{
        System.out.println("...........Txt............");
            // Creating Scanner object and passing the myFile object
            Scanner input = new Scanner(myFile);
            // Printing the next line , where hasNext is used and nextLine is used
            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
            System.out.println("...........end............");
        }catch(Exception e){
            System.out.println("error while reading line 20");
        }

    }
    static void myDelete(File myFile){
        // myFile delete method returnt true if delete sucess full
        if (myFile.delete()){
            System.out.println("The file : "+ myFile.getName() + " is being Deleted");
        }else{
            System.out.println("The file : "+ myFile.getName() + " cant be Deleted");
        }
    }



    public static void main(String[] args) {

         // creating  file obj

         try{


            File myFile = new File("/Volumes/Macintosh HD - Data/javaDevelopment/fileHandling/helloNew.txt");
            // calling delete function
            myDelete(myFile);
            // if( myFile.createNewFile()){
            //     System.out.println("File created");
            // }else{
            //     System.out.println("File present");
            // }
            // calling reading function
            readingFromFile(myFile);
            
            // wrting in file
            System.out.println("writing in file");
            // using the file writer and passsing true so that it will not creat a new file
    
            FileWriter myFileWriter = new FileWriter("/Volumes/Macintosh HD - Data/javaDevelopment/fileHandling/helloNew.txt",false);
            String thingsToWrite = "This text is from recent input variable \n-have nice day.";
            // the write method will delete the previos data so use append instead
            // myFileWriter.write(thingsToWrite);
            myFileWriter.append(thingsToWrite);
            // closing the file 
            myFileWriter.close();
    
            System.out.println("writing sucessfull");

            // calling reading function
            readingFromFile(myFile);
            
            
            
    
    
    
           
        }catch( Exception e){
            System.out.println("Cant do operation ,File error.");
        }
    }
    
        
    

       
      


    
}
