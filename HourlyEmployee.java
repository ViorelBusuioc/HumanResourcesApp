public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String dateOfBirth, String hireDate, double hourlyPayRate) {
        super(name, dateOfBirth, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {

        double paycheck = hourlyPayRate * 40;
        return (int)paycheck;
    }

    public double getDoublePay() {

        return collectPay() * 2;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
