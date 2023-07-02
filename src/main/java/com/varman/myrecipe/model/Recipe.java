package com.varman.myrecipe.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
@Builder
@Data
public class Recipe {
    @PrimaryKey
    UUID id;
    @Column
    String name;
}
