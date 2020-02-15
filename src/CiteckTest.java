import java.util.*;

public class CiteckTest {

    public static void main(String[] args) {
        // Задание 1
        int[] mass = {1, 2, 3, 2, 4, 1, 5, 6 , 1};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i: mass) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList list = new ArrayList((map.entrySet()));
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        for(Object o: list)
            System.out.println(o);

        // Задание 2, строка метода - 31;
        System.out.println(check());

        // Задание 3, строка метода - 44
        replace0();

    }

    public static boolean check() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[')
                counter--;
            if(str.charAt(i) == ')' || str.charAt(i) == ']')
                counter++;
        }
        return counter == 0;
    }
    public static void replace0() {
        Scanner in = new Scanner(System.in);
        String dig = in.nextLine();
        StringBuilder str = new StringBuilder(dig);

        int index = dig.lastIndexOf('0');


        str.setCharAt(index, '1');
        int result = Integer.parseInt(str.toString());

        System.out.println(result);
    }
}
