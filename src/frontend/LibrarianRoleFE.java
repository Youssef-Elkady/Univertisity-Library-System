/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.LibrarianRole;
import javax.swing.JFrame;

/**
 *
 * @author taver
 */
public class LibrarianRoleFE extends javax.swing.JFrame implements Node {

    /**
     * Creates new form LibrarianRole
     */
    public LibrarianRoleFE() {
        initComponents();
    }

    private Node parent;

    @Override
    public Node getParentNode() {
        return parent;
    }

    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewBorrowedBooks = new javax.swing.JButton();
        BorrowBook = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        ReturnBook = new javax.swing.JButton();
        AddBook = new javax.swing.JButton();
        ViewBooks = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Librarian Role");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        ViewBorrowedBooks.setBackground(new java.awt.Color(0, 0, 0));
        ViewBorrowedBooks.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ViewBorrowedBooks.setForeground(new java.awt.Color(255, 255, 255));
        ViewBorrowedBooks.setText("View Borrowed Books");
        ViewBorrowedBooks.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ViewBorrowedBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBorrowedBooksActionPerformed(evt);
            }
        });

        BorrowBook.setBackground(new java.awt.Color(0, 0, 0));
        BorrowBook.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BorrowBook.setForeground(new java.awt.Color(255, 255, 255));
        BorrowBook.setText("Borrow Book");
        BorrowBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BorrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowBookActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(0, 0, 0));
        Logout.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        ReturnBook.setBackground(new java.awt.Color(0, 0, 0));
        ReturnBook.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ReturnBook.setForeground(new java.awt.Color(255, 255, 255));
        ReturnBook.setText("Return Book");
        ReturnBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBookActionPerformed(evt);
            }
        });

        AddBook.setBackground(new java.awt.Color(0, 0, 0));
        AddBook.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddBook.setForeground(new java.awt.Color(255, 255, 255));
        AddBook.setText("Add Book");
        AddBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookActionPerformed(evt);
            }
        });

        ViewBooks.setBackground(new java.awt.Color(0, 0, 0));
        ViewBooks.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ViewBooks.setForeground(new java.awt.Color(255, 255, 255));
        ViewBooks.setText("View Books");
        ViewBooks.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBooksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ViewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewBorrowedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BorrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewBorrowedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosing

    private void ViewBorrowedBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBorrowedBooksActionPerformed
        ViewBorrowedBooks vBB = new ViewBorrowedBooks();
        vBB.setParentNode(this);
        vBB.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewBorrowedBooksActionPerformed

    private void BorrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowBookActionPerformed
        // TODO add your handling code here:
            BorrowBook b1 = new BorrowBook();
            this.setVisible(false);
            b1.setParentNode(this);
            b1.setVisible(true);
    }//GEN-LAST:event_BorrowBookActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        LibrarianRole librarian = new LibrarianRole();
        librarian.logout();       //for saving
        this.setVisible(false);
        LibrarySystem ls = new LibrarySystem();
        ls.setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void ReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBookActionPerformed
        // TODO add your handling code here:
            ReturnBook b1 = new ReturnBook();
            this.setVisible(false);
            b1.setParentNode(this);
            b1.setVisible(true);
    }//GEN-LAST:event_ReturnBookActionPerformed

    private void AddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookActionPerformed
        // TODO add your handling code here:
        AddBook aB = new AddBook();
        aB.setParentNode(this);
        aB.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddBookActionPerformed

    private void ViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBooksActionPerformed
        // TODO add your handling code here:
        ViewBooks vB = new ViewBooks();
        vB.setParentNode(this);
        vB.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewBooksActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LibrarianRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LibrarianRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LibrarianRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LibrarianRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LibrarianRole().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBook;
    private javax.swing.JButton BorrowBook;
    private javax.swing.JButton Logout;
    private javax.swing.JButton ReturnBook;
    private javax.swing.JButton ViewBooks;
    private javax.swing.JButton ViewBorrowedBooks;
    // End of variables declaration//GEN-END:variables
}