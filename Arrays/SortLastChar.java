import java.util.*;

public class SortLastChar {
    public static void main(String[] args) {
        String[] str = {"Apple","Banana","Mango","Orange","Guava"};
        Arrays.sort(str, (a, b) ->{//Sorts acc to last char of a particular string
            return a.charAt(a.length()-1) - b.charAt(b.length()-1);
        });
        //Arrays.sort(str);//Sorts acc to first char of a particular string,if the 1st char of two values are same then it checks the sorts acc to next char
        System.out.println(Arrays.toString(str));
    }
}
