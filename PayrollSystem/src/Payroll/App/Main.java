package Payroll.App;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    // Variables
    private final String For_Company = "<html>ABC Company Corporation<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
            "Makati Metro Manila" +
            "</html>";
    private final String For_Title = "<< Payroll System >>";

    private final String For_Question_One = "No. of hours worked :";

    private final String For_Rate_Per_Hour = "Rate per hour             :";

    private final String For_Gross_Pay = "Gross pay                   :";

    private final String For_Net_Pay = "Net Pay                        :";

    private final String For_Tax_Deduction = "Tax deduction      :";

    private final String For_SSS_Contribution = "SSS contribution :";

    private final String For_Pag_Love = "Pagibig                  :";

    private final String For_Total_Deduction = "Total Deduction   :";

    final int label_width = 260;
    final int label_height = 40;
    final int size = 20;
    final int field_height = 25;
    final int field_width = 200;
    final int button_width = 200;
    final int button_height = 80;


    // Frame
    JFrame frame = new JFrame();
    // Panel
    JPanel panel = new JPanel();


    // Labels
    JLabel company = new JLabel(For_Company);
    JLabel title = new JLabel(For_Title);
    JLabel No_of_Hours = new JLabel(For_Question_One);
    JLabel Rate_Per_Hour = new JLabel(For_Rate_Per_Hour);
    JLabel Gross_Pay = new JLabel(For_Gross_Pay);
    JLabel Net_Pay = new JLabel(For_Net_Pay);
    JLabel Tax_Deduction = new JLabel(For_Tax_Deduction);
    JLabel SSS_Contribution = new JLabel(For_SSS_Contribution);
    JLabel Pag_Love = new JLabel(For_Pag_Love);
    JLabel Total_Deduction = new JLabel(For_Total_Deduction);


    // TextField
    JTextField No_of_Hours_TextField = new JTextField();
    JTextField Rate_Per_Hour_TextField = new JTextField();
    JTextField Gross_Pay_TextField = new JTextField();
    JTextField Net_Pay_TextField = new JTextField();
    JTextField Tax_Deduction_TextField = new JTextField();
    JTextField SSS_Contribution_TextField = new JTextField();
    JTextField Pag_Love_TextField = new JTextField();
    JTextField Total_Deduction_TextField = new JTextField();

    // Buttons
    JButton Compute = new JButton();
    JButton Clear = new JButton();
    JButton Exit = new JButton();

    // Cursor
    Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
    public void frames(){
        frame.setResizable(false);
        frame.setSize(1100,800);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        panel.setLayout(null);
        frame.add(panel);
    }
    private void frame_exit(){
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(frame,
                        "Are you sure you want to close this window?", "Exit",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                else{
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
    }
    public void panels(){
        panel.setBackground(Color.ORANGE);
        panel.add(company);
        panel.add(title);
        panel.add(No_of_Hours);
        panel.add(No_of_Hours_TextField);
        panel.add(Rate_Per_Hour);
        panel.add(Rate_Per_Hour_TextField);
        panel.add(Gross_Pay);
        panel.add(Gross_Pay_TextField);
        panel.add(Net_Pay);
        panel.add(Net_Pay_TextField);
        panel.add(Tax_Deduction);
        panel.add(Tax_Deduction_TextField);
        panel.add(SSS_Contribution);
        panel.add(SSS_Contribution_TextField);
        panel.add(Pag_Love);
        panel.add(Pag_Love_TextField);
        panel.add(Total_Deduction);
        panel.add(Total_Deduction_TextField);
        panel.add(Compute);
        panel.add(Clear);
        panel.add(Exit);
    }
    public void labels(){
        company.setFont(new Font("Arial",Font.BOLD,size));
        company.setBounds(450,50,label_width,label_height);
        company.setForeground(Color.BLACK);
        title.setFont(new Font("Arial",Font.BOLD,size));
        title.setBounds(470,125,label_width,label_height);
        title.setForeground(Color.BLACK);
        No_of_Hours.setFont(new Font("Arial",Font.BOLD,size));
        No_of_Hours.setBounds(100,225,label_width,label_height);
        No_of_Hours.setForeground(Color.BLACK);
        Rate_Per_Hour.setFont(new Font("Arial",Font.BOLD,size));
        Rate_Per_Hour.setBounds(100,300,label_width,label_height);
        Rate_Per_Hour.setForeground(Color.BLACK);
        Gross_Pay.setFont(new Font("Arial",Font.BOLD,size));
        Gross_Pay.setBounds(100,375,label_width,label_height);
        Gross_Pay.setForeground(Color.BLACK);
        Net_Pay.setFont(new Font("Arial",Font.BOLD,size));
        Net_Pay.setBounds(100,470,label_width,label_height);
        Net_Pay.setForeground(Color.BLACK);
        Tax_Deduction.setFont(new Font("Arial",Font.BOLD,size));
        Tax_Deduction.setBounds(600,225,label_width,label_height);
        Tax_Deduction.setForeground(Color.BLACK);
        SSS_Contribution.setFont(new Font("Arial",Font.BOLD,size));
        SSS_Contribution.setBounds(600,300,label_width,label_height);
        SSS_Contribution.setForeground(Color.BLACK);
        Pag_Love.setFont(new Font("Arial",Font.BOLD,size));
        Pag_Love.setBounds(600,375,label_width,label_height);
        Pag_Love.setForeground(Color.BLACK);
        Total_Deduction.setFont(new Font("Arial",Font.BOLD,size));
        Total_Deduction.setBounds(600,470,label_width,label_height);
        Total_Deduction.setForeground(Color.BLACK);
    }
    public void TextField(){
        No_of_Hours_TextField.setFont(new Font("Arial",Font.BOLD,size));
        No_of_Hours_TextField.setBounds(320,230,field_width,field_height);
        No_of_Hours_TextField.requestFocus();
        Rate_Per_Hour_TextField.setFont(new Font("Arial",Font.BOLD,size));
        Rate_Per_Hour_TextField.setBounds(320,305,field_width,field_height);
        Gross_Pay_TextField.setFont(new Font("Arial",Font.BOLD,size));
        Gross_Pay_TextField.setBounds(320,380,field_width,field_height);
        Gross_Pay_TextField.setEditable(false);
        Net_Pay_TextField.setFont(new Font("Arial",Font.BOLD,size));
        Net_Pay_TextField.setBounds(320,475,field_width,field_height);
        Net_Pay_TextField.setEditable(false);
        Tax_Deduction_TextField.setFont(new Font("Arial",Font.BOLD,size));
        Tax_Deduction_TextField.setBounds(790,228,field_width,field_height);
        Tax_Deduction_TextField.setEditable(false);
        SSS_Contribution_TextField.setFont(new Font("Arial",Font.BOLD,size));
        SSS_Contribution_TextField.setBounds(790,303,field_width,field_height);
        SSS_Contribution_TextField.setEditable(false);
        Pag_Love_TextField.setFont(new Font("Arial",Font.BOLD,size));
        Pag_Love_TextField.setBounds(790,378,field_width,field_height);
        Pag_Love_TextField.setEditable(false);
        Total_Deduction_TextField.setFont(new Font("Arial",Font.BOLD,size));
        Total_Deduction_TextField.setBounds(790,473,field_width,field_height);
        Total_Deduction_TextField.setEditable(false);
    }

    private void TextField_Number_hours(){
        No_of_Hours_TextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();

                if(!Character.isDigit(c)){
                    evt.consume();
                }
            }
        });
    }

    private void TextField_Rate_hours(){
        Rate_Per_Hour_TextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();

                if(!Character.isDigit(c)){
                    evt.consume();
                }
            }
        });
    }

    public void Compute_Button(){
        Compute.setText("Compute");
        Compute.setBounds(150,600,button_width,button_height);
        Compute.setFont(new Font("Arial",Font.BOLD,size));
        Compute.setBackground(Color.WHITE);
        Compute.setForeground(Color.BLACK);
        Compute.setBorderPainted(false);
        Compute.setCursor(cursor);
        Compute.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                Compute.setBackground(Color.BLACK);
                Compute.setForeground(Color.WHITE);
            }

            public void mouseExited(MouseEvent evt) {
                Compute.setBackground(UIManager.getColor("control"));
                Compute.setBackground(Color.WHITE);
                Compute.setForeground(Color.BLACK);
            }
        });
        Compute.addActionListener(e -> {
            try {
                String Number_Of_Hours = No_of_Hours_TextField.getText();
                String Rate_Of_Hours = Rate_Per_Hour_TextField.getText();
                int Numbers_For_Hours = Integer.parseInt(Number_Of_Hours);
                int Numbers_For_Rates = Integer.parseInt(Rate_Of_Hours);

                int Total_Gross_Pay = Numbers_For_Hours * Numbers_For_Rates;
                int Total_Tax_Deduction = (Total_Gross_Pay * 5) / 100;
                int Total_SSS_Contribution = (Total_Gross_Pay * 3) / 100;
                int Total_Pag_Love = (Total_Gross_Pay * 2) / 100;
                int Total_Deductions = (Total_SSS_Contribution + Total_Pag_Love + Total_Tax_Deduction);
                int Total_Net_Pay = Total_Gross_Pay - Total_Deductions;

                String write_gross_pay = String.valueOf(Total_Gross_Pay);
                Gross_Pay_TextField.setText(write_gross_pay);
                String write_net_pay = String.valueOf(Total_Net_Pay);
                Net_Pay_TextField.setText(write_net_pay);
                String write_tax_deduction = String.valueOf(Total_Tax_Deduction);
                Tax_Deduction_TextField.setText(write_tax_deduction);
                String write_sss_contribution = String.valueOf(Total_SSS_Contribution);
                SSS_Contribution_TextField.setText(write_sss_contribution);
                String write_pag_love = String.valueOf(Total_Pag_Love);
                Pag_Love_TextField.setText(write_pag_love);
                String write_total_deduction = String.valueOf(Total_Deductions);
                Total_Deduction_TextField.setText(write_total_deduction);
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null,"Add Needed Data in the TextField and Compute it");
                No_of_Hours_TextField.requestFocus();
            }
        });
    }

    public void Clear_Button(){
        Clear.setText("Clear");
        Clear.setBounds(450,599,button_width,button_height);
        Clear.setFont(new Font("Arial",Font.BOLD,size));
        Clear.setBackground(Color.WHITE);
        Clear.setForeground(Color.BLACK);
        Clear.setBorderPainted(false);
        Clear.setCursor(cursor);
        Clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                Clear.setBackground(Color.BLACK);
                Clear.setForeground(Color.WHITE);
            }

            public void mouseExited(MouseEvent evt) {
                Clear.setBackground(UIManager.getColor("control"));
                Clear.setBackground(Color.WHITE);
                Clear.setForeground(Color.BLACK);
            }
        });
        Clear.addActionListener(e -> {
            No_of_Hours_TextField.setText(null);
            Rate_Per_Hour_TextField.setText(null);
            Gross_Pay_TextField.setText(null);
            Net_Pay_TextField.setText(null);
            Tax_Deduction_TextField.setText(null);
            SSS_Contribution_TextField.setText(null);
            Pag_Love_TextField.setText(null);
            Total_Deduction_TextField.setText(null);
            No_of_Hours_TextField.requestFocus();
        });
    }

    public void Exit_Button(){
        Exit.setText("Exit");
        Exit.setBounds(750,599,button_width,button_height);
        Exit.setFont(new Font("Arial",Font.BOLD,size));
        Exit.setBackground(Color.WHITE);
        Exit.setForeground(Color.BLACK);
        Exit.setBorderPainted(false);
        Exit.setCursor(cursor);
        Exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                Exit.setBackground(Color.BLACK);
                Exit.setForeground(Color.WHITE);
            }

            public void mouseExited(MouseEvent evt) {
                Exit.setBackground(UIManager.getColor("control"));
                Exit.setBackground(Color.WHITE);
                Exit.setForeground(Color.BLACK);
            }
        });
        Exit.addActionListener(e -> System.exit(0));
    }

    public Main(){
        // For Frame
        frames();

        // For Frame Exit
        frame_exit();

        // For Panel
        panels();

        // For Labels
        labels();

        // For TextField
        TextField();

        // For Number input of Number of hours worked
        TextField_Number_hours();

        // For Number input of Rate per hour
        TextField_Rate_hours();

        // For Compute Button
        Compute_Button();

        // For Clear Button
        Clear_Button();

        // For Exit Button
        Exit_Button();
    }
    public static void main(String[]args){
        new Main();
    }
}
