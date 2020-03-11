package com.ito.mapers.Mappstruct.mappController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ito.mapers.Mappstruct.Location;
import com.ito.mapers.Mappstruct.Vehicle;
import com.ito.mapers.Mappstruct.dtos.LocationVehicleDTO;
import com.ito.mapers.Mappstruct.dtos.VehicleDTO;
import com.ito.mapers.Mappstruct.dtos.VehicleLocationDTO;

import com.ito.mapers.Mappstruct.mappService.VehicleService;

@RestController
public class MapperController {
	@Autowired
	VehicleService vehicleservice;

	@PostMapping(path = "/vehicletovehicledto", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public VehicleDTO addvehicle(@RequestBody Vehicle vehicle) {
		return vehicleservice.addVehicle(vehicle);
	}
	@GetMapping(path = "/vehicledtotovehicle", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Vehicle getvehicle(@RequestBody VehicleDTO vehicledto) {
		return vehicleservice.getVehicle(vehicledto);
	}

	@PostMapping(path = "/VehicleLocation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Vehicle getVehicleLocation(@RequestBody VehicleLocationDTO vehiclelocationdto) 
	{
		return vehicleservice.getvehiclelocation(vehiclelocationdto);

	}
	@PostMapping(path = "/locationvehicleDTOtoLocation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Location getlocation(@RequestBody LocationVehicleDTO locationvehicledto)
	{
		return vehicleservice.getLocation(locationvehicledto);
	}

	@PostMapping(path = "/locationvehicletolocationvehicleDTO", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public LocationVehicleDTO gettolocation(@RequestBody Location location)
	{
		return vehicleservice.gettoLocation(location);
	}
}
