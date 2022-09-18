package com.arkatech.test;

import com.arkatech.model.Employee;
import com.arkatech.service.CredService;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        CredService cs = new CredService();

        System.out.println("Welcome to " + cs.companyName);
        String firstName, lastName, option;
        System.out.print("Please enter your First name: ");
        firstName = sc.nextLine();
        System.out.println(firstName);
        System.out.print("Please enter your Last name: ");
        lastName = sc.nextLine();
        System.out.println(lastName);
        String[] departments = new String[]{"tech","adm","hr","lg"};
        System.out.print("Please enter the department from the following list:\n" +
                "\t1. Technical\n" +
                "\t2. Admin\n" +
                "\t3. Human Resource\n" +
                "\t4. Legal\n" +
                "Your choice: ");
        System.out.println("(Please use the serial number to enter your choice)");
        option = sc.nextLine();
        Employee e = new Employee(firstName, lastName);

        cs.showCredentials(e,departments[Integer.parseInt(option)-1]);
    }


}
