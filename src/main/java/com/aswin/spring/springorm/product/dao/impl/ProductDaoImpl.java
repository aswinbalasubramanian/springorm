package com.aswin.spring.springorm.product.dao.impl;

import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.aswin.spring.springorm.product.dao.Product;
import com.aswin.spring.springorm.product.dao.ProductDao;

public class ProductDaoImpl implements ProductDao {

	HibernateTemplate hibernateTemplate;

	@Override
	public int create(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

}
