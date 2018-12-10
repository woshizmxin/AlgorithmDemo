package chain;

public class F2Interceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain, Request request) {
        request.setRequest(request.getRequest() + " #F2Request# ");
        Response response = chain.proceed();
        return response.add(" *F2Response* ");
    }
}
