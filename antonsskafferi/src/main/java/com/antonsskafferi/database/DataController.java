package com.antonsskafferi.database;

import jakarta.annotation.ManagedBean;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.*;


@RequestScoped
@Named
public class DataController {

    private Database db = new Database();

    public DataController(){

    }

    public String getTest() {
        return db.getStatus();
    }
}
