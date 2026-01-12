import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringExm {
    //String="Rajesh Kumar Nayak"
    //Output="Nayak Kumar Rajesh"
    public static void main(String[] args) {
        String str="Rajesh Kumar Nayak";
        String[] str1=str.split(" "); // split spaces
        List<String>words= Arrays.asList(str1); // makes a list
        Collections.reverse(words);
        String output=String.join(" ",words);
        System.out.println(output);
    }

}
