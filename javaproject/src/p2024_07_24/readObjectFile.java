package p2024_07_24;

import java.io.*;
import java.util.Date;

class PersonInformation implements Serializable{
	private String name;
	private int age;
	private String address;
	private String telephone;
	
	public PersonInformation(String name, int age, String address, String telephone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.telephone = telephone;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}

class ObjectStreamTest {
	PersonInformation gemini;
	PersonInformation johnharu;
	Date d;

	public ObjectStreamTest() {
		gemini = new PersonInformation("gemini", 10, "seoul", "02-321-3234");
		johnharu = new PersonInformation("johnharu", 20, "seoul", "02-23234-43");
		d = new Date();
	}
	
	public void writeObjectFile() {
		try {
			FileOutputStream fos = new FileOutputStream("person.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(gemini);
			oos.writeObject(johnharu);
			oos.writeObject(d);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void readObjectFile() {
		try {
			FileInputStream fis = new FileInputStream("person.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = null;
			
			while((o = ois.readObject()) != null) {
				if(o instanceof PersonInformation) {
					System.out.print(((PersonInformation)o).getName() + " : ");
					System.out.print(((PersonInformation)o).getAge() + " : ");
					System.out.print(((PersonInformation)o).getAddress() + " : ");
					System.out.print(((PersonInformation)o).getTelephone() + " : ");
				}else {
					System.out.println(o.toString());
				}
				System.out.println();
			}
		}catch(Exception e) {
			//e.printStackTrace();
		} 
	}
}

public class readObjectFile {

	public static void main(String[] args) {
		ObjectStreamTest ost = new ObjectStreamTest();
		ost.writeObjectFile();
		ost.readObjectFile();
	}

}
