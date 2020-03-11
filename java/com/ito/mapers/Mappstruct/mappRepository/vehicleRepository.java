package com.ito.mapers.Mappstruct.mappRepository;


import org.springframework.data.repository.CrudRepository;

import com.ito.mapers.Mappstruct.Location;
import com.ito.mapers.Mappstruct.Vehicle;
import com.ito.mapers.Mappstruct.dtos.VehicleLocationDTO;

public interface vehicleRepository extends CrudRepository<Vehicle, Integer>
{
}
