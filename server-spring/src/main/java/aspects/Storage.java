package aspects;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import io.swagger.model.User;

//class storing info about login times
public final class Storage {
	
	private static List<User> loggedUsers  = new ArrayList<User>();
	private static List<LocalDateTime> loginTime = new ArrayList<LocalDateTime>();
	 
	private Storage () {
	}
	
	public static List<User> getUser() {
		return loggedUsers;
	}

	public static void setUser(List<User> students) {
		Storage.loggedUsers = students;
	}
	
	public static List<LocalDateTime> getLoginTime() {
		return loginTime;
	}

	public static void setLoginTime(List<LocalDateTime> times) {
		Storage.loginTime = times;
	}
	
	public static void addUser(User user) {
		loggedUsers.add(user);
	}
	
	public static int indexOfUser(User user) {
		return loggedUsers.indexOf(user);
	}
	
	public static void addTime(LocalDateTime time) {
		loginTime.add(time);
	}
	
	public static void setCurrentTime(int index) {
		loginTime.set(index, LocalDateTime.now());
	}
}
