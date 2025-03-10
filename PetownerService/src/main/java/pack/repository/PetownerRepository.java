package pack.repository;

import java.beans.JavaBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pack.domain.Petowner;

@Repository
public interface PetownerRepository extends JpaRepository<Petowner, Long> {

}
