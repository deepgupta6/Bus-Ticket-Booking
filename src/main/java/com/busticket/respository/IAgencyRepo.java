package com.busticket.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busticket.entity.Agency;

public interface IAgencyRepo extends JpaRepository<Agency, Integer>{

}
