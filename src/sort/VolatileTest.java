package sort;

public class VolatileTest {

    public volatile int inc = 0;

    public  void inc() {
        inc++;
    }

    public static void main(String[] args) throws Exception {
        final VolatileTest test = new VolatileTest();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        test.inc();
                    }
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(test.inc);
    }
}
