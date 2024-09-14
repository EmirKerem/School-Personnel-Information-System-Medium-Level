public class Principal extends Teacher {
    public Principal(String name, int age, String lesson) {
        super(name, age, lesson);
    }

    public void show_Info() {
        System.out.println("Displaying Principal's Information...");
        System.out.println("Principal's Name = " + getName());
        System.out.println("Principal's Age = " + getAge());
        System.out.println("Principal's Main Subject = " + getLesson());
    }
}

