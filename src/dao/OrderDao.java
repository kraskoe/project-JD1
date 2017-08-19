package dao;

import entities.Order;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Class OrderDao
 *
 * Created by ykrasko on 15/08/2017.
 */
public interface OrderDao extends DAO <Order> {
    List<Order> getByUserId(Serializable userId) throws SQLException;
}
