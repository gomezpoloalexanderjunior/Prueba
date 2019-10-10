package edu.pe.upn.Soluciones_T1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.pe.upn.Soluciones_T1.model.entity.Countries;


@Repository
public interface CountriesRepository extends JpaRepository <Countries,Integer> {

}
