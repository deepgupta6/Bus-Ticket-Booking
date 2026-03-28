package com.busticket.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Table(name = "routes")
@Getter
@Setter
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "route_id")
    private Integer routeId;

    @Column(name = "from_city", nullable = false)
    @NotNull
    private String fromCity;

    @Column(name = "to_city", nullable = false)
    @NotNull
    private String toCity;

    @Column(name = "break_points")
    @NotNull
    private Integer breakPoints;

    @Column(name = "duration")
    @NotNull
    private Integer duration;

}