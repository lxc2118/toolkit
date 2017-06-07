package api;

import java.util.List;

/**
 * Created by Axios on 2016/9/20.
 * 废弃,请用JSONHelper
 */
@Deprecated
public class ListResponse<T> extends ApiResponse {

    public ListResponse(Boolean success, List<T> list){
        this.list = list;
        this.success = success;
    }

    /**
     * 默认success是true
     * @param list
     */
    public ListResponse(List<T> list){
        this.list = list;
        this.success = true;
    }

    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
