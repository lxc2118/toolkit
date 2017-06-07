package api.response;

import api.ApiResponse;
import domain.SupplierOrderGroup;
import models.UserAddress;

import java.util.List;

/**
 * app订单创建页面的数据响应格式
 * */
public class OrderCreatePageResponse extends ApiResponse {

    /**
     * 收货人地址信息
     * */
    private UserAddress userAddress;

    private List<SupplierOrderGroup> supplierOrderGroupList;

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    public List<SupplierOrderGroup> getSupplierOrderGroupList() {
        return supplierOrderGroupList;
    }

    public void setSupplierOrderGroupList(List<SupplierOrderGroup> supplierOrderGroupList) {
        this.supplierOrderGroupList = supplierOrderGroupList;
    }
}
