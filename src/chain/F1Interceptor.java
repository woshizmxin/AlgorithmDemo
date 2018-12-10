package chain;

public class F1Interceptor implements Interceptor {

    public F1Interceptor() {
    }

    @Override
    public Response intercept(Chain chain, Request request) {
        request.setRequest(request.getRequest() + " #F1Request# ");
        Response response = chain.proceed();
        return response.add(" *F1Response* ");
    }
}