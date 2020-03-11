package com.ito.mapers.Mappstruct.dtomapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ito.mapers.Mappstruct.Location;

import com.ito.mapers.Mappstruct.dtos.LocationVehicleDTO;
import com.ito.mapers.Mappstruct.dtos.VehicleDTO;
@Mapper(componentModel = "spring",uses = VehicleDTO.class)
public interface LocationVehicleDTOMapper
{
    		@Mapping(source = "locationVehicledto.locationId", target = "locationId")
    	    @Mapping(source = "locationVehicledto.locationName", target = "locationName")
    	   @Mapping(source = "locationVehicledto.address", target = "address")    
    		Location  LocationDTOToLocation( LocationVehicleDTO locationVehicledto);
    		
    
    		LocationVehicleDTO locationToLocationVehicleDTO( Location location);


  
   
}


