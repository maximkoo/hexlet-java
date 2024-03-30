public class App {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Aston Martin", "V8 Vantage", 2011),
                new Car("Ford", "VWindstar", 1998),
                new Car("Lotus", "Exige", 2006)
        };
        var car1 = new Car("Lotus", "Exige", 2006);
        System.out.println(App.contains(cars, car1)); // true
        var car2 = new Car("Lotus", "Exige", 2009);
        System.out.println(App.contains(cars, car2));// false
    }

    public static boolean contains(Car[] cars, Car car) {
        boolean res = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(car)) {
                res = true;
                return true;
            }
        }
        return res;
    }
}
