
import java.util.*;

public class employees extends showroom implements utility {

    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @Override
    public void get_details() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Age: " + emp_age);
        System.out.println("Employee Department: " + emp_department);
        System.out.println("Showroom Name: " + showroom_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("========================= *** ENTER EMPLOYEE DETAILS *** ========================");
        System.out.println();
        System.out.print("ID: ");
        emp_id = sc.nextLine();
        System.out.print("NAME: ");
        emp_name = sc.nextLine();
        System.out.print("AGE: ");
        emp_age = sc.nextInt();
        System.out.print("DEPARTMENT: ");
        emp_department = sc.nextLine();
        System.out.print("SHOWROOM NAME:");
        showroom_name = sc.nextLine();
    }
}
