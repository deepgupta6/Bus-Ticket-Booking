package com.busticket.respository;

import com.busticket.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDriverRepo extends JpaRepository<Driver, Integer>{

}
