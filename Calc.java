import javax.swing.SwingUtilities;
import res.Start;
public class Calc{
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){  
            @Override
            public void run(){
                new Start();
            } 
        });
    }
}
