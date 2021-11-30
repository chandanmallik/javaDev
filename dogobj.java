class Dog{

    int size ;
    String name ;
    String breed;
    void bark(){
        System.out.println(name + " say's raff raff");
    }
}

public class dogobj {
    

    public static void main(String[] args) {
        Dog dogClass1 = new Dog();
        dogClass1.name = "lucky";
        dogClass1.bark();
        Dog dogclass2 = new Dog();
        dogclass2.name = "bruno";
        dogclass2.bark();
    }
}
