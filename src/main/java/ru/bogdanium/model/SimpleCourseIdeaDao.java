package ru.bogdanium.model;

import java.util.ArrayList;
import java.util.List;

public class SimpleCourseIdeaDao implements CourseIdeaDao {

    private List<CourseIdea> ideas;

    public SimpleCourseIdeaDao() {
        ideas = new ArrayList<>();
        ideas.add(new CourseIdea("Spark with DB", "Fedor"));
        ideas.add(new CourseIdea("Spark testing", "Mika"));
        ideas.add(new CourseIdea("Spark CRUD app", "Annet"));
    }

    @Override
    public boolean add(CourseIdea idea) {
        return ideas.add(idea);
    }

    @Override
    public List<CourseIdea> findAll() {
        return new ArrayList<>(ideas);
    }

    @Override
    public CourseIdea findBySlug(String slug) {
        return ideas.stream()
                .filter(idea -> idea.getSlug().equals(slug))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }
}
