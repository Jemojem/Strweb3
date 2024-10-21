package jaxb.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "organisation")
@XmlAccessorType(XmlAccessType.FIELD)

public class Organisation {
	
	@XmlElementWrapper(name = "departments")
    @XmlElement(name = "department")
	private List<Department> departments;
	
	
	public Organisation(List<Department> departments) {
		super();
		this.departments = departments;
	}


	public Organisation() {
		super();
	}


	public List<Department> getDepartments() {
		return departments;
	}


	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}


	public static Organisation createData()
	{
		return new Organisation(
				Arrays.asList
				(new Department("D01", "ACCOUNTING", "NEW YORK",
						(new ArrayList<Employee>(Arrays.asList(
								new Employee("E01", "Tom", null),
								new Employee("E02", "Mary", "E01"),
								new Employee("E03", "John", null))))),
				new Department("D02", "DEVELOPERS", "OHIO",
						(new ArrayList<Employee>(Arrays.asList(
								new Employee("E01", "Jerry", null),
								new Employee("E02", "Shiro", "E01"),
								new Employee("E03", "John", "E01"))))),
				new Department("D03", "TESTERS", "OHIO",
						(new ArrayList<Employee>(Arrays.asList(
								new Employee("E01", "Vano", null),
								new Employee("E02", "Siri", "E01"),
								new Employee("E03", "Chris", null)))))
				));
	}
}
