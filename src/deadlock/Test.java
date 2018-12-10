package deadlock;

public class Test implements Runnable {
    private boolean isRn = false;  
  
    Test(boolean isRn) {  
        this.isRn = isRn;  
    }  
  
    public void run() {  
  
        if (isRn) {  
            synchronized (MyLock.lookA) {  
                System.out.println("正在执行true中的lookA");  
                synchronized (MyLock.lookB) {

                    System.out.println("正在执行true中的lookB");  
  
                }  
  
            }  
  
        } else {  
            synchronized (MyLock.lookB) {  
                System.out.println("正在执行false中的lookB");  
                synchronized (MyLock.lookA) {  
  
                    System.out.println("正在执行false中的lookA");  
  
                }  
  
            }  
  
        }  
  
    }  
  
}  
