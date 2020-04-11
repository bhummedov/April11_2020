package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> num3 = new ArrayList<>();
        for (int i = 0; i < num1.size(); i++) {
            num3.add((num1.get(i) * num2.get(i)));

        }
        System.out.println(num3);

    }
}