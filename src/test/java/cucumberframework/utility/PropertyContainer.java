package cucumberframework.utility;

import org.springframework.core.io.ClassPathResource;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class  PropertyContainer {

    private static Properties _properties = null;
    
    public static synchronized Properties getProperties() throws IOException {
        if (_properties == null)
        {
            FileReader reader=new FileReader("configure.properties");
            _properties = new Properties();
            _properties.load(reader);
            reader.close();
        }

        { return _properties; }
    }

    public static Properties get_properties() {
        return _properties;
    }
}
