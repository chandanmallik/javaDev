import java.util.logging.Level;

class Outer{
   int x = 5;

    class Inner {
        int y = 8;
    }
}

public class inheritance {

    public static void main(String[] args) {

        enum level {
           i,
           o,
           p,
        }
        
        level b = level.i;
        Outer outerClass = new Outer();
        Outer.Inner inner = outerClass.new Inner();
        System.out.println(outerClass.x + inner.y );
        System.out.println(b);
        
    }
    
}
