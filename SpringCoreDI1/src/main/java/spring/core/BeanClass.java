package spring.core;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BeanClass {
	
	private String ComapanyName;
	private List<String> Department ;
	private Set<String> DevelopemetEmployee;
	private Map<Integer,String> EmpIDMap;
	private Properties properties;
	

	public String getComapanyName() {
		return ComapanyName;
	}
	public void setComapanyName(String comapanyName) {
		ComapanyName = comapanyName;
	}
	public List<String> getDepartment() {
		return Department;
	}
	public void setDepartment(List<String> department) {
		Department = department;
	}
	public Set<String> getDevelopemetEmployee() {
		return DevelopemetEmployee;
	}
	public void setDevelopemetEmployee(Set<String> developemetEmployee) {
		DevelopemetEmployee = developemetEmployee;
	}
	public Map<Integer, String> getEmpIDMap() {
		return EmpIDMap;
	}
	public void setEmpIDMap(Map<Integer, String> empIDMap) {
		EmpIDMap = empIDMap;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "BeanClass [ComapanyName=" + ComapanyName + ", Department=" + Department + ", DevelopemetEmployee="
				+ DevelopemetEmployee + ", EmpIDMap=" + EmpIDMap + ", properties=" + properties + "]";
	}
	public BeanClass() {
		super();
	}
	
	
	
	
	
	
	
	
}
