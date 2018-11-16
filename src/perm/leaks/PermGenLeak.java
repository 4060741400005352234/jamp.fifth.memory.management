package perm.leaks;

import javassist.ClassPool;

public class PermGenLeak {

    /**
     * Инициализация в статическом блоке OutOfMemoryError выполняется для того, что бы
     * к моменту переполнения PermGen данный клас уже был подгружен в память. Иначе JVM
     * не сможет его создать из-за нехватки места в PermGen и, как следствие,
     * мы не увидем истиную причину ошибки. Вместо нее будет:
     * Exception in thread "main"
     * Exception: java.lang.OutOfMemoryError thrown from the UncaughtExceptionHandler in thread "main"
     */
    static {
        new OutOfMemoryError().printStackTrace();
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100000000; i++) {
            Class clazz = generate("jamp.perm.leak.Generated" + i);
            if(i % 50 == 0) {
                System.out.println(clazz);
                System.out.println(clazz);
                System.out.println(clazz);
                System.out.println(clazz);

                System.out.println(clazz);
            }
        }
    }

    public static Class generate(String name) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        return pool.makeClass(name).toClass();
    }
}
