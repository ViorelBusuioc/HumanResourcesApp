public class Main {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("Gicu Micu","17/05/1975","12/04/2023",15000.00);
        System.out.println(salariedEmployee.getName() + " is " + salariedEmployee.getAge() +
                " years old.");
        System.out.println("Weekly paycheck is: $" + salariedEmployee.collectPay());
        salariedEmployee.retire();
        System.out.println("Weekly paycheck after retirement is: $" + salariedEmployee.collectPay());
        System.out.println(salariedEmployee);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Vasile Pamfile","10/12/1985","25/11/2010",
                20.00);
        System.out.println("Monthly paycheck is: $" + hourlyEmployee.collectPay());
        System.out.println("If bonus achieved, new paycheck is: $" + hourlyEmployee.getDoublePay());
        System.out.println(hourlyEmployee.getName() + " is " + hourlyEmployee.getAge() +
                " years old.");
        System.out.println(hourlyEmployee);


    }
}

