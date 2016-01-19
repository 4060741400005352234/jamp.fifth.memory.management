package heap.leaks;

import heap.leaks.data.BigObject;

public class HeapSpaceLeak2 {

    public static void main(String[] args) throws InterruptedException {
        BigObject bigObject = new BigObject();
        while(true) {
            bigObject = new BigObject(bigObject);
        }
    }
}
