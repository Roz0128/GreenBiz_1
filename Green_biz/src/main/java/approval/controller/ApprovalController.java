package approval.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApprovalController {

	private Logger logger = LoggerFactory.getLogger(ApprovalController.class);
	
	@RequestMapping("/approval/main")
	public void approval() {
		logger.info("/approval/main");
	}

	@RequestMapping("/approval/confirm")
	public void appConfirm() {
		logger.info("/approval/confirm");
	}

	@RequestMapping("/approval/form")
	public void appform() {
		logger.info("/approval/form");
	}

	@RequestMapping("/approval/list")
	public void applist() {
		logger.info("/approval/list");
	}
	
	
}
