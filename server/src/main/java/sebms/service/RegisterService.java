package sebms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import sebms.entity.RegisterInfo;
import sebms.repository.RegisterDao;

@Service
public class RegisterService {

	@Autowired private RegisterDao regDao;
	
	public List<RegisterInfo> findAll(){
		Page<RegisterInfo> list = regDao.findAll(new PageRequest(1, 10,Direction.ASC,"zkz"));
		List<RegisterInfo> result = list.getContent();
		return result;
	}
	
	public List<RegisterInfo> findVerified(Integer page,int pageSize){
		page = page == null?1:page;
		List<RegisterInfo> result = regDao.findByStudentIsVerify(1, new PageRequest(page, pageSize));
		return result;
	}
}
