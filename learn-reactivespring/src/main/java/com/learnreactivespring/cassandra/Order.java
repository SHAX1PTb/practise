package com.learnreactivespring.cassandra;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("ORDER_DATA")
@Getter
@Setter
public class Order {

    private static final long serialVersionUID = 2404160767202085990L;

    @Id
    @PrimaryKeyColumn(name = "orderID", type = PrimaryKeyType.PARTITIONED, ordinal = 0)
    private String orderID;

    private Float amount;

    private Float discount;

}
