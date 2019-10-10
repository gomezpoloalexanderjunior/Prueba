package edu.pe.upn.Soluciones_T1.service.Impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import edu.pe.upn.Soluciones_T1.model.entity.Regions;
import edu.pe.upn.Soluciones_T1.repository.RegionRepository;
import edu.pe.upn.Soluciones_T1.service.RegionsService;

@Controller
public class RegionServiceImpl implements RegionsService{
    
	@Autowired
	private RegionRepository regionsrepository;
	@Transactional(readOnly = true)
	@Override
	public List<Regions> findAll() throws Exception {
		
		return regionsrepository.findAll();
	}
    @Transactional(readOnly = true)
	@Override
	public Optional<Regions> findById(String id) throws Exception {
		
		return regionsrepository.findById(id);
	}
    @Transactional
	@Override
	public Regions save(Regions entity) throws Exception {
		// TODO Auto-generated method stub
		return regionsrepository.save(entity);
	}
    @Transactional
	@Override
	public Regions update(Regions entity) throws Exception {
		
		return regionsrepository.save(entity);
	}
    @Transactional
	@Override
	public void deleteById(String id) throws Exception {
		regionsrepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() throws Exception {
		regionsrepository.deleteAll();
		
	}

}
