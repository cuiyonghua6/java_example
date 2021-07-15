package core_java.a3_various_centence;

public class Test_While_For_If {
    public static void main(String[] args) {
        int x = 10;
        while( x < 20 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }

        do{
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }while( x < 20 );

        for(x=10; x < 20; x = x+1) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }

        //Java 增强 for 循环
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x1 : numbers){
            if( x1 == 30 ) {
                continue;
            }
            System.out.print( x1 );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }

        int x2 = 30;

        if (x2 == 10){
            System.out.print("Value of X is 10");
        }else if( x2 == 20 ){
            System.out.print("Value of X is 20");
        }else if( x2 == 30 ){
            System.out.print("Value of X is 30");
        }else{
            System.out.print("这是 else 语句");
        }
    }
}
