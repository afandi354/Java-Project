/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * fMatakuliah.java
 *
 * Created on 11 Jun 13, 18:00:07
 */

package FACE;

import DB.Database;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Btrans
 */
public class fMatakuliah extends javax.swing.JDialog {

    /** Creates new form fMatakuliah */
    public fMatakuliah(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Kelola Data Matakuliah");
        // tombol
        ftombol(true, false, false, false, false, true);
        // bersih
        fbersihText();
        // matikan kolom
        fkolom(false);
        // fokus ke tambah
        cmdTambah.requestFocus();
        // tampil data
        tampilData();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtSKS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmdTambah = new javax.swing.JButton();
        cmdUbah = new javax.swing.JButton();
        cmdSimpan = new javax.swing.JButton();
        cmdBatal = new javax.swing.JButton();
        cmdHapus = new javax.swing.JButton();
        cmdTutup = new javax.swing.JButton();
        cmdCari = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        lblJumlah = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail Data Matakuliah", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Kode MK");

        txtKode.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtKode.setForeground(new java.awt.Color(102, 102, 102));
        txtKode.setText("jTextField1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Matakuliah");

        txtNama.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtNama.setForeground(new java.awt.Color(102, 102, 102));
        txtNama.setText("jTextField1");

        txtSKS.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtSKS.setForeground(new java.awt.Color(102, 102, 102));
        txtSKS.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtSKS.setText("jTextField1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Jumlah SKS");

