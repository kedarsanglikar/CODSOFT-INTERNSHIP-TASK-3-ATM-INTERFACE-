/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm.pkginterface;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
abstract class ATM {

    public abstract void withdraw(float amount);

    public abstract void deposit(float amount);

    public abstract void checkBalance();
}

class BankAccount extends ATM {

    private float balance;

    public float setter(float bal) {
        balance = bal;
        return balance;
    }

    @Override
    public void withdraw(float amount) {
        if (amount <= balance) {
            System.out.println("Withdrawl Successful! Wait for the cash.....");
            JOptionPane.showMessageDialog(null, "Withdrawl Successful! Wait for the cash.....", "ATM Machine", JOptionPane.INFORMATION_MESSAGE);
            balance = balance - amount;
        }
        else if (amount > balance) {
            System.out.println("Insufficient Funds");
            JOptionPane.showMessageDialog(null, "Insufficient Funds", "ATM Machine", JOptionPane.ERROR_MESSAGE);

        }
    }

    @Override
    public void deposit(float amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully!");
        JOptionPane.showMessageDialog(null, "Amount deposited successfully!", "ATM Machine", JOptionPane.INFORMATION_MESSAGE);

    }

    @Override
    public void checkBalance() {
        System.out.println("Available balance : " + balance);
        JOptionPane.showMessageDialog(null, "Available balance : " + balance, "ATM Machine", JOptionPane.INFORMATION_MESSAGE);

    }

}

public class ATMTransactions extends javax.swing.JFrame {

    /**
     * Creates new form ATMTransactions
     */
    public static String stringInput;
    public static float floatInput;
    public static float initialBalance = 6000;
    BankAccount acc;

    public ATMTransactions() {
        initComponents();
        acc = new BankAccount();
        acc.setter(initialBalance);
        jComboBox2.setBackground(new java.awt.Color(0, 0, 0, 1));
        jButton1.setBackground(new java.awt.Color(0, 0, 0, 1));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ATM Transactions");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 975, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Transaction", "Withdraw", "Deposit", "Check Balance", " " }));
        jComboBox2.setBorder(null);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 230, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PROCEED");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 230, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/pkginterface/bank.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 980, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jComboBox2.getSelectedItem() == "Withdraw") {

            stringInput = JOptionPane.showInputDialog("Enter amount to withdraw : ");
            floatInput = Float.parseFloat(stringInput);

//            BankAccount acc=new BankAccount();
            System.out.println(acc.setter(initialBalance));
            acc.withdraw(floatInput);

        }
        if (jComboBox2.getSelectedItem() == "Deposit") {
            stringInput = JOptionPane.showInputDialog("Enter amount to deposit : ");
            floatInput = Float.parseFloat(stringInput);
//            BankAccount acc=new BankAccount();
            acc.deposit(floatInput);
        }
        if (jComboBox2.getSelectedItem() == "Check Balance") {
//             BankAccount acc=new BankAccount();
            acc.checkBalance();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ATMTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMTransactions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
