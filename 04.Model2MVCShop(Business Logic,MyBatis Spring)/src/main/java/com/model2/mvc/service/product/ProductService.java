package com.model2.mvc.service.product;

import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;


//==> 회원관리에서 서비스할 내용 추상화/캡슐화한 Service  Interface Definition  
public interface ProductService {
	
	// 회원가입
	public void addProduct(Product product) throws Exception;
	
	// 상품정보확인 / 로그인
	//public Product getProduct(int prodNo) throws Exception;
	//public Product getProduct(Product product) throws Exception;//2022-04-09 shhwang
	public Product getProduct(int prodNo) throws Exception;
	
	// 상품정보리스트 
	public Map<String , Object> getProductList(Search search) throws Exception;
	
	// 상품정보수정
	public void updateProduct(Product product) throws Exception;
	
	//상품이름 중복 확인은 할 필요가 없다. sequence 를 주었기 때문에 중복체크할 이유가 없다.
	//public boolean checkDuplication(String prodName) throws Exception;
	
}