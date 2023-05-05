import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class flavor_ui extends JFrame {
    private JPanel panel1;
    private JTabbedPane tabbedPane2;
    private JEditorPane editorPane1;
    private JPanel panel3;

    public flavor_ui() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel1);
        tabbedPane2.getComponent(0).addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                JPanel panel2 = new JPanel();
                tabbedPane2.add(panel2);
            }
        });
    }

    public static void main(String[] args) {
        new flavor_ui();
    }
}