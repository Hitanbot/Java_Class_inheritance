package staff.management;

public class Director extends Manager {

    private Double budget;


    public Director(String name, int NINumber, Double salary, String deptName, Double budget) {
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    @Override
    public Double payBonus() {
        return 2*super.payBonus();
    }
}
