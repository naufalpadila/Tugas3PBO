/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author acer
 */
public class Output  {
    public Output(String nama, String jk, String agama,String hobi ){
        JFrame frame = new JFrame("APLIKASI"); //memberi title Aplikasi pada JFrame
        JLabel lnama = new JLabel(" Nama Lengkap ");
        JLabel dnama = new JLabel(nama);
        JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
        JLabel djeniskelamin = new JLabel(jk);
        JLabel lagama = new JLabel(" Agama ");
        JLabel dagama = new JLabel(agama);
        JLabel lhobby = new JLabel(" Hobi ");
        JLabel dhobby = new JLabel(hobi);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pas diteken silang, lgsg berhenti programnya
        frame.setSize(350, 200); //panjang x lebar
        frame.setVisible(true);
        
        frame.setLayout(null);
        frame.add(lnama);
        frame.add(dnama);
        frame.add(ljeniskelamin);
        frame.add(djeniskelamin);
        frame.add(lagama);
        frame.add(dagama);
        frame.add(lhobby);
        frame.add(dhobby);

        //setBounds(m,n,o,p)
        //m = posisi x; n = posisi n
        //o = panjang komponen; p = tinggi komponen
        lnama.setBounds(10, 10, 120, 20);
        dnama.setBounds(130, 10, 150, 20);
        ljeniskelamin.setBounds(10, 35, 120, 20);
        djeniskelamin.setBounds(130, 35, 100, 20);
        lagama.setBounds(10, 60, 150, 20);
        dagama.setBounds(130, 60, 150, 20);
        lhobby.setBounds(10, 85, 120, 20);
        dhobby.setBounds(130, 85, 100, 20);
        
    }
}
