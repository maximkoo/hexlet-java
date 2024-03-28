//package io.hexlet;
class App {
    // BEGIN (write your solution here)
    public static double getSquare(double a, double b, double angle){
        return 0.5 * a*b*Math.sin(Math.PI * angle / 180);
    }
    // END

    public static void main(String[] args) {
        System.out.println(getSquare(10,14.2,45));
    }
}
