package api;

/**
 * Created by lxc on 2016/10/11.
 * 请用JSONHelper
 */
public class ObjResponse<T> extends ApiResponse {

    private T result;

    public ObjResponse() {
    }

    public ObjResponse(T rs) {
        this.result = rs;
        this.success = true;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
