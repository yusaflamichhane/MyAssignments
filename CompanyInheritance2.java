public class CompanyInheritance2 {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Yusaf", 3123, "Network Engineer");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Employee Id : " + employee1.getEmployeeId());
        System.out.println("Title: " + employee1.getJobTitle());
        System.out.println("-----------------------------------------");

        Manager manager1 = new Manager("Sandesh", 1456, "Manager", "Operations");
        System.out.println("Manager Name: " + manager1.getName());
        System.out.println("EmployeeId: " + manager1.getEmployeeId());
        System.out.println("Title: " + manager1.getJobTitle());
        System.out.println("EmployeeId: " + manager1.getDepartment());
        System.out.println("--------------------------------------------");

        CEO ceo1 = new CEO("J.Anderson CEO", 2789, "ABCD Inc.");
        System.out.println("Name of the CEO : " + ceo1.getName());
        System.out.println("EmployeeId of the CEO : " + ceo1.getEmployeeId());
        System.out.println("Name of the Company : " + ceo1.getCompanyName());
        System.out.println("--------------------------------------------------");
    }
}


class Employee {
    private String name;
    private int employeeId;
    private String jobTitle;

    public Employee(String name, int employeeId, String jobTitle) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, String jobTitle, String department) {
        super(name, employeeId, jobTitle);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

class CEO extends Manager {
    private String companyName;

    public CEO(String name, int employeeId, String companyName) {
        super(name, employeeId, "CEO", "Overall");
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}


