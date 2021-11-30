public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        for(int i = 0; i<3; i++){
            MyThread myThreadThing =  new MyThread(i);
            Thread newThrea1 = new Thread(myThreadThing);
            newThrea1.start();
            newThrea1.join();
           

        }
        
        


    }
}
