import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExm {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(4,3,6,9);
        List<Integer>result=num.stream().filter(n->n%2==0).map(n->n*n).sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
