package exam.product.service;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.product.dao.ProductDao;
import exam.product.vo.ProductVo;

@Component
// ����Ͻ� ������ ���� ������ Ŭ����
public class ProductServiceImpl implements ProductService {
	
	// ���񽺴� DAO�� ������!!!!!!!!!!!!!!
	// ���� ProductDao��ü�� �����ؾ���
	// (1) �����ڸ� ���ؼ� ����
	// (2) ���͸� ���ؼ� ����
	@Autowired
	private ProductDao productDao;

	// �����ڸ� ���� ProductDao��ü ����
	public ProductServiceImpl(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	
	

	public ProductDao getProductDao() {
		return productDao;
	}


	// ���͸� ���� ProductDao��ü ����
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}



	@Override
	public void registerProduct(ProductVo newProduct) {
		//productDao���� ����
		ProductVo product = productDao.selectById(newProduct.getId());
		
		if(product != null){
			throw new AlreadyExistingProductException();
		}
		
		newProduct.setRegisterDate(new Date());
		
		productDao.insert(newProduct);
		
		
	}

	@Override
	public ProductVo getProduct(String id) {
		ProductVo product = productDao.selectById(id);
		
		if(product == null){
			throw new ProductNotFoundException();
		}
		
		return product;
	}

	@Override
	public void changeProductPrice(ProductVo updateProduct) {
		ProductVo product = productDao.selectById(updateProduct.getId());
		
		if(product == null){
			throw new ProductNotFoundException();
		}
		
		updateProduct.setName(product.getName());
		updateProduct.setRegisterDate(product.getRegisterDate());
		
		productDao.update(updateProduct);
			

	}

	@Override
	public Collection<ProductVo> getProducts() {
		
		return productDao.seletAll();
	}



	@Override
	public void removeProduct(String id) {
		ProductVo product = productDao.selectById(id);
		
		if(product == null){
			throw new ProductNotFoundException();
		}
		
		productDao.delete(id);
			
	}

}
