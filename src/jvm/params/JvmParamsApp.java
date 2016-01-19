package jvm.params;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JvmParamsApp {

    public static void main(String[] args) throws Exception {
        JvmParamsApp jvmParamsApp = new JvmParamsApp();
        while (true) {
            jvmParamsApp.noReturning(new Object());
            //byte resScalar = jvmParamsApp.returnScalar(new Object());
            //List<Object> objectList = jvmParamsApp.returnObject(new Object());
        }
    }

    private void noReturning(Object object) {
        List<Object> objects = new ArrayList<Object>(Arrays.asList(object));
    }

    private byte returnScalar(Object object) {
        List<Object> objects = new ArrayList<Object>(Arrays.asList(object));
        return 1;
    }

    private List<Object> returnObject(Object object) {
        List<Object> objects = new ArrayList<Object>(Arrays.asList(object));
        return  objects;
    }
}
