package data;

import org.apache.log4j.Logger;

public class LoggingTest {

	public static void main(String[] args) {
		//log4j.jar build path
		//copy log4j.properties file into src folder
		// create object of logger class
		// file path is in the properties file, 
		
		Logger l=Logger.getLogger("devpinoyLogger");
		l.debug("hello"); // system.out.ptintln("hello");
		l.debug("WE r writing in a loger file");
		l.debug("First Line");

		
	}

}
