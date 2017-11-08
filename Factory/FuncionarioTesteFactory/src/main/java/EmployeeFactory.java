public class EmployeeFactory {

    public Employee getEmployee(String employeeType){
        switch (employeeType){
            case "designer":
                return new Designer();
            case "developer":
                return new Developer();
            case "leader":
                return new Leader();
            default:
                throw new RuntimeException("Error");
        }

    }

}
