public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

        String myString = "yarn";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);

        int r = 5;
        System.out.println(r++);
        System.out.println(r);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";

        int x = 4;
        x += 5;
        System.out.println(x);

        int z = 3;
        int y = 4;
        y *= z;
        System.out.println(y);

        int a = 10;
        int b = 2;
        a /= b;
        b -= a;
        System.out.println(a);
        System.out.println(b);

        int max = Integer.MAX_VALUE;
        System.out.println(max);
        max++;
        System.out.println(max);
        //max value is like a constant you can build in
        //Integer is a wrapper class which is called int.

        byte little = (byte)max;
        System.out.println(little);
    }
}
