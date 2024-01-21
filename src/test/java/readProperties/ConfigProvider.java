package readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }
    String URL = readConfig().getString("url");
    String STANDARD_USER_USERNAME = readConfig().getString("standardUser.username");
    String STANDARD_USER_PASSWORD = readConfig().getString("standardUser.password");
}
