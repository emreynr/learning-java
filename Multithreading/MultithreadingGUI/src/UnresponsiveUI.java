import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnresponsiveUI extends JFrame {

    private boolean stopMethod = false; // baslangic stop metodunu false yaptik
    private JTextField tfCount;
    private int count = 1;

    // GUI bilesenleri icin constructor olusturuyoruz
    public UnresponsiveUI() {
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        container.add(new JLabel("Counter"));
        tfCount = new JTextField(count + 10);
        tfCount.setEditable(false);
        container.add(tfCount);

        JButton buttonStart = new JButton("Start Counting");
        container.add(buttonStart);
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopMethod = false;

                Thread thread = new Thread() {
                    public void run () {
                        for (int i = 0;  i < 10000; i++) {

                        }
                    }
                }
            }
        });




    }
}
