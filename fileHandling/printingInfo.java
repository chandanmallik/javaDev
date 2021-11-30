
import java.io.File;
public class printingInfo {

    public static void main(String[] args) {

    try{
    File myFile = new File("/Volumes/Macintosh HD - Data/javaDevelopment/fileHandling/helloNew.txt");
    System.out.println("File name "+ myFile.getName());
    System.out.println("File path"+myFile.getPath());
    System.out.println("File abs path"+myFile.getAbsolutePath());
    System.out.println("File length"+myFile.length());
    System.out.println("File write" +myFile.canWrite());
    System.out.println("File read "+ myFile.canRead());

    }catch(Exception e){
        System.out.println("Error in file handling");
    }
    
}
}
