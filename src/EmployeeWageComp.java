public class EmployeeWageComp{
    public static void main(String[] args ) {
        System.out.println("Hello! Welcome to Employee Wage Computation Program");

        //employee1
        Employee e1 = new Employee("FULL");
        //employee2
        Employee e2 = new Employee("PART");

        //Getting attendance
        System.out.println(e1.attendance_check());
        System.out.println(e2.attendance_check());

        //Getting Full time daily wage
        e1.getFulltimewage();

        //Getting Part time daily wage
        e2.getPartTimewage();

        //Getting wage with the use of switch case
        e1.getEmployeewage();
        e2.getEmployeewage();

        //Getting total monthly wage
        e1.getMonthlywage();
        e2.getMonthlywage();
    }
}
 