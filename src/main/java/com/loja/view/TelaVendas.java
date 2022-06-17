package com.loja.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.Timer;

public class TelaVendas extends JFrame {

	public TelaVendas() {
		initComponents();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
	
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaVendas().setVisible(true);
			}
		});
	}

// declaracao de variaveis.. achei excessivo, estudar maneira de diminuir. 
	protected javax.swing.JButton jButton2;
	protected javax.swing.JFormattedTextField jFCpfCliente;
	protected javax.swing.JLabel jLConfirma;
	protected javax.swing.JLabel jLData;
	protected javax.swing.JLabel jLFinalizarCompra;
	protected javax.swing.JLabel jLHora;
	protected javax.swing.JLabel jLNomeProduto;
	protected javax.swing.JLabel jLQuantidade;
	protected javax.swing.JLabel jLValor;
	protected javax.swing.JLabel jLabel2;
	protected javax.swing.JLabel jLabel3;
	protected javax.swing.JLabel jLabel4;
	protected javax.swing.JLabel jLabel5;
	protected javax.swing.JLabel jLabel6;
	protected javax.swing.JLabel jLabel7;
	protected javax.swing.JLabel jLabel8;
	protected javax.swing.JLabel jLabel9;
	protected javax.swing.JLabel jLtroco;
	protected javax.swing.JPanel jPanel1;
	protected javax.swing.JPanel jPanel10;
	protected javax.swing.JPanel jPanel11;
	protected javax.swing.JPanel jPanel12;
	protected javax.swing.JPanel jPanel2;
	protected javax.swing.JPanel jPanel3;
	protected javax.swing.JPanel jPanel4;
	protected javax.swing.JPanel jPanel5;
	protected javax.swing.JPanel jPanel6;
	protected javax.swing.JPanel jPanel7;
	protected javax.swing.JPanel jPanel8;
	protected javax.swing.JPanel jPanel9;
	protected javax.swing.JScrollPane jScrollPane1;
	protected javax.swing.JTextField jTCodigo;
	protected javax.swing.JTextField jTDinheiroEntrada;
	protected javax.swing.JTextField jTNomeCliente;
	protected javax.swing.JTable jTProdutoComprados;


	@SuppressWarnings("unchecked")
	
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLNomeProduto = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jLQuantidade = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		jLValor = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		jLtroco = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();
		jTDinheiroEntrada = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jPanel9 = new javax.swing.JPanel();
		jTNomeCliente = new javax.swing.JTextField();
		jPanel10 = new javax.swing.JPanel();
		jFCpfCliente = new javax.swing.JFormattedTextField();
		jPanel11 = new javax.swing.JPanel();
		jLFinalizarCompra = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLData = new javax.swing.JLabel();
		jLHora = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jPanel8 = new javax.swing.JPanel();
		jTCodigo = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTProdutoComprados = new javax.swing.JTable();
		jPanel12 = new javax.swing.JPanel();
		jLConfirma = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			
		});

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

		jPanel2.setBackground(new java.awt.Color(0, 100, 240));

		jLNomeProduto.setFont(new java.awt.Font("Bebas Neue", 1, 36)); // NOI18N
		jLNomeProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLNomeProduto.setText("Produtos que ira aparecer quando digitar o codigo");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout
								.createSequentialGroup().addContainerGap().addComponent(jLNomeProduto,
										javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
								.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
						.addContainerGap()));

		jLabel2.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
		jLabel2.setText("Valor");

		jPanel3.setBackground(new java.awt.Color(0, 100, 240));

		jLQuantidade.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
		jLQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLQuantidade.setText("jLabel8");
		jLQuantidade.addAncestorListener(new javax.swing.event.AncestorListener() {
			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
			}

			public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
				jLQuantidadeAncestorAdded(evt);
			}

			public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jLQuantidade,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
						.addContainerGap()));

		jLabel3.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
		jLabel3.setText("Quantidade");

		jPanel4.setBackground(new java.awt.Color(0, 100, 240));

		jLValor.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
		jLValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLValor.setText("jLabel8");
		jLValor.addAncestorListener(new javax.swing.event.AncestorListener() {
			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
			}

			public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
				jLValorAncestorAdded(evt);
			}

			public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(jLValor,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLValor, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
						.addContainerGap()));

		jLabel4.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
		jLabel4.setText("troco");

		jPanel5.setBackground(new java.awt.Color(0, 100, 240));

		jLtroco.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
		jLtroco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLtroco.setText("jLabel9");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(jLtroco,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLtroco, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
						.addContainerGap()));

		jPanel6.setBackground(new java.awt.Color(0, 100, 240));

		jTDinheiroEntrada.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
		jTDinheiroEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTDinheiroEntrada.setBorder(null);
		jTDinheiroEntrada.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTDinheiroEntradaActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
						.addComponent(jTDinheiroEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
						.addComponent(jTDinheiroEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
						.addContainerGap()));

		jLabel5.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
		jLabel5.setText("dinheiro entrada");

		jLabel8.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel8.setText("Nome Cliente:");
		jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		jLabel9.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel9.setText("Cpf Cliente:");
		jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jLabel9.setMaximumSize(new java.awt.Dimension(123, 30));
		jLabel9.setMinimumSize(new java.awt.Dimension(123, 30));
		jLabel9.setPreferredSize(new java.awt.Dimension(123, 30));

		jPanel9.setBackground(new java.awt.Color(0, 100, 240));
		jPanel9.setPreferredSize(new java.awt.Dimension(302, 42));

		jTNomeCliente.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(
				jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout
						.createSequentialGroup().addContainerGap().addComponent(jTNomeCliente).addContainerGap()));
		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel9Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jTNomeCliente)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel10.setBackground(new java.awt.Color(0, 100, 240));

		try {
			jFCpfCliente.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		jFCpfCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup().addContainerGap()
						.addComponent(jFCpfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
						.addContainerGap().addComponent(jFCpfCliente).addContainerGap()));

		jPanel11.setBackground(new java.awt.Color(0, 100, 240));

		jLFinalizarCompra.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
		jLFinalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
		jLFinalizarCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLFinalizarCompra.setText("Finalizar comprar");

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
		jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLFinalizarCompra, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE));
		jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLFinalizarCompra, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addGap(31, 31, 31)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(36, 36, 36)));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addGroup(jPanel7Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 51,
												Short.MAX_VALUE)
										.addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel7Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel7Layout.createSequentialGroup().addGap(22, 22, 22)
								.addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));

		jLabel6.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
		jLabel6.setText("Mercadinho Do Gelado");

		jLData.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
		jLData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		jLHora.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
		jLHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		jLabel7.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("c�digo");

		jPanel8.setBackground(new java.awt.Color(0, 100, 240));

		jTCodigo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
		jTCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTCodigo.setBorder(null);

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup().addContainerGap()
						.addComponent(jTCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup().addContainerGap()
						.addComponent(jTCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
						.addContainerGap()));

		jButton2.setBackground(new java.awt.Color(0, 100, 240));
		jButton2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
		jButton2.setText("X");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2.action(null, jPanel8Layout);
			}
		});

		jTProdutoComprados
				.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { {}, {}, {}, {} }, new String[] {

				}));
		jScrollPane1.setViewportView(jTProdutoComprados);

		jPanel12.setBackground(new java.awt.Color(0, 100, 240));

		jLConfirma.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
		jLConfirma.setForeground(new java.awt.Color(255, 255, 255));
		jLConfirma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLConfirma.setText("OK");
		jLConfirma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jLConfirma.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLConfirmaMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
		jPanel12.setLayout(jPanel12Layout);
		jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE));
		jPanel12Layout.setVerticalGroup(
				jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLConfirma,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(29, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel6).addGap(18, 18, 18)
										.addComponent(jLData, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLHora, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(966, 966, 966).addComponent(jButton2))
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE,
																73, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749,
														javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(65, 65, 65)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jPanel3,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jLabel5).addComponent(jLabel4)
														.addComponent(jLabel2).addComponent(jLabel3)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(jPanel6,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(jPanel12,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))))
						.addContainerGap(37, Short.MAX_VALUE))
				.addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLData, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
								.addComponent(jLHora, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(25, 25, 25).addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1386, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}

	private void jLValorAncestorAdded(javax.swing.event.AncestorEvent evt) {

		double valor = 56.65;
		jLValor.setText("R$ " + valor);
	}

	private void jTDinheiroEntradaActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jLQuantidadeAncestorAdded(javax.swing.event.AncestorEvent evt) {

		int quantidade = 5;
		jLQuantidade.setText("X " + quantidade);

	}

	private void jLConfirmaMouseClicked(java.awt.event.MouseEvent evt) {

	}
}