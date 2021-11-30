class Game{

    player p1;

    public void startGame(){
        int number = (int) Math.random() * 10;
        p1 = new player();
        p1.guess(6);
        if (number == p1.n){
            System.out.println("Your guess is correct");
        }else{
            System.out.println("your guess is incorrect correct number is "+number);
        }

    } 


    public void end(){
        System.out.println("The game ends");
    }
   




}


class player{

    int n ;
    public void guess(int m){
        this.n =  m;
        System.out.println("Your guessed number is "+ m);
    }

}


public class gameClass {



    public static void main(String[] argv){

        Game g1 = new Game();
        g1.startGame();
        g1.end();


    }
}
