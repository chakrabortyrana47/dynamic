package presentation;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import business.UserTO;

public class UserDetailsMB {

	private String name;
	private String phoneNo;
	private String address;
	private String relation;
	
	
	public UserDetailsMB(){
		HttpSession session = 
				(HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		UserTO user=(UserTO)session.getAttribute("user");
		this.name=user.getName();
		this.address=user.getAddress();
		this.phoneNo=user.getPhoneNo();
		this.relation=user.getRelation();
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	
	
}
