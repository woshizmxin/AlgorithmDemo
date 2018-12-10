package chain;

/**
 * Created by zhoumao on 2018/12/10.
 * Description:
 */

public interface Interceptor {
    Response intercept(Chain chain, Request request);

    interface Chain {
        Response proceed();
    }

}
