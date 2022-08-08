package kr.co.ictedu.util.dto;

public class MemberDTO {

	private String mno;
	private String mid;
	private String mpwd;
	private String tel;
	private String email;
	private String mdate;

	private String service_agree;
	private String info_agree;
	private String sms_agree;
	private String email_agree;
	private String tel1;
	private String tel2;
	private String tel3;
	private String email1;
	private String email2;

	private String post_code;
	private String addr1;
	private String addr2;

	public String toString() {
		return mno + " : " + mid;
	}

	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpwd() {
		return mpwd;
	}
	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mdate) {
		this.mdate = mdate;
	}

	public String getService_agree() {
		return service_agree;
	}
	public void setService_agree(String service_agree) {
		this.service_agree = service_agree;
	}
	public String getInfo_agree() {
		return info_agree;
	}
	public void setInfo_agree(String info_agree) {
		this.info_agree = info_agree;
	}
	public String getSms_agree() {
		return sms_agree;
	}
	public void setSms_agree(String sms_agree) {
		this.sms_agree = sms_agree;
	}
	public String getEmail_agree() {
		return email_agree;
	}
	public void setEmail_agree(String email_agree) {
		this.email_agree = email_agree;
	}
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public String getTel3() {
		return tel3;
	}
	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getPost_code() {
		return post_code;
	}
	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

}//class

/*
 * DTO의 종류
 * 1. Table DTO : 테이블 컬럼과 동일한 변수를 갖는 DTO
 * 2. View DTO : 화면 요소와 동일한 변수를 갖는 DTO
 * 3. Composite DTO : 복합적인 변수를 갖는 DTO
 * -> 결론은 개발자 맘대로 만드시면 되요.
 */
