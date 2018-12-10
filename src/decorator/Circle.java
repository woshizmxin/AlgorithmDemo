package decorator;


/**
 * Created by zhoumao on 2018/4/29.
 * Description:
 */

public class Circle implements Shape {
    private static final String TAG = "zhoumao";

    @Override
    public void draw() {
        Log.d(TAG, "draw: " + getClass().getName());
    }
}
