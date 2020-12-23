package ru.specialist.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

class CourseRowMapper implements RowMapper<Course>
{
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		Course c= new Course();
		c.setId(rs.getInt("id"));
		c.setTitle(rs.getString("title"));
		c.setLength(rs.getInt("length"));
		c.setDescription(rs.getString("description"));
		return c;
	}
	
}

public class JdbcCourseDAO implements CourseDAO {
	private static final String SQL_SELECT_COURSE =
			 "SELECT id, title, length, description FROM courses";
	private static final String SQL_SELECT_COURSE_BY_ID =
			SQL_SELECT_COURSE+" WHERE id = ?";
	private static final String SQL_INSERT_COURSE =
			"INSERT INTO Courses (title,length,description) VALUES (:title, :length, :description)";
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Course> findAll() {
		
		// manual map
		/*
		List<Course> courses= new ArrayList<Course>();
		List<Map<String,Object>> rows = 
				getJdbcTemplate().queryForList(SQL_SELECT_COURSE);
		for (Map<String,Object> row : rows) {
			Course c= new Course();
			c.setId((int)(row.get("id")));
			c.setTitle((String)(row.get("title")));
			c.setLength((int)(row.get("length")));
			c.setDescription((String)(row.get("description")));
			courses.add(c);
		}*/
		List<Course> courses = getJdbcTemplate().query(SQL_SELECT_COURSE,
				new BeanPropertyRowMapper(Course.class));
			
		return courses;
	}

	public Course findById(int id) {
		Course course = (Course)getJdbcTemplate().queryForObject(
				SQL_SELECT_COURSE_BY_ID, new Object[] { id }, 
				new CourseRowMapper());		
		return course;
				 
	}

}