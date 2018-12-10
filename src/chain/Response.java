package chain;

/**
 * Created by zhoumao on 2018/12/10.
 * Description:
 */

public class Response {
    String mResponse="";

    public String getResponse() {
        return mResponse;
    }

    public Response setResponse(String response) {
        mResponse = response;
        return this;

    }

    public Response add(String s) {
        if (mResponse == null) {
            mResponse = s;
        } else {
            mResponse = mResponse + s;
        }
        return this;
    }
}
