package GUI;

import javax.swing.JFrame;

public class customFrame extends JFrame{
    
    public customFrame(String judul){
        this.setTitle(judul);
        this.setLayout(null);
        this.setSize(800,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
