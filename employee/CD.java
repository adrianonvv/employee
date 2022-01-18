package employee;

import employee.employeData;
import java.util.Scanner;

public class CD {
    Scanner scan;
    static int j = 0;
    boolean B;
    employeData[] emm;
    String[] list;

    public CD() {
        this.scan = new Scanner(System.in);
        this.B = false;
        this.emm = new employeData[4];
    }

    public void AddEmployee() {
        this.emm[j] = new employeData();

        do {
            System.out.print("Enter name- ");
            String a = this.scan.next();
            System.out.print("Enter surname- ");
            String b = this.scan.next();
            System.out.print("Enter gender( 0/1) - ");
            short gen = this.scan.nextShort();
            System.out.print("Enter id - ");
            String id = this.scan.next();
            if (gen == 1) {
                this.emm[j].employeData(a, b, true, id);
            } else if (gen == 0) {
                this.emm[j].employeData(a, b, false, id);
            }

            ++j;
            this.B = false;
        } while(this.B);

    }

    public void showEmployee() {
        System.out.println("[ " + j + " ] = ");

        for(int i = 0; i < j; ++i) {
            this.emm[i].employeename();
        }

    }

    public void searchEmployeeBySurname() {
        System.out.print("Enter surname for search- ");
        String s = this.scan.next();
        boolean f = true;
        int k = 0;

        for(int i = 0; i < this.emm.length; ++k) {
            if (s.equals(this.emm[k].surname)) {
                System.out.println("found name - " + this.emm[k].surname);
                System.out.println("found name - " + this.emm[k].name);
                System.out.println("found gender - " + this.emm[k].gen);
                System.out.println("found id - " + this.emm[k].id);
                break;
            }

            System.out.print(" ");
            ++i;
        }

    }

    public void searchEmployeeByName() {
        System.out.print("Enter name for search> ");
        int q = 0;
        String s = this.scan.next();

        for(int i = 0; i < this.emm.length; ++q) {
            if (s.equals(this.emm[q].name)) {
                System.out.println("found surname - " + this.emm[q].surname);
                System.out.println("found name - " + this.emm[q].name);
                System.out.println("found gender - " + this.emm[q].gen);
                System.out.println("found id - " + this.emm[q].id);
                break;
            }

            System.out.print(" ");
            ++i;
        }

    }

    public void searchEmployeeByIdnp() {
        System.out.print("Enter id for search- ");
        int k = 0;
        String s = this.scan.next();

        for(int i = 0; i < this.emm.length; ++k) {
            if (s.equals(this.emm[k].id)) {
                System.out.println("found surname - " + this.emm[k].surname);
                System.out.println("found name - " + this.emm[k].name);
                System.out.println("found gender - " + this.emm[k].gen);
                System.out.println("found id - " + this.emm[k].id);
                break;
            }

            System.out.print(" ");
            ++i;
        }

    }

    public void updateEmployeeName() {
        if (this.emm.length != 0) {
            System.out.println("Sorry no new entries!");
        } else {
            System.out.print("Enter name for search:: ");
            int k = 0;
            String s = this.scan.next();

            for(int i = 0; i < this.emm.length; ++k) {
                if (s.equals(this.emm[k].name)) {
                    System.out.println("found :: " + this.emm[k].name);
                    System.out.print("insert new name :: ");
                    String ss = this.scan.next();
                    this.emm[k].name = ss;
                    System.out.println("changed to :: " + this.emm[k].name + " from -- " + s);
                    break;
                }

                System.out.print(" ");
                ++i;
            }

        }
    }

    public void updateEmployeeSurame() {
        if (this.emm.length != 0) {
            System.out.println("Sorry no records!");
        } else {
            System.out.print("Enter surname for search:: ");
            int k = 0;
            String s = this.scan.next();

            for(int i = 0; i < this.emm.length; ++k) {
                if (s.equals(this.emm[k].surname)) {
                    System.out.println("results :: " + this.emm[k].surname);
                    System.out.print("insert new surname :: ");
                    String ss = this.scan.next();
                    this.emm[k].surname = ss;
                    System.out.println("changed to :: " + this.emm[k].surname + " from " + s);
                    break;
                }

                System.out.print(" ");
                ++i;
            }

        }
    }

    public void deleteEmployee() {
        System.out.print("Enter id for search:: ");
        int k = 0;
        String s = this.scan.next();

        for(int i = 0; i < this.emm.length; ++k) {
            if (s.equals(this.emm[k].id)) {
                System.out.println("delete surname :: " + this.emm[k].surname);
                this.emm[k].surname = "";
                System.out.println("delete name :: " + this.emm[k].name);
                this.emm[k].name = "";
                System.out.println("delete gender :: " + this.emm[k].gen);
                this.emm[k].gen = null;
                System.out.println("delete id :: " + this.emm[k].id);
                this.emm[k].id = "";
                break;
            }

            System.out.print(" ");
            ++i;
        }

    }
}
