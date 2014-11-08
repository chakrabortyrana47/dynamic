package presentation;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import business.UserManager;
import business.UserTO;

public class userMB {

	private String name;
	private String phoneNo;
	private String address;
	private String relation;
	private String userName;
	private String passWd;
	private String message;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWd() {
		return passWd;
	}
	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}
	
	
	public String login(){
	UserTO user=new UserTO();
	UserTO userTo=null;
	user.setUserName(userName);
	user.setPassWd(passWd);
	UserManager manager=new UserManager();
	try{
		userTo=manager.logIn(user);
	}catch(Exception e){
		message=e.getMessage();
		//System.out.println(message);
		return "failure";
	}
	HttpSession session = 
			(HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
	session.setAttribute("user", userTo);
	return "success";
	}
}
