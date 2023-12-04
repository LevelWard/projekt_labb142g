package com.antonsskafferi.database;
import com.mysql.cj.jdbc.MysqlDataSource;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import javax.sql.DataSource;
import java.sql.*;

import static java.lang.Boolean.valueOf;

@ApplicationScoped
public class Database {
    private String status = "";
    MysqlDataSource dataSource;
    public Database() {
        MysqlDataSource dataSource1 = new MysqlDataSource();
        dataSource1.setURL("jdbc:mysql://localhost:3306/payaraTest?useSSL=false&allowPublicKeyRetrieval=true");
        dataSource1.setUser("noahServer");
        dataSource1.setPassword("noah");
        this.dataSource = dataSource1;

    }

    public String getStatus() {


        try {
            // below two lines are used for connectivity.
            Connection connection = this.dataSource.getConnection();


            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "select title from books");
            resultSet.next();
            this.status = resultSet.getString("title");
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            this.status = exception.getMessage();
        }

        return status;
    }
}
