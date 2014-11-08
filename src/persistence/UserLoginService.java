package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import business.UserTO;

public class UserLoginService {

	EntityManagerFactory emf;
	EntityManager em;
	
	public Long signUp(UserTO userTO){
		UserEntity user=new UserEntity();
		user.setName(userTO.getName());
		user.setAddress(userTO.getAddress());
		user.setRelationship(userTO.getRelation());
		user.setUserName(userTO.getUserName());
		user.setPassWd(userTO.getPassWd());
		try{
			emf=Persistence.createEntityManagerFactory("Demo");
			em=emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
		userTO.setUserNo(user.getUSERNO());
		saveLoginData(userTO);
		}catch(Exception e){
			e.printStackTrace();
		}
		return user.getUSERNO();
	}
	
	@SuppressWarnings("unchecked")
	public UserTO logIn(UserTO userTO) throws Exception{
		UserTO userTo=null;
		try{
			emf=Persistence.createEntityManagerFactory("Demo");
			em=emf.createEntityManager();
			Query q=em.createQuery("select q from UserEntity q where q.userName=?1 and q.passWd=?2");
			q.setParameter(1, userTO.getUserName());
			q.setParameter(2, userTO.getPassWd());
			em.getTransaction().begin();
			
			List<UserEntity>users=q.getResultList();
			em.getTransaction().commit();
			if(users.isEmpty()){
				throw new Exception("Username does not Exist");
			}
			for(UserEntity user:users){
				userTo=new UserTO();
				userTo.setUserNo(user.getUSERNO());
				userTo.setName(user.getName());
				userTo.setPhoneNo(user.getPhoneNo());
				userTo.setAddress(user.getAddress());
				userTo.setRelation(user.getRelationship());
				userTo.setUserName(user.getUserName());
				userTo.setPassWd(user.getPassWd());
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		return userTo;
	}
	
	public void saveLoginData(UserTO userTO){
		LoginEntity login=new LoginEntity();
		login.setUserNo(userTO.getUserNo());
		login.setUserName(userTO.getUserName());
		login.setPassWd(userTO.getPassWd());
		login.setAccntType("User");
		try{
			emf=Persistence.createEntityManagerFactory("Demo");
			em=emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(login);
			em.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
