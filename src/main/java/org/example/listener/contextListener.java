package org.example.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.repository.DbWork;
import org.flywaydb.core.Flyway;

@WebListener
public class contextListener implements ServletContextListener {


    public void contextInitialized(ServletContextEvent sce) {
        Flyway flyway = Flyway.configure()//.baselineOnMigrate(true)
                .dataSource("jdbc:postgresql://localhost:5432/controlWork", "postgres", "123").load();

        flyway.migrate();

        DbWork.getInstance();
    }
    public void contextDestroyed(ServletContextEvent sce) {
        DbWork.getInstance().destroy();
    }
}
