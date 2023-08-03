public class Employee extends Worker {

    private long employeeID;
    private String hireDate;
    private static int employeeNo = 1;

    public Employee(String name, String dateOfBirth, String hireDate) {
        super(name, dateOfBirth);
        this.employeeID = employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
