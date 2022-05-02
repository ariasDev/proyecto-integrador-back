package com.reservas.Service;

import com.reservas.Entity.ReservasEntity;
import com.reservas.Repository.ReservasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;


@Service
public class ReservasServiceImp implements ReservasService {

    @Autowired
    public ReservasRepository reservasRepository;

    @Override
    public HashMap<String, Object> obtenerTodasReseras() {
        try {
            HashMap<String, Object> reservasList = new HashMap<>();
            reservasList.put("respuesta", reservasRepository.findAll());
            return reservasList;
        } catch (Exception e) {
            HashMap<String, Object> errorMap = new HashMap<>();
            errorMap.put("error", e);
            return errorMap;
        }
    }

    @Override
    public HashMap<String, Object> obtenerReservaPorId(UUID id) {
        try {
            HashMap<String, Object> reserva = new HashMap<>();
            reserva.put("reserva", reservasRepository.findById(id));
            return reserva;
        } catch (Exception e) {
            HashMap<String, Object> errorMap = new HashMap<>();
            errorMap.put("error", e);
            return errorMap;
        }
    }

    @Override
    public HashMap<String, Object> nuevaReserva(ReservasEntity reservasEntity) {
        try {
            HashMap<String, Object> saveResponseMap = new HashMap<>();
            saveResponseMap.put("respuesta", reservasRepository.save(reservasEntity));
            return saveResponseMap;
        } catch (Exception e) {
            HashMap<String, Object> errorMap = new HashMap<>();
            errorMap.put("error", e.getLocalizedMessage());
            return errorMap;
        }
    }

    @Override
    public HashMap<String, Object> eliminarReservaPorId(UUID id) {
        try {
            HashMap<String, Object> deletedMap = new HashMap<>();
            reservasRepository.deleteById(id);
            deletedMap.put("respuesta", "reserva " + id + " eliminada");
            return deletedMap;
        } catch (Exception e) {
            HashMap<String, Object> errorMap = new HashMap<>();
            errorMap.put("error", e);
            return errorMap;
        }
    }

    @Override
    public HashMap<String, Object> obtenerReservasPorUsuario(String usuario) {
        try {
            HashMap<String, Object> listaReservasPorUsuarioMap = new HashMap<>();
            List<ReservasEntity> listaReservasPorUsuario = reservasRepository.findAllByUsuario(usuario);
            listaReservasPorUsuarioMap.put("respuesta", listaReservasPorUsuario);
            return listaReservasPorUsuarioMap;
        } catch (Exception e) {
            HashMap<String, Object> errorMap = new HashMap<>();
            errorMap.put("error", e);
            return errorMap;
        }
    }

}
