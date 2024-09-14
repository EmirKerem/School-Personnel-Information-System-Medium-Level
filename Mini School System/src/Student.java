public class Student extends Teacher {
    private String class_;
    private int grade;

    public Student(String name, int age, String lesson, String class_, int grade) {
        super(name, age, lesson);
    }

    public void show_Info() {
        System.out.println("Displaying Student's Information...");
        System.out.println("Student's Name = " + getName());
        System.out.println("Student's Age = " + getAge());
        System.out.println("Student's Subject = " + getLesson());
        System.out.println("Student's Class = " + class_);
        System.out.println("Student's Grade = " + grade);
    }
}
