package chain;

import java.util.ArrayList;
import java.util.List;

public class ChainUtil {

    public static void main(String[] args) throws Exception {
        Request request = new Request();
        Response response = new Response();
        F1Interceptor f1Interceptor = new F1Interceptor();
        F2Interceptor f2Interceptor = new F2Interceptor();
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(f1Interceptor);
        interceptors.add(f2Interceptor);
        InterceptorChain interceptorChain = new InterceptorChain(interceptors, 0,request,response);
        try {
            interceptorChain.proceed();
            System.out.println(request.getRequest());
            System.out.println(response.getResponse());
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
