package org.sid.billingservice.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.billingservice.model.Customer;

import java.util.Date;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  Date billingDate;
    @OneToMany(mappedBy = "bill")
    private  Collection<ProductItem> productItems;
    private Long customerID;
    @Transient
    private Customer customer;

}
