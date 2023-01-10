package c15;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class c15_PropertiseExample {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();


        properties.load(c15_PropertiseExample.class.getResourceAsStream(("database.properties")));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("admin : " + admin);


    }
}
