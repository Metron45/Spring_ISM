package aspects;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import io.swagger.model.User;

public final class Storage {
	
	private static List<User> loggedUsers;
	private static List<LocalDateTime> loginTime;
	
	private Storage () {
		loggedUsers = new ArrayList<User>();
		loginTime = new ArrayList<LocalDateTime>();
	}
	
	public static List<User> getUser() {
		return loggedUsers;
	}

	public static void setUser(List<User> students) {
		Storage.loggedUsers = students;
//		System.out.println("User who are on the login list:");
//		for( User user : loggedUsers) {
//			System.out.println("User: "+user.getName()+" "+user.getSurname());
//		}
	}
	
	public static List<LocalDateTime> getLoginTime() {
		return loginTime;
	}

	public static void setLoginTime(List<LocalDateTime> times) {
		Storage.loginTime = times;
//		System.out.println("Times of login:");
//		for( LocalDateTime user : loginTime) {
//			System.out.println(user);
//		}
	}
}
