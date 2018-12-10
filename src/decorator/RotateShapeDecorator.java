package decorator;


/**
 * Created by zhoumao on 2018/5/6.
 * Description:
 */

public class RotateShapeDecorator extends ShapeDecorator {

    private static final String TAG = "zhoumao";

    public RotateShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRotate();
    }

    private void setRotate() {
        Log.d(TAG, "setRotate: ");
    }
}
