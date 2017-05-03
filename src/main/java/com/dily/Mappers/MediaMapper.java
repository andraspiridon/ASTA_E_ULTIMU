package com.dily.Mappers;

import com.dily.Entities.Media;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Andra on 5/1/2017.
 */
public final class MediaMapper implements RowMapper<Media> {
    public Media mapRow(ResultSet rs, int rowNum) throws SQLException {
        Media media = new Media();
        media.setMediaId(rs.getInt("media_id"));
        media.setMediaPath(rs.getString("media_path"));
        media.setMediaType(rs.getString("media_type"));
        media.setMemoryId(rs.getInt("memory_id"));
        return media;
    }
}
