import inheritance;
class Animal {
    int code = 10;
    public void sound(){
        System.out.println("Animal makes sound" + code);
    }
}

class Cat extends Animal{
    
    public void sound(){
        System.out.println("cat makes sound meao " + code);
    }

}
class Dogx extends Animal{
    int code  = 2;
    public void sound(){
        System.out.println("dog makes sound \"bhau\"  "+code);
    }
}





public class polymorphism { 

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal cat  =  new Cat();
        Animal dog =  new Dogx();
        myAnimal.sound();
        cat.sound();
        dog.sound();
        cat.code  = 3;

    }
    
}



