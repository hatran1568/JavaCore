package pkgStaff;

public abstract class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    void display(){
        System.out.print(name);
    }
    
    abstract double getSalary();
}
