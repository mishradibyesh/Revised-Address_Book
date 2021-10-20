package com.bl.addressbook;
import java.util.Scanner;

public class Contacts {
	static final int ADD_PERSON = 1;
	private String firstName ;
	private String lastName ;
	private String address ;
	private String city ;
	private String state ;
	private int zipCode;
	private long phoneNumber;
	private String email;
	Scanner scanner = new Scanner(System.in);
	/*
	 *taking input from the user  
	 * using console
	 */
	public void  addContact() {
		System.out.println("Enter First Name : ");
		firstName = scanner.next();
		System.out.println("Enter Last Name : ");
		lastName = scanner.next();
		System.out.println("Enter Address : ");
		address = scanner.next();
		System.out.println("Enter City : ");
		city = scanner.next();
		System.out.println("Enter State : ");
		state = scanner.next();
		System.out.println("Enter ZipCode : ");
		zipCode = scanner.nextInt();
		System.out.println("Enter Mobile Number : ");
		phoneNumber = scanner.nextLong();
		System.out.println("Enter EmailId : ");
		email = scanner.next();
	}
	public String getFirst_name() {
		return firstName;
	}
	public void setFirst_name(String first_name) {
		this.firstName = first_name;
	}
	public String getLast_name() {
		return lastName;
	}
	public void setLast_name(String last_name) {
		this.lastName = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip_code() {
		return zipCode;
	}
	public void setZip_code(int zip_code) {
		this.zipCode = zip_code;
	}
	public long getPhone_number() {
		return phoneNumber;
	}
	public void setPhone_number(long phone_number) {
		this.phoneNumber = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
