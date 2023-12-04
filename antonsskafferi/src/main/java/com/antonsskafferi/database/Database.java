package com.antonsskafferi.database;
import com.mysql.cj.jdbc.MysqlDataSource;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

import static java.lang.Boolean.valueOf;

@ApplicationScoped
public class Database {
    @PersistenceContext
    EntityManager em;

    public List<BooksEntity> getBooks() {
        Query testQuery = em.createNamedQuery("booksEntity.all");
        return testQuery.getResultList();

    }
}
