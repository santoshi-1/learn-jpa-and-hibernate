package com.santoshi.springboot.learnjpaandhibernate.course.jdbc;

import com.santoshi.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    private static String INSERT_QUERY =
            """ 
                    INSERT INTO COURSE(id, name, author)
                    VALUES (?, ?, ?)
                                
                       """;

    private static String DELETE_QUERY =
            """
                    DELETE FROM COURSE WHERE id=?
                    """;

    private static String SELECT_QUERY =
            """
                    SELECT * FROM COURSE WHERE id=?
                    """;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        jdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findCourseById(long id) {
        /**
         * Mapping of result set to bean is called row mapping and is done by BeanPropertyRowMapper
         */
        return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }

}
