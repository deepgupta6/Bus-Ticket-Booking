package com.busticket.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Entity
@Table(name = "buses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
    private Integer busId;

    // Many buses belong to one office
    @NotNull
    @ManyToOne
    @JoinColumn(name = "office_id", nullable = false)
    private AgencyOffice office;

    @Column(name = "registration_number", nullable = false, length = 20)
    @NotNull
    private String registrationNumber;

    @NotNull
    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @NotNull
    @Column(name = "type", length = 30)
    private String type;

    // One bus can have many trips
    @OneToMany(mappedBy = "bus", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Trip> trips;
}