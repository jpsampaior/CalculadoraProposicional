package calculadoraLogica;

public class mainFrame extends javax.swing.JFrame {

    public mainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaInput = new javax.swing.JTextArea();
        txtaOutput = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnNot = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnAnd = new javax.swing.JButton();
        btnOr = new javax.swing.JButton();
        btnConditional = new javax.swing.JButton();
        btnBiConditional = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(560, 560));

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Calculadora Lógica");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Equação"));

        txtaInput.setEditable(false);
        txtaInput.setColumns(20);
        txtaInput.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtaInput.setRows(1);
        jScrollPane1.setViewportView(txtaInput);

        txtaOutput.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jTextArea2.setRows(1);
        txtaOutput.setViewportView(jTextArea2);

        btnNot.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnNot.setText("~");
        btnNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotActionPerformed(evt);
            }
        });

        btnP.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnP.setText("P");
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });

        btnQ.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnQ.setText("Q");
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });

        btnR.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnR.setText("R");
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });

        btnAnd.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnAnd.setText("^");
        btnAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndActionPerformed(evt);
            }
        });

        btnOr.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnOr.setText("v");
        btnOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrActionPerformed(evt);
            }
        });

        btnConditional.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnConditional.setText("->");
        btnConditional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConditionalActionPerformed(evt);
            }
        });

        btnBiConditional.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnBiConditional.setText("<->");
        btnBiConditional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiConditionalActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setToolTipText("");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnLeft.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnLeft.setText("(");
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnDel.setText("Del");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnRight.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnRight.setText(")");
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });

        btnCalculate.setText("Calcular");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNot, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAnd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOr, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConditional, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBiConditional, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOr, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConditional, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBiConditional, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtaOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtaOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 461, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        if (last != "P" && last != "Q" && last != "R" && last != ")") {
            txtaInput.append("P");
            last = "P";
        }
    }//GEN-LAST:event_btnPActionPerformed

    private void btnNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotActionPerformed
        if (last != "P" && last != "Q" && last != "R" && last != "~" && last != ")") {
            txtaInput.append("~");
            last = "~";
        }
    }//GEN-LAST:event_btnNotActionPerformed

    private void btnAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndActionPerformed
        if (last != "^" && last != "~" && last != "<->" && last != "->" && last != "v" && last != "(") {
            txtaInput.append("^");
            last = "^";
        }
    }//GEN-LAST:event_btnAndActionPerformed

    private void btnBiConditionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiConditionalActionPerformed
        if (last != "^" && last != "~" && last != "<->" && last != "->" && last != "v" && last != "(") {
            txtaInput.append("<->");
            last = "<->";
        }
    }//GEN-LAST:event_btnBiConditionalActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtaInput.setText("");
        last = "";
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        if (last != "P" && last != "Q" && last != "R" && last != "(" && last != ")") {
            txtaInput.append("(");
            last = "(";
        }
    }//GEN-LAST:event_btnLeftActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        String teste = txtaInput.getText();
        teste = teste.substring(0, teste.length() - 1);
        last = teste.substring(teste.length() - 1, teste.length());
        txtaInput.setText(teste);
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        if (last != "P" && last != "Q" && last != "R" && last != ")") {
            txtaInput.append("Q");
            last = "Q";
        }
    }//GEN-LAST:event_btnQActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        if (last != "P" && last != "Q" && last != "R" && last != ")") {
            txtaInput.append("R");
            last = "R";
        }
    }//GEN-LAST:event_btnRActionPerformed

    private void btnOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrActionPerformed
        if (last != "^" && last != "~" && last != "<->" && last != "->" && last != "v" && last != "(") {
            txtaInput.append("v");
            last = "v";
        }
    }//GEN-LAST:event_btnOrActionPerformed

    private void btnConditionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConditionalActionPerformed
        if (last != "^" && last != "~" && last != "<->" && last != "->" && last != "v" && last != "(") {
            txtaInput.append("->");
            last = "->";
        }
    }//GEN-LAST:event_btnConditionalActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        if (last != "P" && last != "Q" && last != "R" && last != "(" && last != ")") {
            txtaInput.append(")");
            last = ")";
        }
    }//GEN-LAST:event_btnRightActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }
    private String last = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnd;
    private javax.swing.JButton btnBiConditional;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConditional;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnNot;
    private javax.swing.JButton btnOr;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnRight;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtaInput;
    private javax.swing.JScrollPane txtaOutput;
    // End of variables declaration//GEN-END:variables

}