        cmdTambah.setFont(new java.awt.Font("Tahoma", 1, 10));
        cmdTambah.setForeground(new java.awt.Color(102, 102, 102));
        cmdTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESS/bg-add.png"))); // NOI18N
        cmdTambah.setText("Tambah");
        cmdTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTambahActionPerformed(evt);
            }
        });

        cmdUbah.setFont(new java.awt.Font("Tahoma", 1, 10));
        cmdUbah.setForeground(new java.awt.Color(102, 102, 102));
        cmdUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESS/edit-pen.png"))); // NOI18N
        cmdUbah.setText("Ubah");
        cmdUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUbahActionPerformed(evt);
            }
        });

        cmdSimpan.setFont(new java.awt.Font("Tahoma", 1, 10));
        cmdSimpan.setForeground(new java.awt.Color(102, 102, 102));
        cmdSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESS/bg-drive-orange.png"))); // NOI18N
        cmdSimpan.setText("Simpan");
        cmdSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSimpanActionPerformed(evt);
            }
        });

        cmdBatal.setFont(new java.awt.Font("Tahoma", 1, 10));
        cmdBatal.setForeground(new java.awt.Color(102, 102, 102));
        cmdBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESS/segarkan.png"))); // NOI18N
        cmdBatal.setText("Batal");
        cmdBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBatalActionPerformed(evt);
            }
        });

        cmdHapus.setFont(new java.awt.Font("Tahoma", 1, 10));
        cmdHapus.setForeground(new java.awt.Color(102, 102, 102));
        cmdHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESS/trash.png"))); // NOI18N
        cmdHapus.setText("Hapus");
        cmdHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdHapusActionPerformed(evt);
            }
        });

        cmdTutup.setFont(new java.awt.Font("Tahoma", 1, 10));
        cmdTutup.setForeground(new java.awt.Color(102, 102, 102));
        cmdTutup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESS/Button-Turn-Off-icon.png"))); // NOI18N
        cmdTutup.setText("Tutup");
        cmdTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTutupActionPerformed(evt);
            }
        });

        cmdCari.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cmdCari.setForeground(new java.awt.Color(102, 102, 102));
        cmdCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESS/button-search.png"))); // NOI18N
        cmdCari.setText("Cari");
        cmdCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdCari))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSKS, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cmdTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdSimpan)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdBatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(cmdTutup)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdCari, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSKS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmdHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Data Matakuliah", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelData);

        lblJumlah.setBackground(new java.awt.Color(204, 255, 255));
        lblJumlah.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblJumlah.setForeground(new java.awt.Color(102, 102, 102));
        lblJumlah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJumlah.setText("[ Jumlah Data : 2 ]");
        lblJumlah.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTutupActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cmdTutupActionPerformed

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        // TODO add your handling code here:
        int baris = tabelData.getSelectedRow();

        if(evt.getClickCount()>0){
            try{
                ftombol(true, true, false, false, true, true);
                fkolom(false);
                dbku.bukaKoneksi();
                dbku.perintah.executeQuery("SELECT * FROM matakuliah WHERE mk_id='"+tabelData.getValueAt(baris, 1).toString()+"'");
                dbku.hasil = dbku.perintah.getResultSet();
                dbku.hasil.last();
                txtKode.setText(dbku.hasil.getString("mk_id"));
                txtNama.setText(dbku.hasil.getString("mk_nama"));
                txtSKS.setText(dbku.hasil.getString("mk_sks"));
                dbku.tutupKoneksi();
            }
            catch(Exception e){JOptionPane.showMessageDialog(rootPane, e.getMessage());}
        }
    }//GEN-LAST:event_tabelDataMouseClicked

    private void cmdTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTambahActionPerformed
        // TODO add your handling code here:
        // bersihkan kolom
        fbersihText();
        // atur tombol
        ftombol(false, false, true, true, false, false);
        // aktifkan kolom
        fkolom(true);
        // fokuskan kursor
        txtKode.requestFocus();
    }//GEN-LAST:event_cmdTambahActionPerformed

    private void cmdUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUbahActionPerformed
        // TODO add your handling code here:
        // atur tombol
        ftombol(false, false, true, true, false, false);
        // aktifkan kolom
        fkolom(true);
        // fokuskan kursor
        txtNama.requestFocus();
        // matikan kolom nim
        txtKode.setEditable(false);
    }//GEN-LAST:event_cmdUbahActionPerformed

    private void cmdBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBatalActionPerformed
        // TODO add your handling code here:
         // atur tombol
        ftombol(true, false, false, false, false, true);
        // matikan kolom
        fkolom(false);
        // bersihkan kolom
        fbersihText();
        // fokuskan ke tombol tambah
        cmdTambah.requestFocus();
    }//GEN-LAST:event_cmdBatalActionPerformed

    private void cmdHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHapusActionPerformed
        // TODO add your handling code here:
        // ambil baris
        int baris = tabelData.getSelectedRow();
        try{
            if(JOptionPane.showConfirmDialog(rootPane, "Hapus data Matakuliah dengan Kode "+tabelData.getValueAt(baris, 1)+" ?","Hapus", JOptionPane.YES_NO_OPTION)==0){
                dbku.bukaKoneksi();
                dbku.perintah.execute("DELETE FROM matakuliah WHERE mk_id='"+tabelData.getValueAt(baris, 1)+"'");
                dbku.tutupKoneksi();
                JOptionPane.showMessageDialog(rootPane, "Data berhasil dihapus !","Hapus",JOptionPane.INFORMATION_MESSAGE);
                // bersih
                fbersihText();
                // atur tombol
                ftombol(true, false, false, false, false, true);
                // fokuskan ke tambah
                cmdTambah.requestFocus();
                tampilData();
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_cmdHapusActionPerformed

    private void cmdSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSimpanActionPerformed
        // TODO add your handling code here:
        // cek kolom
        if(txtKode.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Kode belum terisi, silakan periksa kembali !","Simpan",JOptionPane.WARNING_MESSAGE);
            txtKode.requestFocus();
        }
        else if(txtNama.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Matakuliah belum terisi, silakan periksa kembali !","Simpan",JOptionPane.WARNING_MESSAGE);
            txtNama.requestFocus();
        }
        else if(txtSKS.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Jumlah SKS belum terisi, silakan periksa kembali !","Simpan",JOptionPane.WARNING_MESSAGE);
            txtSKS.requestFocus();
        }
        else
        {
            // cek mode
            try{
                if(txtKode.isEditable()==true){ // tambah baru
                    dbku.bukaKoneksi();
                    dbku.perintah.executeQuery("SELECT * FROM matakuliah WHERE mk_id='"+txtKode.getText()+"'");
                    dbku.hasil = dbku.perintah.getResultSet();
                    dbku.hasil.last();
                    if(dbku.hasil.getRow()>0){
                        JOptionPane.showMessageDialog(rootPane, "Matakuliah dengan Kode "+txtKode.getText()+" sudah ada !","Simpan",JOptionPane.WARNING_MESSAGE);
                        txtKode.requestFocus();
                    }
                    else
                    {
                        // simpan
                        dbku.perintah.execute("INSERT INTO matakuliah SET " +
                                "mk_id='"+txtKode.getText()+"', " +
                                "mk_nama='"+txtNama.getText()+"', " +
                                "mk_sks="+txtSKS.getText()+"");
                        JOptionPane.showMessageDialog(rootPane, "Data berhasil disimpan !","Simpan",JOptionPane.INFORMATION_MESSAGE);
                        // bersih
                        fbersihText();
                        // fokus ke nim
                        txtKode.requestFocus();
                        // tampil data
                        tampilData();
                    }
                    dbku.tutupKoneksi();
                }
                else{ // ubah data
                    dbku.bukaKoneksi();
                    dbku.perintah.execute("UPDATE matakuliah SET " +
                                "mk_nama='"+txtNama.getText()+"', " +
                                "mk_sks='"+txtSKS.getText()+"'" +
                                "WHERE mk_id='"+txtKode.getText()+"'");
                    JOptionPane.showMessageDialog(rootPane, "Data berhasil disimpan !","Simpan",JOptionPane.INFORMATION_MESSAGE);
                    // kunci isian
                    fkolom(false);
                    // tombol
                    ftombol(true, true, false, false, true, true);
                    // tampil tabel
                    tampilData();
                    dbku.tutupKoneksi();
                }
            }
            catch(Exception e){JOptionPane.showMessageDialog(rootPane, e.getMessage());}
        }
    }//GEN-LAST:event_cmdSimpanActionPerformed

    private void cmdCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCariActionPerformed
        String cariNim = JOptionPane.showInputDialog(this, "Masukkan kode matakuliah yang ingin dicari : ", "Kotak Pencarian", JOptionPane.QUESTION_MESSAGE);
        String[] kolom = {"No","Kode","Matakuliah","SKS"};
        int[] lebar = {40,120,400,60};
        Object[][] data = null;
        int nomor=0, baris=0, jbaris=0;
        try{
            dbku.bukaKoneksi();
            dbku.perintah.executeQuery("SELECT * FROM matakuliah WHERE mk_id='"+cariNim+"'");
            dbku.hasil = dbku.perintah.getResultSet();
            dbku.hasil.last();
            jbaris = dbku.hasil.getRow();
            data = new Object[jbaris][4];
            dbku.hasil.beforeFirst();
            while(dbku.hasil.next()){
                data[nomor][0] = nomor+1;
                data[nomor][1] = dbku.hasil.getString("mk_id");
                data[nomor][2] = dbku.hasil.getString("mk_nama");
                data[nomor][3] = dbku.hasil.getString("mk_sks");
                nomor+=1;
            }
            dbku.tutupKoneksi();
            tabelData.setModel(new DefaultTableModel(data, kolom));
            tabelData.setRowHeight(20);
            for(baris=0; baris<kolom.length; baris++){
                tabelData.getColumnModel().getColumn(baris).setPreferredWidth(lebar[baris]);
            }
            tabelData.setVisible(true);
            tabelData.setAutoResizeMode(tabelData.AUTO_RESIZE_OFF);
            jScrollPane1.setViewportView(this.tabelData);
            lblJumlah.setText("[ Jumlah data : "+jbaris+" ]");

            if(jbaris>0){
                JOptionPane.showMessageDialog(rootPane, "Data ditemukan !","Pencarian",JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(rootPane, "Data tidak ditemukan !","Pencarian",JOptionPane.ERROR_MESSAGE);
                tampilData();
            }

        } catch(Exception e){JOptionPane.showMessageDialog(this, e.getMessage());}
}//GEN-LAST:event_cmdCariActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                fMatakuliah dialog = new fMatakuliah(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void fbersihText(){
        txtKode.setText(null);
        txtNama.setText(null);
        txtSKS.setText("1");
    }

    private void ftombol(boolean t, boolean u, boolean s, boolean b, boolean h, boolean tu){
        cmdTambah.setEnabled(t);
        cmdUbah.setEnabled(u);
        cmdSimpan.setEnabled(s);
        cmdBatal.setEnabled(b);
        cmdHapus.setEnabled(h);
        cmdTutup.setEnabled(tu);
    }

    private void fkolom(boolean aktif){
        txtKode.setEditable(aktif);
        txtNama.setEditable(aktif);
        txtSKS.setEditable(aktif);
    }

    private void tampilData(){
        String[] kolom = {"No","Kode","Matakuliah","SKS"};
        int[] lebar = {40,120,400,60};
        Object[][] data = null;
        int nomor=0, baris=0, jbaris=0;
        try{
            dbku.bukaKoneksi();
            dbku.perintah.executeQuery("SELECT * FROM matakuliah ORDER BY mk_id DESC");
            dbku.hasil = dbku.perintah.getResultSet();
            dbku.hasil.last();
            jbaris = dbku.hasil.getRow();
            data = new Object[jbaris][4];
            dbku.hasil.beforeFirst();
            while(dbku.hasil.next()){
                data[nomor][0] = nomor+1;
                data[nomor][1] = dbku.hasil.getString("mk_id");
                data[nomor][2] = dbku.hasil.getString("mk_nama");
                data[nomor][3] = dbku.hasil.getString("mk_sks");
                nomor+=1;
            }
            dbku.tutupKoneksi();
            tabelData.setModel(new DefaultTableModel(data, kolom));
            tabelData.setRowHeight(20);
            for(baris=0; baris<kolom.length; baris++){
                tabelData.getColumnModel().getColumn(baris).setPreferredWidth(lebar[baris]);
            }
            tabelData.setVisible(true);
            tabelData.setAutoResizeMode(tabelData.AUTO_RESIZE_OFF);
            jScrollPane1.setViewportView(this.tabelData);
            lblJumlah.setText("[ Jumlah data : "+jbaris+" ]");
        }
        catch(SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
        catch(Exception e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }

    private Database dbku = new Database();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBatal;
    private javax.swing.JButton cmdCari;
    private javax.swing.JButton cmdHapus;
    private javax.swing.JButton cmdSimpan;
    private javax.swing.JButton cmdTambah;
    private javax.swing.JButton cmdTutup;
    private javax.swing.JButton cmdUbah;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJumlah;
    private javax.swing.JTable tabelData;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSKS;
    // End of variables declaration//GEN-END:variables

}
