package org.example.simple;

public class Client {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("设计模式")
                .buildCoursePPT("https://example.org/ppt/design-pattern-builder.ppt")
                .buildCourseVideo("https://example.org/video/design-pattern-builder.mp4")
                .buildCourseArticle("https://example.org/article/design-pattern-builder").build();
        System.out.println(course);
    }
}
