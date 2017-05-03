package com.dily.Mappers;

import com.dily.Entities.Comment;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by rusum on 01.05.2017.
 */
public  final class CommentMapper implements RowMapper<Comment> {

    public Comment mapRow(ResultSet rs, int rowNum) throws SQLException {
        Comment comment = new Comment();
        comment.setCommentId(rs.getInt("comment_id"));
        comment.setUserId(rs.getInt("user_id"));
        comment.setFromUser(rs.getInt("from_user"));
        comment.setMemoryId(rs.getInt("memory_id"));
        comment.setCommentText(rs.getString("comment_text"));
        comment.setCommentDate(rs.getDate("comment_date"));
        return comment;
    }
}