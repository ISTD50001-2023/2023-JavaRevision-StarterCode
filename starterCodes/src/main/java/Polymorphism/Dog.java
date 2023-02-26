package Polymorphism;

public abstract class Dog {

    public void bark(){
        System.out.println("woof");
    }

    public void drool(){
        System.out.println("drool");
    }
}

class Hound extends Dog{

    public void sniff(){
        System.out.println("sniff");
    }

    @Override
    public void bark() {
        System.out.println("growl");
    }

    public void drool(int time) {
        System.out.println("drool" + time);
    }
}
