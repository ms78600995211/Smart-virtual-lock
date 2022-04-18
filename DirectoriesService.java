package smartvirtualkey.service;

import java.io.File;

import org.example.smartvirtualkey.entities.Directories;


public class DirectoriesService {
	
	 private static Directories fileDirectory = new Directories();
	    
	    public static void PrintFiles() {
	    	
	    	fileDirectory.fillFiles();

	        for (File file : DirectoriesService.getFileDirectory().getFiles())
	        {
	            System.out.println(file.getName());
	        }
	    }
	    public static Directories getFileDirectory() {
	        return fileDirectory;
	    }

	    public static void setFileDirectory(Directories fileDirectory) {
	        DirectoriesService.fileDirectory = fileDirectory;
	    }

	
	
	
	

}
