package com.cbo.mntr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbo.mntr.constants.ViewConstants;

@Controller
public class MachineController {

	@RequestMapping(value = { ViewConstants.machineURL1 })
	public String machinePage(Model model) {
		return ViewConstants.machineURL1;
	}

}
