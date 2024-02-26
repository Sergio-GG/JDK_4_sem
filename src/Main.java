import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,89270023344L, "Sigismund", 20);
        Employee emp2 = new Employee(2,89271234455L, "Barbara", 3);
        Employee emp3 = new Employee(3,89273337788L, "Basilius", 10);
        Employee emp4 = new Employee(4,89270012222L, "Casandra", 12);
        Employee emp5 = new Employee(5,89270012222L, "John", 3);

        Catalog catalog = new Catalog();
        catalog.arrayList.add(emp1);
        catalog.arrayList.add(emp2);
        catalog.arrayList.add(emp3);
        catalog.arrayList.add(emp4);

        catalog.arrayToString();
        System.out.println("------------------------------------------------------------------");
        System.out.println(catalog.findByExperience(3));
        System.out.println("------------------------------------------------------------------");
        System.out.println(catalog.findPhonenumber("Casandra"));
        System.out.println("------------------------------------------------------------------");
        System.out.println(catalog.findById(3));
        System.out.println("------------------------------------------------------------------");
        catalog.addNewEmployee(new Employee(5, 89871112233L, "Billy", 7));
        catalog.arrayToString();

    }




}