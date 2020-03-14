package dotclass;

import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class student {
	public student() {
		System.out.println("one");
	}
	public student(int i) {
		System.out.println("two");
	}
	@XmlAnyAttribute
	private int id;
	private String name;
	private int marks;
	private String school;
	
	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@XmlElement
	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}

}
