package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import bean.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	FileSystemResource res=new FileSystemResource("src/cfg/applicationContext.xml");
	XmlBeanFactory bean=new XmlBeanFactory(res);
	WishGenerator wg=bean.getBean("wish",WishGenerator.class);
	String result=wg.generateWishMsg();
	System.out.println("------>"+result);
	}
}