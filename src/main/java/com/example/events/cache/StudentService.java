package com.example.events.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Service
public class StudentService {
    private static List<Student> generateStudents() {
        Random age = new Random();
        Student student1 = new Student();
        student1.setAge(20 + age.nextInt(40));
        student1.setName("David");
        Student student2 = new Student();
        student2.setAge(20 + age.nextInt(40));
        student2.setName("Vivian");
        List<Student> students = List.of(student1, student2);
        return students;
    }

    @Cacheable("students")
    public List<Student> getAllStudents() {
        return generateStudents();
    }

    @CachePut("students")
    public List<Student> updateAllStudents() {
        return generateStudents();
    }

    @CacheEvict(value = "students", allEntries = true)
    public void evictCache() {
        System.out.println("Evicting cache");
    }
}
