import java.awt.*;
import javax.swing.*;

public class firstPanel extends JPanel {
    firstPanel(){
        this.setBackground(new Color(12, 14, 12));
        this.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(234, 235, 234) ));
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.ipady = 5;
    }
    
}