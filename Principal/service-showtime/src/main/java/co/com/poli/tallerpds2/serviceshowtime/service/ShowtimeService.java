package co.com.poli.tallerpds2.serviceshowtime.service;

import co.com.poli.tallerpds2.serviceshowtime.entity.Showtime;

import java.util.List;

public interface ShowtimeService {

    void guardar(Showtime showtime);
    void eliminar(Showtime showtime);
    List<Showtime> listar();
    Showtime findById(Long id);
    Showtime findByNumberInvoice(String numberShowtime);

}
