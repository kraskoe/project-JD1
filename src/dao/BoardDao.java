package dao;

import entities.Board;

import java.sql.SQLException;
import java.util.List;

/**
 * Class BoardDao
 *
 * Created by ykrasko on 15/08/2017.
 */
public interface BoardDao extends DAO<Board> {
    List<Board> getByHotel(long hotelId) throws SQLException;
}
