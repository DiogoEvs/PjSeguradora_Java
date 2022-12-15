package VIEW;

import java.sql.*;
import DAL.ModuloConexao;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class TelaOcorrencia extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaOcorrencia() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOcorrencias = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        btnCliCad = new javax.swing.JButton();
        btnCliPes = new javax.swing.JButton();
        btnCliEdi = new javax.swing.JButton();
        btnCliExc = new javax.swing.JButton();
        btnCliImp = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Fucionalidades Ocorrências");
        setPreferredSize(new java.awt.Dimension(750, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Código:");

        txtCod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Local:");

        txtLoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLocKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Data:");

        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tblOcorrencias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblOcorrencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Renavam", "Data", "Descrição"
            }
        ));
        tblOcorrencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOcorrenciasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOcorrencias);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18))); // NOI18N

        txtDesc.setColumns(4);
        txtDesc.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtDesc.setRows(5);
        txtDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(txtDesc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCliCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Ocorrencia - Cadastrar.png"))); // NOI18N
        btnCliCad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliCad.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliCadActionPerformed(evt);
            }
        });

        btnCliPes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Ocorrencia - procurar.png"))); // NOI18N
        btnCliPes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliPes.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliPesActionPerformed(evt);
            }
        });

        btnCliEdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Ocorrencia - editar.png"))); // NOI18N
        btnCliEdi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliEdi.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliEdiActionPerformed(evt);
            }
        });

        btnCliExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Ocorrencia - excluir.png"))); // NOI18N
        btnCliExc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        btnCliExc.setPreferredSize(new java.awt.Dimension(70, 64));
        btnCliExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliExcActionPerformed(evt);
            }
        });

        btnCliImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Ocorrencia - Imprimir.png"))); // NOI18N
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
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCliCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCliPes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCliEdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCliExc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCliImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
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
                    .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCliCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliPes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliEdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliExc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocKeyReleased
        pesquisar_ocorrencias();

    }//GEN-LAST:event_txtLocKeyReleased

    private void btnCliCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliCadActionPerformed
        cadastrar();

    }//GEN-LAST:event_btnCliCadActionPerformed

    private void tblOcorrenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOcorrenciasMouseClicked
        buscar_dados_ocorrencias();

    }//GEN-LAST:event_tblOcorrenciasMouseClicked

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
        relOcorrencia();

    }//GEN-LAST:event_btnCliImpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliCad;
    private javax.swing.JButton btnCliEdi;
    private javax.swing.JButton btnCliExc;
    private javax.swing.JButton btnCliImp;
    private javax.swing.JButton btnCliPes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOcorrencias;
    private javax.swing.JTextField txtCod;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtLoc;
    // End of variables declaration//GEN-END:variables

    private void cadastrar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        String sql = "INSERT INTO e3ocorrencia ( COD, DATA, LOCAL, DESCRICAO"
                + "(?,?,?,?)";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCod.getText());
            pst.setString(2, txtData.getText());
            pst.setString(3, txtLoc.getText());
            pst.setString(4, txtDesc.getText());
            System.out.println(pst);

            int resultado = pst.executeUpdate();

            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "Registro de ocorrência adicionada com sucesso!");
                txtCod.setText(null);
                txtData.setText(null);
                txtLoc.setText(null);
                txtDesc.setText(null);

            } else {
                JOptionPane.showMessageDialog(null, "Registro não adicionado!");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void pesquisar_ocorrencias() {
        // new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        String sql = "SELECT COD,LOCAL FROM e3ocorrencia WHERE LOCAL like ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtLoc.getText() + "%");
            rs = pst.executeQuery();
            tblOcorrencias.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
        }

    }

    private void buscar_dados_ocorrencias() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        int buscar = tblOcorrencias.getSelectedRow();
        txtCod.setText(tblOcorrencias.getModel().getValueAt(buscar, 0).toString());
        txtData.setText(tblOcorrencias.getModel().getValueAt(buscar, 1).toString());
        txtLoc.setText(tblOcorrencias.getModel().getValueAt(buscar, 2).toString());
        txtDesc.setText(tblOcorrencias.getModel().getValueAt(buscar, 3).toString());

    }

    private void pesquisar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        String sql = "SELECT * FROM e3ocorrencia WHERE COD = ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCod.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                txtLoc.setText(rs.getString("Local"));
                txtData.setText(rs.getString("Data"));
                txtDesc.setText(rs.getString("Descricao"));

            } else {
                JOptionPane.showMessageDialog(null, "Local não encontrado!");
                txtLoc.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void remover() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        String sql = "DELETE FROM e3ocorrencia WHERE COD=?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCod.getText());
            int apagado = pst.executeUpdate();

            if (apagado > 0) {
                JOptionPane.showMessageDialog(null, "Registro Excluído com sucesso!");
                txtCod.setText(null);
                txtLoc.setText(null);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void editar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        String sql = "UPDATE e3ocorrencia SET DATA=?, LOCAL=?, DESCRICAO=? WHERE COD = ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCod.getText());
            pst.setString(2, txtData.getText());
            pst.setString(3, txtLoc.getText());
            pst.setString(4, txtDesc.getText());
            System.out.println(pst);

            int resultado = pst.executeUpdate();

            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "Registro de ocorrência atualizada com sucesso!");
                txtCod.setText(null);
                txtData.setText(null);
                txtLoc.setText(null);
                txtData.setText(null);

            } else {
                JOptionPane.showMessageDialog(null, "Registro não atualizado!");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void relOcorrencia() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        int op = JOptionPane.showConfirmDialog(null, "Confirma impressão!", "relatório de ocorrências", JOptionPane.YES_NO_OPTION);

        if (op == JOptionPane.YES_OPTION) {
            try {
                String caminho = "C:/Rel/RelOcorrencias.jasper";
                JasperPrint print = JasperFillManager.fillReport(caminho, null, conexao);
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
}
