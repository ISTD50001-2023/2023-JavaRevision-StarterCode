package BoxingUnboxing;

public class TestLoops {

    public static void main(String[] args) {

    }


    public static void testLoops(){

        int total1 = 0;
        for( int i = 0; i < Integer.MAX_VALUE; i++){
            total1 = total1 + i;
        }

        Integer total2 = 0;
        for( int i = 0; i < Integer.MAX_VALUE; i++){
            total2 = total2 + i;
        }
    }

}
