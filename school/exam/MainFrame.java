package school.exam;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    private MainPanel panel;

    public MainFrame() {
        super("Explorer");
        create();
    }

    private void create() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                panel.onFinished();
                System.exit(0);
            }
        });

        this.panel = new MainPanel();
        this.getContentPane().add(this.panel, BorderLayout.CENTER);

        this.setPreferredSize(new Dimension(800, 600));
        this.pack();
        this.setLocationRelativeTo(null);

        this.setVisible(true);
    }
}
