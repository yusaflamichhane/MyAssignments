public class Assignment3 {
    public static void main(String[] args) {
        /*
        find out if the employee has
		low scale -> L
		mid scale -> M
		high scale salary -> H
		based on the values of your choice/imagination

	- use class way designing technique to solve this
         */
        Employee employeeobj = new Employee();
        employeeobj.employee(65000);
        employeeobj.getScale();
        System.out.println("The employee's salary scale is: " + employeeobj.getScale());
    }
}
   class Employee {
    private int salary;
    private char scale;

    void employee(int s)
    {
        salary = s;
    }

    char getScale()
    {
        if (salary < 40000) {
            scale = 'L';
        } else if (salary >= 40000 && salary < 95000) {
            scale = 'M';
        } else {
            scale = 'H';
        }
        return scale;
    }
}


