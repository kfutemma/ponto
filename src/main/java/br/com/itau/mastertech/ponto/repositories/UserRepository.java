package br.com.itau.mastertech.ponto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.itau.mastertech.ponto.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
