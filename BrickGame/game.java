package om.game;

import javax.swing.JFrame;

public class game {
     public static void main(String[] args) {
        JFrame obj=new JFrame();
        gameplay gp=new gameplay();
        obj.setBounds(100,100,700,600);
        obj.setTitle("BreakOut Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gp);
    }
}
