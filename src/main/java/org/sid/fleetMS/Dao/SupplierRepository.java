package org.sid.fleetMS.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.sid.fleetMS.Model.*;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
