package personalfinance.gui;

import personalfinance.gui.dialog.AboutDialog;
import personalfinance.gui.dialog.ConfirmDialog;
import personalfinance.gui.dialog.ErrorDialog;
import personalfinance.gui.menu.MainMenu;
import personalfinance.gui.toolbar.FunctionsToolBar;
import personalfinance.gui.toolbar.MainToolBar;
import personalfinance.settings.Style;
import personalfinance.settings.Text;

import javax.swing.*;
import java.awt.*;

public final class MainFrame extends JFrame implements Refresh {

	private GridBagConstraints constraints;
	private final MainMenu mb;
	private final MainToolBar toolBar;

	public MainFrame() {
		super(Text.get("PROGRAMM_NAME"));

		new AboutDialog().setVisible(true);

		setResizable(false);
		setIconImage(Style.ICON_MAIN.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mb = new MainMenu(this);
		setJMenuBar(mb);

		setLayout(new GridBagLayout());

		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 2;


		//toolbar
		toolBar = new MainToolBar();
		add(toolBar, constraints);

		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.anchor = GridBagConstraints.NORTH;

		//leftpanel

		pack();
		setLocationRelativeTo(null);
	}

	@Override
	public void refresh() {
		SwingUtilities.updateComponentTreeUI(this);
		mb.refresh();
		pack();
	}
}
