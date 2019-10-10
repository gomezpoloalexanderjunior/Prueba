package edu.pe.upn.Soluciones_T1.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.pe.upn.Soluciones_T1.model.entity.Countries;
import edu.pe.upn.Soluciones_T1.repository.CountriesRepository;
import edu.pe.upn.Soluciones_T1.service.CountriesService;
@Service
public class CountriesServiceImpl implements CountriesService {
	@Autowired
    private  CountriesRepository countriesrepository;
	
	@Transactional (readOnly = true)
	@Override
	public List<Countries> findAll() throws Exception {
		
		return countriesrepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Countries> findById(Integer id) throws Exception {
		
		return countriesrepository.findById(id);
	}
	@Transactional
	@Override
	public Countries save(Countries entity) throws Exception {
		
		return countriesrepository.save(entity);
	}
	@Transactional
	@Override
	public Countries update(Countries entity) throws Exception {
		
		return countriesrepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		
		countriesrepository.deleteById(id);;
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		countriesrepository.deleteAll();
		
	}

}
