class App {
    public static double getCircumference(Circle circle) {
        // BEGIN (write your solution here)
        return 2 * Math.PI * circle.radius;
        // END
    }

    public static void main(String[] args) {
        Circle circle = new Circle(1, 2, 5);
        System.out.println(App.getCircumference(circle)); // Приблизительно 31.4
    }
}
