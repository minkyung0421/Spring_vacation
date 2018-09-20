package test2;

public class ProductServiceImpl implements ProductService {

	// 서비스 레이어는 DAO레이어에 의존함
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
