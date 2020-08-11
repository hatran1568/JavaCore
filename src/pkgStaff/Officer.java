package pkgStaff;

public class Officer extends Person{
    private double bSalary;

    public Officer() {
    }

    public Officer(String name, double bSalary) {
        super(name);
        this.bSalary = bSalary;
    }

    @Override
    public double getSalary(){
        return bSalary;
    }
    
    public void setbSalary(double bSalary) {
        this.bSalary = bSalary;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println(" - "+this.getSalary());
    }
    
    
}