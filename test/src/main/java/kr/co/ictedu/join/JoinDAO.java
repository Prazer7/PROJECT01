package kr.co.ictedu.join;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ictedu.util.dto.MemberDTO;

@Repository
public class JoinDAO {

	@Autowired
	private SqlSession sqlSession;
	
	

	public int join( MemberDTO dto ) {
		int successCount = 0;
		successCount = sqlSession.insert("JoinMapper.join", dto);
		return successCount;
	}//join
	
	
	

	public int idCheck( String mid ) {
		int isYN = 0;
		isYN = sqlSession.selectOne("JoinMapper.idCheck", mid);
		return isYN;
	}//idCheck

}//class
