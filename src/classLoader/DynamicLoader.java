package classLoader;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class DynamicLoader extends ClassLoader {

    private String baseDir;

    public DynamicLoader(String baseDir) {
        super();
        this.baseDir = baseDir;
    }

    private String getClassFile(String className) {
        return baseDir + className.replace(".", "/") + ".class";
    }

    @Override
    protected Class findClass(String className) throws ClassNotFoundException {
        Class clazz = this.findLoadedClass(className);
        if (null == clazz) {
            try {
                String classFile = getClassFile(className);
                FileInputStream fis = new FileInputStream(classFile);
                FileChannel fileC = fis.getChannel();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                WritableByteChannel outC = Channels.newChannel(baos);
                ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
                int count = 0;
                while ((count = fileC.read(buffer)) > 0) {
                    buffer.flip();
                    outC.write(buffer);
                    buffer.clear();
                }
                fis.close();
                byte[] bytes = baos.toByteArray();
                clazz = defineClass(className, bytes, 0, bytes.length);
            } catch (Exception e) {
                System.out.println("can not load class " + className + " from DynamicLoader.");
            }
        }
        return clazz;
    }


    @Override
    protected synchronized Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
        // First, check if the class has already been loaded
        Class re = findClass(name);
        if (re == null) {
            return super.loadClass(name, resolve);
        }
        return re;
    }
}
