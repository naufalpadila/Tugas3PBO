/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author acer
 */
public class Main {

    JFrame frame = new JFrame("APLIKASI"); //memberi title Aplikasi pada JFrame

    JTextField fnama = new JTextField(10); //Inputan
    JLabel lnama = new JLabel(" Nama Lengkap ");

    JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
    JRadioButton rbPria = new JRadioButton(" Laki-Laki "); //yang bulet option
    JRadioButton rbWanita = new JRadioButton(" Perempuann ");

    JLabel lagama = new JLabel(" Agama ");
    String[] namaAgama
            = {"Islam", "Kristen", "Katolik", "Hindu", "Budha"}; //array untuk isi dropdown agama
    JComboBox cmbAgama = new JComboBox(namaAgama); //dropdown 

    JLabel lhobby = new JLabel(" Hobby ");
    JCheckBox cbSepakbola = new JCheckBox(" Sepakbola "); //kotak yang dicentang
    JCheckBox cbBasket = new JCheckBox(" Basket ");

    JButton btnSave = new JButton("OK");

    public Main() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pas diteken silang, lgsg berhenti programnya
        frame.setSize(350, 200); //panjang x lebar

        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);

        frame.setLayout(null);
        frame.add(lnama);
        frame.add(fnama);
        frame.add(ljeniskelamin);
        frame.add(rbPria);
        frame.add(rbWanita);
        frame.add(lagama);
        frame.add(cmbAgama);
        frame.add(lhobby);
        frame.add(cbSepakbola);
        frame.add(cbBasket);
        frame.add(btnSave);

        //setBounds(m,n,o,p)
        //m = posisi x; n = posisi n
        //o = panjang komponen; p = tinggi komponen
        lnama.setBounds(10, 10, 120, 20);
        fnama.setBounds(130, 10, 150, 20);
        ljeniskelamin.setBounds(10, 35, 120, 20);
        rbPria.setBounds(130, 35, 100, 20);
        rbWanita.setBounds(230, 35, 100, 20);
        lagama.setBounds(10, 60, 150, 20);
        cmbAgama.setBounds(130, 60, 150, 20);
        lhobby.setBounds(10, 85, 120, 20);
        cbSepakbola.setBounds(130, 85, 100, 20);
        cbBasket.setBounds(230, 85, 120, 20);
        btnSave.setBounds(100, 130, 120, 20);

        frame.setVisible(true);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = fnama.getText(); //ngambil inputan di variabel fnama
                String jenkel = ""; 
                if(rbPria.isSelected()){jenkel = rbPria.getText(); }
                else if(rbWanita.isSelected()){jenkel = rbWanita.getText(); }
                String agama = cmbAgama.getSelectedItem().toString();
                String hobby = "";
                if(cbSepakbola.isSelected()){hobby = cbSepakbola.getText(); }
                else if(cbBasket.isSelected()){hobby = cbBasket.getText(); }
                
                Output output = new Output(nama,jenkel,agama,hobby); 
                frame.dispose(); //biar windownya ilang pas udah pencet ok
            }
        });
    }
}
