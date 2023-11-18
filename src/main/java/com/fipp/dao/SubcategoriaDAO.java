package com.fipp.dao;


import com.fipp.models.entities.Subcategoria;
import java.util.ArrayList;
import java.util.List;

public interface SubcategoriaDAO {

    ArrayList<Subcategoria> getAll();

    Subcategoria getById(int id);

    List<Subcategoria> getByCategoriaId(int id);

    int inserir(Subcategoria subcategoria);
    boolean update(Subcategoria subcategoria);

}