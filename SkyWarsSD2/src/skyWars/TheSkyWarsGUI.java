package skyWars;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
//import java.awt.Panel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TheSkyWarsGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private TheSkyWars game = new TheSkyWars();
	SaveLoadGame saveLoadGame = new SaveLoadGame();
	private JButton btnNewgame;
	private JButton btnLoadGame;
	private JButton btnExitGame;
	private ImageIcon theLogo = new ImageIcon(getClass().getClassLoader().getResource("SkyWars.png"));
	//private ImageIcon theBattleShooterImg = new ImageIcon(getClass().getClassLoader().getResource("battleshooter.png"));
	//private ImageIcon theBattleCruiserImg = new ImageIcon(getClass().getClassLoader().getResource("battlecruiser.png"));
	//private ImageIcon theBattleStarImg = new ImageIcon(getClass().getClassLoader().getResource("battlestar.png"));
	//private ImageIcon theMastershipImg = new ImageIcon(getClass().getClassLoader().getResource("mastership.png"));
	private ImageIcon miniLogo = new ImageIcon(getClass().getClassLoader().getResource("miniSkyWars.png"));
	//private ImageIcon theSquareImg = new ImageIcon(getClass().getClassLoader().getResource("space.png"));
	private JPanel panel;
	private JLabel MiniLogo;
	private JButton btnMove;
	private JButton btnRestartGame;
	private JButton btnSaveGame;
	private JButton btnMainMenu;
	private JRadioButton rdbtnDefensive;
	private JRadioButton rdbtnOffensive;
	private JLabel lblFightingMode;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TheSkyWarsGUI frame = new TheSkyWarsGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TheSkyWarsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewgame());
		contentPane.add(getBtnLoadGame());
		contentPane.add(getBtnExitGame());
		contentPane.add(getPanel());
		contentPane.add(getMiniLogo());
		contentPane.add(getBtnMove());
		contentPane.add(getBtnRestartGame());
		contentPane.add(getBtnSaveGame());
		contentPane.add(getBtnMainMenu());
		contentPane.add(getRdbtnDefensive());
		contentPane.add(getRdbtnOffensive());
		contentPane.add(getLblFightingMode());
		contentPane.add(getLblNewLabel_2());
		MiniLogo.setVisible(false);
		btnMove.setVisible(false);
		btnRestartGame.setVisible(false);
		btnSaveGame.setVisible(false);
		btnMainMenu.setVisible(false);
		rdbtnDefensive.setVisible(false);
		rdbtnOffensive.setVisible(false);
		lblFightingMode.setVisible(false);
		panel.setVisible(false);
	}
	
	private JPanel getPanel() {
		if(panel == null) {
			panel = new JPanel();
			panel.setBounds(0, 0, 561, 561);
			panel.setLayout(new GridLayout(TheSkyWars.skySize, TheSkyWars.skySize, 0, 0));
		}
		return panel;
	}
	
	private void grid() {
		for(Row tempRow : Sky.theSky) {
			for(Square tempSquare : tempRow.theRows) {
				Icon img = (Icon) tempSquare.squareImg();
				final JLabel label = new JLabel();
				label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				label.setHorizontalAlignment(JLabel.CENTER);
				label.setFont(new Font("Arial", Font.BOLD, 22));
				label.setIcon(img);
				panel.add(label);
				
			}
		}
	}
	private JButton getBtnNewgame() {
		if (btnNewgame == null) {
			btnNewgame = new JButton("New Game");
			btnNewgame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					game = new TheSkyWars();
					grid();
					panel.validate();
					panel.repaint();
					btnNewgame.setVisible(false);
					btnLoadGame.setVisible(false);
					btnExitGame.setVisible(false);
					lblNewLabel_2.setVisible(false);
					MiniLogo.setVisible(true);
					btnMove.setVisible(true);
					btnRestartGame.setVisible(true);
					btnSaveGame.setVisible(true);
					btnMainMenu.setVisible(true);
					rdbtnDefensive.setVisible(true);
					rdbtnOffensive.setVisible(true);
					lblFightingMode.setVisible(true);
					panel.setVisible(true);
				}
			});
			btnNewgame.setBounds(10, 527, 241, 23);
		}
		return btnNewgame;
	}
	private JButton getBtnLoadGame() {
		if (btnLoadGame == null) {
			btnLoadGame = new JButton("Load Game");
			btnLoadGame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					game = SaveLoadGame.load();
					grid();
					panel.validate();
					panel.repaint();
					btnNewgame.setVisible(false);
					btnLoadGame.setVisible(false);
					btnExitGame.setVisible(false);
					lblNewLabel_2.setVisible(false);
					MiniLogo.setVisible(true);
					btnMove.setVisible(true);
					btnRestartGame.setVisible(true);
					btnSaveGame.setVisible(true);
					btnMainMenu.setVisible(true);
					rdbtnDefensive.setVisible(true);
					rdbtnOffensive.setVisible(true);
					lblFightingMode.setVisible(true);
					panel.setVisible(true);
					
				}
			});
			btnLoadGame.setBounds(271, 527, 241, 23);
		}
		return btnLoadGame;
	}
	private JButton getBtnExitGame() {
		if (btnExitGame == null) {
			btnExitGame = new JButton("Exit Game");
			btnExitGame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnExitGame.setBounds(533, 527, 241, 23);
		}
		return btnExitGame;
	}

	private JLabel getMiniLogo() {
		if (MiniLogo == null) {
			MiniLogo = new JLabel("skywarslogomini");
			MiniLogo.setBounds(560, 0, 224, 144);
			MiniLogo.setIcon(miniLogo);
		}
		return MiniLogo;
	}
	private JButton getBtnMove() {
		if (btnMove == null) {
			btnMove = new JButton("Move");
			btnMove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boolean youLose = game.moveButton();
					if(youLose) {
						dispose();
						game = new TheSkyWars();
						grid();
						panel.validate();
						panel.repaint();
						btnNewgame.setVisible(true);
						btnLoadGame.setVisible(true);
						btnExitGame.setVisible(true);
						lblNewLabel_2.setVisible(true);
						MiniLogo.setVisible(false);
						btnMove.setVisible(false);
						btnRestartGame.setVisible(false);
						btnSaveGame.setVisible(false);
						btnMainMenu.setVisible(false);;
						rdbtnDefensive.setVisible(false);
						rdbtnOffensive.setVisible(false);
						lblFightingMode.setVisible(false);
						panel.setVisible(false);
					}else {
						panel.removeAll();
						grid();
						panel.validate();
						panel.repaint();
					}
				}
			});
			btnMove.setBounds(571, 155, 203, 99);
		}
		return btnMove;
	}
	private JButton getBtnRestartGame() {
		if (btnRestartGame == null) {
			btnRestartGame = new JButton("Restart Game");
			btnRestartGame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					game = new TheSkyWars();
					grid();
					panel.validate();
					panel.repaint();
					btnNewgame.setVisible(false);
					btnLoadGame.setVisible(false);
					btnExitGame.setVisible(false);
					lblNewLabel_2.setVisible(false);
					MiniLogo.setVisible(true);
					btnMove.setVisible(true);
					btnRestartGame.setVisible(true);
					btnSaveGame.setVisible(true);
					btnMainMenu.setVisible(true);
					rdbtnDefensive.setVisible(true);
					rdbtnOffensive.setVisible(true);
					lblFightingMode.setVisible(true);
					panel.setVisible(true);
				}
			});
			btnRestartGame.setBounds(571, 457, 203, 41);
		}
		return btnRestartGame;
	}
	private JButton getBtnSaveGame() {
		if (btnSaveGame == null) {
			btnSaveGame = new JButton("Save Game");
			btnSaveGame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SaveLoadGame.save(game);
				}
			});
			btnSaveGame.setBounds(571, 405, 203, 41);
		}
		return btnSaveGame;
	}
	private JButton getBtnMainMenu() {
		if (btnMainMenu == null) {
			btnMainMenu = new JButton("Main Menu");
			btnMainMenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					game = new TheSkyWars();
					grid();
					panel.validate();
					panel.repaint();
					btnNewgame.setVisible(true);
					btnLoadGame.setVisible(true);
					btnExitGame.setVisible(true);
					lblNewLabel_2.setVisible(true);
					MiniLogo.setVisible(false);
					btnMove.setVisible(false);
					btnRestartGame.setVisible(false);
					btnSaveGame.setVisible(false);
					btnMainMenu.setVisible(false);;
					rdbtnDefensive.setVisible(false);
					rdbtnOffensive.setVisible(false);
					lblFightingMode.setVisible(false);
					panel.setVisible(false);
				}
			});
			btnMainMenu.setBounds(571, 509, 203, 41);
		}
		return btnMainMenu;
	}
	private JRadioButton getRdbtnDefensive() {
		if (rdbtnDefensive == null) {
			rdbtnDefensive = new JRadioButton("Defensive");
			rdbtnDefensive.setSelected(true);
			rdbtnDefensive.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnDefensive.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rdbtnDefensive.isSelected()) {
						rdbtnOffensive.setSelected(false);
						game.Ms.setBattleMode(new Defensive());
						game.setShipsCanDestroy(game.Ms.BattleMode());
						
					}
				
				}
			});
			rdbtnDefensive.setBounds(611, 349, 109, 23);
		}
		return rdbtnDefensive;
	}
	private JRadioButton getRdbtnOffensive() {
		if (rdbtnOffensive == null) {
			rdbtnOffensive = new JRadioButton("Offensive");
			rdbtnOffensive.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnOffensive.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rdbtnOffensive.isSelected()) {
						rdbtnDefensive.setSelected(false);
						game.Ms.setBattleMode(new Offensive());
						game.setShipsCanDestroy(game.Ms.BattleMode());
					}
				}
			});
			rdbtnOffensive.setBounds(611, 375, 109, 23);
		}
		return rdbtnOffensive;
	}
	private JLabel getLblFightingMode() {
		if (lblFightingMode == null) {
			lblFightingMode = new JLabel("Fighting Mode");
			lblFightingMode.setHorizontalAlignment(SwingConstants.CENTER);
			lblFightingMode.setFont(new Font("Arial", Font.PLAIN, 25));
			lblFightingMode.setBounds(571, 265, 203, 77);
		}
		return lblFightingMode;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Logo");
			lblNewLabel_2.setBounds(0, 0, 784, 516);
			lblNewLabel_2.setIcon(theLogo);
		}
		return lblNewLabel_2;
	}
}
