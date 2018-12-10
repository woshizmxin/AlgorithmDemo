package decorator;


public class Rectangle implements Shape {
    private static final String TAG = "zhoumao";

    @Override
    public void draw() {
        Log.d(TAG, "draw: " + "Shape: Rectangle");

    }
}
