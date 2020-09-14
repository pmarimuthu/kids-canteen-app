package com.kids.canteen.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kids.canteen.app.model.AllMenu;

public interface AllMenuRepository extends CrudRepository<AllMenu, String> {

	List<AllMenu> findAll();
}
