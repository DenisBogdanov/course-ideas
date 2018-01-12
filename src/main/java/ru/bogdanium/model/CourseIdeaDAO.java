package ru.bogdanium.model;

import java.util.List;

public interface CourseIdeaDAO {

    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();
}
