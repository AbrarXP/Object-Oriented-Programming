package builder;

import bioskop_123220191.*;

import GUI.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;


public class builder {
    
    JTextField userRegis, passRegis,confirmRegis, userLogin,passLogin;
    JButton registerbtn = new JButton("Register");
    JButton loginbtn = new JButton("Login");
    
    Film SelectedFilm;
    User orang;
    
    customFrame landingFrame = new customFrame("Byoskop landing Page");
    customFrame loginFrame = new customFrame("Login Page");
    
    customFrame pilihFrame = new customFrame("List Film Page");
    customFrame pesanFrame = new customFrame("Pemesanan Film Page");
    
    
    
    public builder(){
        
        JLabel judul = new JLabel("Selamat Datang !");
        judul.setFont(new Font(null,Font.BOLD,30));
        judul.setBounds(290,30,500,40);
        landingFrame.add(judul);
        
        JButton loginbtn = new JButton("Login");
        loginbtn.setBounds(300,250,100,50);
        loginbtn.addActionListener(e -> {
        loginMenu();
        landingFrame.dispose();
        });
        landingFrame.add(loginbtn);
        
        JButton registerbtn = new JButton("Register");
        registerbtn.setBounds(400,250,100,50);
        registerbtn.addActionListener(e -> {
        registerMenu();
        landingFrame.dispose();
        });
        landingFrame.add(registerbtn);
       
        
        landingFrame.setVisible(true);
        
    }
    
    void registerMenu(){
        customFrame myFrame = new customFrame("Register Page");
        
        JLabel judul = new JLabel("Byoskopskop");
        judul.setFont(new Font(null,Font.BOLD,30));
        judul.setBounds(300,30,200,40);
        myFrame.add(judul);
        
        JLabel register = new JLabel("Register");
        register.setFont(new Font(null,Font.PLAIN,13));
        register.setBounds(370,110,200,30);
        myFrame.add(register);
        
        userRegis = new JTextField(20);
        userRegis.setBounds(300,140,200,20);
        
        passRegis = new JTextField(20);
        passRegis.setBounds(300,170,200,20);
        
        confirmRegis = new JTextField(20);
        confirmRegis.setBounds(300,200,200,20);
        
        myFrame.add(userRegis);
        myFrame.add(passRegis);
        myFrame.add(confirmRegis);
        
        registerbtn.setBounds(300,240,100,20);
        registerbtn.addActionListener(e->{
            
            if(passRegis.getText().equals(confirmRegis.getText())){
                String user = userRegis.getText();
                String pass = passRegis.getText();
                orang = new User(user,pass);
                
                System.out.println("Akun berhasil dibuat !");
                myFrame.dispose();
                loginMenu();
            }
            else{
                System.out.println("Password anda tidak sama !");
            }
            
        });
        myFrame.add(registerbtn);
        myFrame.setVisible(true);
    }
    
    void loginMenu(){
        
        JLabel judul = new JLabel("Byoskopskop");
        judul.setFont(new Font(null,Font.BOLD,30));
        judul.setBounds(300,30,200,40);
        loginFrame.add(judul);
        
        JLabel register = new JLabel("Login Page");
        register.setFont(new Font(null,Font.PLAIN,13));
        register.setBounds(370,110,200,30);
        loginFrame.add(register);
        
        userLogin = new JTextField(20);
        userLogin.setBounds(300,140,200,20);
        
        passLogin = new JTextField(20);
        passLogin.setBounds(300,170,200,20);
  
        
        loginFrame.add(userLogin);
        loginFrame.add(passLogin);
        
        loginbtn.setBounds(300,240,100,20);
        loginbtn.addActionListener(e->{
            
            try{
                if(orang.getUsername().equalsIgnoreCase(userLogin.getText()) &&  orang.getPassword().equalsIgnoreCase(passLogin.getText())){
                    System.out.println("Berhasil Login !");
                    
                    pilihMenu();
                    loginFrame.dispose();
                    
                }
            }catch(NullPointerException err){
                System.out.println(err.getMessage());
            }
            
        });
        loginFrame.add(loginbtn);
        loginFrame.setVisible(true);
    }
    
