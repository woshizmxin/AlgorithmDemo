package chain;


import java.util.List;

public class InterceptorChain implements Interceptor.Chain {
    final List<Interceptor> interceptorList;
    private int index;
    private Request request;
    private Response response;

    public InterceptorChain(List<Interceptor> list, int index, Request request, Response response) {
        interceptorList = list;
        this.index = index;
        this.request = request;
        this.response = response;
    }

    @Override
    public Response proceed() {
        if (index >= interceptorList.size()) {
            return response;
        }
        Interceptor interceptor = interceptorList.get(index);
        index++;  // interceptorList.get(index++).intercept(this)会陷入无限循环
        return interceptor.intercept(this, request);
    }
}
