package dec;

public class Decorator2 implements IThirdParty {
    private IThirdParty thirdParty;

    public Decorator2(IThirdParty thirdParty) {
        this.thirdParty = thirdParty;
    }

    public String sayMsg() {
        return "##2" + thirdParty.sayMsg() + "##2";
    }
}

