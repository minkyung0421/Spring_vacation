package exam.product.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import exam.product.vo.ProductVo;


//어노테이션
@Component
//@Component 어노테이션은 스프링이 대신 객체를 생성해준다
//실제로 영속성 처리하는 클래스
public class ProductDaoImpl implements ProductDao {
	
	private Map<String, ProductVo> map = new HashMap<String, ProductVo>();
	
	private ArrayList<ProductVo> arr = new ArrayList<>();

	@Override
	public ProductVo selectById(String id) {
		
		return map.get(id);
	}

	@Override
	public void insert(ProductVo product) {
		map.put(product.getId(), product);

	}

	@Override
	public void update(ProductVo product) {
		map.put(product.getId(), product);

	}

	@Override
	public void delete(String id) {

		map.remove(id);
	}

	@Override
	public Collection<ProductVo> seletAll() {

		return map.values();
	}

}
