package exam.product.dao;

import java.util.Collection;

import exam.product.vo.ProductVo;

// DAO(Data Access Object)
// 康加己 贸府(DB, File贸府)
// CRUD
// Create(insert), Read(select), Update, Delete
public interface ProductDao {
	
	// Read
	public ProductVo selectById(String id);
	
	public void insert(ProductVo product);
	
	public void update(ProductVo product);
	
	public void delete(String id);
	
	public Collection<ProductVo> seletAll();
}
