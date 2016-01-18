package perm.leaks;

import javassist.ClassPool;

public class PermGenLeak {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100000000; i++) {
            generate("jamp.perm.leak.Generated" + i);
        }
    }

    public static Class generate(String name) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        return pool.makeClass(name).toClass();
    }
}
