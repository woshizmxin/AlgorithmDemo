package dec2;

public class Client
{
    public static void main(String[] args)
    {
        Component component = new ConcreteComponent();
        
        Component component1 = new ConcreteDecorator1(component);
        
        component1.doSomething();
        System.out.println("-----------");
        
        Component component2 = new ConcreteDecorator2(component1);
        
        component2.doSomething();
    }

}
