package hcy.util.kit.crawler;

import hcy.util.kit.http.HttpReq;

public class BaiduYun {

	public static String url = "http://pan.baidu.com/share/link?shareid=1260640415&uk=3449908808";

	// 链接：http://pan.baidu.com/s/1eSBkbeU 密码：vk5v
	// http://pan.baidu.com/share/link?shareid=1260640415&uk=3449908808
	// 解压密码
	// 终点

	public static void main(String[] args) {
		String html = new HttpReq("http://plus.go2.cn/new_style/1")
//				.setCookies("Hm_lvt_eb77799942fcf84785b5626e398e49ab=1481248004; PANWEB=1; bdshare_firstime=1481259382124; secu=1; BAIDUID=8A7282EF56BCEE86AC9EA92290F855D0:FG=1; BIDUPSID=8A7282EF56BCEE86AC9EA92290F855D0; PSTM=1481426075; BDUSS=mJ-T0ludHFMUndaTzF-UEs0TldIMDNzYjVvYTFHVk5QbFRzeHVvWklyamxVblJZSVFBQUFBJCQAAAAAAAAAAAEAAAAAc18R0Me54rO-sLUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAOXFTFjlxUxYe; STOKEN=aa707f076ad88951ce461fc8042b9352385fbbf92f964813f2b3b15e7dafc225; SCRC=93b270776a652f6e1d2620c004a8013f; BDCLND=uvyYDJBz2DSS%2BBgOjU3%2BoQOU6qM21%2FWOsedsKCKdbyk%3D; cflag=15%3A3; BAIDU_WISE_UID=wapp_1481596216498_465; locale=zh; PANPSC=7127663900580836410%3Au2C8FyuEb6hcYiXEfhAvBen90oj%2BY%2FIsLksVmi08mO7PVXBC2cX8HEaTZKJHdPhSSrvFsiwiy%2BGtcMJUDArx5LW41U5qf0%2FnU3n1vGgkRfVX1A3fWqwiIiS%2FTplSLiIJfWXIHU1mXJdjbYml1eowNq7IJzS%2Fi2HLfbZ%2FbYW506YYeZrkpSoG3g%3D%3D; Hm_lvt_7a3960b6f067eb0085b7f96ff5e660b0=1481552439,1481553849,1481553850,1481639285; Hm_lpvt_7a3960b6f067eb0085b7f96ff5e660b0=1481639285")
//				.setHeader("Host", "pan.baidu.com")
				.setProxy(true)
				.execute();
		System.out.println(html);
	}
}
