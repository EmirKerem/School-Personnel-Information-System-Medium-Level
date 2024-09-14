public class Teacher {
    private String name;
    private int age;
    private String lesson;

    public Teacher(String name, int age, String lesson) {
        this.name = name;
        this.age = age;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void show_Info() {
        System.out.println("Displaying Teacher's Information...");
        System.out.println("Teacher's Name = " + name);
        System.out.println("Teacher's Age = " + age);
        System.out.println("Teacher's Main Subject = " + lesson);
    }
}

