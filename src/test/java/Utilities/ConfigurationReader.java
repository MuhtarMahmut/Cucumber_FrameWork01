package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    public static String getPropertiesData(String name) {
        String xx="";
        try {
            FileInputStream file = new FileInputStream("src/test/java/Utilities/Files/ConfigurationReader.properties");
            Properties config = new Properties();
            config.load(file);
            xx = config.getProperty(name);
        }catch(Exception e){  }

        return  xx;
    }

}
