package com.bl.addressbook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	static final int ADD_PERSON = 1;
	public static void main(String[] args) {
		System.out.println("**********Welcome to Address Book Program***********");
		System.out.println("if you want to add person in the address book please type 1 ");
		Scanner scanner = new Scanner(System.in);
		ArrayList<Contacts> list = new ArrayList<Contacts>();
		Contacts person = new Contacts();
		int option = scanner.nextInt();
		if(option == ADD_PERSON ) {
			person.addContact(); 
			list.add(person);
			System.out.println(list.get(0));
		}
		else {
			System.out.println("please enter right option ! ");
		}
	}
}