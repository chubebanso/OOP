package hust.soict.hedspi.swing.GUI_Component;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.swing.StoreManagerScreen;

public class AddDVD extends AddItems {

    private JTextField titleField;
    private JTextField categoryField;
    private JTextField directorField;
    private JTextField costField;
    private JTextField lengthField;

    public AddDVD(Store store, StoreManagerScreen store_layout) {
        super(store, store_layout);
    }

    @Override
    protected JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField(20);

        JLabel categoryLabel = new JLabel("Category:");
        categoryField = new JTextField(10);

        JLabel costLabel = new JLabel("Cost:");
        costField = new JTextField(10);
        
        JLabel lengthLabel = new JLabel("Length:");
        lengthField = new JTextField(10);
        
        JLabel directorLabel = new JLabel("Director:");
        directorField = new JTextField(30);
 
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(titleLabel);
        header.add(titleField);
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(categoryLabel);
        header.add(categoryField);
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(costLabel);
        header.add(costField);
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(lengthLabel);
        header.add(lengthField);
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(directorLabel);
        header.add(directorField);
        
        return header;
    }

    @Override
    protected JPanel createMenuBar() {
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton addButton = new JButton("Add CD");
        addButton.addActionListener(e -> {
           String title = titleField.getText();
           String category = categoryField.getText();
           float cost = Float.parseFloat(costField.getText());
           int length = Integer.parseInt(lengthField.getText());
           String director = directorField.getText();
           store.addMedia(new DigitalVideoDisc(title, category, director, length, cost));
           JOptionPane.showMessageDialog(null, "Added DVD successfully");
        });

        menuPanel.add(addButton);

        return menuPanel;
    }

    @Override
    protected JPanel createCenter() {
        return new JPanel(); // You can customize this if needed
    }

}