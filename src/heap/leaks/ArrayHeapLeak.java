package heap.leaks;

import java.util.ArrayList;
import java.util.List;

public class ArrayHeapLeak {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        while(true) {
            list.add(new Object());
        }
    }
}

