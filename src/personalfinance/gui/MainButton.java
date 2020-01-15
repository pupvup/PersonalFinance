package personalfinance.gui;

import personalfinance.settings.Style;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainButton extends JButton {

	public MainButton(String title, ImageIcon icon, ActionListener listener, String action) {
		super(title);
		setIcon(icon);
		addActionListener(listener);
		addMouseListener(new HoverButton());
		setActionCommand(action);

		setFont(Style.FONT_MAIN_BUTTON);
		setFocusPainted(true);
		setBackground(Style.COLOR_BUTTON_BG_NORMAL);
		setOpaque(true);
		setBorderPainted(false);
	}

	public MainButton(String title, ActionListener listener, String action) {
		this(title, null, listener, action);
	}

	public MainButton(ImageIcon icon, ActionListener listener, String action) {
		this("", icon, listener, action);
	}

	private class HoverButton implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) { }

		@Override
		public void mousePressed(MouseEvent e) { }

		@Override
		public void mouseReleased(MouseEvent e) { }

		@Override
		public void mouseEntered(MouseEvent e) {
			MainButton b = (MainButton) e.getSource();
			b.setBackground(Style.COLOR_BUTTON_BG_HOVER);
//			b.setOpaque(true);
//			b.setBorderPainted(false);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			MainButton b = (MainButton) e.getSource();
			b.setBackground(Style.COLOR_BUTTON_BG_NORMAL);
//			b.setOpaque(false);
//			b.setBorderPainted(true);
		}
	}
}
