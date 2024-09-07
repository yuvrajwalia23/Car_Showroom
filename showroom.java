
import java.util.*;

public class showroom implements utility {

    String showroom_name;
    String showroom_address;
    String manager_name;
    int total_employees;
    int total_cars_in_stock = 0;

    @Override
    public void get_details(){
       
        System.out.println("Showroom Name: " + showroom_name);
        System.out.println("Showroom Address: "+ showroom_address); 
        System.out.println("Manager name: " + manager_name);
        System.out.println("Total Employees: " + total_employees);
        System.out.println("Toal cars in stock: " + total_cars_in_stock);
       
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("========================= *** ENTER SHOWROOM DETAILS *** ========================");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        showroom_name = sc.nextLine();
        System.out.print("SHOWROOM ADDRESS: ");
        showroom_address = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        manager_name = sc.nextLine();
        System.out.print("TOTAL EMPLOYEES: ");
        total_employees = sc.nextInt();
        System.out.print("TOTAL CARS IN STOCK: ");
        total_cars_in_stock = sc.nextInt();
    }
}
