package org.example.simple;

import lombok.ToString;

@ToString
public class Course {

    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;

    public Course(CourseBuilder builder) {
        this.courseName = builder.courseName;
        this.coursePPT = builder.coursePPT;
        this.courseVideo = builder.courseVideo;
        this.courseArticle = builder.courseArticle;
    }

    public static class CourseBuilder {

        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
