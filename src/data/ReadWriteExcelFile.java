package data;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
			
		Xls_Reader d = new Xls_Reader("C:\\testing\\NikulTest.xlsx");
		
		System.out.println(d.getCellData("Data1", "Name", 1));
		String cEmail=d.getCellData("Data1", 1, 2);
		System.out.println(cEmail);
		
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1"));
		
		d.setCellData("Data1", "Name", 11, "MyTest");
		System.out.println(d.getCellData("Data1", "Name", 11));
		
		d.addColumn("Data1","M");
		

	}

}
