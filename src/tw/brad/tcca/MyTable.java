package tw.brad.tcca;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class MyTable extends JFrame {
	private JTable jTable;
	private MyTableModel myTableModel;
	private LinkedList<LinkedList<String>> data = new LinkedList<>();
	private JButton add, del;
	
	public MyTable() {
	
		setLayout(new BorderLayout());
		myTableModel = new MyTableModel();
		jTable = new JTable(myTableModel);
		add(jTable, BorderLayout.CENTER);
		
		add = new JButton("add"); del = new JButton("del");
		JPanel top = new JPanel(new FlowLayout());
		top.add(add); top.add(del);
		add(top, BorderLayout.NORTH);
		
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LinkedList<String> row = new LinkedList<>();
				row.add("test1" + (int)(Math.random()*49+1));
				row.add("test1" + (int)(Math.random()*49+1));
				row.add("test1" + (int)(Math.random()*49+1));
				row.add("test1" + (int)(Math.random()*49+1));
				data.add(row);
				myTableModel.fireTableDataChanged();
			}
		});

		del.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int delrow = jTable.getSelectedRow();
				data.remove(delrow);
				myTableModel.fireTableDataChanged();
			}
		});
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MyTableModel extends AbstractTableModel{
		@Override
		public int getRowCount() {
			return data.size();
		}

		@Override
		public int getColumnCount() {
			return 4;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			return data.get(rowIndex).get(columnIndex);
		}
		
	}

	public static void main(String[] args) {
		new MyTable();
	}

}
