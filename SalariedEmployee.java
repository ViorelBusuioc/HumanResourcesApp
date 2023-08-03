public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String dateOfBirth, String hireDate, double annualSalary) {
        super(name, dateOfBirth, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {

        double paycheck = annualSalary / 26;
        double adjustedPayckech = isRetired ? 0.9 * paycheck : paycheck;
        return (int)adjustedPayckech;
    }
    public void setRetired(boolean retired) {

        isRetired = retired;
    }

    public void retire() {

        setRetired(true);
        setEndDate("13/10/2023");
        System.out.println(getName() + " retired. End date updated to 13/10/2023");
    }

    @Override
    public String toString() {

        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
