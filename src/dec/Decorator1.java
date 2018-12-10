package dec;

public class Decorator1 implements IThirdParty {
    private IThirdParty thirdParty;

    public Decorator1(IThirdParty thirdParty) {
        this.thirdParty = thirdParty;
    }

    public String sayMsg() {
        return "##1" + thirdParty.sayMsg() + "##1";
    }
}
