package res;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel {
    //Objects on panel
    private JButton numbers[] = new JButton[10];
    private JButton rezult = new JButton("=");
    private JButton operationRaz = new JButton("-");
    private JButton operationSum = new JButton("+");
    private JButton operationClear = new JButton("C");
    private JTextField output = new JTextField(); 
    private Font fontForNumbers = new Font("TimesRoman", Font.BOLD, 120);
    private Font fontForOutput = new Font("TimesRoman", Font.BOLD, 28);
   
    int res = 0;
    int res1 = 0; 
    String op = "";
    public Panel(){
        setLayout(null);

        //image buttons for operation
        //+
        operationSum.setBounds(260, 180, 51, 80);
        operationSum.setFont(fontForNumbers);
        add(operationSum);
        //-
        operationRaz.setBounds(260, 270, 51, 80);
        operationRaz.setFont(fontForNumbers);
        add(operationRaz);
        //=        
        rezult.setBounds(200, 180, 51, 110);
        rezult.setFont(fontForNumbers);
        add(rezult);
        //C        
        operationClear.setBounds(320, 180, 51, 170);
        operationClear.setFont(fontForNumbers);
        add(operationClear);
        

        //image numbers 1...9
        for(int idx = 0; idx < 3; idx++){
            for(int idy = 0; idy < 3; idy++){
                numbers[idx*3+idy+1] = new JButton(idx*3+idy+1+"");
                numbers[idx*3+idy+1].setBounds(idy*(50+10)+ 20, idx*(50+10)+180, 50, 50);
                numbers[idx*3+idy+1].setFont(fontForNumbers);
                add(numbers[idx*3+idy+1]);
            }
        }
        //image number 0
        numbers[0] = new JButton("0");
        numbers[0].setBounds(200, 300, 51, 50);
        numbers[0].setFont(fontForNumbers);
        add(numbers[0]);

        output.setBounds(20, 20, 360, 100);
        output.setEditable(false);
        output.setFont(fontForOutput);
        add(output);

        ActionListener l = (ActionEvent arg1) ->{
            JButton b = (JButton)arg1.getSource();
            output.setText(output.getText() + b.getText());
            if(res==0){
               res = Integer.valueOf(output.getText());
            }else{
                res1 = Integer.valueOf(output.getText());
            }
            
        };
        
        for(JButton b : numbers){
            b.addActionListener(l);
        }

        operationSum.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg1){
                res = Integer.valueOf(output.getText());
                output.setText("");
                op = "+";
            }
        });

        operationRaz.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg1){
                res = Integer.valueOf(output.getText());
                output.setText("");
                op = "-";
            }
        });

        operationClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg1){
                output.setText("");
            }
        });

        rezult.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                int num = Integer.valueOf(res);
                int num1 = Integer.valueOf(res1);
                String stOp = op;

                CountRez count = new CountRez();
                String strRez = String.valueOf(count.calc(num, stOp, num1));
                output.setText(strRez);
            }
        });
    }
}
