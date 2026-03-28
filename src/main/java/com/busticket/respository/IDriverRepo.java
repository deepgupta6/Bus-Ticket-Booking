package com.busticket.respository;

import java.sql.Driver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IDriverRepo extends JpaRepository<Driver, Integer>{

}
