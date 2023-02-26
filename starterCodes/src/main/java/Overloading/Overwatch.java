package Overloading;

public class Overwatch {

    public void log(Integer x){
        System.out.println(x.toString());
    }

    public void log(String s){
        System.out.println(s);
    }

    public void log(int i){
        System.out.println("int " + i);
    }
}

// TODO 1 - Write code to invoke all three methods

