package com.aswin.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aswin.spring.springorm.product.dao.ProductDao;
import com.aswin.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/aswin/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("ProductDao");
		/*
		 
		product.setId(1);
		product.setName("Iphone");
		product.setDesc("Apple devices");
		product.setPrice(1090);
		
		productDao.create(product);
		productDao.update(product);
		productDao.delete(product);
	 */
	//	Product product = productDao.find(1);
		List<Product> products = productDao.findAll();
		System.out.println(products);
	}

}
