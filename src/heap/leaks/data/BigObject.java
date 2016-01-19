package heap.leaks.data;

public class BigObject {

    private long[] longArray;
    private BigObject bigObject;

    public BigObject() {
        longArray = new long[100];
    }

    public BigObject(BigObject bigObject) {
        longArray = new long[100];
        this.bigObject = bigObject;
    }
}
