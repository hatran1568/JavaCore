package pkgStaff;

public class Worker extends Person {
    private double hours;
    final double RATE = 5.5;

    public Worker() {
    }

    public Worker(String name, double hours) {
        super(name);
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println(" - "+this.getSalary());
    }
    
    @Override
    public double getSalary(){
        return hours * RATE;
}
}