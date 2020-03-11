package com.ito.mapers.Mappstruct.mappService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ito.mapers.Mappstruct.Location;
import com.ito.mapers.Mappstruct.Vehicle;
import com.ito.mapers.Mappstruct.dtomapper.LocationVehicleDTOMapper;
import com.ito.mapers.Mappstruct.dtomapper.VehicleDtoMapper;
import com.ito.mapers.Mappstruct.dtomapper.VehicleLocationDTOMapper;
import com.ito.mapers.Mappstruct.dtos.LocationVehicleDTO;
import com.ito.mapers.Mappstruct.dtos.VehicleDTO;
import com.ito.mapers.Mappstruct.dtos.VehicleLocationDTO;
import com.ito.mapers.Mappstruct.mappRepository.LocationRepository;
import com.ito.mapers.Mappstruct.mappRepository.vehicleRepository;

@Service
public class VehicleService 
{
	
	@Autowired
	vehicleRepository repo;
	
	@Autowired
	LocationRepository repos;
	
	@Autowired
	VehicleDtoMapper vdm;
	
	@Autowired
    VehicleLocationDTOMapper lvm;
	@Autowired
    LocationVehicleDTOMapper lvdm;

	Logger logger=Logger.getLogger(VehicleService.class); 
	public VehicleDTO addVehicle(Vehicle vehicle)
	{
		return	vdm.VehicleToVehicleDTO(repo.save(vehicle));
	}
	public Vehicle getVehicle(VehicleDTO vehicleDTO) {
		
		return vdm.VehicleDTOTOVehicle(vehicleDTO);
	}
	
	public Vehicle getvehiclelocation(VehicleLocationDTO vehicledto) 
	{
		Vehicle vehicle=lvm.VehicleLocationDTOToVehicle(vehicledto);
return repo.save(vehicle);
	
	}
	public Location getLocation(LocationVehicleDTO locationVehicledto) 
	{
	return lvdm.LocationDTOToLocation(locationVehicledto);	
	}
	public LocationVehicleDTO gettoLocation(Location location) {
		
		return lvdm.locationToLocationVehicleDTO(location);
	}
	

}
