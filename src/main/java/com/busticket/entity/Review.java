package com.busticket.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
@Getter
@Setter
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    @NotNull
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    @NotNull
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "trip_id", nullable = false)
    @NotNull
    private Trip trip;

    @Column(name = "rating", nullable = false)
    @NotNull
    private Integer rating;

    @Column(name = "comment")
    @NotNull
    private String comment;

    @Column(name = "review_date")
    @NotNull
    private LocalDateTime reviewDate;
}