package com.ito.mapers.Mappstruct.mappService;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ito.mapers.Mappstruct.Location;
import com.ito.mapers.Mappstruct.dtos.LocationVehicleDTO;
import com.ito.mapers.Mappstruct.dtos.VehicleDTO;
import com.ito.mapers.Mappstruct.mappRepository.LocationRepository;

@Service
public class LocationService
{
	@Autowired
	LocationRepository repo;
	
		
	
}
