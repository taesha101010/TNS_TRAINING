package com.example.RestApi.repository;

import com.example.RestApi.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

}
