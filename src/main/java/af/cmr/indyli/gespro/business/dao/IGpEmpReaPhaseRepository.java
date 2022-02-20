package af.cmr.indyli.gespro.business.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import af.cmr.indyli.gespro.business.entity.GpEmpReaPhase;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;

@Repository(GesproConstantesDAO.GP_EMP_REA_PHASE_DAO)
public interface IGpEmpReaPhaseRepository extends JpaRepository<GpEmpReaPhase, Integer> {

}
