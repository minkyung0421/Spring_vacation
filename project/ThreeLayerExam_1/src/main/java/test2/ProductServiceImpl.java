package test2;

public class ProductServiceImpl implements ProductService {

	// ���� ���̾�� DAO���̾ ������
	private ProductDao productDao;
	
	public void setProductDao(ProductDao productDao){
		this.productDao = productDao;
	}
	
	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return productDao.getProduct();
	}

}