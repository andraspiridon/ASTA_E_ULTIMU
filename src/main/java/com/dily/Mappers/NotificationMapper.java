package com.dily.Mappers;

import com.dily.Entities.Notification;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by rusum on 01.05.2017.
 */

public  final class NotificationMapper implements RowMapper<Notification> {

    public Notification mapRow(ResultSet rs, int rowNum) throws SQLException {
        Notification notification = new Notification();
        notification.setNotificationId(rs.getInt("notification_id"));
        notification.setUserId(rs.getInt("user_id"));
        notification.setFromUser(rs.getInt("from_user"));
        notification.setDateN(rs.getDate("daten"));
        notification.setNotificationText(rs.getString("notificationtext"));
        return notification;
    }
}
