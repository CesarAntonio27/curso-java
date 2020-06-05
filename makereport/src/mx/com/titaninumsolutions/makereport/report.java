package mx.com.titaninumsolutions.makereport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class report {
	
	private String namefile;
	private String content;
	private String title;
	private String extension;
	
	public void makeReport() {
		if (getNamefile() != null && getContent() != null && getTitle() != null) {
			//genera el archivo
			try {
				File file = new File(getNamefile() +"."+ getExtension());
				FileOutputStream fos = new FileOutputStream(file);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(getContent());
				bw.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}else {
			System.out.println("introduce  los datos del archivo");
		}
		
	}
	
	
	
	
	
	
	
	
	
	public String getNamefile() {
		return namefile;
	}
	public void setNamefile(String namefile) {
		this.namefile = namefile;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
		
	
	
	
	
	
	
	
}
