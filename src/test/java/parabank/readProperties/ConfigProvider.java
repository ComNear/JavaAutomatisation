package parabank.readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    String TEST_SITE_URL = readConfig().getString("test_site_url");
    String EDGEDRIVER_PATH = readConfig().getString("edgedriver_path");
    String CHROMEDRIVER_PATH = readConfig().getString("chromedriver_path");
    String BROWSER_EXE_PATH = readConfig().getString("browser_exe_path");


    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }
}
