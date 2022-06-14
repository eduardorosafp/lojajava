package com.loja.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.domain.Pedido;
import com.loja.repositories.PedidoRepository;
import com.loja.services.exceptions.ObjectNotFoundException;
@Service
public class PedidoService {




		@Autowired
		private PedidoRepository repo;

		public Pedido buscar(Integer id) {
			Optional<Pedido> obj = repo.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto nao encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		}
}
