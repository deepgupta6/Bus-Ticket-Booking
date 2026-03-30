package com.busticket.service.interfaces;

import com.busticket.dto.response.TripFullDetailsResponse;

public interface ITripService {
    TripFullDetailsResponse getTripById(Integer tripId);
}





