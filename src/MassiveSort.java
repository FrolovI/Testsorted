import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MassiveSort {
    List<Integer> input = new ArrayList<>(Arrays.asList(1, 3, 0, 0, 5, 0, 18, 0, 0));

    public void sortedComp() {
        Collections.reverse(input);
        input.sort((o1, o2) -> o1 == 0 ? 1 : -1);
        for (Integer integer : input) {
            System.out.print(integer + " ");
        }
    }


}
