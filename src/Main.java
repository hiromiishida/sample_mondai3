import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeNewArray(new int[]{3, 2, 1, 6, 5, 4}));
    }

    private static List<Integer> makeNewArray(int[] in){
        List<Integer> out = new ArrayList<>();
        int i, tail;
        out.add(in[0]);
        for(i = 1 ; i <= in.length - 1 ; i++){
            tail = out.get(out.size() - 1);
            out.add(tail + in[i]);
        }
        return out;
    }
}