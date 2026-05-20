/**
 * GymGUI class is made to maintain ArrayList of GymMember class and also hold the
 * object of both class RegularMember and PremiumMember
 *
 * @author (Sabin Shrestha)
 * @version (2025-03-08)
 */
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.List;

public class GymGUI implements ActionListener//implementing action listener
{
    public static void main(String[]args)
    {
        GymGUI obj = new GymGUI();//member is created and assignes the variable as obj
        obj.Home();//home method is called on the object
    }
    private ButtonGroup premium_group;
    private ButtonGroup regular_group;
    ArrayList<GymMember> obj = new ArrayList<GymMember>();//creating arraylist and its object

    //for home panel
    private JFrame frameHome;
    private JPanel panelHome;
    private JButton buttonHomePrem;
    private JButton buttonHomeRegu;
    private JLabel labelHome;
    private JPanel panelPrem;
    private JPanel panelRegu;
    private JButton buttonActMemb;
    private JButton buttonDeActMemb;
    private JButton buttonMarkAtt;
    private JButton buttonSavetoFile;
    private JButton buttonReadfromFile;
    private JButton buttonUpPlan;
    private JButton buttonDisplay;
    private JButton buttonRevertMembership;
    private JButton buttonPayment;
    private JPanel panelActivatemembership;
    private JPanel panelDeactivatemembership;
    private JPanel panelMarkattendence;
    private JPanel panelSavetofile;
    private JPanel panelReadfromfile;
    private JPanel panelUpgradeplan;
    private JPanel panelDisplay;
    private JPanel panelRevertmembership;
    private JPanel panelPayment;

    //for regular members
    private JFrame frame_second;
    private JLabel Regular_title;
    private JButton Regular_backButton;
    private JLabel Regular_idLabel;
    private JTextField Regular_idTextField;
    private JLabel Regular_nameLabel;
    private JTextField Regular_nameTextField;
    private JLabel Regular_emailLabel;
    private JTextField Regular_emailTextField;
    private JLabel Regular_locationLabel;
    private JTextField Regular_locationTextField;
    private JLabel Regular_phoneLabel;
    private JTextField Regular_phoneTextField;
    private JLabel Regular_referalsourceLabel;
    private JTextField Regular_referalsourceTextField;
    private JLabel Regular_genderLabel;
    private JRadioButton Regular_maleRadiobutton;
    private JRadioButton Regular_femaleRadiobutton;
    private JLabel Regular_dobLabel;
    private JComboBox Regular_dobDayCombobox;
    private JComboBox Regular_dobMonthCombobox;
    private JComboBox Regular_dobYearCombobox;
    private JLabel Regular_MemebershipStartDateLabel;
    private JComboBox Regular_MembershipStartDateDayCombobox;
    private JComboBox Regular_MembershipStartDateMonthCombobox;
    private JComboBox Regular_MembershipStartDateYearCombobox;
    private JButton Regular_addMemberButton;
    private JButton Regular_clearButton;

    //for premium member

    private JButton Premium_backButton;
    private JLabel Premium_title;
    private JLabel Premium_idLabel;
    private JTextField Premium_idTextField;
    private JLabel Premium_nameLabel;
    private JTextField Premium_nameTextField;
    private JLabel Premium_emailLabel;
    private JTextField Premium_emailTextField;
    private JLabel Premium_locationLabel;
    private JTextField Premium_locationTextField;
    private JLabel Premium_phoneLabel;
    private JTextField Premium_phoneTextField;
    private JLabel Premium_TrainerLabel;
    private JTextField Premium_TrainerTextField;
    private JLabel Premium_genderLabel;
    private JRadioButton Premium_maleRadiobutton;
    private JRadioButton Premium_femaleRadiobutton;
    private JLabel Premium_dobLabel;
    private JComboBox Premium_dobDayCombobox;
    private JComboBox Premium_dobMonthCombobox;
    private JComboBox Premium_dobYearCombobox;
    private JLabel Premium_MemebershipStartDateLabel;
    private JComboBox Premium_MembershipStartDateDayCombobox;
    private JComboBox Premium_MembershipStartDateMonthCombobox;
    private JComboBox Premium_MembershipStartDateYearCombobox;
    private JButton Premium_addMemberButton;
    private JButton Premium_clearButton;

    //for title in panel
    private JLabel Activatemembership_title;
    private JLabel Deactivatemembership_title;
    private JLabel Markattendence_title;
    private JLabel Savefromfile_title;
    private JLabel Readfromfile_title;
    private JLabel Upgradeplan_title;
    private JLabel Display_title;
    private JLabel Revertmembership_title;
    private JLabel Payment_title;

    //for id in panel
    private JLabel Activatemembership_id;
    private JLabel Deactivatemembership_id;
    private JLabel Markattendence_id;
    private JLabel Upgradeplan_id;
    private JLabel Display_id;
    private JLabel Revertmembership_id;
    private JLabel Payment_id;
    private JLabel Payment_calculatediscount;
    private JLabel Payment_amount;
    private JLabel Upgradeplan_plan;
    private JLabel Upgradeplan_price;

    //for text field of panel of id
    private JTextField Activatemembership_idTextField;
    private JTextField Deactivatemembership_idTextField;
    private JTextField Markattendence_idTextField;
    private JTextField Upgradeplan_idTextField;
    private JTextField Dispaly_idTextField;
    private JTextField Revertmembership_idTextField;
    private JTextField Payment_idTextField;
    private JTextField Payment_calculate_discountTextField;
    private JTextField Payment_amountTextField;
    private JTextField Upgradeplan_priceTextField;

    //for button in panel
    private JButton Activatemembership_button;
    private JButton Deactivatemembership_button;
    private JButton Markattendence_button;
    private JButton Savetofile_button;
    private JButton ReadfromFile_button;
    private JButton Upgradeplan_button;
    private JButton Display_button;
    private JButton Revertmembership_regular_button;
    private JButton Payment_button;
    private JButton Payment_Calculate_Discount_button;

    //clear buuton of all the panel
    private JButton Activatemembership_clear_button;
    private JButton Deactivatemembership_clear_button;
    private JButton MarkAttendence_clear_button;
    private JButton Display_clear_button;
    private JButton Revertmembership_clear_button;
    private JButton Revertmembership_premium_button;
    private JButton Payment_clear_button;
    private JButton Upgradeplan_clear_button;

    private JLabel Revert_RemovalreasonLabel;
    private JTextField Revert_Removalreasontextfield;
    private JComboBox Upgradeplan_combobox;

