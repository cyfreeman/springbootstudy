package cy.study.springboot002;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;


@SpringBootTest
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
class Springboot002ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws Exception {
        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }

}
