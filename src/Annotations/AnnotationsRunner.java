package Annotations;

import java.lang.reflect.Method;
/**
 * @author Mrs.Wang
 * @create 2019-10-24 21:02
 */
public class AnnotationsRunner {
    public static void main(String[] args) throws Exception {
        Class clazz = Test.class;
        Method [] ms = clazz.getMethods();
        for (Method method : ms) {
            boolean flag = method.isAnnotationPresent(Annotations.class);
            if (flag) {
                method.invoke(clazz.newInstance(), null);
            }
        }
    }
}
