package VIEW;

import java.sql.*;
import DAL.ModuloConexao;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class TelaAutomovel extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaAutomovel() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPla = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbbAno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutomoveis = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtFab = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        btnCliCad = new javax.swing.JButton();
        btnCliPes = new javax.swing.JButton();
        btnCliEdi = new javax.swing.JButton();
        btnCliExc = new javax.swing.JButton();
        btnCliImp = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Fucionalidades Automóveis");
        setPreferredSize(new java.awt.Dimension(750, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Código:");

        txtCod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Renavam:");

        txtRen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRenKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Placa:");

        txtPla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ano:");

        cbbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990" }));
        cbbAno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblAutomoveis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblAutomoveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Renavam", "Placa", "Ano"
            }
        ));
        tblAutomoveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAutomoveisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAutomoveis);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Fabricante:");

        txtFab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Modelo:");

        txtMod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Cor:");

        txtCor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFab, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtMod)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCliCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Automovel - cadastrar.png"))); // NOI18N
        btnCliCad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliCad.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliCadActionPerformed(evt);
            }
        });

        btnCliPes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Automovel - procurar.png"))); // NOI18N
        btnCliPes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliPes.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliPesActionPerformed(evt);
            }
        });

        btnCliEdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Automovel - Editar.png"))); // NOI18N
        btnCliEdi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliEdi.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliEdiActionPerformed(evt);
            }
        });

        btnCliExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Automovel - excluir.png"))); // NOI18N
        btnCliExc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliExc.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliExcActionPerformed(evt);
            }
        });

        btnCliImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Automovel - Imprimir.png"))); // NOI18N
        btnCliImp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliImp.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliImpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRen, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(txtPla))
                                .addGap(114, 114, 114)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnCliCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCliPes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCliEdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCliExc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCliImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCliCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliPes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliEdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliExc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRenKeyReleased
        pesquisar_automoveis();

    }//GEN-LAST:event_txtRenKeyReleased

    private void btnCliCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliCadActionPerformed
        cadastrar();

    }//GEN-LAST:event_btnCliCadActionPerformed

    private void tblAutomoveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAutomoveisMouseClicked
        buscar_dados_automoveis();

    }//GEN-LAST:event_tblAutomoveisMouseClicked

    private void btnCliPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliPesActionPerformed
        pesquisar();

    }//GEN-LAST:event_btnCliPesActionPerformed

    private void btnCliExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliExcActionPerformed
        remover();

    }//GEN-LAST:event_btnCliExcActionPerformed

    private void btnCliEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliEdiActionPerformed
        editar();

    }//GEN-LAST:event_btnCliEdiActionPerformed

    private void btnCliImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliImpActionPerformed
        relAutomovel();

    }//GEN-LAST:event_btnCliImpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliCad;
    private javax.swing.JButton btnCliEdi;
    private javax.swing.JButton btnCliExc;
    private javax.swing.JButton btnCliImp;
    private javax.swing.JButton btnCliPes;
    private javax.swing.JComboBox<String> cbbAno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAutomoveis;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtFab;
    private javax.swing.JTextField txtMod;
    private javax.swing.JTextField txtPla;
    private javax.swing.JTextField txtRen;
    // End of variables declaration//GEN-END:variables

    private void cadastrar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        String sql = "INSERT INTO e1automovel ( COD, PLACA,  RENAVAM,"
                + " FABRICANTE, MODELO, ANO, COR) VALUES "
                + "(?,?,?,?,?,?,?)";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCod.getText());
            pst.setString(2, txtPla.getText());
            pst.setString(3, txtRen.getText());
            pst.setString(4, txtFab.getText());
            pst.setString(5, txtMod.getText());
            pst.setString(6, cbbAno.getSelectedItem().toString());
            pst.setString(7, txtCor.getText());
            System.out.println(pst);

            int resultado = pst.executeUpdate();

            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "Registro do automóvel cadastrado com sucesso!");
                txtCod.setText(null);
                txtPla.setText(null);
                txtRen.setText(null);
                txtFab.setText(null);
                txtMod.setText(null);
                cbbAno.setSelectedItem(null);
                txtCor.setText(null);

            } else {
                JOptionPane.showMessageDialog(null, "Registro não cadastrado!");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void pesquisar_automoveis() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        String sql = "SELECT COD,PLACA FROM e1automovel WHERE RENAVAM like ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtRen.getText() + "%");
            rs = pst.executeQuery();
            tblAutomoveis.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
        }

    }

    private void buscar_dados_automoveis() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        int buscar = tblAutomoveis.getSelectedRow();
        txtCod.setText(tblAutomoveis.getModel().getValueAt(buscar, 0).toString());
        txtPla.setText(tblAutomoveis.getModel().getValueAt(buscar, 1).toString());
        txtRen.setText(tblAutomoveis.getModel().getValueAt(buscar, 2).toString());
        txtFab.setText(tblAutomoveis.getModel().getValueAt(buscar, 3).toString());
        txtMod.setText(tblAutomoveis.getModel().getValueAt(buscar, 4).toString());
        cbbAno.setSelectedItem(tblAutomoveis.getModel().getValueAt(buscar, 5).toString());
        txtCor.setText(tblAutomoveis.getModel().getValueAt(buscar, 6).toString());

    }

    private void pesquisar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        String sql = "SELECT * FROM e1automovel WHERE COD = ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCod.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                txtRen.setText(rs.getString("Renavam"));
                txtPla.setText(rs.getString("Placa"));
                txtFab.setText(rs.getString("Fabricante"));
                txtMod.setText(rs.getString("Modelo"));
                cbbAno.setSelectedItem(rs.getString("Ano"));
                txtCor.setText(rs.getString("Cor"));

            } else {
                JOptionPane.showMessageDialog(null, "Renavam não encontrado!");
                txtRen.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void remover() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        String sql = "DELETE FROM e1automovel WHERE COD=?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCod.getText());
            int apagado = pst.executeUpdate();

            if (apagado > 0) {
                JOptionPane.showMessageDialog(null, "Registro Excluído com sucesso!");
                txtCod.setText(null);
                txtRen.setText(null);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void editar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        String sql = "UPDATE e1automovel SET PLACA=?, RENAVAM=?, FABRICANTE=?, "
                + "MODELO=?, ANO=?, COR=? WHERE COD=?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCod.getText());
            pst.setString(2, txtPla.getText());
            pst.setString(3, txtRen.getText());
            pst.setString(4, txtFab.getText());
            pst.setString(5, txtMod.getText());
            pst.setString(6, cbbAno.getSelectedItem().toString());
            pst.setString(7, txtCor.getText());
            System.out.println(pst);

            int atualizado = pst.executeUpdate();

            if (atualizado == 1) {
                JOptionPane.showMessageDialog(null, "Registro do automóvel atualizado com sucesso!");
                txtCod.setText(null);
                txtPla.setText(null);
                txtRen.setText(null);
                txtFab.setText(null);
                txtMod.setText(null);
                cbbAno.setSelectedItem(null);
                txtCor.setText(null);

            } else {
                JOptionPane.showMessageDialog(null, "Registro não atualizado.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void relAutomovel() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        int op = JOptionPane.showConfirmDialog(null, "Confirma impressão!", "relatório de automóveis", JOptionPane.YES_NO_OPTION);

        if (op == JOptionPane.YES_OPTION) {
            try {
                String caminho = "C:/Rel/RelAutomoveis.jasper";
                JasperPrint print = JasperFillManager.fillReport(caminho, null, conexao);
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
}
