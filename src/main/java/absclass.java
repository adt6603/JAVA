
abstract class Animal {
    abstract void sound();

    public void eat() {
        System.out.println("humans can eat.");
    }
}

class Human extends Animal {

    public void sound() {
        System.out.println("humans can speak");
    }
}


public class absclass {
    public static void main(String[] args) {

        Human h = new Human();

        h.sound();
        h.eat();
    }
}

