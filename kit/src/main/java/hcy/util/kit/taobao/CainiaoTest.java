package hcy.util.kit.taobao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.CainiaoCloudprintMystdtemplatesGetRequest;
import com.taobao.api.request.CainiaoCloudprintStdtemplatesGetRequest;
import com.taobao.api.request.CainiaoWaybillIiGetRequest;
import com.taobao.api.request.CainiaoWaybillIiSearchRequest;
import com.taobao.api.response.CainiaoCloudprintMystdtemplatesGetResponse;
import com.taobao.api.response.CainiaoCloudprintStdtemplatesGetResponse;
import com.taobao.api.response.CainiaoCloudprintStdtemplatesGetResponse.StandardTemplateResult;
import com.taobao.api.response.CainiaoWaybillIiGetResponse;
import com.taobao.api.response.CainiaoWaybillIiSearchResponse;

public class CainiaoTest {

//	"http://gw.api.tbsandbox.com/router/rest"
	
	public static final String URL = "http://gw.api.taobao.com/router/rest";
	public static final String TEST_URL = "http://gw.api.tbsandbox.com/router/rest";
	public static final String APP_KEY = "12264547";
	public static final String APP_SERCRET = "013c73fef6dcb6d971d5b269a7f6c0cc";
	public static final String SESSION_KEY = "6201217304e39cb8705019eb7ZZ14d2e96680a463a21155301195469";
	public static void main(String[] args) throws ApiException {
//		CainiaoTest.cainiaoWaybillIiSearchRequest();
//		CainiaoTest.cainiaoCloudprintMystdtemplatesGetRequest();
//		CainiaoTest.getCainiaoWaybillIiSearchRequest();
//		CainiaoTest.getStdtemplate();
//		String str = "{\"code\": \"COD\",\"services\": {\"SVC-COD\": {\"value\": \"200\"}},\"title\": \"代收货款\"}";
//		Map<String, Map> mapObj = JSONObject.parseObject(str,Map.class);
//		System.out.println(mapObj.get("services").get("title"));
	}
	
	public static void cainiaoWaybillIiSearchRequest() throws ApiException {
		TaobaoClient client = new DefaultTaobaoClient(URL, APP_KEY, APP_SERCRET);
		CainiaoWaybillIiSearchRequest req = new CainiaoWaybillIiSearchRequest();
//		req.setCpCode("ZTO");
		CainiaoWaybillIiSearchResponse rsp = client.execute(req, SESSION_KEY);
		System.out.println(rsp.getBody());
	}
	
	public static void cainiaoCloudprintMystdtemplatesGetRequest() throws ApiException {
		TaobaoClient client = new DefaultTaobaoClient(URL, APP_KEY, APP_SERCRET);
		CainiaoCloudprintMystdtemplatesGetRequest req = new CainiaoCloudprintMystdtemplatesGetRequest();
		CainiaoCloudprintMystdtemplatesGetResponse rsp = client.execute(req, SESSION_KEY);
		System.out.println(rsp.getBody());
	}
	
	public static void getStdtemplate() throws ApiException  {
		TaobaoClient client = new DefaultTaobaoClient(URL, APP_KEY, APP_SERCRET);
		CainiaoCloudprintStdtemplatesGetRequest req = new CainiaoCloudprintStdtemplatesGetRequest();
		CainiaoCloudprintStdtemplatesGetResponse rsp = client.execute(req, SESSION_KEY);
		List<StandardTemplateResult> list = rsp.getResult().getDatas();
		System.out.println(rsp.getBody());
	}
	
