package com.skilldistillery.archerygear.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.archerygear.data.BowDAO;

@Controller
public class BowController {

	@Autowired
	private BowDAO bowDao;
	
	@RequestMapping(path = {"/", "home.do"} )
	public String index(Model model) {
		model.addAttribute("bowList", bowDao.findAll());
		return "home";
	}

}
