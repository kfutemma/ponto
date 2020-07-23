package br.com.itau.mastertech.ponto.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.itau.mastertech.ponto.models.Clock;
import br.com.itau.mastertech.ponto.models.User;

@Repository
public interface ClockRepository extends JpaRepository<Clock, Long>{
	
	@Query("select p from user p where p.clocks.id = :id")
	List<Clock> findByUserId(@Param("id") int id);
	
}
