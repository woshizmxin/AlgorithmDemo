package classLoader;

import java.lang.reflect.Method;

public class HelloMain {

    public static void main(String[] args) throws Exception {

        while (true) {
            DynamicLoader loader = new DynamicLoader("/Users/zhoumao/Documents/PycharmProjects/algorithm/out/production/algorithm/");
            Class clazz = loader.loadClass("classLoader.Worker");
            Object instance = clazz.newInstance();
            Method doit = clazz.getDeclaredMethod("doit", null);
            doit.invoke(instance, null);
            Thread.sleep(1000);
        }

    }

}
