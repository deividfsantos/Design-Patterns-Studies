public class Main {

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();

        Employee designer = employeeFactory.getEmployee("designer");
        designer.work();

        Employee developer = employeeFactory.getEmployee("developer");
        developer.work();

        Employee leader = employeeFactory.getEmployee("leader");
        leader.work();
    }

}
