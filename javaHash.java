// import the hash pkg
import java.util.HashMap;
// hashset also can be used but its like python set where no duplicate



public class javaHash {


    static void NameWithAge(){

        HashMap<String, Integer> NameAge = new HashMap<String, Integer>();
        NameAge.put("ram", 21);
        NameAge.put("durv", 23);
        NameAge.put("yash", 19);
        for (String i : NameAge.keySet()){
            System.out.println("Name : "+i + " , Age : "+ NameAge.get(i) );
        }

    }


    public static void main(String[] args) {
        
        // < data type , data type>
        HashMap<String, String> code = new HashMap<String, String>();
        code.put("lol", "laugh on loud");
        code.put("rip", "rest in peace");
        code.put("dm", "direct message");
        // print code
        System.out.println(code);
        // print by key
        System.out.println(code.get("dm"));
        // size
        System.out.println(code.size());
        // remove
        code.remove("dm");
        System.out.println(code);
        NameWithAge();
        
    }
    
}
