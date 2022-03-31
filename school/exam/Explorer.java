package school.exam;

import javax.swing.SwingUtilities;

public class Explorer {
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}
