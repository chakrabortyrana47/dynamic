package business;

import persistence.UserLoginService;

public class UserManager {
	public UserLoginService service=new UserLoginService();
	public Long signUp(UserTO user){
		Long userNo=service.signUp(user);
		return userNo;
		
		}
public UserTO logIn(UserTO userEntity) throws Exception{
		UserTO user=service.logIn(userEntity);
		return user;
	}
	

}
