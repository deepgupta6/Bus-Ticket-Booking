package com.busticket.controller;


import com.busticket.dto.response.FeatureResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.web.bind.annotation.*;

        import java.util.*;

        import org.springframework.security.core.Authentication;

@RestController
@RequestMapping("/api")
public class DashboardController {

    @GetMapping("/dashboard")
    @JsonPropertyOrder({"name", "features"})
    public Map<String, Object> dashboard(Authentication auth) {

        String email = auth.getName();


        Map<String, String> names = Map.of(
                "javed@gmail.com", "Javed",
                "shivam@gmail.com", "Shivam",
                "ayush@gmail@gmail.com", "Ayush",
                "shreshtha@gmail.com", "Shrestha",
                "deep@gmail.com", "Deep"
        );

        // 👇 feature mapping
        Map<String, List<FeatureResponse>> devFeatures = Map.of(

                "javed@gmail.com", List.of(
                        new FeatureResponse("Get Customer Details", "/api/customers/{id}"),
                        new FeatureResponse("Get Trip Details", "GET /api/trips/{trip_id}/")
                ),

                "shivam@gmail.com", List.of(
                        new FeatureResponse("Get Agencies in a City", "/api/agencies"),
                        new FeatureResponse("Get Customer Bookings and Payments", "/api/customers/bookings-payments")
                ),

                "Ayush@gmail.com" , List.of(
                        new FeatureResponse("Get Route with Trips", "/api/routes/{route_id}/trips"),
                        new FeatureResponse("Get agency offices with their bus and drivers", "/api/agencies/offices/resources")
                ),

                "deep@gmail.com", List.of(
                        new FeatureResponse("Get All Bookings", "/api/bookings/"),
                        new FeatureResponse("Get Booking by ID", "/api/bookings/{id}"),
                        new FeatureResponse("Get Dashboard Info", "/api/dashboard")
                 ),

                "shreshtha@gmail.com" , List.of(
                        new FeatureResponse("Get Route with Trips", "/api/routes/{route_id}/trips"),
                        new FeatureResponse("Get agency offices with their bus and drivers", "/api/agencies/offices/resources")
                )
        );

        return Map.of(
                "name", names.get(email),
                "features", devFeatures.getOrDefault(email, List.of())
        );
    }
}