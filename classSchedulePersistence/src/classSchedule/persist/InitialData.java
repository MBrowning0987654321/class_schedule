package classSchedule.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import classSchedule.model.Major;
import classSchedule.model.User;

public class InitialData {
	
	//reads the users in the csv spreadsheet for the fakeDatabase
	public static List<User> getUsers() throws IOException{
		List<User> userList = new ArrayList<User>();
		ReadCSV readUsers = new ReadCSV("users.csv");
		
		try {
			while (true) {
				List<String> tuple = readUsers.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				User user = new User();
				user.setId(Integer.parseInt(i.next()));
				user.setUsername(i.next());
				user.setPassword(i.next());
				userList.add(user);
			}
			return userList;
		} finally {
			readUsers.close();
		}
	}
	
	//reads in the majors in the csv spreadsheet for the fakeDatabase
	public static List<Major> getMajors() throws IOException{
		List<Major> majorList = new ArrayList<Major>();
		ReadCSV readMajors = new ReadCSV("majors.csv");
		
		try {
			while (true) {
				List<String> tuple = readMajors.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				Major major = new Major();
				major.setId(Integer.parseInt(i.next()));
				major.setName(i.next());
				majorList.add(major);
			}
			return majorList;
		} finally {
			readMajors.close();
		}
	}
	}

