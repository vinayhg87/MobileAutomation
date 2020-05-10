package IOS_Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class IOSPropertiesReader {

    public String readProperties(String property) throws IOException {

        /* Getting device and browser details from properties file */
        String currentDirectory = System.getProperty("user.dir");
        String IOSDevices_prop = currentDirectory + File.separator + "IOSDevice.properties";
        Properties prop = new Properties();
        prop.load(new FileInputStream(IOSDevices_prop));

        return prop.getProperty(property);
    }
}
