package exam.product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import exam.product.vo.ProductVo;

//������̼� 
//@Component������̼��� �������� ��� ��ü�� �������ش�.
@Component
//������ ���Ӽ� ó���ϴ� Ŭ����
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SqlSession sqlSession;
	
	private static String namespace = "exam.product.mapper.ProductMapper";
	
	public ProductDaoImpl(){
		
	}
	
	
	private Map<String, ProductVo> map = new HashMap<String, ProductVo>();
	
	@Override
	public ProductVo selectById(String id) {
		
		List<ProductVo> products
		= sqlSession.selectList(namespace + ".selectById", id);
		
		
		return products.isEmpty() ? null : products.get(0);
	}

	@Override
	public void insert(ProductVo product) {
		
		sqlSession.insert(namespace + ".insert", product);

	}

	@Override
	public void update(ProductVo product) {
		
		sqlSession.update(namespace + ".update", product);
	}

	@Override
	public void delete(String id) {
		
		sqlSession.delete(namespace + ".delete", id);

	}

	@Override
	public Collection<ProductVo> selectAll() {
		
		List<ProductVo> products
		= sqlSession.selectList(namespace + ".selectAll");
		
		
		return products;
	}

}
