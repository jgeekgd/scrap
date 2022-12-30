package com.revature.app;

//import ---> statement use to refer the java API from another package not present in current packages.
import java.util.Scanner;

import com.revature.constants.Constant;

public class MenuDrivenApplication {
	public static void main(String[] args) {
		howToGetValueEasilyFromUser();
	}

	private static void howToGetValueEasilyFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println(Constant.HEADER_MSG);
		char proceed = 'Y';
		do {
			System.out.println(Constant.FINAL_MENU_MSG);
			System.out.print(Constant.MENU_CHOICE_MSG);
			int choice = sc.nextInt();

			if (choice == 1) {
				registerUser(sc);
			} else {
				break;
			}

			System.out.print(Constant.MENU_CONTINUE_MSG);
			proceed = sc.next().toUpperCase().charAt(0);
			// System.out.println(proceed!='N');
			// System.out.println(proceed!='n');
			// System.out.println(proceed!='N' || proceed!='n');

		} while (proceed != 'N');
		System.out.println(Constant.FOOTER_MSG);
	}

	private static void registerUser(Scanner sc) {
		System.out.print(Constant.MSG_ENTER_AGE_HINDI);
		int age = sc.nextInt();
		System.out.print(Constant.MSG_ENTER_NAME_HINDI);
		String name = sc.next();
		System.out.printf(Constant.SUCESSFUL_REGISTRATION_MESSAGE, name, age);
	}
}

// १८   
// गंगाधर

/*
 * Ctrl+Shift+F format code Ctrl+shift+/ --- comment multi line comment
 * Ctrl+shift+\ --- uncomment comment multi line comment Ctrl_+/ -- comment
 * single line comment Ctrl_+\ -- uncomment single line comment
 * 
 * 
 * -- Menu Driven Program -- Foundational Project P0 Accept simple value from
 * user? What is I/O? We use java.io package accept user input from keyboard. :
 * System.in ------ > Keyboard. Writing the data to files is the output
 * operation. : System.out ---> Send o/p to console. Error can be send to log
 * files System.err
 */