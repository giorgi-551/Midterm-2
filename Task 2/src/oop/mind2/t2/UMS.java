package oop.mind2.t2;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a learning course in the university.
 */
class LearningCourse {
    private String title;
    private String prerequisites;
    private String majorTopics;

    public LearningCourse(String title, String prerequisites, String majorTopics) {
        this.title = title;
        this.prerequisites = prerequisites;
        this.majorTopics = majorTopics;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getMajorTopics() {
        return majorTopics;
    }

    public void setMajorTopics(String majorTopics) {
        this.majorTopics = majorTopics;
    }

    @Override
    public String toString() {
        return "Course Title: " + title + "\n" +
                "Prerequisites: " + prerequisites + "\n" +
                "Major Topics: " + majorTopics + "\n";
    }
}

/**
 * Represents a student who can take multiple learning courses.
 */
class Student {
    private String name;
    private String id;
    private List<LearningCourse> courses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public void addCourse(LearningCourse course) {
        courses.add(course);
    }

    public List<LearningCourse> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

/**
 * University Management System class to manage students and print their data.
 */
public class UMS {
    private List<Student> students;

    public UMS() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Prints the student details along with their enrolled learning courses.
     * @param student the student whose data is to be printed
     */
    public void printStudentData(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Enrolled Learning Courses:");

        List<LearningCourse> courseList = student.getCourses();
        if (courseList.isEmpty()) {
            System.out.println("  No courses enrolled.");
        } else {
            for (int i = 0; i < courseList.size(); i++) {
                System.out.println("  Course #" + (i + 1) + ":");
                System.out.println("  " + courseList.get(i).toString().replaceAll("(?m)^", "    "));
            }
        }
    }

    // Example main method to test the implementation
    public static void main(String[] args) {
        UMS ums = new UMS();

        Student student1 = new Student("Giorgi Maisuradze", "59601135440");

        student1.addCourse(new LearningCourse(
                "Object Oriented Programming (ENG)",
                "Introduction to Programming (ENG)",
                "Java syntax and data structures;\n" +
                        "Procedural programming concepts;\n" +
                        "Classes and encapsulation;\n" +
                        "Polymorphism and inheritance;\n" +
                        "Java packages and modularization;\n" +
                        "Working with the network;\n" +
                        "File handling and data persistence;\n" +
                        "Processing and analyzing text data;\n" +
                        "Terminal and command-line interactions."
        ));

        student1.addCourse(new LearningCourse(
                "English Language Course C1-2 (ENG)",
                "English Language Course C1-1 (ENG)",
                "Exploration of cultural topics;\n" +
                        "Interpretation and critical thinking;\n" +
                        "Persuasive communication strategies;\n" +
                        "Building personal and professional connections;\n" +
                        "Technology-related vocabulary and discussions;\n" +
                        "Developing linguistic independence."
        ));

        student1.addCourse(new LearningCourse(
                "Computer Organization (ENG)",
                "Introduction to Programming (ENG)",
                "Representing and manipulating information;\n" +
                        "Machine-level representations of programs;\n" +
                        "Optimizing program performance;\n" +
                        "Understanding the memory hierarchy."
        ));

        student1.addCourse(new LearningCourse(
                "AWS Cloud Practitioner (ENG)",
                "Course is not Mandatory",
                "Cloud computing concepts and principles;\n" +
                        "Distributed systems: computing and networking;\n" +
                        "Distributed data storage and database systems;\n" +
                        "Economies of scale in computing infrastructure."
        ));

        student1.addCourse(new LearningCourse(
                "Computer and Society (ENG)",
                "None",
                "Ethics and professional responsibility – ethical frameworks, professional conduct;\n" +
                        "Privacy and security – data privacy, surveillance, cyber threats;\n" +
                        "Intellectual property – copyright, digital ownership, open-source issues;\n" +
                        "Digital divide and access – technology disparities, digital literacy;\n" +
                        "Social media and influence – misinformation, societal impact;\n" +
                        "Artificial intelligence and automation – AI ethics, workforce implications;\n" +
                        "Bias and fairness in computing – algorithmic bias, equitable AI;\n" +
                        "Environmental impact – e-waste, sustainability in computing;\n" +
                        "Future of work – remote work, human-AI collaboration;\n" +
                        "Emerging technologies – quantum computing, blockchain, policy concerns."
        ));


        /*
        Beta tester
         */
        Student student2 = new Student("Nika Dzabaxidze", "010101010");
        student2.addCourse(new LearningCourse("Data Structures", "Java Programming", "Arrays, LinkedLists, Trees"));
        student2.addCourse(new LearningCourse("Web Development", "HTML & CSS", "HTML, CSS, JavaScript, React"));

        ums.addStudent(student1);
        ums.addStudent(student2);

        // Print data for each student
        ums.printStudentData(student1);
        ums.printStudentData(student2);
    }
}
