package br.com.itau.mastertech.ponto.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.mastertech.ponto.models.Clock;
import br.com.itau.mastertech.ponto.services.ClockService;

@RestController
@RequestMapping("/v1/clock")
public class ClocksController {
	
	@Autowired
	public ClockService clockService;
	
	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Clock> findById(@PathVariable("id") Long id){
		return clockService.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Clock> save(@RequestBody Clock clock) {
		return ResponseEntity.ok(clockService.save(clock));
	}

}
