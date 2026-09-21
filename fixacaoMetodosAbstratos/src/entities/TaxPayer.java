package entities;

public abstract class TaxPayer {
    private String name;
    private double anaualIncome;

    public TaxPayer(){
    }

    public TaxPayer(String name, double anaualIncome) {
        this.name = name;
        this.anaualIncome = anaualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnaualIncome() {
        return anaualIncome;
    }

    public void setAnaualIncome(double anaualIncome) {
        this.anaualIncome = anaualIncome;
    }



    public abstract double tax();



    }

