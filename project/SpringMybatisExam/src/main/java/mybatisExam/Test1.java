package mybatisExam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test1 {
	private SqlSession sqlSession;

	public Test1(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession; //�ϳ��� �˻�
	}
	
	public void selectOne(){
		int count = sqlSession.selectOne("exam.test.SingerMapper.getSingerCount");
		System.out.println("�׷�� : " + count);
	}
	
	public void selectOne1(String name){
		int count
		=sqlSession.selectOne("exam.test.SingerMapper.getSingerMember", name);
		
		System.out.println("�׷� ����� : " + count);
	}
	
	public void selectOne2(int member){
		String name
		= sqlSession.selectOne("exam.test.SingerMapper.getSingerName", member);
		System.out.println(member + "�� �׷� �̸� : " + name);
	}
	
	public void selectOne3(String name, int member){
		Map<String, Object> paramMap
		= new HashMap<String, Object>();
		paramMap.put("name", name);
		paramMap.put("member", member);
		
		String result
		= sqlSession.selectOne("exam.test.SingerMapper.getSingerNameMember", paramMap);
		
		System.out.println(member + "�� �׷� �̸� : " + result);
	}
	
	public void selectOne4(Singer singer){
		Singer rsinger
		= sqlSession.selectOne("exam.test.SingerMapper.getSinger1", singer);
		
		System.out.println(rsinger);
	}
	
	public void selectList(int member){
		List<Singer> singers
		=sqlSession.selectList("exam.test.SingerMapper.getSingers", member);
		
		for(Singer singer : singers){
			System.out.println(singer);
		}
	}
	
	public void insert(Singer singer){
		int count
		= sqlSession.insert("exam.test.SingerMapper.insertSinger", singer);
		
		System.out.println(count + "���� ���ڵ尡 �߰���");
	}
	
	public void update(Singer singer){
		int count
		= sqlSession.update("exam.test.SingerMapper.updateSinger", singer);
		
		System.out.println(count + "���� ���ڵ尡 ������");
	}
	
	public void delete(String name){
		int count
		= sqlSession.delete("exam.test.SingerMapper.deleteSinger", name);
		
		System.out.println(count + "���� ���ڵ尡 ������");
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx 
		= new GenericXmlApplicationContext("beans.xml");
		Test1 t = ctx.getBean("test1", Test1.class);
		t.selectOne();
		t.selectOne1("EXO");
		t.selectOne2(13);
		t.selectOne3("EXO", 13);
		t.selectOne4(new Singer("EXO", 13));
		t.selectList(7);
		t.delete("���");
		t.insert(new Singer("���", 5));
		t.selectOne1("���");
		t.update(new Singer("���", 6));
		t.selectOne1("���");
	}

}
