package edu.pe.upn.Soluciones_T1.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.pe.upn.Soluciones_T1.model.entity.Locations;
public interface LocationsRepository extends JpaRepository <Locations,String> {

}
