package sebms.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import sebms.entity.RegisterInfo;

/**
 * 注册信息Repository
 * @author minz
 */
public interface RegisterDao extends JpaRepository<RegisterInfo,Long> {

	public RegisterInfo findByZkz(String zkz);
	
	//public int countByZkz(String zkz);
	
	public RegisterInfo findByStudentSfz(String sfz);


	public List<RegisterInfo> findByStudentIsVerify(int flag,Pageable pageable);
}
