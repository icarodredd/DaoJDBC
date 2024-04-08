package model.dao;

import java.util.List;

import model.entities.Departament;

public interface ProductDao {
	void insert(Departament obj);

	void update(Departament obj);

	Departament findById(Departament obj);

	List<Departament> findAll();
}
