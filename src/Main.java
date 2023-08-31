import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

/* Task 2-Написать программу, которая должна найти и вывести повторяющийся символ в слове «Hello»*/
        String s = "Hello";
        char[] symbol = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            symbol[i] = s.charAt(i);
            System.out.println(symbol[i] + " -" + i);
            //if(symbol[i-1] > 0 && symbol[i] <= symbol[symbol.length-1] && symbol[i-1]==symbol[i]){
            //System.out.println(symbol[i]);
            //}
        }
        System.out.println(Arrays.toString(symbol));


        char[] symbol1 = s.toCharArray();
        for (char c : symbol1) {
            System.out.print(c);
        }
        System.out.println();
        for (int i = 0; i < symbol1.length - 1; i++) {
            for (int j = i + 1; j < symbol.length; j++) {
                if (symbol[i] == symbol[j]) {
                    System.out.println("Повторяющийся символ- " + symbol[i] + " с индексом- " + (i + 1));
                }
                break;
            }
        }
    }

}