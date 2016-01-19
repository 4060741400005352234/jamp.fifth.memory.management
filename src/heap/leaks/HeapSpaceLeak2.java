package heap.leaks;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class HeapSpaceLeak2 {

    private static List<Object> list = new ArrayList<Object>();

    public static void main(String[] args) throws InterruptedException {
        while(true) {
            Thread.sleep(1);
            list.add(new Object());
        }
    }
}
