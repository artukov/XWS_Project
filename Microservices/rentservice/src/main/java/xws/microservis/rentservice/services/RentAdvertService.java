package xws.microservis.rentservice.services;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xws.microservis.rentservice.dto.RentAdvertDTO;
import xws.microservis.rentservice.model.RentAdvert;
import xws.microservis.rentservice.repository.RentAdvertRepository;

@Service
public class RentAdvertService {
	@Autowired
	private RentAdvertRepository repository;
	
	
	//pronalazenje reklame
	public RentAdvertDTO findRentAdver(Long id) {
		RentAdvert ra = repository.findById(id).orElse(null);
		if(ra == null) {
			throw new NoSuchElementException();
		}
		
		return new RentAdvertDTO(ra);
	}
	
	
	
	
}
