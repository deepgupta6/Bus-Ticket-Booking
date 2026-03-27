package com.busticket.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RouteDTO {

    private Integer routeId;

    private String fromCity;
    private String toCity;

    private Integer breakPoints;
    private Integer duration;
}