
package pkgPhoneNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneNumber[] phoneList = new PhoneNumber[1000];
        int area, choice; String number, cc;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list of phone numbers:");
        System.out.println("------------------------------");
        while(true){
            System.out.print("Type of phone number ?(1 - local phone, 2 – Inter phone number, 0 - exit): ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    System.out.print("Enter area code: ");
                    area = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter number: ");
                    number = sc.nextLine();
                    phoneList[i] = new PhoneNumber(area, number);
                    i++;
                    break;
                case 2:
                    System.out.print("Enter country code: ");
                    cc = sc.nextLine();
                    System.out.print("Enter area code: ");
                    area = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter number: ");
                    number = sc.nextLine();
                    phoneList[i] = new IntPhoneNumber(cc, area, number);
                    i++;
                    break;
                case 0: 
                    break;
                default:
                    System.out.println("Invalid choice, please reenter.");
                    break;
            }
            if(choice == 0) break;
        }
        int n=i;
        System.out.println("");
        System.out.println("List of phone number: ");
        System.out.println("-----------------------");
        for (i = 0; i < n; i++){
            phoneList[i].display();
        }
    }
}