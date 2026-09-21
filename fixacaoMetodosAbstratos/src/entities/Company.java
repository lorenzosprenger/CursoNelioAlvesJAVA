package entities;

public class Company extends TaxPayer{
    private int numberOfEmployees;

    public Company() {
    }

    public Company(String name, double anaualIncome, int numberOfEmployees) {
        super(name, anaualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10) {
            return getAnaualIncome() * 0.14;
        } else {
            return getAnaualIncome() * 0.16;
        }
    }
}
