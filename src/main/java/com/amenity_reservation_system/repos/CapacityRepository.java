package com.amenity_reservation_system.repos;

import com.amenity_reservation_system.model.AmenityType;
import com.amenity_reservation_system.model.Capacity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CapacityRepository extends JpaRepository<Capacity, Long> {

    Capacity findByAmenityType(AmenityType amenityType);
}
