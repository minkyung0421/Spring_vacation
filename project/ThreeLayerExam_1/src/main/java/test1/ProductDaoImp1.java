package test1;

public class ProductDaoImp1 implements ProductDao {

	@Override
	public Product getProduct() {
		// 실제로는 여기서 DB처리함
		return new Product("가위", 100);
	}

}
