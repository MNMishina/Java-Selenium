package readProperties;

import org.junit.Test;
import java.io.IOException;

public class PropertiesTest {
    @Test
    public void readProperties() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("application.properties"));
        String urlFromProperty = System.getProperty("url");
    }
    @Test
    public void readConf() {
        String urlFromConfig = ConfigProvider.URL;
        System.out.println(urlFromConfig);

    }
}
