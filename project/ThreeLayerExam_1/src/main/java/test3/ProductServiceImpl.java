package test3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service")
public class ProductServiceImpl implements ProductService {

	// ���� ���̾�� DAO���̾ ������
	@Autowired //�ڵ�����
	private ProductDao productDao;
	
	// ���͸� ���� DAO����
	public void setProductDao(ProductDao productDao){
		this.productDao = productDao;
	}
	
	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return productDao.getProduct();
	}

}
