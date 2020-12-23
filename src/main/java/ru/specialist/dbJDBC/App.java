package ru.specialist.dbJDBC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.specialist.DAO.Course;
import ru.specialist.DAO.CourseDAO;

public class App 
{
    public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		CourseDAO courseDao = context.getBean(CourseDAO.class);

		for(Course c : courseDao.findAll())
			System.out.println(c);

		System.out.println("Запись по ID:");

		System.out.println(courseDao.findById(5));

		System.out.println("Записи по title:");

		for(Course c : courseDao.findByTitle("%Web%"))
			System.out.println(c);
		
		context.close();
    }
}