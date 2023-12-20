package hust.soict.hedspi.swing.GUI_Component;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.swing.StoreManagerScreen;

public abstract class AddItems extends JFrame {

	public Store store;
	public StoreManagerScreen store_layout;
	
	public AddItems(Store store, StoreManagerScreen store_layout) {
		this.store = store;
		this.store_layout = store_layout;
		
		Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);

        setTitle("Add item to store");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
		// TODO Auto-generated constructor stub
	}

	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	protected abstract JPanel createHeader();

	protected abstract JPanel createMenuBar();

	protected abstract JPanel createCenter();
	
	
}
