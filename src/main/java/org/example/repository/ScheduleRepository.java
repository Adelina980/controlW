package org.example.repository;

import org.example.model.Schedule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScheduleRepository {
    private DbWork db = DbWork.getInstance();


    public List<Schedule> findAll() {
        List<Schedule> clients = new ArrayList<>();

        try (Connection connection = db.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "select * from schedule");

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Schedule schedule = new Schedule(
                        resultSet.getLong("id"),
                        resultSet.getInt("nclassroom"),
                        resultSet.getString("starttime"),
                        resultSet.getString("endtime"),
                        resultSet.getString("dayofweek"),
                        resultSet.getString("teacher"),
                        resultSet.getString("ngroup")
                );

                clients.add(schedule);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clients;
    }
    public Schedule findById(Long id) {
        Schedule schedule = null;
        try (Connection connection = db.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "select * from schedule where id = ?");
            statement.setLong(1, id);


            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                schedule = new Schedule(
                        resultSet.getLong("id"),
                        resultSet.getInt("nclassroom"),
                        resultSet.getString("starttime"),
                        resultSet.getString("endtime"),
                        resultSet.getString("dayofweek"),
                        resultSet.getString("teacher"),
                        resultSet.getString("ngroup")
                );

            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return schedule;
    }

}

