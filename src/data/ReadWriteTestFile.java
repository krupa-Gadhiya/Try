package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTestFile {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\testing\\temp_p");
		f.createNewFile();
		
		//Write onto file
		FileWriter w= new FileWriter(f);
		BufferedWriter out= new BufferedWriter(w);
		out.write("This is First Line");
		out.newLine();

		out.write("This is Second Line");
		out.newLine();
	
		out.write("This is Third Line");
		out.newLine();
		
		
	out.flush();
	out.close();
	
	// Read file
	FileReader r =new FileReader(f);
	BufferedReader rd=new BufferedReader(r);
	
	/*System.out.println(rd.readLine());
	System.out.println(rd.readLine());
	System.out.println(rd.readLine());
	System.out.println(rd.readLine());*/
	
	
	String s;
	int i=0;
	while((s=rd.readLine())!=null)
	{
		System.out.println(s);
		i++;
	}
	
	System.out.println("total Line"+i);
	
	
	
		}

}
