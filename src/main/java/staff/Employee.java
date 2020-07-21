package staff;

public abstract class Employee {
    private String name;
    private int NINumber;
    private Double salary;

    public Employee(String name, int NINumber, Double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public void setName(String name) {
        if (!(name==null)) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public int getNINumber() {
        return NINumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(Double increment) {
        if (increment>0) {
            this.salary = increment * salary;
        }
    }

    public Double payBonus() {
        return 0.01*salary;
    }
}
