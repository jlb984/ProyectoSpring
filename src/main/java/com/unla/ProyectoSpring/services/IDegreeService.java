package com.unla.ProyectoSpring.services;
import java.util.List;

import com.unla.ProyectoSpring.entities.Degree;
import com.unla.ProyectoSpring.models.DegreeModel;


public interface IDegreeService {

	public List<Degree> getAll();

	public DegreeModel insertOrUpdate(DegreeModel degreeModel);

	public boolean remove(int id);
}

