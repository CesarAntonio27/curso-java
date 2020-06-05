package mx.com.titaninumsolutions.makereport;

public class main {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		
		report report = new report();
		report.setNamefile("reporte");
		report.setExtension("txt");
		report.setTitle("::REPORTE::\n");
		String content = report.getTitle();
		for (int i = 0; i < 5; i++) {
			content += "\nreporte: " +  i;
			
		}
		report.setContent(content);
		report.makeReport();

	}

}
