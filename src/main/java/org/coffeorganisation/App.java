package org.coffeorganisation;

import org.coffeorganisation.bean.CoffeeService;
import org.coffeorganisation.config.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yaml.snakeyaml.Yaml;
//import javax.security.auth.login.Configuration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class App
{
    public static void main( String[] args ) throws SQLException, IOException {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        CoffeeService service = (CoffeeService) context.getBean("coffeeService");
        String info_to_DB = service.show();


        //swagger==============================================


        
        //swagger==============================================



        //---------------ОПЕРАЦИИ С БД-----------------------------------
        //подключение к БД;
        String user = "postgres";
        String password = "1234";
        String database = "jdbc:postgresql://localhost:5432/postgres";
        Connection conn = DriverManager.getConnection(database, user, password);
        //-----------------------------------------------------------
        // запись в БД
        System.out.println("НАЧАЛО ЗАПИСИ!");
        final String sql_zapros = "INSERT INTO data" + "(coffee_info, date_and_time) VALUES (?, CURRENT_DATE + CURRENT_TIME)";
        PreparedStatement ps = conn.prepareStatement (sql_zapros);
        ps.setString(1, info_to_DB);
        ps.executeUpdate();
        System.out.println("КОНЕЦ ЗАПИСИ!");
        //-----------------------------------------------------------
        /*
        System.out.println("ПОКАЗ БД:");

        Statement stmt = conn.createStatement();
        // чтение или выборка из БД
        ResultSet rs = stmt.executeQuery("select id, coffee_info " + "from data");
        while (rs.next())
        {
            System.out.println(rs);
        }

         */

        //System.out.println("----------");

        //MyComponent myComponent = (MyComponent) context.getBean("myComponent");
        //String date_to_db = myComponent.showAppInfo_and_date();

    }
}
