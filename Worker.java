public class Worker {

    private String name;
    private String dateOfBirth;
    private String endDate;

    public Worker() {
    }

    public Worker(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        String date = dateOfBirth;
        String[] values = date.split("/");
        int day = Integer.parseInt(values[0]);
        int month = Integer.parseInt(values[1]);
        int year = Integer.parseInt(values[2]);
        int currentYear = 2023;
        return currentYear - year;
    }

    public double collectPay () {

        return 0.0;
    }

    public String terminate (String endDate) {
        setEndDate(endDate);
        System.out.println("Contract terminated. Contract End Date update to " + endDate);
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
