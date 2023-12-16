package BusinessLogic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static String URL;
    public static String Username;
    public static String Password;

    public static void main(String args[]) throws IOException {
        Properties prop=new Properties();
        String filename="src/test/resources/Browser.properities";
        //est.class.getClassLoader().getResourceAsStream(filename);
        prop.load(new FileInputStream(filename));
        URL=prop.getProperty("URL");
        Username=prop.getProperty("userName");
        Password=prop.getProperty("password");
    }
}
