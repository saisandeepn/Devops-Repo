package com.sai.sandeep.product.bo;

import com.sai.sandeep.product.dto.Product;

public interface ProductBO {
	public void create(Product product);

	public Product findProduct(int id);

}
