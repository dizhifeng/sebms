package sebms.service;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sebms.entity.RegisterInfo;
import sebms.repository.RegisterDao;

@Service
public class LoginService {

	@Autowired private RegisterDao regDao;
	
	public RegisterInfo login(String zkz,String sfz) throws LoginException{
		RegisterInfo result = null;
		RegisterInfo info = regDao.findByZkz(zkz);
		if(info == null){
			throw new LoginException("准考证不存在！");
		}
		else{
			String stuSfz = info.getStudent().getSfz();
			if(stuSfz.equals(sfz)){
				result = info;
			}
			else{
				throw new LoginException("身份证错误！");
			}
		}
		return result;
	}
}
