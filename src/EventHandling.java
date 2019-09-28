
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ItemEvent.*;

public class EventHandling extends JFrame {

    JFrame frame = new JFrame();
    JLabel kl = new JLabel("Pilih Kelamin Anda");
    JRadioButton lk = new JRadioButton("Laki-laki");
    JRadioButton pr = new JRadioButton("Perempuan");
    JTextField kelamin = new JTextField("Kelamin anda ?");
    ButtonGroup bt = new ButtonGroup();
    JLabel agm = new JLabel("Apa Agamamu?");
    String namaagm[] = {"Islam", "Hindu", "Buddha", "Katolik", "Kristen", "Khonghucu"};
    JComboBox nagm = new JComboBox(namaagm);
    JTextField agama = new JTextField("Agamamu?");
    JLabel hbi = new JLabel("Apa Saja Hobimu?");
    JCheckBox sepak = new JCheckBox("Sepak Bola");
    JCheckBox basket = new JCheckBox("Basket");
    JTextField hobi = new JTextField("Hobimu?");
    ButtonGroup btc = new ButtonGroup();
    JTextField tes = new JTextField("Tes");
    JTextField a = new JTextField("a");
    JTextField b = new JTextField("b");
    JTextField c = new JTextField("c");
    JTextField nilai = new JTextField();
    JTextField nilai2 = new JTextField();

    public EventHandling() {
        frame.setTitle("Aplikasi");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.add(kl);
        kl.setBounds(50, 40, 200, 20);
        frame.add(lk);
        lk.setBounds(50, 70, 100, 20);
        frame.add(pr);
        pr.setBounds(150, 70, 100, 20);
        bt.add(lk);
        bt.add(pr);
        frame.add(kelamin);
        kelamin.setBounds(300, 70, 150, 20);
        kelamin.setEditable(false);
        lk.addItemListener((ItemEvent event) -> {
            if (event.getSource() == lk) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    kelamin.setText("Laki-laki");
                }
            }

        });
        pr.addItemListener((ItemEvent event) -> {
            if (event.getSource() == pr) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    kelamin.setText("Perempuan");
                }
            }
        });
        frame.add(agm);
        agm.setBounds(50, 120, 200, 20);
        frame.add(nagm);
        nagm.setBounds(50, 150, 200, 20);
        frame.add(agama);
        agama.setBounds(300, 150, 150, 20);
        agama.setEditable(false);
        nagm.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (nagm.getSelectedIndex() == 0) {
                    agama.setText("Islam");
                } else if (nagm.getSelectedIndex() == 1) {
                    agama.setText("Hindu");
                } else if (nagm.getSelectedIndex() == 2) {
                    agama.setText("Buddha");
                } else if (nagm.getSelectedIndex() == 3) {
                    agama.setText("Katolik");
                } else if (nagm.getSelectedIndex() == 4) {
                    agama.setText("Kristen");
                } else if (nagm.getSelectedIndex() == 5) {
                    agama.setText("Khonghucu");
                }
            }
        });
        frame.add(hbi);
        hbi.setBounds(50, 200, 200, 20);
        frame.add(sepak);
        sepak.setBounds(50, 230, 200, 20);
        frame.add(basket);
        basket.setBounds(50, 175, 200, 200);
        frame.add(hobi);
        hobi.setBounds(300, 210, 150, 20);
        hobi.setEditable(false);
        btc.add(sepak);
        btc.add(basket);
        sepak.addItemListener((ItemEvent event) -> {
            if (event.getSource() == sepak) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hobi.setText("Sepak Bola");
                }
            }

        });
        basket.addItemListener((ItemEvent event) -> {
            if (event.getSource() == basket) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hobi.setText("Basket");
                }
            }
        });
        frame.add(tes);
        tes.setBounds(25, 350, 150, 20);
        tes.setEditable(false);
        tes.setHorizontalAlignment(JTextField.CENTER);
        tes.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                nilai.setText(tes.getText());
            }
        });
        frame.add(a);
        a.setBounds(225, 350, 150, 20);
        a.setEditable(false);
        a.setHorizontalAlignment(JTextField.CENTER);
        a.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                nilai.setText(a.getText());
            }
        });
        frame.add(b);
        b.setBounds(425, 350, 150, 20);
        b.setEditable(false);
        b.setHorizontalAlignment(JTextField.CENTER);
        b.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                nilai.setText(b.getText());
            }
        });
        frame.add(c);
        c.setBounds(625, 350, 150, 20);
        c.setEditable(false);
        c.setHorizontalAlignment(JTextField.CENTER);
        c.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                nilai.setText(c.getText());
            }
        });
        frame.add(nilai);
        nilai.setBounds(25, 400, 750, 50);
        nilai.setEditable(false);
        nilai.setHorizontalAlignment(JTextField.CENTER);
        nilai.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                nilai2.setText(nilai.getText());
            }
        });
        frame.add(nilai2);
        nilai2.setBounds(25, 420, 750, 50);
        nilai2.setEditable(false);
        nilai2.setHorizontalAlignment(JTextField.CENTER);
        nilai2.addMouseListener(new MouseAdapter() {

        });

    }
}
