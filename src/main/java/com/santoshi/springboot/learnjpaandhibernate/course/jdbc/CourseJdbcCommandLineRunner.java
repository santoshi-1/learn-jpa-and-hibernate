//package com.santoshi.springboot.learnjpaandhibernate.course.jdbc;
//
//import com.santoshi.springboot.learnjpaandhibernate.course.Course;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CourseJdbcCommandLineRunner implements CommandLineRunner {
//
//    @Autowired
//    private CourseJdbcRepository courseJdbcRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        courseJdbcRepository.insert(new Course(1, "Learn AWS Now!", "in28Minutes"));
//        courseJdbcRepository.insert(new Course(2, "Learn Devops Now!", "in28Minutes"));
//        courseJdbcRepository.insert(new Course(3, "Learn Azure Now!", "in28Minutes"));
//        courseJdbcRepository.deleteById(1);
//        System.out.println(courseJdbcRepository.findCourseById(2));
//        System.out.println(courseJdbcRepository.findCourseById(3));
//    }
//}
