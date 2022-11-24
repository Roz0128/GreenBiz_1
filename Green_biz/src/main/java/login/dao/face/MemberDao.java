package login.dao.face;

import login.dto.Member;

public interface MemberDao {

	/**
	 * 로그인 사원번호랑 일치하는 행의 수 구하기
	 *  -> 로그인 인증에 사용
	 * 
	 * @param loginParam - 로그인 정보
	 * @return 일치하는 행의 수
	 */
	public int selectCntByIdPw(Member member);

	/**
	 * 사원 이름과 이메일이 일치하는 행의 수 구하기
	 * 
	 * @param loginParam - 회원 정보
	 * @return 일치하는 행의 수
	 */
	public int selectLoginCntByNameEmail(Member member);

	/**
	 * 전달된 사원 이름을 이용하여 사원정보 조회
	 * 
	 * @param findName - 조회하려는 대상의 사원이름
	 * @param findEmail - 조회하려는 대상의 이메일
	 * @return 조회된 사원 정보
	 */
	public Member selectFindByName(Member member);

	/**
	 * 사원번호와 이메일이 일치하는 행의 수 구하기
	 * 
	 * @param loginParam - 사원 정보
	 * @return 일치하는 행의 갯수
	 */
	public int selectCntByNoEmail(Member member);

	/**
	 * 전달된 사원이름과 이메일을 이용하여 비밀번호 찾기
	 * 
	 * @param loginParam 조회하려는 사원 정보
	 * @return 조회된 사원 정보
	 */
	public Member selectFindByNameEmail(Member member);

	/**
	 * 전달된 사원의 이름과 이메일을 이용하여 비밀번호 변경하기
	 * 
	 * @param login 조회하려는 사원 정보
	 * @return 조회된 사원 정보
	 */
	public void updatePw(Member member);
}
