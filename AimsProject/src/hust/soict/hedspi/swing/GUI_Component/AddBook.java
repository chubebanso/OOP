package hust.soict.hedspi.swing.GUI_Component;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.swing.StoreManagerScreen;

public class AddBook extends AddItems {

    private JTextField titleField;
    private JTextField categoryField;
    private JTextField authorField;
    private JTextField costField;

    public AddBook(Store store, StoreManagerScreen store_layout) {
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
        
        JLabel authorLabel = new JLabel("Authors (comma-separated):");
        authorField = new JTextField(30);
 
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
        header.add(authorLabel);
        header.add(authorField);
        
        return header;
    }

    @Override
    protected JPanel createMenuBar() {
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(e -> {
           String title = titleField.getText();
           String category = categoryField.getText();
           float cost = Float.parseFloat(costField.getText());
           ArrayList<String> authors = new ArrayList<String> (Arrays.asList(authorField.getText().split(", ")));
           store.addMedia(new Book(title, category, cost, authors));
           JOptionPane.showMessageDialog(null, "Added book successfully");
        });

        menuPanel.add(addButton);

        return menuPanel;
    }

    @Override
    protected JPanel createCenter() {
        return new JPanel(); // You can customize this if needed
    }

}