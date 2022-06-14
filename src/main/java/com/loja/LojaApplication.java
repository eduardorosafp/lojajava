package com.loja;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.loja.domain.Categoria;
import com.loja.domain.Cidade;
import com.loja.domain.Cliente;
import com.loja.domain.Endereco;
import com.loja.domain.Estado;
import com.loja.domain.Pagamento;
import com.loja.domain.PagamentoComBoleto;
import com.loja.domain.PagamentoComCartao;
import com.loja.domain.Pedido;
import com.loja.domain.Produto;
import com.loja.domain.enums.EstadoPagamento;
import com.loja.domain.enums.TipoCliente;
import com.loja.repositories.CategoriaRepository;
import com.loja.repositories.CidadeRepository;
import com.loja.repositories.ClienteRepository;
import com.loja.repositories.EnderecoRepository;
import com.loja.repositories.EstadoRepository;
import com.loja.repositories.PagamentoRepository;
import com.loja.repositories.PedidoRepository;
import com.loja.repositories.ProdutoRepository;

@SpringBootApplication
public class LojaApplication implements CommandLineRunner {

	// dependencias 
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private PagamentoRepository pagamentoRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Escritorio");
		Categoria cat2 = new Categoria(null, "Informatica");
		
		Produto p1 = new Produto(null, "computador", 2000.00);
		Produto p2 = new Produto(null, "impressora", 800.00);
		Produto p3 = new Produto(null, "mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		Estado est1 = new Estado(null, "RS");
		Estado est2 = new Estado(null, "MG");
		
		Cidade c1 = new Cidade(null, "Canoas", est1);
		Cidade c2 = new Cidade(null, "Minas", est2);
		Cidade c3 = new Cidade(null, "Porto Alegre", est1);
		
		est1.getCidades().addAll(Arrays.asList(c1, c3));
		est2.getCidades().addAll(Arrays.asList(c2));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Cliente cli1 = new Cliente(null, "Eduardo Rosa", "eduardorosafp@gmail.com", "0000000000000", TipoCliente.PESSOAFISICA);
		Cliente cli2 = new Cliente(null, "Eduarda Leite", "eduardaGleite@gmail.com", "0000000000001", TipoCliente.PESSOAFISICA);
		
		cli1.getTelefones().addAll(Arrays.asList("232323232", "3434434343"));
		cli2.getTelefones().addAll(Arrays.asList("3434343434", "21212121212"));
		
		Endereco e1 = new Endereco(null, "Rua Napoleao Laureano", "401", "apt301", "Centro", "92010190", cli1, c1);
		Endereco e2 = new Endereco(null, "Rua Napoleao Laurenao", "402", "apt302", "Centro", "92010190", cli1, c2);
		
		
		cli1.getEndereco().addAll(Arrays.asList(e1, e2));
		cli2.getEndereco().addAll(Arrays.asList( e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1, cli2));
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		Pedido ped1 = new Pedido(null, sdf.parse("14/06/2022 14:28" ),  cli1, e1);
		Pedido ped2 = new Pedido(null, sdf.parse("14/06/2022 14:30" ),  cli2, e2);
		
		Pagamento pagt1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pagt1);
		
		Pagamento pagt2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, sdf.parse("20/10/2022 00:00"), null);
		ped2.setPagamento(pagt2);
		
		
		cli1.getPedidos().addAll(Arrays.asList(ped1));
		cli2.getPedidos().addAll(Arrays.asList(ped2));
		
		pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
		pagamentoRepository.saveAll(Arrays.asList(pagt1, pagt2));

		
	}

}
