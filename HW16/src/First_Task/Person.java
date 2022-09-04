package First_Task;

import java.io.Serializable;
import java.util.*;

import javax.crypto.SecretKey;

public class Person extends Human implements Serializable, SecretKey{
	
	public String name;
	private String lastName;
	private int age;
	
	public Person() {}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(String lastName, int age) {
		super();
		this.lastName = lastName;
		this.age = age;
	}

	public Person(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, lastName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [name='" + name + "'; lastName='" + lastName + "'; age=" + age + "]";
	}

	@Override
	public String getAlgorithm() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] getEncoded() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