    public void Home()
    {
        //frame of home page//
        frameHome = new JFrame();
        frameHome.setTitle("SS Gym");
        frameHome.setBounds(100, 0, 1500, 1000);
        frameHome.setLayout(null);
        frameHome.setResizable(false);

        //panel of home page
        panelHome = new JPanel();
        panelHome.setBounds(0, 0, 1500, 1000);
        panelHome.setLayout(null);
        frameHome.add(panelHome);

        //panel of premium member
        panelPrem = new JPanel();
        panelPrem.setLayout(null);
        panelPrem.setBounds(0, 0, 1500, 1000);
        panelPrem.setVisible(false);
        frameHome.add(panelPrem);

        //panel of regular member
        panelRegu = new JPanel();
        panelRegu.setBounds(0, 0, 1500, 1000); 
        panelRegu.setVisible(false);
        panelRegu.setLayout(null);
        frameHome.add(panelRegu);

        //label of home page
        labelHome = new JLabel("SS Gym");
        labelHome.setBounds(650,50 , 300, 100);
        labelHome.setFont(new Font("SansSerif", Font.BOLD, 48));
        panelHome.add(labelHome);

        //button of add premium member
        buttonHomePrem= new JButton("Add Premium Member");
        buttonHomePrem.setBounds(400 , 200 , 300, 100);
        buttonHomePrem.setFont(new Font("SansSerif", Font.BOLD, 16));
        panelHome.add(buttonHomePrem);
        buttonHomePrem.addActionListener(this);
        buttonHomePrem.setFocusable(false);//to off highlight

        //button of add regular member
        buttonHomeRegu = new JButton("Add Regular Member");
        buttonHomeRegu.setBounds(800, 200, 300, 100);
        buttonHomeRegu.setFont(new Font("SansSerif", Font.BOLD, 16));
        panelHome.add(buttonHomeRegu);
        buttonHomeRegu.addActionListener(this);
        buttonHomeRegu.setFocusable(false);

        //for panel of regular member
        //back button of regular panel
        Regular_backButton = new JButton("<");
        Regular_backButton.setBounds(50, 50, 100, 50);
        Regular_backButton.setFont(new Font("SansSerif", Font.BOLD, 44));
        Regular_backButton.setFocusable(false);
        Regular_backButton.addActionListener(this);
        panelRegu.add(Regular_backButton);

        //label of title of regular member in regular panel
        Regular_title = new JLabel("REGULAR MEMBER");
        Regular_title.setBounds(500, 50, 500, 50);
        Regular_title.setFont(new Font("SansSerif", Font.BOLD, 44));
        panelRegu.add(Regular_title);

        //label of id in regular panel
        Regular_idLabel = new JLabel("ID");
        Regular_idLabel.setBounds(100, 150, 200, 30);
        Regular_idLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelRegu.add(Regular_idLabel);

        //textfield of id
        Regular_idTextField = new JTextField();
        Regular_idTextField.setBounds(350, 150, 200, 30);
        panelRegu.add(Regular_idTextField);

        //label of name
        Regular_nameLabel = new JLabel("NAME");
        Regular_nameLabel.setBounds(100, 230, 200, 30);
        Regular_nameLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelRegu.add(Regular_nameLabel);

        //textfield of name
        Regular_nameTextField = new JTextField();
        Regular_nameTextField.setBounds(350, 230, 200, 30);
        panelRegu.add(Regular_nameTextField);

        //label of location
        Regular_locationLabel = new JLabel("LOCATION");
        Regular_locationLabel.setBounds(100, 310, 200, 30);
        Regular_locationLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelRegu.add(Regular_locationLabel);

        //textfield of location
        Regular_locationTextField = new JTextField();
        Regular_locationTextField.setBounds(350, 310, 200, 30);
        panelRegu.add(Regular_locationTextField);

        //label of phone
        Regular_phoneLabel = new JLabel("PHONE");
        Regular_phoneLabel.setBounds(100, 390, 200, 30);
        Regular_phoneLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelRegu.add(Regular_phoneLabel);

        //textfield of phone
        Regular_phoneTextField = new JTextField();
        Regular_phoneTextField.setBounds(350, 390, 200, 30);
        panelRegu.add(Regular_phoneTextField);

        //label of email
        Regular_emailLabel = new JLabel("EMAIL");
        Regular_emailLabel.setBounds(700, 150 , 200, 30);
        Regular_emailLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelRegu.add(Regular_emailLabel);

        //textfield of email
        Regular_emailTextField = new JTextField();
        Regular_emailTextField.setBounds(1050, 150, 200, 30);
        panelRegu.add(Regular_emailTextField);

        //label of referal source
        Regular_referalsourceLabel = new JLabel("REFERAL SOURCE");
        Regular_referalsourceLabel.setBounds(700, 230 , 300, 30);
        Regular_referalsourceLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelRegu.add(Regular_referalsourceLabel);

        //textfield of referal source
        Regular_referalsourceTextField = new JTextField();
        Regular_referalsourceTextField.setBounds(1050, 230, 200, 30);
        panelRegu.add(Regular_referalsourceTextField);

        //label of gender
        Regular_genderLabel = new JLabel("GENDER");
        Regular_genderLabel.setBounds(700, 310 , 300, 30);
        Regular_genderLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelRegu.add(Regular_genderLabel);

        //Jbutton of male
        Regular_maleRadiobutton = new JRadioButton("MALE");
        Regular_maleRadiobutton.setBounds(1050, 310, 100, 30);
        Regular_maleRadiobutton.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelRegu.add(Regular_maleRadiobutton);

        //Jbutton of female
        Regular_femaleRadiobutton = new JRadioButton("FEMALE");
        Regular_femaleRadiobutton.setBounds(1200, 310, 150, 30);
        Regular_femaleRadiobutton.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelRegu.add(Regular_femaleRadiobutton);

        //grouping the button
        regular_group = new ButtonGroup();
        regular_group.add(Regular_maleRadiobutton);
        regular_group.add(Regular_femaleRadiobutton);

        //lable of dob
        Regular_dobLabel= new JLabel("DOB");
        Regular_dobLabel.setBounds(700, 390 , 150, 30);
        Regular_dobLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelRegu.add(Regular_dobLabel);

        //label of membership start date
        Regular_MemebershipStartDateLabel= new JLabel("MEMBERSHIP START DATE");
        Regular_MemebershipStartDateLabel.setBounds(100,470 , 350, 30);
        Regular_MemebershipStartDateLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelRegu.add(Regular_MemebershipStartDateLabel);

        //for add member button of regular panel
        Regular_addMemberButton = new JButton("ADD MEMBER");
        Regular_addMemberButton.setBounds(400, 650 , 300, 100);
        Regular_addMemberButton.setFont(new Font("SansSerif", Font.BOLD, 24));
        Regular_addMemberButton.setFocusable(false);
        panelRegu.add(Regular_addMemberButton);
        Regular_addMemberButton.addActionListener(this);

        //for clear button of regular panel
        Regular_clearButton = new JButton("CLEAR");
        Regular_clearButton.setBounds(800, 650 , 300, 100);
        Regular_clearButton.setFont(new Font("SansSerif", Font.BOLD, 24));
        Regular_clearButton.setFocusable(false);
        Regular_clearButton.addActionListener(this);
        panelRegu.add(Regular_clearButton);

        //for dob combo box
        String[] dobday = new String[32];
        dobday[0] = "DAY";
        for(int i=1;i<=31;i++)
        {
            dobday[i]=String.valueOf(i);
        }

        Regular_dobDayCombobox = new JComboBox(dobday);
        Regular_dobDayCombobox.setBounds(1280, 390, 150, 30);
        panelRegu.add(Regular_dobDayCombobox);

        String[] dobmonth = {"MONTH","JANUARY","FEBURARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        Regular_dobMonthCombobox = new JComboBox(dobmonth);
        Regular_dobMonthCombobox.setBounds(1080, 390, 150, 30);
        panelRegu.add(Regular_dobMonthCombobox);

        String[] Regular_dobyear = new String[51];
        Regular_dobyear[0]="YEAR";
        for(int i=1;i<=50;i++)
        {
            int dobcalculated_year = 2021-i;
            Regular_dobyear[i] = String.valueOf(dobcalculated_year);
        }

        Regular_dobYearCombobox = new JComboBox(Regular_dobyear);
        Regular_dobYearCombobox.setBounds(880, 390, 150, 30);
        panelRegu.add(Regular_dobYearCombobox);

        //for membershipstart date combobox
        String[] Regular_membershipStartDay = new String[32];
        Regular_membershipStartDay[0] = "DAY";
        for(int i=1;i<=31;i++)
        {
            Regular_membershipStartDay[i]=String.valueOf(i);
        }

        Regular_MembershipStartDateDayCombobox = new JComboBox(Regular_membershipStartDay);
        Regular_MembershipStartDateDayCombobox.setBounds(950, 470, 150, 30);
        panelRegu.add(Regular_MembershipStartDateDayCombobox);

        String[] Regular_membershipStartMonth = {"MONTH","JANUARY","FEBURARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        Regular_MembershipStartDateMonthCombobox = new JComboBox(Regular_membershipStartMonth);
        Regular_MembershipStartDateMonthCombobox.setBounds(750, 470, 150, 30);
        panelRegu.add(Regular_MembershipStartDateMonthCombobox);

        String[] Regular_membershipStartYear = new String[51];
        Regular_membershipStartYear[0]="YEAR";
        for(int i=1;i<=50;i++)
        {
            int membershipStartcalculated_year = 2026-i;
            Regular_membershipStartYear[i] = String.valueOf(membershipStartcalculated_year);
        }

        Regular_MembershipStartDateYearCombobox = new JComboBox(Regular_membershipStartYear);
        Regular_MembershipStartDateYearCombobox.setBounds(550, 470, 150, 30);
        panelRegu.add(Regular_MembershipStartDateYearCombobox);

        //button of activate membership           
        buttonActMemb = new JButton("Activate Membership");
        buttonActMemb.setBounds(150, 350, 300, 100);
        buttonActMemb.setFont(new Font("SansSerif", Font.BOLD, 16));
        panelHome.add(buttonActMemb);
        buttonActMemb.addActionListener(this);

        buttonActMemb.setFocusable(false);
        //button of deactivate membership
        buttonDeActMemb = new JButton("Deactivate Membership");
        buttonDeActMemb.setBounds(150, 500, 300, 100);
        buttonDeActMemb.setFont(new Font("SansSerif", Font.BOLD, 16));
        panelHome.add(buttonDeActMemb);
        buttonDeActMemb.addActionListener(this);
        buttonDeActMemb.setFocusable(false);

        //button of mark attendence
        buttonMarkAtt = new JButton("Mark Attendence");
        buttonMarkAtt.setBounds(150, 650, 300, 100);
        buttonMarkAtt.setFont(new Font("SansSerif", Font.BOLD, 16));
        panelHome.add(buttonMarkAtt);
        buttonMarkAtt.addActionListener(this);
        buttonMarkAtt.setFocusable(false);

        //button of save to file
        buttonSavetoFile = new JButton("Save to File");
        buttonSavetoFile.setBounds(600, 350, 300, 100);
        buttonSavetoFile.setFont(new Font("SansSerif", Font.BOLD, 16));
        panelHome.add(buttonSavetoFile);
        buttonSavetoFile.addActionListener(this);
        buttonSavetoFile.setFocusable(false);

        //button of read from file
        buttonReadfromFile = new JButton("Read from File");
        buttonReadfromFile.setBounds(600, 500, 300, 100);
        buttonReadfromFile.setFont(new Font("SansSerif", Font.BOLD, 16));
        panelHome.add(buttonReadfromFile);
        buttonReadfromFile.addActionListener(this);
        buttonReadfromFile.setFocusable(false);

        //button of upgrade plan
        buttonUpPlan = new JButton("Upgrade Plan");
        buttonUpPlan.setBounds(600, 650, 300, 100);
        buttonUpPlan.setFont(new Font("SansSerif", Font.BOLD, 16));
        panelHome.add(buttonUpPlan);
        buttonUpPlan.addActionListener(this);
        buttonUpPlan.setFocusable(false);

        //button of display
        buttonDisplay = new JButton("Display");
        buttonDisplay.setBounds(1000, 350, 300, 100);
        buttonDisplay.setFont(new Font("SansSerif", Font.BOLD, 16));
        panelHome.add(buttonDisplay);
        buttonDisplay.addActionListener(this);
        buttonDisplay.setFocusable(false);

        //button of revert membership
        buttonRevertMembership = new JButton("Revert Membership");
        buttonRevertMembership.setBounds(1000, 500, 300, 100);
        buttonRevertMembership.setFont(new Font("SansSerif", Font.BOLD, 16));
        panelHome.add(buttonRevertMembership);
        buttonRevertMembership.addActionListener(this);
        buttonRevertMembership.setFocusable(false);

        //button of payment
        buttonPayment = new JButton("Payment");
        buttonPayment.setBounds(1000, 650, 300, 100);
        buttonPayment.setFont(new Font("SansSerif", Font.BOLD, 16));
        panelHome.add(buttonPayment);
        buttonPayment.addActionListener(this);
        buttonPayment.setFocusable(false);

        //for panel of premium member
        //back button of premium panel
        Premium_backButton = new JButton("<");
        Premium_backButton.setBounds(50, 50, 100, 50);
        Premium_backButton.setFont(new Font("SansSerif", Font.BOLD, 44));
        Premium_backButton.setFocusable(false);
        Premium_backButton.addActionListener(this);
        panelPrem.add(Premium_backButton);

        //title of premium member
        Premium_title = new JLabel("PREMIUM MEMBER");
        Premium_title.setBounds(500, 50, 500, 50);
        Premium_title.setFont(new Font("SansSerif", Font.BOLD, 44));
        panelPrem.add(Premium_title);

        //label of id in regular panel
        Premium_idLabel = new JLabel("ID");
        Premium_idLabel.setBounds(100, 150, 200, 30);
        Premium_idLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPrem.add(Premium_idLabel);

        //textfield of id
        Premium_idTextField = new JTextField();
        Premium_idTextField.setBounds(350, 150, 200, 30);
        panelPrem.add(Premium_idTextField);

        //label of name
        Premium_nameLabel = new JLabel("NAME");
        Premium_nameLabel.setBounds(100, 230, 200, 30);
        Premium_nameLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPrem.add(Premium_nameLabel);

        //textfield of name
        Premium_nameTextField = new JTextField();
        Premium_nameTextField.setBounds(350, 230, 200, 30);
        panelPrem.add(Premium_nameTextField);

        //label of location
        Premium_locationLabel = new JLabel("LOCATION");
        Premium_locationLabel.setBounds(100, 310, 200, 30);
        Premium_locationLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPrem.add(Premium_locationLabel);

        //textfield of location
        Premium_locationTextField = new JTextField();
        Premium_locationTextField.setBounds(350, 310, 200, 30);
        panelPrem.add(Premium_locationTextField);

        //label of phone
        Premium_phoneLabel = new JLabel("PHONE");
        Premium_phoneLabel.setBounds(100, 390, 200, 30);
        Premium_phoneLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPrem.add(Premium_phoneLabel);

        //textfield of phone
        Premium_phoneTextField = new JTextField();
        Premium_phoneTextField.setBounds(350, 390, 200, 30);
        panelPrem.add(Premium_phoneTextField);

        //label of email
        Premium_emailLabel = new JLabel("EMAIL");
        Premium_emailLabel.setBounds(700, 150 , 200, 30);
        Premium_emailLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPrem.add(Premium_emailLabel);

        //textfield of email
        Premium_emailTextField = new JTextField();
        Premium_emailTextField.setBounds(1050, 150, 200, 30);
        panelPrem.add(Premium_emailTextField);

        //label of trainer
        Premium_TrainerLabel = new JLabel("TRAINER");
        Premium_TrainerLabel.setBounds(700, 230 , 300, 30);
        Premium_TrainerLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPrem.add(Premium_TrainerLabel);

        //textfield of trainer
        Premium_TrainerTextField = new JTextField();
        Premium_TrainerTextField.setBounds(1050, 230, 200, 30);
        panelPrem.add(Premium_TrainerTextField);

        //label of gender
        Premium_genderLabel = new JLabel("GENDER");
        Premium_genderLabel.setBounds(700, 310 , 300, 30);
        Premium_genderLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPrem.add(Premium_genderLabel);

        //radiobutton of male
        Premium_maleRadiobutton = new JRadioButton("MALE");
        Premium_maleRadiobutton.setBounds(1050, 310, 100, 30);
        Premium_maleRadiobutton.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPrem.add(Premium_maleRadiobutton);

        //radiobutton of female
        Premium_femaleRadiobutton = new JRadioButton("FEMALE");
        Premium_femaleRadiobutton.setBounds(1200, 310, 150, 30);
        Premium_femaleRadiobutton.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPrem.add(Premium_femaleRadiobutton);

        //grouping radiobutton
        premium_group = new ButtonGroup();
        premium_group.add(Premium_maleRadiobutton);
        premium_group.add(Premium_femaleRadiobutton);

        //label of dob
        Premium_dobLabel= new JLabel("DOB");
        Premium_dobLabel.setBounds(700, 390 , 150, 30);
        Premium_dobLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPrem.add(Premium_dobLabel);

        //label of mambershipstartdate
        Premium_MemebershipStartDateLabel= new JLabel("MEMBERSHIP START DATE");
        Premium_MemebershipStartDateLabel.setBounds(100,470 , 350, 30);
        Premium_MemebershipStartDateLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPrem.add(Premium_MemebershipStartDateLabel);

        //for add member button of premium panel
        Premium_addMemberButton = new JButton("ADD MEMBER");
        Premium_addMemberButton.setBounds(400, 650 , 300, 100);
        Premium_addMemberButton.setFont(new Font("SansSerif", Font.BOLD, 24));
        Premium_addMemberButton.setFocusable(false);
        Premium_addMemberButton.addActionListener(this);
        panelPrem.add(Premium_addMemberButton);

        //for clear button of premium panel
        Premium_clearButton = new JButton("CLEAR");
        Premium_clearButton.setBounds(800, 650 , 300, 100);
        Premium_clearButton.setFont(new Font("SansSerif", Font.BOLD, 24));
        Premium_clearButton.setFocusable(false);
        Premium_clearButton.addActionListener(this);
        panelPrem.add(Premium_clearButton);

        //for dob combo box
        String[] Premium_dobday = new String[32];
        Premium_dobday[0] = "DAY";
        for(int i=1;i<=31;i++)
        {
            Premium_dobday[i]=String.valueOf(i);
        }

        Premium_dobDayCombobox = new JComboBox(Premium_dobday);
        Premium_dobDayCombobox.setBounds(1280, 390, 150, 30);
        panelPrem.add(Premium_dobDayCombobox);

        String[] Premium_dobmonth = {"MONTH","JANUARY","FEBURARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        Premium_dobMonthCombobox = new JComboBox(Premium_dobmonth);
        Premium_dobMonthCombobox.setBounds(1080, 390, 150, 30);
        panelPrem.add(Premium_dobMonthCombobox);

        String[] Premium_dobyear = new String[51];
        Premium_dobyear[0]="YEAR";
        for(int i=1;i<=50;i++)
        {
            int Premium_dobcalculated_year = 2021-i;
            Premium_dobyear[i] = String.valueOf(Premium_dobcalculated_year);
        }

        Premium_dobYearCombobox = new JComboBox(Premium_dobyear);
        Premium_dobYearCombobox.setBounds(880, 390, 150, 30);
        panelPrem.add(Premium_dobYearCombobox);

        //for membershipstart date combobox
        String[] Premium_membershipStartDay = new String[32];
        Premium_membershipStartDay[0] = "DAY";
        for(int i=1;i<=31;i++)
        {
            Premium_membershipStartDay[i]=String.valueOf(i);
        }

        Premium_MembershipStartDateDayCombobox = new JComboBox(Premium_membershipStartDay);
        Premium_MembershipStartDateDayCombobox.setBounds(950, 470, 150, 30);
        panelPrem.add(Premium_MembershipStartDateDayCombobox);

        String[] Premium_membershipStartMonth = {"MONTH","JANUARY","FEBURARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        Premium_MembershipStartDateMonthCombobox = new JComboBox(Premium_membershipStartMonth);
        Premium_MembershipStartDateMonthCombobox.setBounds(750, 470, 150, 30);
        panelPrem.add(Premium_MembershipStartDateMonthCombobox);

        String[] Premium_membershipStartYear = new String[51];
        Premium_membershipStartYear[0]="YEAR";
        for(int i=1;i<=50;i++)
        {
            int Premium_membershipStartcalculated_year = 2026-i;
            Premium_membershipStartYear[i] = String.valueOf(Premium_membershipStartcalculated_year);
        }

        Premium_MembershipStartDateYearCombobox = new JComboBox(Premium_membershipStartYear);
        Premium_MembershipStartDateYearCombobox.setBounds(550, 470, 150, 30);
        panelPrem.add(Premium_MembershipStartDateYearCombobox);

        frameHome.setVisible(true);//setting visibility
    }

    public void framesecond()
    {
        frame_second = new JFrame();
        frame_second.setTitle("SS Gym");
        frame_second.setLayout(null);
        frame_second.setBounds(500, 200, 500, 700);
        frame_second.setResizable(true);

        //panel of activate member
        panelActivatemembership = new JPanel();
        panelActivatemembership.setLayout(null);
        panelActivatemembership.setBounds(0, 0, 500, 700); 
        panelActivatemembership.setVisible(false);

        //title of activate membership
        Activatemembership_title = new JLabel("<html>ACTIVATE <br>MEMBERSHIP</html>");
        Activatemembership_title.setBounds(50, 0, 400, 200);
        Activatemembership_title.setFont(new Font("SansSerif", Font.BOLD, 48));
        panelActivatemembership.add(Activatemembership_title);

        //id label
        Activatemembership_id = new JLabel("ID");
        Activatemembership_id.setBounds(50, 250, 100, 30);
        Activatemembership_id.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelActivatemembership.add(Activatemembership_id);

        //id textfield
        Activatemembership_idTextField = new JTextField();
        Activatemembership_idTextField.setBounds(130, 250, 150, 30);
        panelActivatemembership.add(Activatemembership_idTextField);

        //activate button
        Activatemembership_button = new JButton("ACTIVATE");
        Activatemembership_button.setBounds(100, 400, 300, 50);
        Activatemembership_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Activatemembership_button.setFocusable(false);
        Activatemembership_button.addActionListener(this);
        panelActivatemembership.add(Activatemembership_button);

        //claer button
        Activatemembership_clear_button = new JButton("CLEAR");
        Activatemembership_clear_button.setBounds(100, 500, 300, 50);
        Activatemembership_clear_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Activatemembership_clear_button.setFocusable(false);
        Activatemembership_clear_button.addActionListener(this);
        panelActivatemembership.add(Activatemembership_clear_button);

        //panel of Deactivate membership
        panelDeactivatemembership = new JPanel();
        panelDeactivatemembership.setLayout(null);
        panelDeactivatemembership.setBounds(0, 0, 500, 700); 
        panelDeactivatemembership.setVisible(false);

        //title of deactivate membership
        Deactivatemembership_title = new JLabel("<html>DEACTIVATE <br>MEMBERSHIP</html>");
        Deactivatemembership_title.setBounds(50, 0, 400, 200);
        Deactivatemembership_title.setFont(new Font("SansSerif", Font.BOLD, 48));
        panelDeactivatemembership.add(Deactivatemembership_title);

        //id label
        Deactivatemembership_id = new JLabel("ID");
        Deactivatemembership_id.setBounds(50, 250, 100, 30);
        Deactivatemembership_id.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelDeactivatemembership.add(Deactivatemembership_id);

        //id textfield
        Deactivatemembership_idTextField = new JTextField();
        Deactivatemembership_idTextField.setBounds(130, 250, 150, 30);
        panelDeactivatemembership.add(Deactivatemembership_idTextField);

        //deactivate button
        Deactivatemembership_button = new JButton("DEACTIVATE");
        Deactivatemembership_button.setBounds(100, 400, 300, 50);
        Deactivatemembership_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Deactivatemembership_button.setFocusable(false);
        Deactivatemembership_button.addActionListener(this);
        panelDeactivatemembership.add(Deactivatemembership_button);

        //clear button
        Deactivatemembership_clear_button = new JButton("CLEAR");
        Deactivatemembership_clear_button.setBounds(100, 500, 300, 50);
        Deactivatemembership_clear_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Deactivatemembership_clear_button.setFocusable(false);
        Deactivatemembership_clear_button.addActionListener(this);
        panelDeactivatemembership.add(Deactivatemembership_clear_button);

        //panel of Mark Attendence
        panelMarkattendence = new JPanel();
        panelMarkattendence.setLayout(null);
        panelMarkattendence.setBounds(0, 0, 500, 700); 
        panelMarkattendence.setVisible(false);

        //mark attendence title
        Markattendence_title = new JLabel("<html>MARK <br>ATTENDENCE</html>");
        Markattendence_title.setBounds(50, 0, 400, 200);
        Markattendence_title.setFont(new Font("SansSerif", Font.BOLD, 48));
        panelMarkattendence.add(Markattendence_title);

        //id label
        Markattendence_id = new JLabel("ID");
        Markattendence_id.setBounds(50, 250, 100, 30);
        Markattendence_id.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelMarkattendence.add(Markattendence_id);

        //id textfield
        Markattendence_idTextField = new JTextField();
        Markattendence_idTextField.setBounds(130, 250, 150, 30);
        panelMarkattendence.add(Markattendence_idTextField);

        //mark attendence button
        Markattendence_button = new JButton("MARK ATTENDENCE");
        Markattendence_button.setBounds(100, 400, 300, 50);
        Markattendence_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Markattendence_button.setFocusable(false);
        Markattendence_button.addActionListener(this);
        panelMarkattendence.add(Markattendence_button);

        //clear button
        MarkAttendence_clear_button = new JButton("CLEAR");
        MarkAttendence_clear_button.setBounds(100, 500, 300, 50);
        MarkAttendence_clear_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        MarkAttendence_clear_button.setFocusable(false);
        MarkAttendence_clear_button.addActionListener(this);
        panelMarkattendence.add(MarkAttendence_clear_button);

        //panel of Display
        panelDisplay = new JPanel();
        panelDisplay.setLayout(null);
        panelDisplay.setBounds(0, 0, 500, 700); 
        panelDisplay.setVisible(false);

        //title display
        Display_title = new JLabel("DISPLAY");
        Display_title.setBounds(50, 0, 400, 200);
        Display_title.setFont(new Font("SansSerif", Font.BOLD, 48));
        panelDisplay.add(Display_title);

        //id label
        Display_id = new JLabel("ID");
        Display_id.setBounds(50, 250, 100, 30);
        Display_id.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelDisplay.add(Display_id);

        //id textfield
        Dispaly_idTextField = new JTextField();
        Dispaly_idTextField.setBounds(130, 250, 150, 30);
        panelDisplay.add(Dispaly_idTextField);

        //display button
        Display_button = new JButton("DISPLAY");
        Display_button.setBounds(100, 400, 300, 50);
        Display_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Display_button.setFocusable(false);
        Display_button.addActionListener(this);
        panelDisplay.add(Display_button);

        //clear button
        Display_clear_button = new JButton("CLEAR");
        Display_clear_button.setBounds(100, 500, 300, 50);
        Display_clear_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Display_clear_button.setFocusable(false);
        Display_clear_button.addActionListener(this);
        panelDisplay.add(Display_clear_button);

        //panel of revert membership
        panelRevertmembership = new JPanel();
        panelRevertmembership.setLayout(null);
        panelRevertmembership.setBounds(0, 0, 500, 700); 
        panelRevertmembership.setVisible(false);

        //title of revert membership
        Revertmembership_title = new JLabel("<html>REVERT <br>MEMBERSHIP</html>");
        Revertmembership_title.setBounds(50, 0, 400, 200);
        Revertmembership_title.setFont(new Font("SansSerif", Font.BOLD, 48));
        panelRevertmembership.add(Revertmembership_title);

        //id label
        Revertmembership_id = new JLabel("ID");
        Revertmembership_id.setBounds(50, 200, 100, 30);
        Revertmembership_id.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelRevertmembership.add(Revertmembership_id);

        //id textfield
        Revertmembership_idTextField = new JTextField();
        Revertmembership_idTextField.setBounds(170, 200, 150, 30);
        panelRevertmembership.add(Revertmembership_idTextField);

        //reason label
        Revert_RemovalreasonLabel = new JLabel("REASON");
        Revert_RemovalreasonLabel.setBounds(20, 250, 150, 30);
        Revert_RemovalreasonLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelRevertmembership.add(Revert_RemovalreasonLabel);

        //reason textfield
        Revert_Removalreasontextfield = new JTextField();
        Revert_Removalreasontextfield.setBounds(170, 250, 250, 50);
        panelRevertmembership.add(Revert_Removalreasontextfield);

        //revert premium button
        Revertmembership_premium_button = new JButton("REVERT PREMIUM");
        Revertmembership_premium_button.setBounds(100, 350, 300, 50);
        Revertmembership_premium_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Revertmembership_premium_button.setFocusable(false);
        Revertmembership_premium_button.addActionListener(this);
        panelRevertmembership.add(Revertmembership_premium_button);

        //revert regular button
        Revertmembership_regular_button = new JButton("REVERT REGULAR");
        Revertmembership_regular_button.setBounds(100, 450, 300, 50);
        Revertmembership_regular_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Revertmembership_regular_button.setFocusable(false);
        Revertmembership_regular_button.addActionListener(this);
        panelRevertmembership.add(Revertmembership_regular_button);

        //clear button
        Revertmembership_clear_button = new JButton("CLEAR");
        Revertmembership_clear_button.setBounds(100, 550, 300, 50);
        Revertmembership_clear_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Revertmembership_clear_button.setFocusable(false);
        Revertmembership_clear_button.addActionListener(this);
        panelRevertmembership.add(Revertmembership_clear_button);

        //panel of payment

        panelPayment = new JPanel();
        panelPayment.setLayout(null);
        panelPayment.setBounds(0, 0, 500, 700); 
        panelPayment.setVisible(false);

        //title payment
        Payment_title = new JLabel("PAYMENT");
        Payment_title.setBounds(50, 0, 400, 200);
        Payment_title.setFont(new Font("SansSerif", Font.BOLD, 48));
        panelPayment.add(Payment_title);

        //label id
        Payment_id = new JLabel("ID");
        Payment_id.setBounds(50, 200, 100, 30);
        Payment_id.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPayment.add(Payment_id);

        //id textfield
        Payment_idTextField = new JTextField();
        Payment_idTextField.setBounds(170, 200, 150, 30);
        panelPayment.add(Payment_idTextField);

        //amount label
        Payment_amount = new JLabel("AMOUNT");
        Payment_amount.setBounds(20, 250, 150, 30);
        Payment_amount.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPayment.add(Payment_amount);

        //amount textfield
        Payment_amountTextField = new JTextField();
        Payment_amountTextField.setBounds(170, 250, 150, 30);
        panelPayment.add(Payment_amountTextField);

        //discount label
        Payment_calculatediscount = new JLabel("DISCOUNT");
        Payment_calculatediscount.setBounds(20, 300, 150, 30);
        Payment_calculatediscount.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelPayment.add(Payment_calculatediscount);

        //discount text field
        Payment_calculate_discountTextField = new JTextField();
        Payment_calculate_discountTextField.setBounds(170, 300, 150, 30);
        panelPayment.add(Payment_calculate_discountTextField);
        Payment_calculate_discountTextField.setEditable(false);

        //payment button
        Payment_button = new JButton("PAYMENT");
        Payment_button.setBounds(100, 400, 300, 50);
        Payment_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Payment_button.setFocusable(false);
        Payment_button.addActionListener(this);
        panelPayment.add(Payment_button);

        //claculate discount button
        Payment_Calculate_Discount_button = new JButton("CALCULATE DISCOUNT");
        Payment_Calculate_Discount_button.setBounds(100, 480, 300, 50);
        Payment_Calculate_Discount_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Payment_Calculate_Discount_button.setFocusable(false);
        Payment_Calculate_Discount_button.addActionListener(this);
        panelPayment.add(Payment_Calculate_Discount_button);

        //clear button
        Payment_clear_button = new JButton("CLEAR");
        Payment_clear_button.setBounds(100, 580, 300, 50);
        Payment_clear_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Payment_clear_button.setFocusable(false);
        Payment_clear_button.addActionListener(this);
        panelPayment.add(Payment_clear_button);

        //panel of upgrade plan

        panelUpgradeplan = new JPanel();
        panelUpgradeplan.setLayout(null);
        panelUpgradeplan.setBounds(0, 0, 500, 700); 
        panelUpgradeplan.setVisible(false);

        //title upgrade
        Upgradeplan_title = new JLabel("UPGRADE");
        Upgradeplan_title.setBounds(50, 0, 400, 200);
        Upgradeplan_title.setFont(new Font("SansSerif", Font.BOLD, 48));
        panelUpgradeplan.add(Upgradeplan_title);

        //id label
        Upgradeplan_id = new JLabel("ID");
        Upgradeplan_id.setBounds(50, 200, 100, 30);
        Upgradeplan_id.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelUpgradeplan.add(Upgradeplan_id);

        //id textfield
        Upgradeplan_idTextField = new JTextField();
        Upgradeplan_idTextField.setBounds(170, 200, 150, 30);
        panelUpgradeplan.add(Upgradeplan_idTextField);

        //plan label
        Upgradeplan_plan = new JLabel("PLAN");
        Upgradeplan_plan.setBounds(50, 250, 100, 30);
        Upgradeplan_plan.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelUpgradeplan.add(Upgradeplan_plan);

        //plan combobox
        String[] Upgradeplan = {"BASIC","STANDARD","DELUXE"};
        Upgradeplan_combobox = new JComboBox(Upgradeplan);
        Upgradeplan_combobox.setBounds(170, 250, 200, 30);
        panelUpgradeplan.add(Upgradeplan_combobox);

        Upgradeplan_combobox.addActionListener(new ActionListener()//plan combobox action listener
            {
                public void actionPerformed(ActionEvent e) {
                    String plan = (String) Upgradeplan_combobox.getSelectedItem();

                    // Define price dynamically
                    String price = "";
                    if (plan.equals("BASIC")) {
                        price = "6500";
                    } else if (plan.equals("STANDARD")) {
                        price = "12500";
                    } else if (plan.equals("DELUXE")) {
                        price = "18500";
                    }

                    // Set price in your existing text field
                    Upgradeplan_priceTextField.setText(price);
                }
            });

        //upgrade plan button
        Upgradeplan_button = new JButton("UPGRADE");
        Upgradeplan_button.setBounds(100, 480, 300, 50);
        Upgradeplan_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Upgradeplan_button.setFocusable(false);
        Upgradeplan_button.addActionListener(this);
        panelUpgradeplan.add(Upgradeplan_button);

        //clear button
        Upgradeplan_clear_button = new JButton("CLEAR");
        Upgradeplan_clear_button.setBounds(100, 580, 300, 50);
        Upgradeplan_clear_button.setFont(new Font("SansSerif", Font.BOLD, 16));
        Upgradeplan_clear_button.setFocusable(false);
        Upgradeplan_clear_button.addActionListener(this);
        panelUpgradeplan.add(Upgradeplan_clear_button);

        //price label
        Upgradeplan_price = new JLabel("PRICE");
        Upgradeplan_price.setBounds(20, 300, 150, 30);
        Upgradeplan_price.setFont(new Font("SansSerif", Font.BOLD, 24));
        panelUpgradeplan.add(Upgradeplan_price);

        //price textfield
        Upgradeplan_priceTextField = new JTextField();
        Upgradeplan_priceTextField.setBounds(170, 300, 150, 30);
        panelUpgradeplan.add(Upgradeplan_priceTextField);
        Upgradeplan_priceTextField.setEditable(false);

        //adding panel to frame
        frame_second.add(panelActivatemembership);
        frame_second.add(panelDeactivatemembership);
        frame_second.add(panelMarkattendence);
        frame_second.add(panelDisplay);
        frame_second.add(panelRevertmembership);
        frame_second.add(panelUpgradeplan);

        /*frame_second.add(panelSavetofile);
        frame_second.add(panelReadfromfile);*/

        frame_second.add(panelPayment);
        frame_second.setVisible(true);
    }

    //display method for regular member
    public void display_regular_member(int id,String name,String location,String phone,String email,String gender,String DOB,String membershipStart,
    String referalSource,String attendance,String loyalitypoints,String plan,String PlanPrice,String activeStatus)
    {
        JFrame frame = new JFrame("Regular Member Display ");
        frame.setBounds(300, 200, 500, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel title = new JLabel("REGULAR MEMBERS:");
        title.setBounds(20, 20, 200, 20);
        frame.add(title);

        JLabel label_id = new JLabel("ID:");
        label_id.setBounds(20, 50, 200, 20);
        frame.add(label_id);
        JLabel id_value = new JLabel(String.valueOf(id));
        id_value.setBounds(200, 50, 200, 20);
        frame.add(id_value);

        JLabel label_name = new JLabel("NAME:");
        label_name.setBounds(20, 80, 200, 20);
        frame.add(label_name);
        JLabel name_value = new JLabel(name);
        name_value.setBounds(200, 80, 200, 20);
        frame.add(name_value);

        JLabel label_location = new JLabel("LOCATION:");
        label_location.setBounds(20, 110, 200, 20);
        frame.add(label_location);
        JLabel location_value = new JLabel(location);
        location_value.setBounds(200, 110, 200, 20);
        frame.add(location_value);

        JLabel label_phone = new JLabel("PHONE:");
        label_phone.setBounds(20, 140, 200, 20);
        frame.add(label_phone);
        JLabel phone_value = new JLabel(phone);
        phone_value.setBounds(200, 140, 200, 20);
        frame.add(phone_value);

        JLabel label_email = new JLabel("EMAIL:");
        label_email.setBounds(20, 170, 200, 20);
        frame.add(label_email);
        JLabel email_value = new JLabel(email);
        email_value.setBounds(200, 170, 200, 20);
        frame.add(email_value);

        JLabel label_gender = new JLabel("GENDER:");
        label_gender.setBounds(20, 200, 200, 20);
        frame.add(label_gender);
        JLabel gender_value = new JLabel(gender);
        gender_value.setBounds(200, 200, 200, 20);
        frame.add(gender_value);

        JLabel label_DOB = new JLabel("DOB:");
        label_DOB.setBounds(20, 230, 200, 20);
        frame.add(label_DOB);
        JLabel DOB_value = new JLabel(DOB);
        DOB_value.setBounds(200, 230, 200, 20);
        frame.add(DOB_value);

        JLabel label_membershipStart = new JLabel("START DATE:");
        label_membershipStart.setBounds(20, 260, 200, 20);
        frame.add(label_membershipStart);
        JLabel membershipStart_value = new JLabel(membershipStart);
        membershipStart_value.setBounds(200, 260, 200, 20);
        frame.add(membershipStart_value);

        JLabel label_referalSource = new JLabel("REFERAL SOURCE:");
        label_referalSource.setBounds(20, 290, 200, 20);
        frame.add(label_referalSource);
        JLabel referalSource_value = new JLabel(referalSource);
        referalSource_value.setBounds(200, 290, 200, 20);
        frame.add(referalSource_value);

        JLabel label_attendance = new JLabel("ATTENDANCE:");
        label_attendance.setBounds(20, 320, 200, 20);
        frame.add(label_attendance);
        JLabel attendance_value = new JLabel(attendance);
        attendance_value.setBounds(200, 320, 200, 20);
        frame.add(attendance_value);

        JLabel label_loyalitypoints= new JLabel("LOYALITY POINTS:");
        label_loyalitypoints.setBounds(20, 350, 200, 20);
        frame.add(label_loyalitypoints);
        JLabel loyalitypoints_value = new JLabel(loyalitypoints);
        loyalitypoints_value.setBounds(200, 350, 200, 20);
        frame.add(loyalitypoints_value);

        JLabel label_plan= new JLabel("PLAN:");
        label_plan.setBounds(20, 380, 200, 20);
        frame.add(label_plan);
        JLabel plan_value = new JLabel(plan);
        plan_value.setBounds(200, 380, 200, 20);
        frame.add(plan_value);

        JLabel label_price= new JLabel("PRICE:");
        label_price.setBounds(20, 410, 200, 20);
        frame.add(label_price);
        JLabel price_value = new JLabel(PlanPrice);
        price_value.setBounds(200, 410, 200, 20);
        frame.add(price_value);

        JLabel label_activeStatus= new JLabel("ACTIVE STATUS:");
        label_activeStatus.setBounds(20, 440, 200, 20);
        frame.add(label_activeStatus);
        JLabel activeStatus_value = new JLabel(activeStatus);
        activeStatus_value.setBounds(200, 440, 200, 20);
        frame.add(activeStatus_value);

        frame.setVisible(true);
    }

    
    //display method for premium member
    public void display_premium_member(int id,String name,String location,String phone,String email,String gender,String DOB,String membershipStart,
    String attendance,String loyaltypoints,String activeStatus,String PersonalTrainer,String paidAmount,String isFullPayment,
    String RemainingAmount,String discountAmount)
    {
        JFrame frame = new JFrame("Premium Member Display ");
        frame.setBounds(300, 200, 500, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel title = new JLabel("PREMIUM MEMBERS:");
        title.setBounds(20, 20, 200, 20);
        frame.add(title);

        JLabel label_id = new JLabel("ID:");
        label_id.setBounds(20, 50, 200, 20);
        frame.add(label_id);
        JLabel id_value = new JLabel(String.valueOf(id));
        id_value.setBounds(200, 50, 200, 20);
        frame.add(id_value);

        JLabel label_name = new JLabel("NAME:");
        label_name.setBounds(20, 80, 200, 20);
        frame.add(label_name);
        JLabel name_value = new JLabel(name);
        name_value.setBounds(200, 80, 200, 20);
        frame.add(name_value);

        JLabel label_location = new JLabel("LOCATION:");
        label_location.setBounds(20, 110, 200, 20);
        frame.add(label_location);
        JLabel location_value = new JLabel(location);
        location_value.setBounds(200, 110, 200, 20);
        frame.add(location_value);

        JLabel label_phone = new JLabel("PHONE:");
        label_phone.setBounds(20, 140, 200, 20);
        frame.add(label_phone);
        JLabel phone_value = new JLabel(phone);
        phone_value.setBounds(200, 140, 200, 20);
        frame.add(phone_value);

        JLabel label_email = new JLabel("EMAIL:");
        label_email.setBounds(20, 170, 200, 20);
        frame.add(label_email);
        JLabel email_value = new JLabel(email);
        email_value.setBounds(200, 170, 200, 20);
        frame.add(email_value);

        JLabel label_gender = new JLabel("GENDER:");
        label_gender.setBounds(20, 200, 200, 20);
        frame.add(label_gender);
        JLabel gender_value = new JLabel(gender);
        gender_value.setBounds(200, 200, 200, 20);
        frame.add(gender_value);

        JLabel label_DOB = new JLabel("DOB:");
        label_DOB.setBounds(20, 230, 200, 20);
        frame.add(label_DOB);
        JLabel DOB_value = new JLabel(DOB);
        DOB_value.setBounds(200, 230, 200, 20);
        frame.add(DOB_value);

        JLabel label_membershipStart = new JLabel("START DATE:");
        label_membershipStart.setBounds(20, 260, 200, 20);
        frame.add(label_membershipStart);
        JLabel membershipStart_value = new JLabel(membershipStart);
        membershipStart_value.setBounds(200, 260, 200, 20);
        frame.add(membershipStart_value);

        JLabel label_attendance = new JLabel("ATTENDANCE:");
        label_attendance.setBounds(20, 290, 200, 20);
        frame.add(label_attendance);
        JLabel attendance_value = new JLabel(attendance);
        attendance_value.setBounds(200, 290, 200, 20);
        frame.add(attendance_value);

        JLabel label_loyaltypoints = new JLabel("LOYALTY POINTS:");
        label_loyaltypoints.setBounds(20, 320, 200, 20);
        frame.add(label_loyaltypoints);
        JLabel loyaltypoints_value = new JLabel(loyaltypoints);
        loyaltypoints_value.setBounds(200, 320, 200, 20);
        frame.add(loyaltypoints_value);

        JLabel label_activeStatus = new JLabel("ACTIVE STATUS:");
        label_activeStatus.setBounds(20, 350, 200, 20);
        frame.add(label_activeStatus);
        JLabel activeStatus_value = new JLabel(activeStatus);
        activeStatus_value.setBounds(200, 350, 200, 20);
        frame.add(activeStatus_value);

        JLabel label_PersonalTrainer = new JLabel("PERSONAL TRAINER:");
        label_PersonalTrainer.setBounds(20, 380, 200, 20);
        frame.add(label_PersonalTrainer);
        JLabel PersonalTrainer_value = new JLabel(PersonalTrainer);
        PersonalTrainer_value.setBounds(200, 380, 200, 20); 
        frame.add(PersonalTrainer_value);

        JLabel label_paidAmount= new JLabel("PAID AMOUNT:");
        label_paidAmount.setBounds(20, 410, 200, 20);
        frame.add(label_paidAmount);
        JLabel paidAmount_value = new JLabel(paidAmount);
        paidAmount_value.setBounds(200, 410, 200, 20);
        frame.add(paidAmount_value);

        JLabel label_isFullPayment= new JLabel("FULL PAYMENT:");
        label_isFullPayment.setBounds(20, 440, 200, 20);
        frame.add(label_isFullPayment);
        JLabel isFullPayment_value = new JLabel(isFullPayment);
        isFullPayment_value.setBounds(200, 440, 200, 20);
        frame.add(isFullPayment_value);

        JLabel label_RemainingAmount= new JLabel("REMAINING AMOUNT:");
        label_RemainingAmount.setBounds(20, 470, 200, 20);
        frame.add(label_RemainingAmount);
        JLabel RemainingAmount_value = new JLabel(RemainingAmount);
        RemainingAmount_value.setBounds(200, 470, 200, 20);
        frame.add(RemainingAmount_value);

        JLabel label_discountAmount= new JLabel("DISCOUNT AMOUNT:");
        label_discountAmount.setBounds(20, 500, 200, 20);
        frame.add(label_discountAmount);
        JLabel discountAmount_value = new JLabel(discountAmount);
        discountAmount_value.setBounds(200, 500, 200, 20);
        frame.add(discountAmount_value);

        frame.setVisible(true);
    }

    //save to file method
    public void SaveDataToFile(ArrayList<GymMember> obj)
    {
        File file = new File("Memberdetails.txt");

        try
        {
            if(!file.exists())
            {
                file.createNewFile();
            }
            try(FileWriter writer = new FileWriter(file))
            {
                if(file.length() == 0)
                {
                    String header = String.format("%-12s %-5s %-15s %-15s %-12s %-25s %-10s %-15s %-10s %-15s %-18s %-10s %-15s %-10s %-12s %-12s %-10s%n","Member Type",
                            "ID", "Name", "Location", "Phone", "Email","Gender", "Trainer","Plan", "DOB",  "Membership Start",
                            "Attendance", "Loyalty points", "Active","Discout amt","Full Payment","Paid amt");
                    writer.write(header);
                }
                for(GymMember member: obj)
                {
                    if(member instanceof RegularMember)
                    {
                        RegularMember regularMember = (RegularMember) member;

                        String line = String.format("%-12s %-5s %-15s %-15s %-12s %-25s %-10s %-15s %-10s %-15s %-18s %-10s %-15s %-10s %-12s %-12s %-10s%n","Regular",
                                regularMember.Get_id(),regularMember.Get_name(),regularMember.Get_location(),regularMember.Get_phone(),regularMember.Get_email()
                            ,regularMember.Get_gender(),"-",regularMember.Get_plan(),regularMember.Get_DOB(),regularMember.Get_membershipStartDate()
                            ,String.valueOf(regularMember.Get_attendance()),String.valueOf(regularMember.Get_loyaltyPoints()),String.valueOf(regularMember.Get_activeStatus()),"-","-","-");
                        writer.write(line);
                    }
                    else if (member instanceof PremiumMember)
                    {
                        PremiumMember premiumMember = (PremiumMember) member;

                        String line = String.format("%-12s %-5s %-15s %-15s %-12s %-25s %-10s %-15s %-10s %-15s %-18s %-10s %-15s %-10s %-12s %-12s %-10s%n","Premium",
                                premiumMember.Get_id(),premiumMember.Get_name(),premiumMember.Get_location(),premiumMember.Get_phone(),premiumMember.Get_email()
                            ,premiumMember.Get_gender(),premiumMember.Get_personalTrainer(),"-",premiumMember.Get_DOB(),premiumMember.Get_membershipStartDate()
                            ,String.valueOf(premiumMember.Get_attendance()),String.valueOf(premiumMember.Get_loyaltyPoints()),String.valueOf(premiumMember.Get_activeStatus()),
                                premiumMember.Get_discountAmount(),premiumMember.Get_isFullPayment(),premiumMember.Get_paidAmount());
                        writer.write(line);
                    }
                }
                JOptionPane.showMessageDialog(frame_second, "The data was successfully stored");
            }
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(frame_second, "An Error Occured");
        }
    }

    //read from file method
    public void ReadDataFromFile()
    {
        List<String> allLines = new ArrayList<>();
        String line;

        File file = new File("Memberdetails.txt");
        try(BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
            while((line = reader.readLine()) != null)
            {
                allLines.add(line);
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(50, 200, 1500, 600);
        frame.setLayout(null);
        frame.setResizable(true);
        int y = 10;
        for (String text : allLines) {
            JLabel label = new JLabel(text);
            label.setFont(new Font("SansSerif", Font.BOLD, 14));
            label.setBounds(20, y, 1900, 20);
            frame.add(label);
            y+=30;
        }
        frame.setVisible(true);
    }

    //action listener method
    public void actionPerformed(ActionEvent e) 
    {
        //adding premium member
        if(e.getSource() == Premium_addMemberButton)
        {
            try {
                int id = Integer.parseInt(Premium_idTextField.getText().trim());
                String id_string = Premium_idTextField.getText().trim();
                String name = Premium_nameTextField.getText().trim();
                String location = Premium_locationTextField.getText().trim();
                String phoneNumber = Premium_phoneTextField.getText().trim();
                String email = Premium_emailTextField.getText().trim();
                String trainerName = Premium_TrainerTextField.getText().trim();
                String gender = Premium_maleRadiobutton.isSelected() ? "Male" : "Female";

                String day = String.valueOf(Premium_dobDayCombobox.getSelectedItem());
                String month = String.valueOf(Premium_dobMonthCombobox.getSelectedItem());
                String year = String.valueOf(Premium_dobYearCombobox.getSelectedItem());
                String fullDOB = day + "/" + month + "/" + year;

                String msDay = String.valueOf(Premium_MembershipStartDateDayCombobox.getSelectedItem());
                String msMonth = String.valueOf(Premium_MembershipStartDateMonthCombobox.getSelectedItem());
                String msYear = String.valueOf(Premium_MembershipStartDateYearCombobox.getSelectedItem());
                String membershipStartDate = msDay + "/" + msMonth + "/" + msYear;

                boolean valid = true;
                for(int i=0; i<phoneNumber.length();i++)
                {
                    if(!Character.isDigit(phoneNumber.charAt(i)))
                    {
                        valid = false;
                        break;
                    }
                }
                if(id_string.isEmpty() || name.isEmpty() || location.isEmpty() || phoneNumber.isEmpty() || email.isEmpty() || gender.isEmpty() || fullDOB.isEmpty() || day.isEmpty()||
                month.isEmpty() || year.isEmpty() || membershipStartDate.isEmpty() || msDay.isEmpty() || msMonth.isEmpty() || msYear.isEmpty() || trainerName.isEmpty())
                {
                    JOptionPane.showMessageDialog(frameHome, "For premium members all the fields must be filled..");
                }
                else if (phoneNumber.length()!= 10)
                {
                    JOptionPane.showMessageDialog(frameHome, "Phone number should be 10 digits");
                }
                else if (!valid)
                {
                    JOptionPane.showMessageDialog(frameHome, "Phone number should only have digits");
                }
                else
                {
                    boolean duplicate = false;
                    for(GymMember member:obj)
                    {
                        if(member.Get_id() == id)
                        {
                            duplicate = true;
                            break;
                        }
                    }
                    if(duplicate)
                    {
                        JOptionPane.showMessageDialog(frameHome, "ID must be unique");
                    }
                    else
                    {
                        PremiumMember newMember = new PremiumMember(id, name, location, phoneNumber, email,gender, fullDOB, membershipStartDate, trainerName);
                        obj.add(newMember);
                        JOptionPane.showMessageDialog(frameHome, "Premium member added successfully....");
                    }

                }
            }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frameHome, "ID must be an integer.");
            }
        }
        //adding regular member
        if(e.getSource() == Regular_addMemberButton)

        {
            try {
                int id = Integer.parseInt(Regular_idTextField.getText().trim());
                String id_string = Regular_idTextField.getText().trim();
                String name = Regular_nameTextField.getText().trim();
                String location = Regular_locationTextField.getText().trim();
                String phoneNumber = Regular_phoneTextField.getText().trim();
                String email = Regular_emailTextField.getText().trim();
                String referralSource = Regular_referalsourceTextField.getText().trim();
                String gender = Regular_maleRadiobutton.isSelected() ? "Male" : "Female";

                String day = String.valueOf(Regular_dobDayCombobox.getSelectedItem());
                String month = String.valueOf(Regular_dobMonthCombobox.getSelectedItem());
                String year = String.valueOf(Regular_dobYearCombobox.getSelectedItem());
                String fullDOB = day + "/" + month + "/" + year;

                String msDay = String.valueOf(Regular_MembershipStartDateDayCombobox.getSelectedItem());
                String msMonth = String.valueOf(Regular_MembershipStartDateMonthCombobox.getSelectedItem());
                String msYear = String.valueOf(Regular_MembershipStartDateYearCombobox.getSelectedItem());
                String membershipStartDate = msDay + "/" + msMonth + "/" + msYear;

                boolean valid = true;
                for(int i=0; i<phoneNumber.length();i++)
                {
                    if(!Character.isDigit(phoneNumber.charAt(i)))
                    {
                        valid = false;
                        break;
                    }
                }
                if(id_string.isEmpty() || name.isEmpty() || location.isEmpty() || phoneNumber.isEmpty() || email.isEmpty() || gender.isEmpty() || fullDOB.isEmpty() ||
                month.isEmpty() || year.isEmpty() || membershipStartDate.isEmpty() || msDay.isEmpty() || msMonth.isEmpty() || msYear.isEmpty() || referralSource.isEmpty())
                {
                    JOptionPane.showMessageDialog(frameHome, "For Regular members all the fields must be filled..");
                }
                else if (phoneNumber.length()!= 10)
                {
                    JOptionPane.showMessageDialog(frameHome, "Phone number should be 10 digits");
                }
                else if (!valid)
                {
                    JOptionPane.showMessageDialog(frameHome, "Phone number should only have digits");
                }
                else
                {
                    boolean duplicate = false;
                    for(GymMember member:obj)
                    {
                        if(member.Get_id() == id)
                        {
                            duplicate = true;
                            break;
                        }
                    }
                    if(duplicate)
                    {
                        JOptionPane.showMessageDialog(frameHome, "ID should unique");
                    }
                    else
                    {
                        RegularMember newMember = new RegularMember(id, name, location, phoneNumber, email,gender, fullDOB, membershipStartDate, referralSource);
                        obj.add(newMember);
                        JOptionPane.showMessageDialog(frameHome, "Regular member added successfully....");
                    }

                }
            }
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(frameHome, "ID must be an integer.");
            }
        }
        //to change panel to premium member panel when clicked
        if(e.getSource()==buttonHomePrem)
        {
            panelPrem.setVisible(true);
            panelRegu.setVisible(false);
            panelHome.setVisible(false);/*
            panelActivatemembership.setVisible(false);
            panelDeactivatemembership.setVisible(false);
            panelMarkattendence.setVisible(false);
            panelSavetofile.setVisible(false);
            panelReadfromfile.setVisible(false);
            panelUpgradeplan.setVisible(false);
            panelDisplay.setVisible(false);
            panelRevertmembership.setVisible(false);
            panelPayment.setVisible(false);*/
        }

        //to change panel to regular member when clicked
        if(e.getSource()==buttonHomeRegu)
        {
            panelPrem.setVisible(false);
            panelRegu.setVisible(true);
            panelHome.setVisible(false);/*
            panelActivatemembership.setVisible(false);
            panelDeactivatemembership.setVisible(false);
            panelMarkattendence.setVisible(false);
            panelSavetofile.setVisible(false);
            panelReadfromfile.setVisible(false);
            panelUpgradeplan.setVisible(false);
            panelDisplay.setVisible(false);
            panelRevertmembership.setVisible(false);
            panelPayment.setVisible(false);*/
        }

        //to change panel to home panel from regular panel when clicked
        if(e.getSource() == Regular_backButton)
        {
            panelPrem.setVisible(false);
            panelRegu.setVisible(false);
            panelHome.setVisible(true); /*
            panelDeactivatemembership.setVisible(false);
            panelMarkattendence.setVisible(false);
            panelSavetofile.setVisible(false);
            panelReadfromfile.setVisible(false);
            panelUpgradeplan.setVisible(false);
            panelDisplay.setVisible(false);
            panelRevertmembership.setVisible(false);
            panelPayment.setVisible(false);*/
        }

        //to cange panel to home panel from premium panel when clicked
        if(e.getSource() == Premium_backButton)
        {
            panelPrem.setVisible(false);
            panelRegu.setVisible(false);
            panelHome.setVisible(true);/*
            panelActivatemembership.setVisible(false);
            panelDeactivatemembership.setVisible(false);
            panelMarkattendence.setVisible(false);
            panelSavetofile.setVisible(false);
            panelReadfromfile.setVisible(false);
            panelUpgradeplan.setVisible(false);
            panelDisplay.setVisible(false);
            panelRevertmembership.setVisible(false);
            panelPayment.setVisible(false);*/
        }

        //to display detailes of member
        if (e.getSource() == Display_button)
        {
            try {
                String idText = Dispaly_idTextField.getText().trim();

                if (idText.isEmpty()) {
                    JOptionPane.showMessageDialog(frameHome, "ID cannot be empty!");
                    return;
                }

                int id = Integer.parseInt(idText);
                boolean find = false;

                for (GymMember member : obj) {
                    if (id == member.Get_id()) {
                        find = true;

                        if (member instanceof RegularMember) {
                            RegularMember regular_Member = (RegularMember) member;
                            display_regular_member(
                                regular_Member.Get_id(), regular_Member.Get_name(), regular_Member.Get_location(),
                                regular_Member.Get_phone(), regular_Member.Get_email(), regular_Member.Get_gender(),
                                regular_Member.Get_DOB(), regular_Member.Get_membershipStartDate(), regular_Member.Get_referralSource(),
                                String.valueOf(regular_Member.Get_attendance()), String.valueOf(regular_Member.Get_loyaltyPoints()),
                                regular_Member.Get_plan(), String.valueOf(regular_Member.Get_price()), String.valueOf(regular_Member.Get_activeStatus())
                            );
                        } else if (member instanceof PremiumMember) {
                            PremiumMember premium_Member = (PremiumMember) member;
                            display_premium_member(
                                premium_Member.Get_id(), premium_Member.Get_name(), premium_Member.Get_location(),
                                premium_Member.Get_phone(), premium_Member.Get_email(), premium_Member.Get_gender(),
                                premium_Member.Get_DOB(), premium_Member.Get_membershipStartDate(), String.valueOf(premium_Member.Get_attendance()),
                                String.valueOf(premium_Member.Get_loyaltyPoints()), String.valueOf(premium_Member.Get_activeStatus()),
                                premium_Member.Get_personalTrainer(), String.valueOf(premium_Member.Get_paidAmount()),
                                String.valueOf(premium_Member.Get_isFullPayment()), String.valueOf(premium_Member.Get_premiumCharge() - premium_Member.Get_paidAmount()),
                                String.valueOf(premium_Member.Get_discountAmount())
                            );
                        }
                        break; // Exit loop once a match is found
                    }
                }

                if (!find) {
                    JOptionPane.showMessageDialog(frameHome, "Member not found!");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frameHome, "Invalid ID format! Please enter a number.");
            } catch (Exception ex) {
                ex.printStackTrace(); // Debugging output
                JOptionPane.showMessageDialog(frameHome, "Unexpected error: " + ex.getMessage());
            }
        }

        //to upgrade plan
        if (e.getSource() == Upgradeplan_button) {
            try {
                int inputId = Integer.parseInt(Upgradeplan_idTextField.getText().trim());
                String selectedPlan = (String) Upgradeplan_combobox.getSelectedItem();

                if (selectedPlan == null || selectedPlan.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(frame_second, "Please select a valid plan.");
                    return;
                }

                boolean found = false;

                for (GymMember member : obj) {
                    if (inputId == member.Get_id())
                    {
                        found = true;

                        if (member instanceof RegularMember) {
                            String result = ((RegularMember) member).upgradePlan(selectedPlan.trim());
                            JOptionPane.showMessageDialog(frame_second, result);
                        } else {
                            JOptionPane.showMessageDialog(frame_second, "Plan can only be upgraded for Regular Member");
                        }
                        break;
                    }
                }

                if (!found) {
                    JOptionPane.showMessageDialog(frame_second, "Member is not found..");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame_second, "ID must be an integer!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame_second, "Error..");
            }
        }

        //to activate membership
        if (e.getSource() == Activatemembership_button)
        {
            try {
                String idText = Activatemembership_idTextField.getText().trim();

                if (idText.isEmpty()) {
                    JOptionPane.showMessageDialog(frameHome, "ID cannot be empty!");
                    return;
                }

                int inputId = Integer.parseInt(idText);
                boolean find = false;

                for (GymMember member : obj)
                {
                    if (inputId == member.Get_id()) 
                    {
                        find = true;

                        // Check if the member is already active
                        if (member.Get_activeStatus())
                        {
                            JOptionPane.showMessageDialog(frameHome, "Member is already activated!");
                        } else 
                        {
                            member.activateMembership();
                            JOptionPane.showMessageDialog(frameHome, "Membership activated for ID: " + inputId);
                        }
                        break; // Exit loop after finding the member
                    }
                }

                if (!find) {
                    JOptionPane.showMessageDialog(frameHome, "ID does not exist!");
                }
            } catch (NumberFormatException ex) 
            {
                JOptionPane.showMessageDialog(frameHome, "ID must be a valid number!");
            } catch (Exception ex)
            {
                JOptionPane.showMessageDialog(frameHome, "Unexpected error: " + ex.getMessage());
            }
        }
        if (e.getSource() == Deactivatemembership_button) 
        {
            try {
                String idText = Deactivatemembership_idTextField.getText().trim();

                if (idText.isEmpty())
                {
                    JOptionPane.showMessageDialog(frameHome, "ID cannot be empty!");
                    return;
                }

                int inputId = Integer.parseInt(idText);
                boolean find = false;

                for (GymMember member : obj)
                {
                    if (inputId == member.Get_id())
                    {
                        find = true;

                        // Check if the member is already inactive
                        if (!member.Get_activeStatus())
                        {
                            JOptionPane.showMessageDialog(frameHome, "Member is already deactivated!");
                        } else 
                        {
                            member.deactiveMembership();
                            JOptionPane.showMessageDialog(frameHome, "Membership deactivated for ID: " + inputId);
                        }
                        break; // Exit loop after finding the member
                    }
                }

                if (!find)
                {
                    JOptionPane.showMessageDialog(frameHome, "ID does not exist!");
                }
            } catch (NumberFormatException ex) 
            {
                JOptionPane.showMessageDialog(frameHome, "ID must be a valid number!");
            } catch (Exception ex)
            {
                JOptionPane.showMessageDialog(frameHome, "Unexpected error: " + ex.getMessage());
            }
        }

        //to mark attendence
        if(e.getSource() == Markattendence_button)
        {
            try{

                int InputId = Integer.parseInt(Markattendence_idTextField.getText());
                boolean find = false;

                for(GymMember member : obj)
                {
                    if (InputId == member.Get_id())
                    {
                        find = true;

                        if(!member.Get_activeStatus())
                        {
                            JOptionPane.showMessageDialog(frameHome,"Member should be activated to mark attendence..");
                        }
                        else if(member instanceof PremiumMember)
                        {
                            ((PremiumMember)member).markAttendance();
                            JOptionPane.showMessageDialog(frameHome,"Attendance Marked Sucessful");
                        }
                        else
                        {
                            ((RegularMember)member).markAttendance();
                            JOptionPane.showMessageDialog(frameHome,"Attendance Marked Sucessful");
                        }
                        break;
                    }
                }
                if(!find)
                {
                    JOptionPane.showMessageDialog(frameHome,"Member not found!!!");

                }
            }catch(NumberFormatException ex)
            { 
                JOptionPane.showMessageDialog(frameHome,"ID must be integer!!!");

            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(frameHome,"ERROR!!!");
            }
        }

        //for clear button of premium panel
        if(e.getSource() == Premium_clearButton)
        {
            Premium_idTextField.setText("");
            Premium_locationTextField.setText("");
            Premium_nameTextField.setText("");
            Premium_phoneTextField.setText("");
            Premium_emailTextField.setText("");
            Premium_TrainerTextField.setText("");
            premium_group.clearSelection();
            Premium_dobDayCombobox.setSelectedIndex(0);
            Premium_dobMonthCombobox.setSelectedIndex(0);
            Premium_dobYearCombobox.setSelectedIndex(0);
            Premium_MembershipStartDateDayCombobox.setSelectedIndex(0);
            Premium_MembershipStartDateMonthCombobox.setSelectedIndex(0);
            Premium_MembershipStartDateYearCombobox.setSelectedIndex(0);
        }

        //for clear button of regular panel
        if(e.getSource() == Regular_clearButton)
        {
            Regular_idTextField.setText("");
            Regular_locationTextField.setText("");
            Regular_nameTextField.setText("");
            Regular_phoneTextField.setText("");
            Regular_emailTextField.setText("");
            Regular_referalsourceTextField.setText("");
            regular_group.clearSelection();
            Regular_dobDayCombobox.setSelectedIndex(0);
            Regular_dobMonthCombobox.setSelectedIndex(0);
            Regular_dobYearCombobox.setSelectedIndex(0);
            Regular_MembershipStartDateDayCombobox.setSelectedIndex(0);
            Regular_MembershipStartDateMonthCombobox.setSelectedIndex(0);
            Regular_MembershipStartDateYearCombobox.setSelectedIndex(0);
        }

        //activate membership clear button
        if(e.getSource()==Activatemembership_clear_button)
        {
            Activatemembership_idTextField.setText("");
        }

        //deactivate membership clear button
        if(e.getSource()==Deactivatemembership_clear_button)
        {
            Deactivatemembership_idTextField.setText("");
        }

        //mark attendence clear button
        if(e.getSource()==MarkAttendence_clear_button)
        {
            Markattendence_idTextField.setText("");
        }

        //display clear button
        if(e.getSource()==Display_clear_button)
        {
            Dispaly_idTextField.setText("");
        }

        //revert membership clear button
        if(e.getSource()==Revertmembership_clear_button)
        {
            Revertmembership_idTextField.setText("");
            Revert_Removalreasontextfield.setText("");
        }

        //payment clear button
        if(e.getSource()==Payment_clear_button)
        {
            Payment_idTextField.setText("");
            Payment_amountTextField.setText("");
            Payment_calculate_discountTextField.setText("");
        }

        //upgrade plan clear button
        if(e.getSource()==Upgradeplan_clear_button)
        {
            Upgradeplan_idTextField.setText("");
            Upgradeplan_priceTextField.setText("");
            /*Upgradeplan_combobox.setText("");*/
        }

        //function for revert regular membership
        if(e.getSource() == Revertmembership_regular_button)
        {
            boolean found = false;

            try
            {
                int input_id = Integer.parseInt(Revertmembership_idTextField.getText());
                String removalReason = Revert_Removalreasontextfield.getText();
                if(removalReason.isEmpty())
                {
                    JOptionPane.showMessageDialog(frame_second, "Enter removal reason","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    for(GymMember member: obj)
                    {

                        if(input_id == member.Get_id())
                        {
                            found=true;
                            if(member instanceof RegularMember)
                            {
                                RegularMember regularMember = (RegularMember) member;
                                regularMember.revertRegularMember(removalReason);
                                JOptionPane.showMessageDialog(frame_second, "succesfully reverted");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(frame_second, "This id has no regular member");
                            }
                        }
                    }
                    if(!found)
                    {
                        JOptionPane.showMessageDialog(frame_second, "member not found");
                    }
                }

            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(frame_second, "Format of ID is incorrect");
            }
        }

        //function for revert premium membership
        if(e.getSource() == Revertmembership_premium_button)
        {
            boolean found = false;

            try
            {
                int input_id = Integer.parseInt(Revertmembership_idTextField.getText());
                String removalReason = Revert_Removalreasontextfield.getText();
                if(removalReason.isEmpty())
                {
                    JOptionPane.showMessageDialog(frame_second, "Enter removal reason","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    for(GymMember member: obj)
                    {
                        if(input_id == member.Get_id())
                        {
                            found=true;
                            if(member instanceof PremiumMember)
                            {
                                PremiumMember premiumMember = (PremiumMember) member;
                                premiumMember.revertPremiumMember(removalReason);
                                JOptionPane.showMessageDialog(frame_second, "succesfully reverted");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(frame_second, "This id has no premium member");
                            }
                        }
                    }
                    if(!found)
                    {
                        JOptionPane.showMessageDialog(frame_second, "member not found");
                    }
                }

            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(frame_second, "Format of ID is incorrect");
            }
        }

        //function for payment button
        if (e.getSource() == Payment_button) {
            try {
                int id_input = Integer.parseInt(Payment_idTextField.getText());
                double amt = Double.parseDouble(Payment_amountTextField.getText());
                if (amt < 0)
                {
                    JOptionPane.showMessageDialog(frame_second, "Payment amount cannot be negative!");
                    return; // Stop execution if negative
                }

                boolean find = false;

                for (GymMember member : obj) {
                    if (id_input == member.Get_id()) {
                        find = true;

                        if (!member.Get_activeStatus()) {
                            JOptionPane.showMessageDialog(frame_second, "Member needs to be activated to pay the due amount.");
                        } else if (member instanceof PremiumMember) {

                            String paymentMessage = ((PremiumMember) member).payDueAmount(amt);
                            JOptionPane.showMessageDialog(frame_second, paymentMessage);
                        } else {
                            JOptionPane.showMessageDialog(frame_second, "Payment cannot be processed for Regular members.");
                        }
                        break;
                    }
                }

                if (!find) {
                    JOptionPane.showMessageDialog(frame_second, "Member not found!");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame_second, "ID must be an integer!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame_second, "An unexpected error occurred: " + ex.getMessage());
            }
        }

        //function to claculate discount
        if(e.getSource() == Payment_Calculate_Discount_button)
        {
            try{

                int id_input = Integer.parseInt(Payment_idTextField.getText());
                boolean find = false;

                for(GymMember member : obj)
                {
                    if (id_input == member.Get_id())
                    {
                        find = true;

                        if(!member.Get_activeStatus())
                        {
                            JOptionPane.showMessageDialog(frame_second,"Member need to be  activated to calculate discount");
                        }
                        else if(member instanceof PremiumMember)
                        {
                            ((PremiumMember)member).calculateDiscount();
                            Payment_calculate_discountTextField.setText(String.valueOf(((PremiumMember)member).Get_discountAmount()));
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(frame_second,"Payment cannot be done for Regular member.");
                        }
                        break;
                    }
                }
                if(!find)
                {
                    JOptionPane.showMessageDialog(frame_second,"Member not found!!!");
                }
            }catch(NumberFormatException ex)
            { 
                JOptionPane.showMessageDialog(frame_second,"ID must be integer!!!");

            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(frame_second,"ERROR!!!");
            }
        }

        //sunction to save file
        if(e.getSource() == buttonSavetoFile)
        {
            SaveDataToFile(obj);
        }
        
        //function to read file
        if(e.getSource() == buttonReadfromFile)
        {
            ReadDataFromFile();
        }

        //function to activate panel of activate membership
        if(e.getSource() == buttonActMemb)
        {
            framesecond();
            panelActivatemembership.setVisible(true);
        }
        
        //function to activate panel of deactivate membership
        if(e.getSource() == buttonDeActMemb)
        {
            framesecond();
            panelDeactivatemembership.setVisible(true);
        }
        
        //function to activate panel of mark attendence
        if(e.getSource() == buttonMarkAtt)
        {
            framesecond();
            panelMarkattendence.setVisible(true);
        }
        
        //function to activate panel of display 
        if(e.getSource() == buttonDisplay)
        {
            framesecond();
            panelDisplay.setVisible(true);
        }
        
        //function to activate panel of revert membership
        if(e.getSource() == buttonRevertMembership)
        {
            framesecond();
            panelRevertmembership.setVisible(true);
        }

        //function to activate panel of payment button
        if(e.getSource() == buttonPayment)
        {
            framesecond();
            panelPayment.setVisible(true);
        }
        //function to activate panel of upgrade plan
        if(e.getSource() == buttonUpPlan)
        {
            framesecond();
            panelUpgradeplan.setVisible(true);
        }
    }
}