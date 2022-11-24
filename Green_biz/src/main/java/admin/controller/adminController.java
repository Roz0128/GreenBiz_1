package admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminController {
	
	
   //관리자 메인페이지 컨트롤러
   @RequestMapping(value="/admin/adminMain")  //클라이언트가 요청한 경로
   public String adminMain() {
      return "/admin/adminMain";   //이동할 뷰 페이지 이름
   }
   
   //admin Dept
   //관리자 부서정보,조회
   @RequestMapping(value="/adminDeptRead")  //클라이언트가 요청한 경로
   public String adminDeptRead() {
      return "admin/Dept/adminDeptR";   //이동할 뷰 페이지 이름
   }
   
   //관리자 부서정보 등록
   @RequestMapping(value="/adminDeptCreate")  //클라이언트가 요청한 경로
   public String adminDeptCreate() {
      return "admin/Dept/adminDeptC";   //이동할 뷰 페이지 이름
   }
   
   //관리자 부서정보 상제페이지 및 삭제
   @RequestMapping(value="/adminDeptDelete")  //클라이언트가 요청한 경로
   public String adminDeptDelete() {
      return "admin/Dept/adminDeptD";   //이동할 뷰 페이지 이름
   }
   
   //관리자 부서정보 수정
   @RequestMapping(value="/adminDeptUpdate")  //클라이언트가 요청한 경로
   public String adminDeptUpdate() {
      return "admin/Dept/adminDeptU";   //이동할 뷰 페이지 이름
   }
   
   
   //admin Member
   //관리자 사원정보 목록, 사원조회
   @RequestMapping(value="/adminMemRead")  //클라이언트가 요청한 경로
   public String adminMemRead() {
      return "admin/Member/adminMemR";   //이동할 뷰 페이지 이름
   }
   
   //관리자 사원정보 등록
   @RequestMapping(value="/adminMemCreate")  //클라이언트가 요청한 경로
   public String adminMemCreate() {
      return "admin/Member/adminMemC";   //이동할 뷰 페이지 이름
   }

   //관리자 사원정보 상세페이지 및 삭제
   @RequestMapping(value="/adminMemDelete")  //클라이언트가 요청한 경로
   public String adminMemDelete() {
      return "admin/Member/adminMemD";   //이동할 뷰 페이지 이름
   }

   //관리자 사원정보 수정
   @RequestMapping(value="/adminMemUpdate")  //클라이언트가 요청한 경로
   public String adminMemUpdate() {
      return "admin/Member/adminMemU";   //이동할 뷰 페이지 이름
   }

   //admin Post
   //관리자 게시판 메인화면
   @RequestMapping(value="/adminPostRead")  //클라이언트가 요청한 경로
   public String adminAllPostRead() {
      return "admin/Post/adminAllPostR";   //이동할 뷰 페이지 이름
   }
   
   //admin AllPost
   //관리자 전사게시 등록
   @RequestMapping(value="/adminAllPostCreate.do")  //클라이언트가 요청한 경로
   public String adminAllPostCreate() {
      return "admin/Post/adminAllPostC";   //이동할 뷰 페이지 이름
   }
   
   //관리자 전사게시 상세페이지 및 삭제
   @RequestMapping(value="/adminAllPostDelete.do")  //클라이언트가 요청한 경로
   public String adminAllPostDelete() {
      return "admin/Post/adminAllPostD";   //이동할 뷰 페이지 이름
   }
   
   //관리자 전사게시 수정
   @RequestMapping(value="/adminAllPostUpdate.do")  //클라이언트가 요청한 경로
   public String adminAllPostUpdate() {
      return "admin/Post/adminAllPostU";   //이동할 뷰 페이지 이름
   }
   
   //admin FreePost
   //관리자 전사게시 등록
   @RequestMapping(value="/adminFreePostCreate.do")  //클라이언트가 요청한 경로
   public String adminFreePostCreate() {
      return "admin/Post/adminFreePostC";   //이동할 뷰 페이지 이름
   }
   
   //관리자 전사게시 상세페이지 및 삭제
   @RequestMapping(value="/adminFreePostDelete.do")  //클라이언트가 요청한 경로
   public String adminFreePostDelete() {
      return "admin/Post/adminFreePostD";   //이동할 뷰 페이지 이름
   }
   
   //관리자 전사게시 수정
   @RequestMapping(value="/adminFreePostUpdate.do")  //클라이언트가 요청한 경로
   public String adminFreePostUpdate() {
      return "admin/Post/adminFreePostU";   //이동할 뷰 페이지 이름
   }
   
   //사원, 전사게시 메인페이지
   @RequestMapping(value="/noticeMain.do")  //클라이언트가 요청한 경로
   public String noticeMain() {
      return "notice/noticeMain";   //이동할 뷰 페이지 이름
   }
   
   //사원, 전사게시 상세페이지
   @RequestMapping(value="/noticeDetail.do")  //클라이언트가 요청한 경로
   public String noticeDetail() {
      return "notice/noticeDetail";   //이동할 뷰 페이지 이름
   }
   
   
}

