package com.massivedynamic.spring.crm.repository;


import com.massivedynamic.spring.crm.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {
}