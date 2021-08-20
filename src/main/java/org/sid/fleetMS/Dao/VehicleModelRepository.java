package org.sid.fleetMS.Dao;

import org.sid.fleetMS.Model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