    void pilihMenu(){
        JLabel judul = new JLabel("Byoskopskop");
        judul.setFont(new Font(null,Font.BOLD,30));
        judul.setBounds(300,0,200,40);
        pilihFrame.add(judul);
        
        JButton logoutBtn = new JButton("Logout");
        logoutBtn.setBounds(10,0,200,40);
        logoutBtn.addActionListener(e ->{
            orang = null;
            pilihFrame.dispose();
            System.out.println("Logout Berhasil !");
        });
        pilihFrame.add(logoutBtn);
        
        JLabel user = new JLabel("Hi, " + orang.getUsername());
        user.setFont(new Font(null,Font.BOLD,13));
        user.setBounds(700,0,200,40);
        pilihFrame.add(user);
        
        JButton film1 = new JButton("X-Men");
        film1.addActionListener(e ->{
            SelectedFilm = new Film("X-men", "Thrller", 300000);
            pesanMenu();
            pilihFrame.dispose();
        });
        
        JButton film2 = new JButton("Bravado");
        film1.addActionListener(e ->{
            SelectedFilm = new Film("Bravado", "Thrller", 350000);
            pesanMenu();
            pilihFrame.dispose();
        });
        JButton film3 = new JButton("FILM 3");
        JButton film4 = new JButton("FILM 4");
        JButton film5 = new JButton("FILM 5");
        JButton film6 = new JButton("FILM 6");
        JButton film7 = new JButton("FILM 7");
        JButton film8 = new JButton("FILM 8");
        JButton film9 = new JButton("FILM 9");
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,3));
        panel1.setBounds(0,50,800,400);
        panel1.add(film1);
        panel1.add(film2);
        panel1.add(film3);
        panel1.add(film4);
        panel1.add(film5);
        panel1.add(film6);
        panel1.add(film7);
        panel1.add(film8);
        panel1.add(film9);
        
        pilihFrame.add(panel1);
        pilihFrame.setVisible(true);
        
        
    }
    
    void pesanMenu(){
        JLabel judul = new JLabel("Byoskopskop");
        judul.setFont(new Font(null,Font.BOLD,30));
        judul.setBounds(50,0,200,40);
        pesanFrame.add(judul);
        
        
        JLabel user = new JLabel("Hi, " + orang.getUsername());
        user.setFont(new Font(null,Font.BOLD,13));
        user.setBounds(700,0,70,40);
        pesanFrame.add(user);
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(50,50,400,300);
        panel1.setBackground(Color.darkGray);
        pesanFrame.add(panel1);
        
        
        JLabel bnykTiket = new JLabel("Banyak Tiket");
        bnykTiket.setFont(new Font(null,Font.PLAIN,13));
        bnykTiket.setBounds(500,50,200,10);
        pesanFrame.add(bnykTiket);
        
        JTextField Textfield1 = new JTextField(20);
        Textfield1.setFont(new Font(null,Font.PLAIN,13));
        Textfield1.setBounds(500,60,200,40);
        pesanFrame.add(Textfield1);
        
        JLabel bangku = new JLabel("Bangku");
        bangku.setFont(new Font(null,Font.PLAIN,13));
        bangku.setBounds(500,120,200,10);
        pesanFrame.add(bangku);
        
        JTextField Textfield2 = new JTextField(20);
        Textfield2.setFont(new Font(null,Font.PLAIN,13));
        Textfield2.setBounds(500,130,200,40);
        pesanFrame.add(Textfield2);
        
        JLabel total = new JLabel("Total Rp.9999999");
        total.setFont(new Font(null,Font.PLAIN,13));
        total.setBounds(650,160,200,40);
        pesanFrame.add(total);
        
        JLabel bayar = new JLabel("Masukkan Uang");
        bayar.setFont(new Font(null,Font.PLAIN,13));
        bayar.setBounds(500,200,200,10);
        pesanFrame.add(bayar);
        
        JTextField Textfield3 = new JTextField(20);
        Textfield3.setFont(new Font(null,Font.PLAIN,13));
        Textfield3.setBounds(500,230,200,40);
        pesanFrame.add(Textfield3);
        
        JButton konfirmasi = new JButton("Konfirmasi");
        konfirmasi.setBounds(500,280,200,20);
        pesanFrame.add(konfirmasi);
        
        pesanFrame.setVisible(true);
    }
}