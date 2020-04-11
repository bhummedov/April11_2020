package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        ArrayList<Integer> numReversed = new ArrayList<>();
//        for (int i = num.size(); i >= 0; i--) {
//            numReversed.add(i);
//        }
//        System.out.println(numReversed);

        int temp;
        int index = num.size() - 1;
        for (int i = 0; i < num.size() / 2; i++) {
            for (int j = 0; j < num.size(); j++) {
                if (j <index) {
                    System.out.println(j);
                }
                 else if (num.get(j) > num.get(j + 1)) {
                       int k = num.get(i);
                        num.remove(j);
                        num.add(j, num.get(j));
                        num.remove(j + 1);
                        num.add(j);
                        j = -1;
                    System.out.println(num);
                    }
                }
            }
        }
    }
