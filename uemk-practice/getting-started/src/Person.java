public class Person {
    String id;
    String name;

    public Person(String id, String name){
        setId(id);
        setName(name);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

class Employee extends Person{
    String department;
    String salary;

    public Employee(String id, String name, String department, String salary) {
        super(id, name);
        this.department = department;
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(String salary){
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getSalary() {
        return salary;
    }
}

class Manager extends Employee{
    String teamSize;

    public Manager(String id, String name, String department, String salary, String teamSize) {
        super(id, name, department, salary);
        this.teamSize = teamSize;
    }

    public String getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(String teamSize) {
        this.teamSize = teamSize;
    }
}