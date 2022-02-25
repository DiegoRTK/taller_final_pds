package co.com.poli.tallerpds2.servicemovie.service;

import co.com.poli.tallerpds2.servicemovie.entity.Movies;

import java.util.List;

public interface MoviesService {

    void guardar(Movies movie);
    void eliminar(Movies movie);
    List<Movies> listar();
    Movies findById(Long id);

}
