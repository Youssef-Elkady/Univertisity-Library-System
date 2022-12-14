package frontend;

public class LibrarySystem extends javax.swing.JFrame implements Node {

    /**
     * Creates new form LibrarySystem
     */
    private Node parent;
    
    public LibrarySystem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminRoleButton = new javax.swing.JButton();
        LibrarianRoleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library System");
        setResizable(false);

        AdminRoleButton.setBackground(new java.awt.Color(0, 0, 0));
        AdminRoleButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AdminRoleButton.setForeground(new java.awt.Color(255, 255, 255));
        AdminRoleButton.setText("Admin Role");
        AdminRoleButton.setName(""); // NOI18N
        AdminRoleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminRoleButtonActionPerformed(evt);
            }
        });

        LibrarianRoleButton.setBackground(new java.awt.Color(0, 0, 0));
        LibrarianRoleButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LibrarianRoleButton.setForeground(new java.awt.Color(255, 255, 255));
        LibrarianRoleButton.setText("Librarian Role");
        LibrarianRoleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibrarianRoleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LibrarianRoleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminRoleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(AdminRoleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(LibrarianRoleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public Node getParentNode() {
        return parent;
    }

    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }

    private void AdminRoleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminRoleButtonActionPerformed
        // TODO add your handling code here:
        AdminLogin a = new AdminLogin();
        a.setVisible(true);
        a.setParentNode(this);
        this.setVisible(false);
    }//GEN-LAST:event_AdminRoleButtonActionPerformed

    private void LibrarianRoleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibrarianRoleButtonActionPerformed
        // TODO add your handling code here:
        LibrarianLogin l = new LibrarianLogin();
        l.setVisible(true);
        l.setParentNode(this);
        this.setVisible(false);
    }//GEN-LAST:event_LibrarianRoleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarySystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminRoleButton;
    private javax.swing.JButton LibrarianRoleButton;
    // End of variables declaration//GEN-END:variables
}
