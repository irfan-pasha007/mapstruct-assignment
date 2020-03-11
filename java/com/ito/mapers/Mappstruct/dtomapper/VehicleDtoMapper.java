package com.ito.mapers.Mappstruct.dtomapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import com.ito.mapers.Mappstruct.Vehicle;
import com.ito.mapers.Mappstruct.dtos.VehicleDTO;

@Mapper(componentModel = "spring")
public interface VehicleDtoMapper {
 
    VehicleDTO VehicleToVehicleDTO(Vehicle vehicle);
 
    @InheritInverseConfiguration
    Vehicle VehicleDTOTOVehicle(VehicleDTO vehicleDTO);
}