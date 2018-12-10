package decorator;


public class RedShapeDecorator extends ShapeDecorator {
    private static final String TAG = "zhoumao";

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(super.decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        Log.d(TAG, "setRedBorder: " + "Border Color: Red");
    }
}
