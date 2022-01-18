package employee;



public class employeData {
    public String name;
    public String surname;
    public employeData.gender gen;
    public String id;

    public employeData() {
    }

    public void employeData(String name, String surname, boolean gen, String idnp) {
        this.name = name;
        this.surname = surname;
        this.id = idnp;
        if (gen) {
            this.gen = employeData.gender.masculin;
        } else {
            this.gen = employeData.gender.feminin;
        }

    }

    public void employeename() {
        System.out.print(" name:: ");
        System.out.println(this.name);
        System.out.print(" surname:: ");
        System.out.println(this.surname);
        System.out.print(" gender:: ");
        System.out.println(this.gen);
        System.out.print(" idnp:: ");
        System.out.println(this.id);
        System.out.println("********************");
    }

    public static enum gender {
        masculin,
        feminin;

        private gender() {
        }
    }
}
