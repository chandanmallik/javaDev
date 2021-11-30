public class MyThread implements Runnable {

    private int threadNo ;
    public MyThread(int i){
        this.threadNo = i;
    }
    public void run(){


        for( int i = 1 ; i<5;i++){
            System.out.println(i + "Thread no : " + threadNo);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
           
        }
    }
    
}
