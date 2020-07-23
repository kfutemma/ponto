package br.com.itau.mastertech.ponto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itau.mastertech.ponto.models.Clock;
import br.com.itau.mastertech.ponto.repositories.ClockRepository;

@Service
public class ClockService {

	@Autowired
	private ClockRepository clockRepository;
	
	public Optional<Clock> findById(Long id){
		return clockRepository.findById(id);
	}
	
	public Clock save(Clock clock) {
		return clockRepository.save(clock);
	}
}
