package org.alvas.ome_to_one.controller;

import java.util.Scanner;

import org.alvas.one_to_one.dao.PersonDao;
import org.alvas.one_to_one.dto.Adhar;
import org.alvas.one_to_one.dto.Person;

public class PersonController {
	static Person person = new Person();
	static Adhar adhar  = new Adhar();
	static PersonDao dao = new PersonDao();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("1. Save Person Adhar Details");
System.out.println("Enter the choice");
int ch = sc.nextInt();
switch(ch) {
case 1:
	person.setName("Amisha");
	person.setEmail("ami@gmail.com");
	adhar.setAadharno(987655445);
	adhar.setAddress("Mijar");
	
	person.setAdhar(adhar);
	dao.savePerson(person,adhar);
break;
	}
	}

}
