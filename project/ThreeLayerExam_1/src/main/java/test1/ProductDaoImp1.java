package test1;

public class ProductDaoImp1 implements ProductDao {

	@Override
	public Product getProduct() {
		// �����δ� ���⼭ DBó����
		return new Product("����", 100);
	}

}
