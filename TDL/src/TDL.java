
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author maespey
 */
public class TDL extends JFrame {
    public TDL() {
        super();

        this.setLayout(new BorderLayout());
        
    // Top of the window
        JPanel top = new JPanel();
        this.add(top,BorderLayout.NORTH);
        top.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        top.add(new JLabel("ToDo", JLabel.RIGHT),c);
        
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.HORIZONTAL;
        top.add(new JTextField("Enter Task Here"),c);
        
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 1;
        top.add(new JLabel("Description", JLabel.RIGHT),c);
        
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 1;
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.HORIZONTAL;
        top.add(new JTextArea("Enter Task Details Here", 10, 20),c);
        
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 2;
        c.anchor = GridBagConstraints.EAST;
        JButton addButton = new JButton("Add");
        top.add(addButton, c);
        
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 2;
        c.anchor = GridBagConstraints.WEST;
        JButton rmButton = new JButton("Delete");
        top.add(rmButton, c);
        
    // Bottom reg as center so it expands with window
        JPanel bottom = new JPanel();
        this.add(bottom,BorderLayout.CENTER);
        
        
    }
    
    public static void main(String[] args) {
        TDL todo = new TDL();
        todo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        todo.pack();
        todo.setVisible(true);
    }

    private PopupMenu newJTextField(String enter_Task_Here) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}