package com.kids.canteen.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kids.canteen.app.bean.AllMenuBean;
import com.kids.canteen.app.service.AllMenuService;

@RestController
@RequestMapping(path = "/menu")
public class AllMenuController {

	@Autowired
	private AllMenuService allMenuService;
	
	@GetMapping(path = "/get")
	public List<AllMenuBean> getAllMenu() {
		return allMenuService.getAllMenu();		
	}
	
	@PostMapping(path = "/add")
	public List<AllMenuBean> addAllMenu(@RequestBody List<AllMenuBean> menuList) {
		return allMenuService.addAllMenu(menuList);
	}
	
	@PutMapping(path = "/edit")
	public List<AllMenuBean> editAllMenu(@RequestBody List<AllMenuBean> menuList) {
		return allMenuService.updateAllMenu(menuList);
	}
	
	@PostMapping(path = "/remove")
	public List<AllMenuBean> removeAllMenu(@RequestBody List<AllMenuBean> menuList) {
		return allMenuService.removeAllMenu(menuList);
	}
}
