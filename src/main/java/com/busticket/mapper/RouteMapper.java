package com.busticket.mapper;

import com.busticket.dto.ResponseDTO.RouteDTO;
import com.busticket.entity.Route;

public class RouteMapper {

    public static RouteDTO toDTO(Route route) {
        RouteDTO dto = new RouteDTO();
        dto.setRouteId(route.getRouteId());
        dto.setFromCity(route.getFromCity());
        dto.setToCity(route.getToCity());
        dto.setBreakPoints(route.getBreakPoints());
        dto.setDuration(route.getDuration());
        return dto;
    }

    public static Route toEntity(RouteDTO dto) {
        Route route = new Route();
        route.setRouteId(dto.getRouteId());
        route.setFromCity(dto.getFromCity());
        route.setToCity(dto.getToCity());
        route.setBreakPoints(dto.getBreakPoints());
        route.setDuration(dto.getDuration());
        return route;
    }
}