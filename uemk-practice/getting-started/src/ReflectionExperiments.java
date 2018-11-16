
public class ReflectionExperiments {
    public static void main(String args[]) {
        System.out.println("Hello Reflections! I do NOT need you..." +
                "Except for DevOps of course LOL");
        Employee e = new Employee("001", "Mark Twain", "IT", "23000.00");
        Class cl = e.getClass();
        System.out.println(e.getClass().getName() + " " + e.getName());

    }
}
