package org.sid.fleetMS.Dao;

import org.sid.fleetMS.Model.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
