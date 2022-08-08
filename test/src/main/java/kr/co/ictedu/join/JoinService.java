package kr.co.ictedu.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ictedu.util.dto.MemberDTO;

@Service
public class JoinService {

	@Autowired
	private JoinDAO dao;

	public int join( MemberDTO dto ) {
		int successCount = 0;

		if( dto.getTel1() != null && !dto.getTel1().equals("")
			&& dto.getTel2() != null && !dto.getTel2().equals("")
			&& dto.getTel3() != null && !dto.getTel3().equals("") ) {
			dto.setTel( dto.getTel1() + "-" + dto.getTel2() + "-" + dto.getTel3() );
		}

		if( dto.getEmail1() != null && !dto.getEmail1().equals("")
			&& dto.getEmail2() != null && !dto.getEmail2().equals("") ) {
			dto.setEmail( dto.getEmail1() + "@" + dto.getEmail2() );
		}

		successCount = dao.join( dto );
		return successCount;
	}//join

	public int idCheck( String mid ) {
		int isYN = 0;
		isYN = dao.idCheck( mid );
		return isYN;
	}//idCheck

}//class
