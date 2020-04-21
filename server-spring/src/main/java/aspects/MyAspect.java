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
	
	@AfterReturning(pointcut = "execution(* io.swagger.service.UserServiceImpl.addUser(..))",
			returning = "retVal")
	public Object doOtherThing(Object retVal) throws Throwable {
		System.out.println(retVal);
		int index = Storage.indexOfUser((User) retVal); 
		//despite using AfterReturnign Aspects do the function 2 times.
		//this way we check if the user was already logged
		if(index == -1) {
			Storage.addUser((User) retVal);
			Storage.addTime(LocalDateTime.now());
		}
		return retVal;
	}
	
	@AfterReturning(pointcut = "execution(* io.swagger.service.UserServiceImpl.loginUser(..))",
			returning = "retVal")
	public Object doThing(Object retVal) throws Throwable {
		int index = Storage.indexOfUser((User) retVal); 
		if(index == -1) {
			Storage.addUser((User) retVal);
			Storage.addTime(LocalDateTime.now());
		}
		else {
			Storage.setCurrentTime(index);
		}
		return retVal;
	}
}