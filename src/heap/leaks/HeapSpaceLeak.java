package heap.leaks;

public class HeapSpaceLeak {

    public static void main(String[] args) throws Exception {
        HeapSpaceLeak memoryTest = new HeapSpaceLeak();
        memoryTest.generateOOM();
    }

    public void generateOOM() throws Exception {
        int iteratorValue = 20;
        for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
            //System.out.println("Iteration " + outerIterator + " Free Mem: " + Runtime.getRuntime().freeMemory());
            int loop1 = 2;
            int[] memoryFillIntVar = new int[iteratorValue];
            // feel memoryFillIntVar array in loop..
            do {
                memoryFillIntVar[loop1] = 0;
                loop1--;
            } while (loop1 > 0);
            iteratorValue = iteratorValue * 5;
            //for debug only
            if (outerIterator == 10) {
                System.out.printf("");
            }
            //System.out.println("\nRequired Memory for next loop: " + iteratorValue);
            Thread.sleep(1000);
        }
    }
}
