import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Biodata extends JFrame {
    private JTextField NamaField;
    private JTextField NIM;
    private JComboBox angkatan;
    private JRadioButton lakiLakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private JTextField Alamat;
    private JButton saveButton;
    private JButton resetButton;
    private  JPanel panelMain;
    private JLabel Nama;
    private JTextArea Result;
    private ArrayList<String> biodataList;

    public Biodata() {
        setTitle("Biodata Mahasiswa Teknik Komputer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setContentPane(panelMain);

        biodataList = new ArrayList<>();

        // ButtonGroup untuk radio button agar pilihan cuma 1
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(lakiLakiRadioButton);
        genderGroup.add(perempuanRadioButton);

        // Tambahkan JScrollPane untuk JTextArea
        //Result.setEditable(false); // Supaya JTextArea hanya untuk membaca
        //JScrollPane scrollPane =new JScrollPane(Result);
        //scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        //scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // Tambahkan scrollPane ke dalam layout utama
        //panelMain.add(scrollPane); // Pastikan layout mendukung penambahan komponen

        // Listener untuk tombol Save
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveData();
            }
        });

        // Listener untuk tombol Reset
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });

        setVisible(true);
    }

    // Method untuk menyimpan data
    private void saveData() {
        // Validasi apakah form telah diisi lengkap
        if (NamaField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama belum diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (NIM.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NIM belum diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (angkatan.getSelectedIndex() == 0) { // Misalkan index 0 adalah pilihan kosong
            JOptionPane.showMessageDialog(this, "Angkatan belum dipilih!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!lakiLakiRadioButton.isSelected() && !perempuanRadioButton.isSelected()) {
            JOptionPane.showMessageDialog(this, "Jenis kelamin belum dipilih!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (Alamat.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Alamat belum diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Jika semua validasi lulus, lanjutkan menyimpan data
        String nama = NamaField.getText();
        String nim = NIM.getText();
        String jurusan = (String) angkatan.getSelectedItem();
        String jenisKelamin = lakiLakiRadioButton.isSelected() ? "Laki-laki" : "Perempuan";
        String alamat = Alamat.getText();

        // Simpan data ke biodataList
        biodataList.add("Nama: " + nama);
        biodataList.add("NIM: " + nim);
        biodataList.add("Jurusan: " + jurusan);
        biodataList.add("Jenis Kelamin: " + jenisKelamin);
        biodataList.add("Alamat: " + alamat);

        // Tampilkan data di JTextArea
        StringBuilder riwayat = new StringBuilder();
        for (String item : biodataList) {
            riwayat.append(item).append("\n-----------------\n");
        }
        Result.setText(riwayat.toString());

        // Tampilkan pesan sukses
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
    }

    // Method untuk mereset form
    private void resetForm() {
        // Hapus isi text field
        NamaField.setText("");
        NIM.setText("");
        angkatan.setSelectedIndex(0);
        lakiLakiRadioButton.setSelected(false);
        perempuanRadioButton.setSelected(false);
        Alamat.setText("");

        // Kosongkan list data (opsional)
        biodataList.clear();

        // Tampilkan pesan
        JOptionPane.showMessageDialog(this, "Form telah direset!");
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(Biodata::new);
    }
}
