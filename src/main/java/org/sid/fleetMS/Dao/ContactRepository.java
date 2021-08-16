package org.sid.fleetMS.Dao;

import org.sid.fleetMS.Model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
