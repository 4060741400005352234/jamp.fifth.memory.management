package heap.leaks;

public class StackOverflowExample {

    public static void main(String[] args) throws Exception {
        A a = new A();
    }

    private static class A {
        private B bInstance = null;

        public A() throws InterruptedException {
            Thread.sleep(500);
            bInstance = new B();
        }
    }

    private static class B {
        private A aInstance = null;

        public B() throws InterruptedException {
            Thread.sleep(500);
            aInstance = new A();
        }
    }
}
