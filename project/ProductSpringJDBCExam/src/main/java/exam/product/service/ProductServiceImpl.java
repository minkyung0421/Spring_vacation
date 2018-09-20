package exam.product.service;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.product.dao.ProductDao;
import exam.product.vo.ProductVo;

@Component
//����Ͻ� ������ ���� ������ Ŭ����
public class ProductServiceImpl implements ProductService {
	//���񽺴� DAO�� ������!!!!!!!!!!!!!!!!
	//���� ProductDao��ü�� �����ؾ���
	//(1) �����ڸ� ���ؼ� ����
	//(2) ���͸� ���ؼ� ����
	
	@Autowired
	private ProductDao productDao;
	
	//�����ڸ� ���� ProductDao��ü ����
	public ProductServiceImpl(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	//���͸� ���� ProductDao��ü ����
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}


	@Override
	public void registerProduct(ProductVo newproduct) {
		ProductVo product = productDao.selectById(newproduct.getId());
		
		if(product != null) {
			throw new AlreadyExistingProductException();
		}
		newproduct.setRegisterDate(new Date());
		
		productDao.insert(newproduct);
	}

	@Override
	public ProductVo getProduct(String id) {
		ProductVo product = productDao.selectById(id);
		
		if(product == null) {
			throw new ProductNotFoundException();
		}
		return product;
	}

	@Override
	public void changeProductPrice(ProductVo updateProduct) {
		ProductVo product = productDao.selectById(updateProduct.getId());
		
		if(product == null) {
			throw new ProductNotFoundException();
		}
		
		updateProduct.setName(product.getName());
		updateProduct.setRegisterDate(product.getRegisterDate());
		
		productDao.update(updateProduct);
	}

	@Override
	public Collection<ProductVo> getProducts() {
		return productDao.selectAll();
	}

	@Override
	public void removeProduct(String id) {
		ProductVo product = productDao.selectById(id);
		
		if(product == null) {
			throw new ProductNotFoundException();
		}
		
		productDao.delete(id);
		
	}

	
}
