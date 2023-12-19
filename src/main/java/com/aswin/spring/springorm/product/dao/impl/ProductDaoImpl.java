package com.aswin.spring.springorm.product.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.aswin.spring.springorm.product.entity.Product;
import com.aswin.spring.springorm.product.dao.ProductDao;

@Component
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public int create(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

}
