package Collections;
import java.util.ArrayList;

public class SentenceArray {
    public static void main(String[] args) {
//       String sentence = "";
//       ArrayList<Character> myArr = new ArrayList<>();
//        for (int i=0; i<sentence.length(); i++){
//            myArr.add(sentence.charAt(i));
//        }
//            System.out.println(myArr);
//    }
//}
//
       String letters = "abscdefgddfdg";
      //  System.out.println(letters.charAt((int)(Math.random()*letters.length())));
       ArrayList <String> words = new ArrayList<>();
       String word;
       for (int i=0; i<100; i++){
           word="";
           for (int j=0; j<5; j++){
            word+=letters.charAt((int)(Math.random()*letters.length()));
           }
           words.add(word);
       }
        System.out.println(words);
     }
}