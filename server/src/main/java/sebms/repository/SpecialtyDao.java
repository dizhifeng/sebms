package sebms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sebms.entity.Specialty;

public interface SpecialtyDao extends JpaRepository<Specialty, Long> {

}
