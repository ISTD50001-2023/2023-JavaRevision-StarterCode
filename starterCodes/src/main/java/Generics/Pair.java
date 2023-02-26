package Generics;

public class Pair <F, S> {

    private F first;
    private S second;

    Pair(F first, S second){
        this.first = first;
        this.second = second;
    }

    //TODO put the getters in yourselves

    public Pair<S,F> swap (){
        return new Pair(second, first);
    }
}
