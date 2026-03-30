package com.busticket.respository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.busticket.entity.Driver;

public interface IDriverRepo extends JpaRepository<Driver, Integer>{

}
