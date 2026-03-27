package com.busticket.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "routes")
@Getter @Setter


public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer routeId;

    private String fromCity;
    private String toCity;
    private Integer breakPoints;
    private Integer duration;

    @OneToMany(mappedBy = "route")
    private List<Trip> trips;
}