package at.juergenbergmann.gittest;

import java.time.LocalDate;

public class Person {
	String name;
	LocalDate geburtsDatum;
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, LocalDate geburtsDatum) {
		this.name = name;
		this.geburtsDatum = geburtsDatum;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", geburtsDatum=" + geburtsDatum + "]";
	}
}
