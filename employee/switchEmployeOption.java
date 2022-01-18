package employee;

import employee.CD;
import java.util.Scanner;

public class switchEmployeOption {
    public switchEmployeOption() {
    }

    public void switchEmployee() {
        Scanner scan = new Scanner(System.in);
        CD tape = new CD();
        System.out.println("***      Employee  MENU     ***");
        System.out.println("***    1. Add new Employee  ");
        System.out.println("***    2. Show all Employee  ");
        System.out.println("***    3. Edit Employee(menu)  ");
        System.out.println("***    4. Delete Employee  ");
        System.out.println("***    5. Search Employee(menu) ");
        System.out.println("***    5.1  Search Employee by name ");
        System.out.println("***    5.2  Search Employee by surname ");
        System.out.println("***    5.3  Search Employee by ID");

        while(true) {
            while(true) {
                System.out.print(" Select new option  ");
                int i = scan.nextShort();
                short R;
                switch(i) {
                    case 1:
                        tape.AddEmployee();
                        break;
                    case 2:
                        tape.showEmployee();
                        break;
                    case 3:
                        System.out.println(" *** 1. Edit name");
                        System.out.println(" *** 2. Edit surname");
                        System.out.println(" SELECT AS BELOW ");
                        R = scan.nextShort();
                        switch(R) {
                            case 1:
                                tape.updateEmployeeName();
                                continue;
                            case 2:
                                tape.updateEmployeeSurame();
                            default:
                                continue;
                        }
                    case 4:
                        tape.deleteEmployee();
                        break;
                    case 5:
                        System.out.println(" *** 1. Search by name");
                        System.out.println(" *** 2. Search by surname");
                        System.out.println(" *** 3. Search by IDNP");
                        System.out.println(" *** Choose :: ");
                        R = scan.nextShort();
                        switch(R) {
                            case 1:
                                tape.searchEmployeeByName();
                                continue;
                            case 2:
                                tape.searchEmployeeBySurname();
                                continue;
                            case 3:
                                tape.searchEmployeeByIdnp();
                                continue;
                        }
                    default:
                        System.out.println("Selection not identified!");
                }
            }
        }
    }
}
