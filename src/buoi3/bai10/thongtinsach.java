/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS TUF
 */
public class thongtinsach extends javax.swing.JFrame {

    /**
     * Creates new form thongtinsach
     */
    ArrayList<String> dsArrayList = new ArrayList<>();
    String mess = "";

    public thongtinsach() {
        initComponents();
        this.setLocationRelativeTo(this);
        lbloitensach.setText(" ");
        lbloitentg.setText(" ");
        lbthongbaoid.setText(" ");
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttacgia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttensach = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnthemsach = new javax.swing.JButton();
        btnnhaplai = new javax.swing.JButton();
        lbthongbaoid = new javax.swing.JLabel();
        lbloitentg = new javax.swing.JLabel();
        lbloitensach = new javax.swing.JLabel();
        cbloai = new javax.swing.JComboBox<>();
        btndoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thông Tin Sách");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel1.setText("ID:");

        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });

        jLabel3.setText("Tên Tác Giả:");

        txttacgia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttacgiaFocusLost(evt);
            }
        });

        jLabel4.setText("Tên Sách:");

        txttensach.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttensachFocusLost(evt);
            }
        });

        jLabel5.setText("Loại:");

        btnthemsach.setText("Thêm Sách");
        btnthemsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemsachActionPerformed(evt);
            }
        });

        btnnhaplai.setText("Nhập Lại");
        btnnhaplai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhaplaiActionPerformed(evt);
            }
        });

        lbthongbaoid.setForeground(new java.awt.Color(255, 51, 51));

        lbloitentg.setForeground(new java.awt.Color(255, 51, 51));

        lbloitensach.setForeground(new java.awt.Color(255, 102, 102));

        cbloai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KHXH", "KHTN", "luận văn" }));

        btndoc.setText("Đọc");
        btndoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbloitensach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbthongbaoid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txttensach, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtID)
                    .addComponent(txttacgia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbloitentg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbloai, 0, 131, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnthemsach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btndoc)
                .addGap(39, 39, 39)
                .addComponent(btnnhaplai)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(lbthongbaoid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbloitentg)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(lbloitensach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthemsach)
                    .addComponent(btnnhaplai)
                    .addComponent(btndoc))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean kiemtra() {
        if (txtID.getText().isEmpty() || txttacgia.getText().isEmpty() || txttensach.getText().isEmpty()) {
            mess += "Các trường không được để trống";
            return false;
        }
        if (txtID.getText().isEmpty() == false) {
            boolean kitu = true;
            String kiemtra = "\\w+";
            String id = txtID.getText();
            kitu = id.matches(kiemtra);
            if (kitu == false) {
                mess += "lỗi kí tự";
                return false;
            }
            if(kitu==true){
             boolean trung=true;
             quanli t=new quanli(id,"","","");
             trung=t.loitrungid();
             if(trung==false){
                 mess+="ID này đã tồn tại";
                 return false;
             }
             
         }
        }
        if (txttacgia.getText().isEmpty() == false) {
            String tacgia = txttacgia.getText();
            int kiemtra = 0;
            int i = 0;
            for (i = 0; i < tacgia.length(); i++) {
                char ch = tacgia.charAt(i);
                if ((ch >= 'A' && ch <= 'Z') || ch == ' ' || (ch >= 'a' && ch <= 'z')
                        || ch == 'ă' || ch == 'ằ'
                        || ch == 'ắ' || ch == 'ặ' || ch == 'â' || ch == 'ầ' || ch == 'ậ' || ch == 'ấ'
                        || ch == 'đ' || ch == 'ê' || ch == 'ệ' || ch == 'ề' || ch == 'ế'
                        || ch == 'ô' || ch == 'ồ' || ch == 'ố' || ch == 'ộ'
                        || ch == 'ơ' || ch == 'ờ' || ch == 'ớ' || ch == 'ợ'
                        || ch == 'ư' || ch == 'ừ' || ch == 'ứ' || ch == 'ự' || ch == 'ạ' || ch == 'ã' || ch == 'à' || ch == 'á') {
                } else {
                    mess += "định dạng sai";
                    kiemtra++;
                    break;
                }
            }
            if (kiemtra > 0) {
                return false;
            }
            if (i <= 5) {
                mess += "yêu cầu nhập đủ họ tên";
                return false;
            }
            if (txttensach.getText().isEmpty() == false) {
               String loi=lbloitensach.getText();
               if(loi.equals(" ")){
                   return true;
               }
               else{
                   mess+="lỗi định dạng";
                   return false;
               }
            }
        }
        return true;
    }
    private void btnthemsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemsachActionPerformed
        boolean hople = true;
         String ID = txtID.getText();
            String tentg = txttacgia.getText();
            String tensach = txttensach.getText();
            String loai = cbloai.getSelectedItem().toString();
        hople = kiemtra();
        if (hople) {
            quanli t = new quanli(ID, tentg, tensach, loai);
            t.luufile();
        } else {
            JOptionPane.showMessageDialog(this, mess);
            mess = "";
        }
    }//GEN-LAST:event_btnthemsachActionPerformed

    private void btnnhaplaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhaplaiActionPerformed
        txtID.setText("");
        txttacgia.setText("");
        txttensach.setText("");
        cbloai.setSelectedIndex(0);
    }//GEN-LAST:event_btnnhaplaiActionPerformed

    private void btndocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndocActionPerformed
        table t = new table();
        t.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btndocActionPerformed

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        if (txtID.getText().isEmpty() == false) {
            boolean kitu = true;
            String kiemtra = "\\w+";
            String id = txtID.getText();
            kitu = id.matches(kiemtra);
            if (kitu == false) {
                lbthongbaoid.setText("viết liền,không kí tự");
            } else {
                lbthongbaoid.setText(" ");
            }
         if(kitu==true){
             boolean trung=true;
             quanli t=new quanli(id,"","","");
             trung=t.loitrungid();
             if(trung==false){
                 lbthongbaoid.setText("ID này đã tồn tại");
             }
             else{
                 lbthongbaoid.setText(" ");
             }
         }
        }
    }//GEN-LAST:event_txtIDFocusLost

    private void txttacgiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttacgiaFocusLost
        if (txttacgia.getText().isEmpty() == false) {
            String tacgia = txttacgia.getText();
            int i = 0;
            for (i = 0; i < tacgia.length(); i++) {
                char ch = tacgia.charAt(i);
                if ((ch >= 'A' && ch <= 'Z') || ch == ' ' || (ch >= 'a' && ch <= 'z')
                        || ch == 'ă' || ch == 'ằ'
                        || ch == 'ắ' || ch == 'ặ' || ch == 'â' || ch == 'ầ' || ch == 'ậ' || ch == 'ấ'
                        || ch == 'đ' || ch == 'ê' || ch == 'ệ' || ch == 'ề' || ch == 'ế'
                        || ch == 'ô' || ch == 'ồ' || ch == 'ố' || ch == 'ộ'
                        || ch == 'ơ' || ch == 'ờ' || ch == 'ớ' || ch == 'ợ'
                        || ch == 'ư' || ch == 'ừ' || ch == 'ứ' || ch == 'ự' || ch == 'ạ' || ch == 'ã' || ch == 'à' || ch == 'á') {
                    lbloitentg.setText(" ");
                } else {
                    lbloitentg.setText("không kí tự,số");
                }
            }
        }
    }//GEN-LAST:event_txttacgiaFocusLost

    private void txttensachFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttensachFocusLost
        if (txttensach.getText().isEmpty() == false) {
            String tensach = txttensach.getText();
            int j = 0;
            for (j = 0; j < tensach.length(); j++) {
                char ch = tensach.charAt(j);
                if ((ch >= 'A' && ch <= 'Z') || ch == ' ' || (ch >= 'a' && ch <= 'z')
                        || ch == 'ă' || ch == 'ằ'
                        || ch == 'ắ' || ch == 'ặ' || ch == 'â' || ch == 'ầ' || ch == 'ậ' || ch == 'ấ'
                        || ch == 'đ' || ch == 'ê' || ch == 'ệ' || ch == 'ề' || ch == 'ế'
                        || ch == 'ô' || ch == 'ồ' || ch == 'ố' || ch == 'ộ'
                        || ch == 'ơ' || ch == 'ờ' || ch == 'ớ' || ch == 'ợ'
                        || ch == 'ư' || ch == 'ừ' || ch == 'ứ' || ch == 'ự' || ch == 'ạ' || ch == 'ã' || ch == 'à' || ch == 'á') {

                    lbloitensach.setText(" ");
                } else {
                    lbloitensach.setText("không kí tự,số");
                }
            }
        }
    }//GEN-LAST:event_txttensachFocusLost

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
            java.util.logging.Logger.getLogger(thongtinsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(thongtinsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(thongtinsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(thongtinsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new thongtinsach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndoc;
    private javax.swing.JButton btnnhaplai;
    private javax.swing.JButton btnthemsach;
    private javax.swing.JComboBox<String> cbloai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbloitensach;
    private javax.swing.JLabel lbloitentg;
    private javax.swing.JLabel lbthongbaoid;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txttacgia;
    private javax.swing.JTextField txttensach;
    // End of variables declaration//GEN-END:variables
}