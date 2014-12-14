package GUI;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class OperatorPanel extends JPanel {
	private JLabel lblOperator;
    public OperatorPanel() {
        super();
        
        lblOperator = new JLabel("Operator");
        
        this.setBackground(Color.black);
        this.add(lblOperator);
        
    }
}
