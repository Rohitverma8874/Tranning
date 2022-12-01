package io;

import java.io.Serializable;

    public class Candidate implements Serializable {

        private String name;
        private int candidateId;
        private String courseEnrolledIn ;

        public Candidate(String name, int candidateId, String courseEnrolledIn) {
            this.name = name;
            this.candidateId = candidateId;
            this.courseEnrolledIn = courseEnrolledIn;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return candidateId;
        }

        public void setAge(int candidateId) {
            this.candidateId = candidateId;
        }


        public void setGrade(String grcourseEnrolledInade) {
            this.courseEnrolledIn = courseEnrolledIn;
        }

        @Override
        public String toString() {
            return "Candidate{" +
                    "candidateId='" + candidateId + '\'' +
                    ", name=" + name +
                    ", courseEnrolledIn=" + courseEnrolledIn +
                    '}';
        }
    }
