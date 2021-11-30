

public class implemtTread {

    public static void main(String[] args) {
        multiThread myT = new multiThread();
        // pasing the newThread to Thread class
        Thread myThread =  new Thread(myT);
        Thread myThread2 =  new Thread(myT);

        myThread.start();
        myThread2.start();
        
    }
    
}
