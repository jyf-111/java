import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainPanel extends JPanel {
	private final FileQueue queue;

	private Thread scanner;

	private Thread render;

	private JButton start;

	private JButton stop;

	private JTextField where;

	private JTextArea logger;

	public MainPanel() {
		super();
		create();
		
		queue = new FileQueue();
	}

	private void create() {
		this.setLayout(new GridBagLayout());
		where = new JTextField();
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		this.add(where, gbc);

		JButton browse = new JButton("...");
		browse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				if(fc.showOpenDialog(browse) == JFileChooser.APPROVE_OPTION) {
					File  file = fc.getSelectedFile();
					where.setText(file.getAbsolutePath());
				}
			}
		});
		gbc.gridx = 1;
		gbc.weightx = 0;
		gbc.fill = GridBagConstraints.NONE;
		this.add(browse, gbc);

		start = new JButton("Start");
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logger.selectAll();
				logger.replaceSelection("");
				
				render = new Thread(new Render(queue, MainPanel.this));
				render.start();
				scanner = new Thread(new Scanner(queue, new File(where.getText())));
				scanner.start();
			}
		});
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		this.add(start, gbc);

		stop = new JButton("Stop");
		gbc.gridx = 1;
		this.add(stop, gbc);

		logger = new JTextArea(10, 20);
		logger.setEditable(false);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.BOTH;
		this.add(new JScrollPane(logger), gbc);
	}

	public void onFilePair(FilePair pair) {
		logger.append(pair.getParent().getAbsolutePath() + " : " + pair.getChild().getAbsolutePath() + "\n");
	}

	public void onFinished() {
		this.render = null;
		this.scanner = null;
	}
}
