package frete.api.repository;

import frete.api.entity.Frete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreteRepository  extends JpaRepository<Frete,Integer> {

}
