public class SquareGenerator {
    public static Square[] generate(double side, int howMany) {
        Square[] s = new Square[howMany];
        for (int i = 0; i < howMany; i++) {
            s[i] = new Square(side);
        }
        return s;
    }
}
