package p1;

public class A {

    private int a;

    A( int a){
        this.a = a;
    }

    protected int getA(){
        return a;
    }

    int get2A(){
        return 2*a;
    }

    private int get3A(){
        return 3*a;
    }
}
