package sebms.web;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sebms.entity.RegisterInfo;
import sebms.entity.Student;
import sebms.service.LoginService;

@RestController
@RequestMapping("login")
public class LoginController {

	@Autowired private LoginService loginSrv;
	
	@RequestMapping
	public JsonResponse index(@RequestBody Student stu){
		JsonResponse res = new JsonResponse();
		Student student = null;
		RegisterInfo regInfo = null;
		try {
			regInfo = loginSrv.login(stu.getZkz(),stu.getSfz());
			res.setData(regInfo);
			res.setResult(true);
		} catch (LoginException e) {
			res.setError(e.getMessage());
		}
		return res;
	}
}
