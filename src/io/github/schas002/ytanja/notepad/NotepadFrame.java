package io.github.schas002.ytanja.notepad;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

public class NotepadFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static NotepadFrame frame = new NotepadFrame();

	public static NotepadFrame getFrame() {
		return frame;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					NotepadFrame frame = new NotepadFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public NotepadFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 640, 480);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JMenuBar menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);

		JMenu mnFile = new JMenu(Messages.getString("NotepadFrame.mnFile")); //$NON-NLS-1$
		menuBar.add(mnFile);

		JMenuItem mntmNew = new JMenuItem(
				Messages.getString("NotepadFrame.mntmNew")); //$NON-NLS-1$
		mntmNew.setEnabled(false); // TODO
		mntmNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
				InputEvent.CTRL_MASK));
		mnFile.add(mntmNew);

		JMenuItem mntmOpen = new JMenuItem(
				Messages.getString("NotepadFrame.mntmOpen")); //$NON-NLS-1$
		mntmOpen.setEnabled(false); // TODO
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
				InputEvent.CTRL_MASK));
		mnFile.add(mntmOpen);

		JMenuItem mntmSave = new JMenuItem(
				Messages.getString("NotepadFrame.mntmSave")); //$NON-NLS-1$
		mntmSave.setEnabled(false); // TODO
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
				InputEvent.CTRL_MASK));
		mnFile.add(mntmSave);

		mnFile.addSeparator();

		JMenuItem mntmPrint = new JMenuItem(
				Messages.getString("NotepadFrame.mntmPrint")); //$NON-NLS-1$
		mntmPrint.setEnabled(false); // TODO
		mntmPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,
				InputEvent.CTRL_MASK));
		mnFile.add(mntmPrint);

		mnFile.addSeparator();

		JMenuItem mntmQuit = new JMenuItem(
				Messages.getString("NotepadFrame.mntmQuit")); //$NON-NLS-1$
		mntmQuit.addActionListener(new QuitAction());
		mntmQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,
				InputEvent.CTRL_MASK));
		mnFile.add(mntmQuit);

		JMenu mnEdit = new JMenu(Messages.getString("NotepadFrame.mnEdit")); //$NON-NLS-1$
		menuBar.add(mnEdit);

		JMenuItem mntmUndo = new JMenuItem(
				Messages.getString("NotepadFrame.mntmUndo")); //$NON-NLS-1$
		mntmUndo.setEnabled(false); // TODO
		mntmUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,
				InputEvent.CTRL_MASK));
		mnEdit.add(mntmUndo);

		JMenuItem mntmRedo = new JMenuItem(
				Messages.getString("NotepadFrame.mntmRedo")); //$NON-NLS-1$
		mntmRedo.setEnabled(false); // TODO
		mntmRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,
				InputEvent.CTRL_MASK));
		mnEdit.add(mntmRedo);

		mnEdit.addSeparator();

		JMenuItem mntmCut = new JMenuItem(
				Messages.getString("NotepadFrame.mntmCut")); //$NON-NLS-1$
		mntmCut.setEnabled(false); // TODO
		mntmCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
				InputEvent.CTRL_MASK));
		mnEdit.add(mntmCut);

		JMenuItem mntmCopy = new JMenuItem(
				Messages.getString("NotepadFrame.mntmCopy")); //$NON-NLS-1$
		mntmCopy.setEnabled(false); // TODO
		mntmCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
				InputEvent.CTRL_MASK));
		mnEdit.add(mntmCopy);

		JMenuItem mntmPaste = new JMenuItem(
				Messages.getString("NotepadFrame.mntmPaste")); //$NON-NLS-1$
		mntmPaste.setEnabled(false); // TODO
		mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,
				InputEvent.CTRL_MASK));
		mnEdit.add(mntmPaste);

		JMenuItem mntmDelete = new JMenuItem(
				Messages.getString("NotepadFrame.mntmDelete")); //$NON-NLS-1$
		mntmDelete.setEnabled(false); // TODO
		mntmDelete
				.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		mnEdit.add(mntmDelete);

		JMenuItem mntmSelectAll = new JMenuItem(
				Messages.getString("NotepadFrame.mntmSelectAll")); //$NON-NLS-1$
		mntmSelectAll.setEnabled(false); // TODO
		mntmSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
				InputEvent.CTRL_MASK));
		mnEdit.add(mntmSelectAll);

		mnEdit.addSeparator();

		JMenuItem mntmGoToLine = new JMenuItem(
				Messages.getString("NotepadFrame.mntmGoToLine")); //$NON-NLS-1$
		mntmGoToLine.setEnabled(false); // TODO
		mntmGoToLine.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,
				InputEvent.CTRL_MASK));
		mnEdit.add(mntmGoToLine);

		JMenu mnFind = new JMenu(Messages.getString("NotepadFrame.mnFind")); //$NON-NLS-1$
		menuBar.add(mnFind);

		JMenuItem mntmFind = new JMenuItem(
				Messages.getString("NotepadFrame.mntmFind")); //$NON-NLS-1$
		mntmFind.setEnabled(false); // TODO
		mntmFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,
				InputEvent.CTRL_MASK));
		mnFind.add(mntmFind);

		JMenuItem mntmFindAndReplace = new JMenuItem(
				Messages.getString("NotepadFrame.mntmFindAndReplace")); //$NON-NLS-1$
		mntmFindAndReplace.setEnabled(false); // TODO
		mntmFindAndReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,
				InputEvent.CTRL_MASK));
		mnFind.add(mntmFindAndReplace);

		JMenu mnHelp = new JMenu(Messages.getString("NotepadFrame.mnHelp")); //$NON-NLS-1$
		menuBar.add(mnHelp);

		JMenuItem mntmHelpContents = new JMenuItem(
				Messages.getString("NotepadFrame.mntmHelpContents")); //$NON-NLS-1$
		mntmHelpContents.setEnabled(false); // TODO
		mntmHelpContents.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1,
				0));
		mnHelp.add(mntmHelpContents);

		JMenuItem mntmAboutThisApplication = new JMenuItem(
				Messages.getString("NotepadFrame.mntmAboutThisApplication")); //$NON-NLS-1$
		mntmAboutThisApplication.setEnabled(false); // TODO
		mntmAboutThisApplication.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_F1, InputEvent.CTRL_MASK));
		mnHelp.add(mntmAboutThisApplication);

		JScrollPane textAreaWrapper = new JScrollPane();
		contentPane.add(textAreaWrapper, BorderLayout.CENTER);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textAreaWrapper.setViewportView(textArea);
	}

	private class QuitAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// thanks to Stack Overflow answer
			// <https://stackoverflow.com/a/1235994>
			// from camickr <https://stackoverflow.com/users/131872>
            // (CC BY-SA 3.0)
			NotepadFrame frame = NotepadFrame.getFrame();
			frame.dispatchEvent(new WindowEvent(frame,
					WindowEvent.WINDOW_CLOSING));
		}
	}
}
