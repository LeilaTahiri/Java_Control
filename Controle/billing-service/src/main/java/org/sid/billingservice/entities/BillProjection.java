package org.sid.billingservice.entities;

import jakarta.persistence.criteria.Order;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="fullOder",types = Order.class)
public interface BillProjection {
    Long getId();
     Date getCreatedAt();


}
