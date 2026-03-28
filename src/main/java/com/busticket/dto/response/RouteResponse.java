// RouteResponse.java
package com.busticket.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RouteResponse {

    private Integer routeId;
    private String fromCity;
    private String toCity;
    private Integer breakPoints;
    private Integer duration;           // in minutes
    private String durationFormatted;   // e.g. "14h 30m" — derived, not stored
}