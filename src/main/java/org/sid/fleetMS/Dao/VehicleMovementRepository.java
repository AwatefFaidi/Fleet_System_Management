package org.sid.fleetMS.Dao;

import org.sid.fleetMS.Model.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
