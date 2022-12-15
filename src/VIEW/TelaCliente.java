package VIEW;

import java.sql.*;
import DAL.ModuloConexao;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils; // usado para fazer a pesquisa SQL na tabela do BD
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class TelaCliente extends javax.swing.JInternalFrame {

    Connection conexao = null;    // abre conexao
    PreparedStatement pst = null; // Executa sql
    ResultSet rs = null;          //exibe  resultado do bd/SQL

    public TelaCliente() {
        initComponents();
        conexao = ModuloConexao.conector(); // local
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCliCad = new javax.swing.JButton();
        btnCliPes = new javax.swing.JButton();
        btnCliEdi = new javax.swing.JButton();
        btnCliExc = new javax.swing.JButton();
        btnCliImp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTelRes = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtLog = new javax.swing.JTextField();
        txtBai = new javax.swing.JTextField();
        txtCom = new javax.swing.JTextField();
        txtCid = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        txtNr = new javax.swing.JTextField();
        cbbUf = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTelCel = new javax.swing.JFormattedTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Funcionalidades Clientes");
        setMaximumSize(null);
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 500));

        btnCliCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/userAdicionar.png"))); // NOI18N
        btnCliCad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliCad.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliCadActionPerformed(evt);
            }
        });

        btnCliPes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/userPesquisar.png"))); // NOI18N
        btnCliPes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliPes.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliPesActionPerformed(evt);
            }
        });

        btnCliEdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/userEditar.png"))); // NOI18N
        btnCliEdi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliEdi.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliEdiActionPerformed(evt);
            }
        });

        btnCliExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/userDeletar.png"))); // NOI18N
        btnCliExc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliExc.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliExcActionPerformed(evt);
            }
        });

        btnCliImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/userImpressora_1.png"))); // NOI18N
        btnCliImp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliImp.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliImpActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("RG:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("CPF:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tel Residencial:");

        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });

        txtRg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgActionPerformed(evt);
            }
        });

        txtCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtTelRes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtTelRes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tblClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Rg", "Cpf"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Logradouro:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Bairro:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Complemento:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Nr:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Cidade:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Cep:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("UF:");

        txtLog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogActionPerformed(evt);
            }
        });

        txtBai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtNr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbbUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbbUf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLog)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtBai, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCom, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNr, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(158, 158, 158)))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cbbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Tel Celular:");

        txtTelCel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtTelCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnCliCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCliPes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCliEdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCliExc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCliImp, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCliPes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliEdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliExc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCliExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliExcActionPerformed
        remover();

    }//GEN-LAST:event_btnCliExcActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed


    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgActionPerformed


    }//GEN-LAST:event_txtRgActionPerformed

    private void btnCliImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliImpActionPerformed
        relCliente();

    }//GEN-LAST:event_btnCliImpActionPerformed

    private void txtLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogActionPerformed

    }//GEN-LAST:event_txtLogActionPerformed

    private void btnCliCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliCadActionPerformed
        cadastrar();

    }//GEN-LAST:event_btnCliCadActionPerformed

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        pesquisar_clientes();

    }//GEN-LAST:event_txtNomeKeyReleased

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        buscar_dados_clientes();

    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnCliPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliPesActionPerformed
        consultar();

    }//GEN-LAST:event_btnCliPesActionPerformed

    private void btnCliEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliEdiActionPerformed
        atualizar();

    }//GEN-LAST:event_btnCliEdiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliCad;
    private javax.swing.JButton btnCliEdi;
    private javax.swing.JButton btnCliExc;
    private javax.swing.JButton btnCliImp;
    private javax.swing.JButton btnCliPes;
    private javax.swing.JComboBox<String> cbbUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBai;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCom;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtLog;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNr;
    private javax.swing.JTextField txtRg;
    private javax.swing.JFormattedTextField txtTelCel;
    private javax.swing.JFormattedTextField txtTelRes;
    // End of variables declaration//GEN-END:variables

    private void cadastrar() {

        String sql = "INSERT INTO e2cliente (COD, NOME, RG, CPF, "
                + "TELCEL, TELRES, BAIRRO, CEP, LOGRADOURO, "
                + "LOCALIDADE, UF, COMPLEMENTO, NR) VALUES "
                + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCodigo.getText());
            pst.setString(2, txtNome.getText());
            pst.setString(3, txtRg.getText());   //  para copiar CONTROL+Shift+Seta para baixo
            pst.setString(4, txtCpf.getText());
            pst.setString(5, txtTelCel.getText());
            pst.setString(6, txtTelRes.getText());
            pst.setString(7, txtBai.getText());
            pst.setString(8, txtCep.getText());
            pst.setString(9, txtLog.getText());
            pst.setString(10, txtCid.getText());
            pst.setString(11, cbbUf.getSelectedItem().toString()); //Pega posição de um array e transforma em String ex.: A posição 1  equivale ao  AC
            pst.setString(12, txtCom.getText());
            pst.setString(13, txtNr.getText());
            System.out.println(pst);

            int resultado = pst.executeUpdate();

            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                txtCodigo.setText(null);
                txtNome.setText(null);
                txtRg.setText(null);
                txtCpf.setText(null);
                txtTelCel.setText(null);
                txtTelRes.setText(null);
                txtBai.setText(null);
                txtCep.setText(null);
                txtLog.setText(null);
                txtCid.setText(null);
                cbbUf.setSelectedItem(null);
                txtCom.setText(null);
                txtNr.setText(null);

            } else {
                JOptionPane.showMessageDialog(null, "Cliente NÃO cadastrado!");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void pesquisar_clientes() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "SELECT COD, NOME, UF FROM e2cliente WHERE NOME like ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNome.getText() + "%");
            rs = pst.executeQuery();
            tblClientes.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
        }

    }

    private void buscar_dados_clientes() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int buscar = tblClientes.getSelectedRow();
        txtCodigo.setText(tblClientes.getModel().getValueAt(buscar, 0).toString());
        txtNome.setText(tblClientes.getModel().getValueAt(buscar, 1).toString());
        txtRg.setText(tblClientes.getModel().getValueAt(buscar, 2).toString());
        txtCpf.setText(tblClientes.getModel().getValueAt(buscar, 3).toString());
        txtTelCel.setText(tblClientes.getModel().getValueAt(buscar, 4).toString());
        txtTelRes.setText(tblClientes.getModel().getValueAt(buscar, 5).toString());
        txtBai.setText(tblClientes.getModel().getValueAt(buscar, 6).toString());
        txtCep.setText(tblClientes.getModel().getValueAt(buscar, 7).toString());
        txtLog.setText(tblClientes.getModel().getValueAt(buscar, 8).toString());
        txtCid.setText(tblClientes.getModel().getValueAt(buscar, 9).toString());
        cbbUf.setSelectedItem(tblClientes.getModel().getValueAt(buscar, 10).toString());
        txtCom.setText(tblClientes.getModel().getValueAt(buscar, 11).toString());
        txtNr.setText(tblClientes.getModel().getValueAt(buscar, 12).toString());

    }

    private void consultar() {
        String sql = "SELECT * FROM e2cliente WHERE COD = ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCodigo.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                txtNome.setText(rs.getString("Nome"));
                txtRg.setText(rs.getString("Rg"));
                txtCpf.setText(rs.getString("Cpf"));
                txtTelCel.setText(rs.getString("TelCel"));
                txtTelRes.setText(rs.getString("TelRes"));
                txtBai.setText(rs.getString("Bairro"));
                txtCep.setText(rs.getString("Cep"));
                txtLog.setText(rs.getString("Logradouro"));
                txtCid.setText(rs.getString("Cidade"));
                cbbUf.setSelectedItem(rs.getString("Uf"));
                txtCom.setText(rs.getString("Complemento"));
                txtNr.setText(rs.getString("Nr"));

            } else {
                JOptionPane.showMessageDialog(null, "Cliente não localizado!");
                txtNome.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void remover() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "DELETE FROM e2cliente WHERE COD=?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCodigo.getText());
            int apagado = pst.executeUpdate();

            if (apagado > 0) {
                JOptionPane.showMessageDialog(null, "Cliente Excluído com sucesso!");
                txtCodigo.setText(null);
                txtNome.setText(null);
                //  colocar os demais campos

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void atualizar() {
        String sql = "UPDATE e2cliente SET NOME=?, RG=?, CPF=?, "
                + "TELCEL=?, TELRES=?, BAIRRO=?, CEP=?, LOGRADOURO=?, "
                + "LOCALIDADE=?, UF=?, COMPLEMENTO=?, NR=? WHERE COD=?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtRg.getText());   //  para copiar CONTROL+Shift+Seta para baixo
            pst.setString(3, txtCpf.getText());
            pst.setString(4, txtTelCel.getText());
            pst.setString(5, txtTelRes.getText());
            pst.setString(6, txtBai.getText());
            pst.setString(7, txtCep.getText());
            pst.setString(8, txtLog.getText());
            pst.setString(9, txtCid.getText());
            pst.setString(10, cbbUf.getSelectedItem().toString()); //Pega posição de um array e transforma em String ex.: A posição 1  equivale ao  AC
            pst.setString(11, txtCom.getText());
            pst.setString(12, txtNr.getText());
            pst.setString(13, txtCodigo.getText());
            System.out.println(pst);

            int atualizado = pst.executeUpdate();

            if (atualizado == 1) {
                JOptionPane.showMessageDialog(null, "Cliente Atualizado com sucesso!");
                txtCodigo.setText(null);
                txtBai.setText(null);
                txtNome.setText(null);
                txtRg.setText(null);
                txtCpf.setText(null);
                txtTelCel.setText(null);
                txtTelRes.setText(null);
                txtBai.setText(null);
                txtCep.setText(null);
                txtLog.setText(null);
                txtCid.setText(null);
                cbbUf.setSelectedItem(null);
                txtCom.setText(null);
                txtNr.setText(null);

            } else {
                JOptionPane.showMessageDialog(null, "Cliente NÃO atualizado!");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void relCliente() {
        //BIBLIOTECAS DO IREPORT C:\Program Files (x86)\Jaspersoft\iReport-5.6.0\ireport\modules\ext 
        int op = JOptionPane.showConfirmDialog(null, "Confirma impressão!", "relatório de clientes", JOptionPane.YES_NO_OPTION);

        if (op == JOptionPane.YES_OPTION) {
            try {
                String caminho = "C:/Rel/RelClientes.jasper";
                JasperPrint print = JasperFillManager.fillReport(caminho, null, conexao);
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
}
