package at.juergenbergmann.gittest;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("J�rgen Bergmann", LocalDate.now());
		System.out.println(person.toString());
	}

}
