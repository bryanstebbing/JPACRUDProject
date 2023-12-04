package com.skilldistillery.archerygear.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.archerygear.data.BowDAO;
import com.skilldistillery.archerygear.entities.Bow;

@Controller
public class BowController {

	@Autowired
	private BowDAO bowDao;

	@RequestMapping(path = { "/", "home.do" })
	public String index(Model model) {
		model.addAttribute("bowList", bowDao.findAll());
		return "home";
	}

	@GetMapping("/CreateABow")
	public String showCreateForm(Model model) {
		model.addAttribute("newBow", new Bow());
		return "create";
	}

	@PostMapping("/CreateABow")
	public String createBow(@ModelAttribute Bow bow) {
		bowDao.create(bow);
		return "redirect:/bows/listall";
	}

	@GetMapping("/Update/{id}")
	public String showUpdateForm(@PathVariable int id, Model model) {
		Bow existingBow = bowDao.findByInt(id);
		model.addAttribute("existingBow", existingBow);
		return "update";
	}

	@PostMapping("/Update/{id}")
	public String updateBow(@PathVariable int id, @ModelAttribute Bow bow) {
		Bow existingBow = bowDao.findByInt(id);

		existingBow.setName(bow.getName());
		existingBow.setTypeOfBow(bow.getName());
		existingBow.setWeightOfBow(bow.getWeightOfBow());
		existingBow.setWeightOfPull(bow.getWeightOfPull());

		bowDao.create(existingBow);

		return "redirect:/bows/listall";
	}

	@GetMapping("/Remove/{id}")
	public String removeBow(@PathVariable int id, Model model) {
		Bow existingBow = bowDao.findByInt(id);

		if (existingBow != null) {
			bowDao.deleteById(id);
		} else {
			model.addAttribute("errorMessage", "Bow not found or already removed.");
		}
		return "redirect:/bows/listall";
	}

	@GetMapping("/FindById/{id}")
	public String findById(@PathVariable int id, Model model) {
        Bow foundBow = bowDao.findByInt(id); 
        if (foundBow != null) {
            model.addAttribute("foundBow", foundBow);
        } else {
            model.addAttribute("errorMessage", "Bow not found.");
        }
        return "findbyid";
    }

	@GetMapping("/ListAll")
	public String listAllBows(Model model) {
        List<Bow> allBows = bowDao.findAll(); 
        model.addAttribute("allBows", allBows);
        return "listall";
	}
	
    @PostMapping("/ListAll")
    public String listAllBowsPost(Model model) {
        return "redirect:/bows/listall";
    }
}
