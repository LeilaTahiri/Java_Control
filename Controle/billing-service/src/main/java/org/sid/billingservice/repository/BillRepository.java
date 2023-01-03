package org.sid.billingservice.repository;

import jakarta.persistence.criteria.Order;
import org.sid.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill,Long> {
    @RestResource(path = "/byCustomerId")
    List<Order> findByCustomerID(@Param("customerId") Long customerId);
}
