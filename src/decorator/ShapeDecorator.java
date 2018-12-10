package decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    int defVal;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
