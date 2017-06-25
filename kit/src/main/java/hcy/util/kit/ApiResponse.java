package hcy.util.kit;

public class ApiResponse {

    protected String msg;

    protected String code;

    protected Boolean success;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean isSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ApiResponse() {
    }

    public ApiResponse(Boolean success) {
        this.success = success;
    }

    public ApiResponse(Boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public void setErrorMsg(String msg){
        this.success = false;
        this.msg = msg;
    }
    
    public void setErrorMsg(String code, String msg){
        this.setErrorMsg(msg);
        this.code = code;
    }
}
