package data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {

		FileInputStream f= new FileInputStream("C:\\testing\\temp_p.properties");
		Properties p = new Properties();
		p.load(f);
		
		String s=p.getProperty("browser");
		System.out.println(s);
		System.out.println(p.getProperty("browser"));
		
		System.out.println(p.getProperty("incorrectemail"));
		
		System.out.println(p.getProperty("url"));
		
		String correctid=p.getProperty("correctemail");
		System.out.println(correctid);

	}

}
