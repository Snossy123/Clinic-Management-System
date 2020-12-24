
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seif
 */
public class GUI extends JFrame implements ActionListener {
    public GUI(){
        LoginPage();

    }
//    Login Page Start
     JLabel headerLabel;
     JLabel usernameLabel;
     JLabel usernameHiddenLabel;
     JTextField usernameTextField;
     JLabel passwordLabel;
     JLabel passwordHiddenLabel;
     JPasswordField passwordTextField;
     JLabel jobLabel;
     JLabel jobHiddenLabel;
     JRadioButton adminRadioButton;
     JRadioButton doctorRadioButton;
     JRadioButton receptionistRadioButton;
     ButtonGroup jobButtonGroup;
     JButton loginButton;
    public int LoginPage(){
//        this Variable is used to 
//        choose the role of the user(admin,doctor,receptionist)
//        and then take the user to the page of it's role
        int page=0;
        this.setTitle("Login Page");
        this.setSize(500,600);
        this.setLocation(600,100);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        

        
        
        headerLabel=new JLabel("Login");
        headerLabel.setBounds(210,20,200,40);
        headerLabel.setFont(new Font("Arial",Font.BOLD,30));
        this.add(headerLabel);
        
        usernameLabel=new JLabel("Username: ");
        usernameLabel.setBounds(110,150,110,30);
        usernameLabel.setFont(new Font("Arial",Font.BOLD,20));
        this.add(usernameLabel);
        
        usernameTextField=new JTextField();
        usernameTextField.setBounds(230,145,230,40);
        usernameTextField.setFont(new Font("Arial", Font.ROMAN_BASELINE,20));
        usernameTextField.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        this.add(usernameTextField);
        
        usernameHiddenLabel=new JLabel("Wrong Username!!!");
        usernameHiddenLabel.setBounds(110,190,200,20);
        usernameHiddenLabel.setForeground(Color.red);
        usernameHiddenLabel.setVisible(false);
        this.add(usernameHiddenLabel);
        
        passwordLabel=new JLabel("Password: ");
        passwordLabel.setBounds(110,250,200,30);
        passwordLabel.setFont(new Font("Arial",Font.BOLD,20));
        this.add(passwordLabel);        
        
        passwordTextField=new JPasswordField();
        passwordTextField.setBounds(230,245,230,40);
        passwordTextField.setFont(new Font("Arial", Font.ROMAN_BASELINE,20));
        passwordTextField.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        this.add(passwordTextField);       
        
        passwordHiddenLabel=new JLabel("Wrong Password");
        passwordHiddenLabel.setBounds(110,290,200,30);
        passwordHiddenLabel.setFont(new Font("Arial",Font.BOLD,15));
        passwordHiddenLabel.setForeground(Color.red);
        passwordHiddenLabel.setVisible(false);
        this.add(passwordHiddenLabel);  
        
        jobLabel=new JLabel("User job: ");
        jobLabel.setBounds(110,340,200,40);
        jobLabel.setFont(new Font("Arial",Font.BOLD,20));
        this.add(jobLabel);
        
        jobHiddenLabel=new JLabel("Choose your Job ");
        jobHiddenLabel.setBounds(110,370,200,40);
        jobHiddenLabel.setFont(new Font("Arial",Font.BOLD,15));
        jobHiddenLabel.setForeground(Color.red);
        jobHiddenLabel.setVisible(false);
        this.add(jobHiddenLabel);
        
        adminRadioButton=new JRadioButton("Admin");
        adminRadioButton.setBounds(240,340,80,30);
        adminRadioButton.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
        this.add(adminRadioButton);

        doctorRadioButton=new JRadioButton("Doctor");
        doctorRadioButton.setBounds(350,340,90,30);
        doctorRadioButton.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
        this.add(doctorRadioButton);
        
        receptionistRadioButton=new JRadioButton("Receptionist");
        receptionistRadioButton.setBounds(280,375,140,30);
        receptionistRadioButton.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
        this.add(receptionistRadioButton);
        
        jobButtonGroup=new ButtonGroup();
        jobButtonGroup.add(adminRadioButton);
        jobButtonGroup.add(doctorRadioButton);
        jobButtonGroup.add(receptionistRadioButton);

        loginButton=new JButton("Login");
        loginButton.setBounds(200,470,100,30);
        loginButton.setFont(new Font("Arial",Font.BOLD,20));
        this.add(loginButton);

        loginButton.addActionListener(this);
        adminRadioButton.addActionListener(this);

        

        return page;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
//         Login Page Action Events Start
        String Username="";
        String Password="";

        if(e.getSource()==loginButton){
            Username=usernameTextField.getText();
            Password=passwordTextField.getText();


            if(adminRadioButton.isSelected()){
                System.out.println("Admin Page");
            }
            else if(doctorRadioButton.isSelected()){
                System.out.println("Doctor Page");
            }
            else if(receptionistRadioButton.isSelected()){
                System.out.println("Receptionist Page");
            }

            
        }
    }
    
}
