package heap.leaks.data;

public class BigObject {

    private long[] longArray = new long[10];
    private BigObject bigObject;
    private long arrSize;

    public BigObject() {
    }

    public BigObject(BigObject bigObject) {
        this.bigObject = bigObject;
        arrSize = longArray.length;
    }
}
