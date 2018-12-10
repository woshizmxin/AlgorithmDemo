package decorator;


public class DecoratorPatternDemo {
    private static final String TAG = "zhoumao";


    public static void main(String[] args) {

        Shape circle = new Circle();

        Log.d(TAG, "*********main: ");
        Log.d(TAG, "Circle with normal border");
        circle.draw();


        Shape redCircle = new RedShapeDecorator(new Circle());
        Log.d(TAG, "\n******Circle of red border");
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Log.d(TAG, "\n********Rectangle of red border");
        redRectangle.draw();

        Log.d(TAG, "\n**********Rectangle rotate of red border");
        Shape allRect = new RotateShapeDecorator(redRectangle);
        allRect.draw();
    }
}
