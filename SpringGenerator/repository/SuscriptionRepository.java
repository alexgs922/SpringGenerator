package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Suscription;

@Repository
public interface SuscriptionRepository extends JpaRepository<Suscription, Integer> {
}