package dec;

public class MailTest {
    public static void main(String[] args) {

        IThirdParty thirdPartyOne = new ThirdParty();
        IThirdParty decorator1 = new Decorator1(thirdPartyOne);
        IThirdParty decorator2 = new Decorator2(decorator1);
        System.out.println(decorator2.sayMsg());
    }
}