	public static void getCainiaoWaybillIiSearchRequest() throws ApiException  {
		TaobaoClient client = new DefaultTaobaoClient(URL, APP_KEY, APP_SERCRET);
        CainiaoWaybillIiGetRequest req = new CainiaoWaybillIiGetRequest();
        CainiaoWaybillIiGetRequest.WaybillCloudPrintApplyNewRequest waybillCloudPrintApplyNewRequest = new CainiaoWaybillIiGetRequest.WaybillCloudPrintApplyNewRequest();
        waybillCloudPrintApplyNewRequest.setCpCode("TTKDEX");
//        waybillCloudPrintApplyNewRequest.setProductCode("\"\"");
        CainiaoWaybillIiGetRequest.UserInfoDto senderUserInfoDto = new CainiaoWaybillIiGetRequest.UserInfoDto();
        CainiaoWaybillIiGetRequest.AddressDto senderAddressDto = new CainiaoWaybillIiGetRequest.AddressDto();
        senderAddressDto.setProvince("浙江省");
        senderAddressDto.setCity("台州市");
        senderAddressDto.setDistrict("温岭市");
        senderAddressDto.setDetail("农贸城");
        senderUserInfoDto.setAddress(senderAddressDto);
        senderUserInfoDto.setMobile("13306761612");
        senderUserInfoDto.setName("天购");
        senderUserInfoDto.setPhone("13306761612");
        waybillCloudPrintApplyNewRequest.setSender(senderUserInfoDto);
        List<CainiaoWaybillIiGetRequest.TradeOrderInfoDto> tradeOrderInfoDtoList = new ArrayList<>();
        CainiaoWaybillIiGetRequest.TradeOrderInfoDto tradeOrderInfoDto = new CainiaoWaybillIiGetRequest.TradeOrderInfoDto();
        //如不需要特殊服务，该值为空
        tradeOrderInfoDto.setLogisticsServices(null);
        tradeOrderInfoDto.setObjectId("1");
        CainiaoWaybillIiGetRequest.OrderInfoDto orderInfoDto = new CainiaoWaybillIiGetRequest.OrderInfoDto();
        orderInfoDto.setOrderChannelsType("OTHERS");
        List<String> orderIdList = new ArrayList<>();
        orderIdList.add("3");
        orderInfoDto.setTradeOrderList(orderIdList);
        tradeOrderInfoDto.setOrderInfo(orderInfoDto);
        CainiaoWaybillIiGetRequest.PackageInfoDto packageInfoDto = new CainiaoWaybillIiGetRequest.PackageInfoDto();
        packageInfoDto.setId("1");
        List<CainiaoWaybillIiGetRequest.Item> itemList = new ArrayList<CainiaoWaybillIiGetRequest.Item>();
        CainiaoWaybillIiGetRequest.Item item = new CainiaoWaybillIiGetRequest.Item();
        itemList.add(item);
        item.setCount(1L);
        item.setName("鞋子");
        packageInfoDto.setItems(itemList);
//        packageInfoDto.setVolume(1L);
//        packageInfoDto.setWeight(1L);
        tradeOrderInfoDto.setPackageInfo(packageInfoDto);
        CainiaoWaybillIiGetRequest.UserInfoDto recipientUserInfoDto = new CainiaoWaybillIiGetRequest.UserInfoDto();
        CainiaoWaybillIiGetRequest.AddressDto recipientAddressDto = new CainiaoWaybillIiGetRequest.AddressDto();
        recipientAddressDto.setCity("北京市");
        recipientAddressDto.setDetail("花家地社区卫生服务站");
        recipientAddressDto.setDistrict("朝阳区");
        recipientAddressDto.setProvince("北京");
        recipientAddressDto.setTown("望京街道");
        recipientUserInfoDto.setAddress(recipientAddressDto);
        recipientUserInfoDto.setMobile("1326443654");
        recipientUserInfoDto.setName("测试订单");
        recipientUserInfoDto.setPhone("057123222");
        tradeOrderInfoDto.setRecipient(recipientUserInfoDto);
        tradeOrderInfoDto.setTemplateUrl("http://cloudprint.cainiao.com/template/standard/76403/43");
        tradeOrderInfoDto.setUserId(301195469L);
        tradeOrderInfoDtoList.add(tradeOrderInfoDto);
        waybillCloudPrintApplyNewRequest.setTradeOrderInfoDtos(tradeOrderInfoDtoList);
        req.setParamWaybillCloudPrintApplyNewRequest(waybillCloudPrintApplyNewRequest);
        CainiaoWaybillIiGetResponse rsp = client.execute(req, SESSION_KEY);
        System.out.println(rsp.getBody());
	}


}
