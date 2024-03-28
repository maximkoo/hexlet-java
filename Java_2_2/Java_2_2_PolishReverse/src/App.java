import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println(calcInPolishNotation("1 2 + 4 * 3 +")); // 15
        System.out.println(calcInPolishNotation("7 2 3 * -")); // 1
    }

    public static int calcInPolishNotation(String str) {
        LinkedList<Integer> list = new LinkedList();
        int i=0;
        int i1=0;
        String s;
        int operand1=0;
        int operand2=0;
        int sum=0;
        while (true){
            i=str.indexOf(" ",i+1);
            if (i==-1){
                break;
            }
            s = str.substring(i1,i);
            i1=i+1;
            if (s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")){
                operand1 = list.pollLast();
                operand2 = list.pollLast();
            }
            switch (s) {
                case ("+"):
                    sum = operand1 + operand2;
                    break;
                case ("-"):
                    sum = operand1 - operand2;
                    break;
                case ("*"):
                    sum = operand1 * operand2;
                    break;
                case ("/"):
                    if (operand2 == 0) {
                        throw new ArithmeticException("Произошло деление на ноль");
                    }
                    sum = operand1 / operand2;
                    break;
                default:
                    list.add(Integer.parseInt(s));
                    break;
            }
            if (s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")){
                list.add(sum);
            }
        }
        return sum;
    }



    public static int calcInPolishNotation2(String str) {
        List<String> items = Arrays.asList(str.split(" "));
        LinkedList<String> list = new LinkedList(items);
        int operand1 = 0;
        int operand2 = 0;
        int sum = 0;
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).equals("+") || list.get(i).equals("-") || list.get(i).equals("*") || list.get(i).equals("/")) {
                operand1 = Integer.parseInt(list.get(i - 2));
                operand2 = Integer.parseInt(list.get(i - 1));

                switch (list.get(i)) {
                    case ("+"):
                        sum = operand1 + operand2;
                        break;
                    case ("-"):
                        sum = operand1 - operand2;
                        break;
                    case ("*"):
                        sum = operand1 * operand2;
                        break;
                    case ("/"):
                        if (operand2 == 0) {
                            throw new ArithmeticException("Произошло деление на ноль");
                        }
                        sum = operand1 / operand2;
                        break;
                }
                list.set(i - 2, Integer.valueOf(sum).toString());
                list.remove(i); // Удаляем отработанный знак
                list.remove(i - 1); //Удаляем второй операнд
                i--;
                i--;
            }
            i++;
        }
        return sum;
    }

}
