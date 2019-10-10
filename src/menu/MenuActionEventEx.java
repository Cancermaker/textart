package menu;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 
public class MenuActionEventEx extends JFrame {
    JLabel imgLabel = new JLabel(); // �� ���̺�
 
    MenuActionEventEx() {
        setTitle("�ƽ�Ű��Ʈ�� ����� ����!");
        createMenu();
        getContentPane().add(imgLabel, BorderLayout.CENTER);
        setSize(1080, 700);
        setVisible(true);
    }
 
    void createMenu() {
        JMenuBar mb = new JMenuBar(); // �޴��� ����
        JMenuItem[] menuItem = new JMenuItem[4];
        String[] itemTitle = { "file load", "Print", "Routing", "Exit" };
        JMenu screenMenu = new JMenu("menu");
 
        MenuActionListener listener = new MenuActionListener();
        for (int i = 0; i < menuItem.length; i++) {
            menuItem[i] = new JMenuItem(itemTitle[i]);
            menuItem[i].addActionListener(listener);
            screenMenu.add(menuItem[i]);
        }
        mb.add(screenMenu);
        setJMenuBar(mb); // �޴��ٸ� �����ӿ� ����
    }
 
    class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            switch (cmd) { // �޴� �������� ���� ����
            case "file load":
                if (imgLabel.getIcon() != null)
                    return;
               
                imgLabel.setIcon(new ImageIcon("img/Koala.jpg"));
                break;
            case "Print":
            	
                break;
            case "Routing":
                imgLabel.setVisible(true);
                break;
            case "Exit":
                System.exit(0);
                break;
            }
        }
    }
 
    public static void main(String[] args) {
        new MenuActionEventEx();
    }
}

