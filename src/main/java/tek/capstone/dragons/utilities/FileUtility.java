package tek.capstone.dragons.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileUtility {
	//return file input instance just if we want to read a file 
	//this class will not return any class
	
	public static FileInputStream getFileInputStream(String filePath) throws FileNotFoundException {
		return new FileInputStream(new File (filePath));
	}

}
