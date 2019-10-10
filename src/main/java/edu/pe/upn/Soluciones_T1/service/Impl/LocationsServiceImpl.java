package edu.pe.upn.Soluciones_T1.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import edu.pe.upn.Soluciones_T1.model.entity.Locations;
import edu.pe.upn.Soluciones_T1.repository.LocationsRepository;
import edu.pe.upn.Soluciones_T1.service.LocationsService;
@Controller
public class LocationsServiceImpl implements LocationsService {
    @Autowired
	private LocationsRepository locationsrepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Locations> findAll() throws Exception {
		
		return locationsrepository.findAll();
	}
    
	@Transactional(readOnly = true)
	@Override
	public Optional<Locations> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return locationsrepository.findById(id);
	}
    @Transactional
	@Override
	public Locations save(Locations entity) throws Exception {
		
		return locationsrepository.save(entity);
	}
    @Transactional
	@Override
	public Locations update(Locations entity) throws Exception {
		
		return locationsrepository.save(entity);
	}
    @Transactional
	@Override
	public void deleteById(String id) throws Exception {
    	locationsrepository.deleteById(id);
		
	}
    @Transactional
	@Override
	public void deleteAll() throws Exception {
    	locationsrepository.deleteAll();
		
	}

}
