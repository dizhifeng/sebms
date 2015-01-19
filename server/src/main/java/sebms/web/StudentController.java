package sebms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sebms.entity.RegisterInfo;
import sebms.entity.Student;
import sebms.service.RegisterService;

@RestController
@RequestMapping("students")
public class StudentController {

	@Autowired private RegisterService regSrv;
	
	@RequestMapping
	public List<RegisterInfo> index(@RequestParam(required=false) Integer page){
		return regSrv.findVerified(page, 10);
	}
}
