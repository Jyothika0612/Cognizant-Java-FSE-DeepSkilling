public class Main {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement(5);

        Employee e1 = new Employee(101, "Rahul", "Manager", 60000);
        Employee e2 = new Employee(102, "Anjali", "Developer", 50000);
        Employee e3 = new Employee(103, "Kiran", "Tester", 45000);

        // Add Employees
        management.addEmployee(e1);
        management.addEmployee(e2);
        management.addEmployee(e3);

        // Display Employees
        System.out.println("\n===== Employee List =====");
        management.displayEmployees();

        // Search Employee
        System.out.println("\n===== Search Employee =====");
        management.searchEmployee(102);

        // Delete Employee
        System.out.println("\n===== Delete Employee =====");
        management.deleteEmployee(102);

        // Display After Deletion
        System.out.println("\n===== Employee List After Deletion =====");
        management.displayEmployees();

    }

}