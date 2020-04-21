/*
 * LoggingWithAspectJ - Logging with AspectJ
 * Copyright (C) 2007 Christian Schenk
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 */
package aspects;

import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import io.swagger.model.User;

@Aspect
@Component
public final class MyAspect {
	
	private static final List<User> loggedUsers = new ArrayList<User>();
	private static final List<LocalDateTime> loginTime = new ArrayList<LocalDateTime>();
	
	//Aspects log the last login rime of each user
	//Endpoint for times of login is under /accountsTime
	
	@AfterReturning(pointcut = "execution(* io.swagger.service.UserServiceImpl.addUser(..))",
			returning = "retVal")
	public Object doOtherThing(Object retVal) throws Throwable {
		int index = loggedUsers.indexOf(retVal); 
		//despite using AfterReturnign Aspects do the function 2 times.

		if(index == -1) {
			loggedUsers.add((User) retVal);
			loginTime.add(LocalDateTime.now());
		}
		
		Storage.setLoginTime(loginTime);
		Storage.setUser(loggedUsers);
		
		return retVal;
		
	}
	
	@AfterReturning(pointcut = "execution(* io.swagger.service.UserServiceImpl.loginUser(..))",
			returning = "retVal")
	public Object doThing(Object retVal) throws Throwable {
		int index = loggedUsers.indexOf(retVal);
		loginTime.set(index, LocalDateTime.now());
		
		Storage.setLoginTime(loginTime);
		Storage.setUser(loggedUsers);
		
		return retVal;
	}
}