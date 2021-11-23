/*
 * formMahasiswa.java
 *
 * Created on 05 Jun 13, 20:45:45
 */

package FACE;

import DB.Database;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Btrans
 */
public class formMahasiswa extends javax.swing.JDialog {

    /** Creates new form formMahasiswa */
    public formMahasiswa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tampilData();
        // isi combobox gender
        fisiComboBox();
        // tombol
        ftombol(true, false, false, false, false, true);
        // bersih
        fbersihText();
        // matikan kolom
        fkolom(false);
        // fokus ke tambah
        cmdTambah.requestFocus();
        
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
        jLabel1 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGender = new javax.swing.JComboBox();
        txtAgama = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        cmdTambah = new javax.swing.JButton();
        cmdUbah = new javax.swing.JButton();
        cmdSimpan = new javax.swing.JButton();
        cmdBatal = new javax.swing.JButton();
        cmdHapus = new javax.swing.JButton();
        cmdTutup = new javax.swing.JButton();
        txtTgl1 = new javax.swing.JTextField();
        cmdCari = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        lblJumlah = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail Mahasiswa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nomor Induk Mahasiswa");

        txtNim.setText("jTextField1");

        txtNama.setText("jTextField1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Lengkap");

        txtTL.setText("jTextField1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tempat dan Tanggal Lahir");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jenis Kelamin");

        txtGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtAgama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Agama");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat");

        txtAlamat.setText("jTextField1");

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

        txtTgl1.setText("jTextField1");

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
                        .addComponent(cmdTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdBatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(cmdTutup))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addComponent(txtTL, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTgl1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTgl1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdTambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(cmdUbah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(cmdSimpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(cmdBatal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmdHapus, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(cmdTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdCari, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Datal Mahasiswa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
            .addComponent(lblJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTutupActionPerformed
        dispose();
    }//GEN-LAST:event_cmdTutupActionPerformed

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        int baris = tabelData.getSelectedRow();
        
        if(evt.getClickCount()>0){
            try{
                ftombol(true, true, false, false, true, true);
                fkolom(false);
                dbku.bukaKoneksi();
                dbku.perintah.executeQuery("SELECT * FROM mahasiswa WHERE mhs_id='"+tabelData.getValueAt(baris, 1).toString()+"'");
                dbku.hasil = dbku.perintah.getResultSet();
                dbku.hasil.last();
                txtNim.setText(dbku.hasil.getString("mhs_id"));
                txtNama.setText(dbku.hasil.getString("mhs_nama"));
                txtTL.setText(dbku.hasil.getString("mhs_tempat_lahir"));
                txtTgl1.setText(dbku.hasil.getString("mhs_tanggal_lahir"));
                txtGender.setSelectedItem(dbku.hasil.getString("mhs_gender"));
                txtAgama.setSelectedItem(dbku.hasil.getString("mhs_agama"));
                txtAlamat.setText(dbku.hasil.getString("mhs_alamat"));
                dbku.tutupKoneksi();
            }
            catch(Exception e){JOptionPane.showMessageDialog(rootPane, e.getMessage());}
        }
    }//GEN-LAST:event_tabelDataMouseClicked

    private void cmdTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTambahActionPerformed
        // bersihkan kolom
        fbersihText();
        // atur tombol
        ftombol(false, false, true, true, false, false);
        // aktifkan kolom
        fkolom(true);
        // fokuskan kursor
        txtNim.requestFocus();
    }//GEN-LAST:event_cmdTambahActionPerformed

    private void cmdUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUbahActionPerformed

        // atur tombol
        ftombol(false, false, true, true, false, false);
        // aktifkan kolom
        fkolom(true);
        // fokuskan kursor
        txtNama.requestFocus();
        // matikan kolom nim
        txtNim.setEditable(false);
    }//GEN-LAST:event_cmdUbahActionPerformed

    private void cmdBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBatalActionPerformed

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
        // ambil baris
        int baris = tabelData.getSelectedRow();
        try{
            if(JOptionPane.showConfirmDialog(rootPane, "Hapus data mahasiswa dengan Nim "+tabelData.getValueAt(baris, 1)+" ?","Hapus", JOptionPane.YES_NO_OPTION)==0){
                dbku.bukaKoneksi();
                dbku.perintah.execute("DELETE FROM mahasiswa WHERE mhs_id='"+tabelData.getValueAt(baris, 1)+"'");
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
        // cek kolom
        if(txtNim.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Nim belum terisi, silakan periksa kembali !","Simpan",JOptionPane.WARNING_MESSAGE);
            txtNim.requestFocus();
        }
        else if(txtNama.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Nama Lengkap belum terisi, silakan periksa kembali !","Simpan",JOptionPane.WARNING_MESSAGE);
            txtNama.requestFocus();
        }
        else if(txtTL.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Tempat Lahir belum terisi, silakan periksa kembali !","Simpan",JOptionPane.WARNING_MESSAGE);
            txtTL.requestFocus();
        }
        else if(txtTL.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Tanggal Lahir belum terisi, silakan periksa kembali !","Simpan",JOptionPane.WARNING_MESSAGE);
            txtTgl1.requestFocus();
        }
        else if(txtAlamat.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Alamat belum terisi, silakan periksa kembali !","Simpan",JOptionPane.WARNING_MESSAGE);
            txtAlamat.requestFocus();
        }
        else
        {
            // cek mode
            try{
                if(txtNim.isEditable()==true){ // tambah baru
                    dbku.bukaKoneksi();
                    dbku.perintah.executeQuery("SELECT * FROM mahasiswa WHERE mhs_id='"+txtNim.getText()+"'");
                    dbku.hasil = dbku.perintah.getResultSet();
                    dbku.hasil.last();
                    if(dbku.hasil.getRow()>0){
                        JOptionPane.showMessageDialog(rootPane, "Mahasiswa dengan Nim "+txtNim.getText()+" sudah ada !","Simpan",JOptionPane.WARNING_MESSAGE);
                        txtNim.requestFocus();
                    }
                    else
                    {
                        // simpan
                        dbku.perintah.execute("INSERT INTO mahasiswa SET " +
                                "mhs_id='"+txtNim.getText()+"', " +
                                "mhs_nama='"+txtNama.getText()+"', " +
                                "mhs_tempat_lahir='"+txtTL.getText()+"', " +
                                "mhs_tanggal_lahir='"+txtTgl1.getText()+"', " +
                                "mhs_gender='"+txtGender.getSelectedItem()+"', " +
                                "mhs_agama='"+txtAgama.getSelectedItem()+"', " +
                                "mhs_alamat='"+txtAlamat.getText()+"'");
                        JOptionPane.showMessageDialog(rootPane, "Data berhasil disimpan !","Simpan",JOptionPane.INFORMATION_MESSAGE);
                        // bersih
                        fbersihText();
                        // fokus ke nim
                        txtNim.requestFocus();
                        // tampil data
                        tampilData();
                    }
                    dbku.tutupKoneksi();
                }
                else{ // ubah data
                    dbku.bukaKoneksi();
                    dbku.perintah.execute("UPDATE mahasiswa SET " +
                                "mhs_nama='"+txtNama.getText()+"', " +
                                "mhs_tempat_lahir='"+txtTL.getText()+"', " +
                                "mhs_tanggal_lahir='"+txtTgl1.getText()+"', " +
                                "mhs_gender='"+txtGender.getSelectedItem()+"', " +
                                "mhs_agama='"+txtAgama.getSelectedItem()+"', " +
                                "mhs_alamat='"+txtAlamat.getText()+"'" +
                                "WHERE mhs_id='"+txtNim.getText()+"'");
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
        String cariNim = JOptionPane.showInputDialog(this, "Masukkan nim yang ingin dicari : ", "Kotak Pencarian", JOptionPane.QUESTION_MESSAGE);
        String[] kolom = {"No","Nim","Nama Lengkap","Jenis Kelamin","Agama","Alamat"};
        int[] lebar = {40,120,200,100,120,260};
        Object[][] data = null;
        int nomor=0, baris=0, jbaris=0;
        try{
            dbku.bukaKoneksi();
            dbku.perintah.executeQuery("SELECT * FROM mahasiswa WHERE mhs_id='"+cariNim+"'");
            dbku.hasil = dbku.perintah.getResultSet();
            dbku.hasil.last();
            jbaris = dbku.hasil.getRow();
            data = new Object[jbaris][6];
            dbku.hasil.beforeFirst();
            while(dbku.hasil.next()){
                data[nomor][0] = nomor+1;
                data[nomor][1] = dbku.hasil.getString("mhs_id");
                data[nomor][2] = dbku.hasil.getString("mhs_nama");
                data[nomor][3] = dbku.hasil.getString("mhs_gender");
                data[nomor][4] = dbku.hasil.getString("mhs_agama");
                data[nomor][5] = dbku.hasil.getString("mhs_alamat");
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
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Data tidak ditemukan !","Pencarian",JOptionPane.ERROR_MESSAGE);
                tampilData();
            }
            
        }
        catch(SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
        catch(Exception e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_cmdCariActionPerformed

    
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formMahasiswa dialog = new formMahasiswa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void fisiComboBox(){
        String[] gender = {"Laki-laki","Perempuan"};
        String[] agama = {"Islam","Kristen","Hindu","Budha","Katolik"};
        txtAgama.setModel(new DefaultComboBoxModel(agama));
        txtGender.setModel(new DefaultComboBoxModel(gender));
        txtAgama.setSelectedIndex(0);
        txtGender.setSelectedIndex(0);
    }
    
    private void fbersihText(){
        txtNim.setText(null);
        txtNama.setText(null);
        txtTL.setText(null);
        txtTgl1.setText(null);
        txtGender.setSelectedIndex(0);
        txtAgama.setSelectedIndex(0);
        txtAlamat.setText(null);
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
        txtNim.setEditable(aktif);
        txtNama.setEditable(aktif);
        txtTL.setEditable(aktif);
        txtTgl1.setEnabled(aktif);
        txtGender.setEnabled(aktif);
        txtAgama.setEnabled(aktif);
        txtAlamat.setEditable(aktif);
    }

    private void tampilData(){
        String[] kolom = {"No","Nim","Nama Lengkap","Jenis Kelamin","Agama","Alamat"};
        int[] lebar = {40,120,200,100,120,260};
        Object[][] data = null;
        int nomor=0, baris=0, jbaris=0;
        try{
            dbku.bukaKoneksi();
            dbku.perintah.executeQuery("SELECT * FROM mahasiswa ORDER BY mhs_id DESC");
            dbku.hasil = dbku.perintah.getResultSet();
            dbku.hasil.last();
            jbaris = dbku.hasil.getRow();
            data = new Object[jbaris][6];
            dbku.hasil.beforeFirst();
            while(dbku.hasil.next()){
                data[nomor][0] = nomor+1;
                data[nomor][1] = dbku.hasil.getString("mhs_id");
                data[nomor][2] = dbku.hasil.getString("mhs_nama");
                data[nomor][3] = dbku.hasil.getString("mhs_gender");
                data[nomor][4] = dbku.hasil.getString("mhs_agama");
                data[nomor][5] = dbku.hasil.getString("mhs_alamat");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJumlah;
    private javax.swing.JTable tabelData;
    private javax.swing.JComboBox txtAgama;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JComboBox txtGender;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtTL;
    private javax.swing.JTextField txtTgl1;
    // End of variables declaration//GEN-END:variables

}