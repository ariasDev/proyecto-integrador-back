package com.reservas.Service;
import java.util.HashMap;
import java.util.UUID;

import com.reservas.Entity.ReservasEntity;


public interface ReservasService {
	public HashMap<String, Object> obtenerTodasReseras();
	public HashMap<String, Object> obtenerReservaPorId(UUID id);
	public HashMap<String, Object> nuevaReserva(ReservasEntity reservasEntity);
	public HashMap<String, Object> eliminarReservaPorId(UUID id);
	public HashMap<String, Object> obtenerReservasPorUsuario(String usuario);
}
