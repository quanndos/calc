package res;

import javax.swing.JFrame;

public class Start {
    private JFrame window;

    public Start(){
        window = new JFrame("Calculator");
        window.setSize(400, 450);
        window.add(new Panel());
        window.setResizable(false);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
