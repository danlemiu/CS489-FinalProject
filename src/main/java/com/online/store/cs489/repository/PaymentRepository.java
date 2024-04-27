package com.online.store.cs489.repository;

import com.online.store.cs489.domain.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
