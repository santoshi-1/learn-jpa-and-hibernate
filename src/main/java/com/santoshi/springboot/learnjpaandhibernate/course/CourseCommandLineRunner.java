package com.santoshi.springboot.learnjpaandhibernate.course;


import com.santoshi.springboot.learnjpaandhibernate.course.jpa.CourseJPARepository;
import com.santoshi.springboot.learnjpaandhibernate.course.springDataJpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJPARepository courseJPARepository;

    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
//        courseJPARepository.insert(new Course(1, "Learn AWS Now!", "in28Minutes"));
//        courseJPARepository.insert(new Course(2, "Learn Devops Now!", "in28Minutes"));
//        courseJPARepository.insert(new Course(3, "Learn Azure Now!", "in28Minutes"));
//        courseJPARepository.deleteById(1);
//        System.out.println(courseJPARepository.findCourseById(2));
//        System.out.println(courseJPARepository.findCourseById(3));

        courseSpringDataJpaRepository.save(new Course(1, "Learn AWS Now!", "in28Minutes"));
        courseSpringDataJpaRepository.save(new Course(2, "Learn Devops Now!", "in28Minutes"));
        courseSpringDataJpaRepository.save(new Course(3, "Learn Azure Now!", "in28Minutes"));
        courseSpringDataJpaRepository.deleteById(1l);
        System.out.println(courseSpringDataJpaRepository.findById(2l));
        System.out.println(courseSpringDataJpaRepository.findById(3l));

        System.out.println(courseSpringDataJpaRepository.findAll());
        System.out.println(courseSpringDataJpaRepository.findByAuthor("in28Minutes"));
        System.out.println(courseSpringDataJpaRepository.findByAuthor("santoshi"));


        System.out.println(courseSpringDataJpaRepository.findByAuthor("Learn AWS Now!"));
        System.out.println(courseSpringDataJpaRepository.findByAuthor("Learn Devops Now!"));

    }
}
