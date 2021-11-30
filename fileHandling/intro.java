// import file pkg

// file read and its content

import java.io.File;
import java.util.Scanner;

public class intro {

    public static void main(String[] args) {
        //  creating instance of file Dp var = new Dp(nameOfFile)
        try{
            // creating file object with argument as location of file
            File myFile = new File("/Volumes/Macintosh HD - Data/javaDevelopment/fileHandling/helloNew.txt");
            // checking is file is present with createFile
            if(myFile.createNewFile()){
                System.out.println("file created");
            }else{
                System.out.println("file present");
            }
            // we creat a scnner obj and pass our myfile as argument

            Scanner reader = new Scanner(myFile);
            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
    
            
            } 
        }
        catch(Exception e){
            System.out.println("error");
        }
       
        

    }
    
}
