package exam.springjdbc;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SelectTest1 {
	private JdbcTemplate jdbcTemplate;

	public SelectTest1(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Singer queryForObject(String name){
		String sql = "select * from singer_group " + 
					"where name=?";
		
		class MyRowMapper implements RowMapper<Singer>{
			public Singer mapRow(ResultSet rs, int rowNum) throws SQLException
			{
				Singer s = new Singer();
				s.setName(rs.getString("name"));
				s.setMember(rs.getInt("member"));
				return s;
			}
		}
		Singer singer
		= jdbcTemplate.queryForObject(sql, new MyRowMapper(), name);
		
		return singer;
	}
	
	
	//클래스를 만들면서 바로 객체생성
	public Singer queryForObject1(String name){
		String sql = "select * from singer_group " + 
					"where name=?";
		
		Singer singer 
		= jdbcTemplate.queryForObject(sql, 
				new RowMapper<Singer>(){
					public Singer mapRow(ResultSet rs, int rowNum) throws SQLException
					{
						Singer s = new Singer();
						s.setName(rs.getString("name"));
						s.setMember(rs.getInt("member"));
						return s;
					}
				}
				, name);
		
		return singer;
	}
	
	
	public static void main(String[] args) {
		ApplicationContext ctx
		= new GenericXmlApplicationContext("beans.xml");
		SelectTest1 selectTest1
		= ctx.getBean("selectTest1", SelectTest1.class);
		Singer singer = selectTest1.queryForObject("EXO");
		System.out.println(singer);
		Singer singer1 = selectTest1.queryForObject1("소녀시대");
		System.out.println(singer1);
		
	}
	
}
