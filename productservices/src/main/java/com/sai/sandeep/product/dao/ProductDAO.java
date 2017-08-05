package com.sai.sandeep.product.dao;

import com.sai.sandeep.product.dto.Product;

public interface ProductDAO {
	void create(Product product);

	Product read(int id);

	void update(Product product);

	void delete(int id);

}
