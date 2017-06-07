package api.response;

import api.ApiResponse;
import domain.SiteUserCart;

import java.util.List;

public class UserCartGetResponse extends ApiResponse{

    private List<SiteUserCart> siteUserCartList;

    public List<SiteUserCart> getSiteUserCartList() {
        return siteUserCartList;
    }

    public void setSiteUserCartList(List<SiteUserCart> siteUserCartList) {
        this.siteUserCartList = siteUserCartList;
    }
}
