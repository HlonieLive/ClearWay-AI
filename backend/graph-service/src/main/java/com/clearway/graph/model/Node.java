package com.clearway.graph.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "nodes")
public class Node {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Latitude
    @Column (nullable = false)
    private Double latitude;

    // Longitude
    @Column (nullable = false)
    private Double longitude;

    // Name of the Street/Road
    @Column
    private String streetName;
}
