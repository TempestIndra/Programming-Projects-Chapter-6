import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PushCounterPanel extends JPanel {

    private int count;
    private JButton push;
    private JLabel label;

    public PushCounterPanel(){

        count = 0;

        push = new JButton( "Push Me!" );
        push.addActionListener(new ButtonListerner());

        label = new JLabel( "Pushes: " + count );

        add(push);
        add(label);

        setBackground( Color.gray );

        setPreferredSize( new Dimension(300,40) );
    }

    private class ButtonListerner implements ActionListener
    {
        public void actionPerformed(ActionEvent event){
            count++;
            label.setText( "Pushes: " + count );
        }
    }
}
