
import java.util.*;

interface utility {

    public void get_details();

    public void set_details();
}

public class Main {

    static void main_menu() {
        System.out.println();
        System.out.println("=================== *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** ==================");
        System.out.println();
        System.out.println("========================= *** ENTER YOUR CHOICE *** ========================");
        System.out.println();
        System.out.println("1) ADD SHOWROOM \t\t\t 2) ADD EMPLOYEES \t\t\t 3) ADD CARS");
        System.out.println();
        System.out.println("4) GET SHOWROOM \t\t\t 5) GET EMPLOYEES \t\t\t 6) GET CARS");
        System.out.println();
        System.out.println("========================= *** ENTER 0 TO EXIT *** ========================");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        showroom showroom[] = new showroom[5];
        employees employee[] = new employees[5];
        cars car[] = new cars[5];

        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int choice = 100;

        while (choice != 0) {

            main_menu();
            choice = sc.nextInt();

            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        showroom[showroom_counter] = new showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println(showroom_counter);
                        System.out.println("1) ADD NEW SHOWROOM");
                        System.out.println("9) GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 2:
                        employee[employees_counter] = new employees();
                        employee[employees_counter].set_details();
                        employees_counter++;
                        System.out.println("2) ADD NEW EMPLOYEE");
                        System.out.println("9) GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        car[car_counter] = new cars();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println("3) ADD NEW CAR");
                        System.out.println("9) GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 4:
                        for (int i = 0; i < showroom_counter ; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9) GO BACK TO MAIN MENU");
                        System.out.println("0) EXIT");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for (int i = 0; i < employees_counter ; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9) GO BACK TO MAIN MENU");
                        System.out.println("0) EXIT");
                        choice = sc.nextInt();
                        break;

                    case 6:
                        for (int i = 0; i < car_counter ; i++) {
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9) GO BACK TO MAIN MENU");
                        System.out.println("0) EXIT");
                        choice = sc.nextInt();

                    default:
                        System.out.println("PLEASE ENTER VALID CHOICE");
                        break;
                }
            }
        }
    }
}
