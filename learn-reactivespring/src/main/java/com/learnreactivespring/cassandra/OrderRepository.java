package com.learnreactivespring.cassandra;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderRepository extends CassandraRepository<Order, Id> {
    @Query("select * from ORDER_DATA where orderID = ?0")
    public List<Order> findByOrderId(String orderID);

}
