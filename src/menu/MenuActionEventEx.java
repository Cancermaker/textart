package menu;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 
public class MenuActionEventEx extends JFrame {
    JLabel imgLabel = new JLabel(); // 빈 레이블
 
    MenuActionEventEx() {
        setTitle("아스키아트를 만들어 보자!");
        createMenu();
        getContentPane().add(imgLabel, BorderLayout.CENTER);
        setSize(1080, 700);
        setVisible(true);
    }
 
    void createMenu() {
        JMenuBar mb = new JMenuBar(); // 메뉴바 생성
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
        setJMenuBar(mb); // 메뉴바를 프레임에 부착
    }
 
    class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            switch (cmd) { // 메뉴 아이템의 종류 구분
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

