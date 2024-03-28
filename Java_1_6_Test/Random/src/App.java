public class App {
    public static void main(String[] args) {
        var seq = new Random(100);
        var result1 = seq.getNext();
        var result2 = seq.getNext();

        System.out.println(result1);
        System.out.println(result2);
        //result1 != result2; // true

        seq.reset();

        var result21 = seq.getNext();
        var result22 = seq.getNext();

        System.out.println(result21);
        System.out.println(result22);
        //result1 == result21; // true
        //result2 == result22; // true
        for (int i = 0; i < 20; i++) {
            System.out.println(seq.getNext());
        }
    }
}
