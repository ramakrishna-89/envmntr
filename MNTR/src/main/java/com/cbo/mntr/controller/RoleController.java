package com.cbo.mntr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cbo.mntr.constants.ViewConstants;

@Controller
public class RoleController {

	@RequestMapping(value = { ViewConstants.roleURL1 })
	public String rolePage(Model model) {
		return ViewConstants.roleURL1;
	}

}
