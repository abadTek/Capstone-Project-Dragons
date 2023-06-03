package tek.capstone.dragons.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class ReadYamlFiles {
	
//declare class private then we create constractor to read YamlConfid data
	
	private static ReadYamlFiles readYamlFiles;
	private HashMap propertyType;
	// we create a constrator to load our yaml file
	private ReadYamlFiles(String filePath) throws FileNotFoundException {
		FileInputStream fileInputStream = FileUtility.getFileInputStream(filePath);
		Yaml yaml = new Yaml();
		this.propertyType = yaml.load(fileInputStream);
	}
	
	 // we are returning an isntance of ReadYamalFile class
	 public static ReadYamlFiles getIntance(String filePath) throws FileNotFoundException {
		 if(readYamlFiles == null)
			 return new ReadYamlFiles(filePath);
		return readYamlFiles;
	}
	//we get property from the yaml file and store in a Hashmap so that when we call the method
	 //getYaamlPropwrty we pass the key and this method will return the value
	
	 public  HashMap getYamlProperty(String key) {
		 return (HashMap) this.propertyType.get(key);
	 }
}
