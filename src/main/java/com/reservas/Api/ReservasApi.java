package com.reservas.Api;

import com.reservas.Entity.ReservasEntity;
import com.reservas.Service.ReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.UUID;

@RestController
@RequestMapping(value = "/reservas")
public class ReservasApi {
    @Autowired
    private ReservasService reservasService;

    @GetMapping(path = "")
    public HashMap<String, Object> obtenerTodasLasResevas() {
        return reservasService.obtenerTodasReseras();
    }


    @PostMapping(consumes = "application/json", produces = "application/json")
    public HashMap<String, Object> guardarNuevaReserva(@RequestBody ReservasEntity reservaEntity) {
        return reservasService.nuevaReserva(reservaEntity);
    }

    @DeleteMapping("/{id}")
    public HashMap<String, Object> eliminarReserva(@PathVariable UUID id) {
        return reservasService.eliminarReservaPorId(id);
    }

    @GetMapping(path = "/{usuario}")
    public HashMap<String, Object> obtenerReservasPorUsuario(@PathVariable String usuario) {
        return reservasService.obtenerReservasPorUsuario(usuario);
    }

}
