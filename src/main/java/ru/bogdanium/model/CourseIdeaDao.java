package ru.bogdanium.model;

import java.util.List;

public interface CourseIdeaDao {

    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();

    CourseIdea findBySlug(String slug);
}
