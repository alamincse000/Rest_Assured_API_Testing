package utils;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class Utils {
//    Using Data write method
    public static void setCollectionVariable(String key, String value) throws ConfigurationException {
        PropertiesConfiguration config = new PropertiesConfiguration("./src/test/resources/config.properties");
        config.setProperty(key, value);
        config.save();
    }
    public void addNumber(String value) throws ConfigurationException {
        setCollectionVariable("phone",value);

    }
}

