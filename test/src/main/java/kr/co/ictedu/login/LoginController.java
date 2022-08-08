package kr.co.ictedu.login;

import java.io.PrintWriter;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ictedu.util.dto.MemberDTO;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService service;

	@RequestMapping( value = "/logout", method = RequestMethod.GET )
	public String logout( HttpSession session ) {
		session.invalidate();
		return "home";//jsp file name
	}//logout

	@RequestMapping( value = "/login", method = RequestMethod.POST )
	public void login( MemberDTO dto, PrintWriter out, HttpSession session ) {
		MemberDTO dtoFromDB = null;
		dtoFromDB = service.login( dto );
		if( dtoFromDB == null ) {
			out.print(0);//아이디 없는 사용자 또는 패스워드 오류 사용자.
		} else if( dtoFromDB != null && dtoFromDB.getMno() != null && dtoFromDB.getMno() != "" ) {
			out.print(1);//아이디, 패스워드 모두 OK
			session.setAttribute("login_info", dtoFromDB);
		}
		out.close();

	}//login

	@RequestMapping( value = "/login/login_form", method = RequestMethod.GET )
	public String loginForm() {
		return "/login/login_form";//jsp file name
	}//loginForm

}//class

/*
drop table member;
CREATE TABLE `member` (
  `mno` int NOT NULL AUTO_INCREMENT,
  `mid` varchar(20) NOT NULL,
  `mpwd` varchar(20) NOT NULL,
  `tel` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `mdate` datetime NOT NULL,
  `service_agree` varchar(5) NOT NULL DEFAULT 'true',
  `info_agree` varchar(5) NOT NULL DEFAULT 'true',
  `sms_agree` varchar(5) NOT NULL DEFAULT 'false',
  `email_agree` varchar(5) NOT NULL DEFAULT 'false',
  `post_code` varchar(10) DEFAULT NULL,
  `addr1` varchar(150) DEFAULT NULL,
  `addr2` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`mno`)
);
insert into member(mid, mpwd, tel, email, mdate)
values('tea', '1111', '010-9999-8888', 'aaa@bbb.com', now());
commit;
*/
