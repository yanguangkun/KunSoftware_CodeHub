package cn.codehub;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TestC {
	public static void main(String[] args) {
		
		try {
//			Document doc = Jsoup.connect("http://www.oschina.net/")
//					  .data("query", "Java")   //请求参数
//					  .userAgent("ebs") //设置User-Agent
//					  .cookie("auth", "token") //设置cookie
//					  .timeout(3000)           //设置连接超时时间
//					  .post();                 //使用POST方法访问URL
//			String title = doc.title();
			
			Document doc = Jsoup.connect("http://www.oschina.net/")
					.userAgent("Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1599.69 Safari/537.36")
					.get(); 
			String title = doc.title(); 
			Element ele = doc.select(".p1").first();
			Elements lis = ele.select("li");
			for(Element element :lis) {
				System.out.println(element.text());
			}
//			
			Elements hrefs = doc.getElementById("IndustryNews").select("a[href]");
			for(Element element :hrefs) {
				System.out.println(element.attr("href"));
				System.out.println(element.text());
			}
			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} 
	}
}
