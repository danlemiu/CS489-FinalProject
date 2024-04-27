package com.online.store.cs489.repository;

import com.online.store.cs489.domain.OrderStatus;
import com.online.store.cs489.domain.OrderStatusType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRepository extends CrudRepository<OrderStatus, Integer> {

    @Query("select s from OrderStatus s where s.status = :status")
    OrderStatus getStatusByName(OrderStatusType status);
}
