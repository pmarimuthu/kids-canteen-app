package com.kids.canteen.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kids.canteen.app.bean.AllMenuBean;
import com.kids.canteen.app.model.AllMenu;
import com.kids.canteen.app.repository.AllMenuRepository;

@Service
public class AllMenuService {

	@Autowired
	private AllMenuRepository allMenuRepository;

	// Get ++
	public List<AllMenuBean> getAllMenu() {
		List<AllMenu> entities = allMenuRepository.findAll();
		return entities.stream().map(AllMenu::toBean).collect(Collectors.toList());
	}

	// Add ++
	public List<AllMenuBean> addAllMenu(List<AllMenuBean> allMenuToAdd) {
		allMenuToAdd.stream().forEach(bean -> {
			AllMenu entity = new AllMenu();
			entity.toEntity(bean);
			
			allMenuRepository.save(entity);
		});

		return getAllMenu();
	}

	// Update ++
	public List<AllMenuBean> updateAllMenu(List<AllMenuBean> allMenuToUpdate) {
		allMenuToUpdate.stream().forEach(bean -> {
			AllMenu entity = allMenuRepository.findById(bean.getDishName()).orElse(null);
			if(entity != null) {
				entity.toEntity(bean);
				allMenuRepository.save(entity);
			}
		});

		return getAllMenu();
	}

	// Delete ++
	public List<AllMenuBean> removeAllMenu(List<AllMenuBean> allMenuToRemove) {
		allMenuToRemove.stream().forEach(bean -> {
			AllMenu entity = allMenuRepository.findById(bean.getDishName()).orElse(null);
			if(entity != null) {
				allMenuRepository.delete(entity);
			}
		});
		
		return getAllMenu();
	}
	
}
