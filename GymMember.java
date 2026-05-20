/**
 * GymMember class which is a super class is made to hold the various details of gym members like id,name,location
 * etc and various method is made to activate and deactivate membership etc.
 *
 * @author (Sabin Shretha)
 * @version (2025-03-08)
 */
public abstract class GymMember//abstract class GymMember 
{
    /*
     * attributes of class GymMember with protected access modifier
     */
    protected int id;
    protected String name;
    protected String location;
    protected String phone;
    protected String email;
    protected String gender;
    protected String DOB;
    protected String membershipStartDate;
    protected int attendance;
    protected double loyaltyPoints;
    protected boolean activeStatus;

    /*
     * parameter of constructor of GymMember class
     */
    public GymMember(int id, String name, String location, String phone, String email,String gender, String DOB, String membershipStartDate)
    {
        this.attendance=0;
        this.loyaltyPoints=0;
        this.activeStatus=false;
        this.id=id;
        this.name=name;
        this.location=location;
        this.phone=phone;
        this.email=email;
        this.membershipStartDate=membershipStartDate;
    }   
    //getter method for id
    public int Get_id()
    {
        return this.id;
    }
    //getter method for name
    public String Get_name()
    {
        return this.name;
    }
    //getter method for location
    public String Get_location()
    {
        return this.location;
    }
    //getter method for phone
    public String Get_phone()
    {
        return this.phone;
    }
    //getter method for email
    public String Get_email()
    {
        return this.email;
    }
    //getter method for gender
    public String Get_gender()
    {
        return this.gender;
    }
    //getter method for DOB
    public String Get_DOB()
    {
        return this.DOB;
    }
    //getter method for membershipStartDate
    public String Get_membershipStartDate()
    {
        return this.membershipStartDate;
    }
    //getter method for attendance
    public int Get_attendance()
    {
        return this.attendance;
    }
    //getter method for loyaltyPoints
    public double Get_loyaltyPoints()
    {
        return this.loyaltyPoints;
    }
    //getter method for activeStatus
    public boolean Get_activeStatus()
    {
        return this.activeStatus;
    }
    //abstract markAttendance method is used to track the attendance of the member
    public abstract void markAttendance();
    //this method is used to activate membership of the members of the gym and if the membership is already activated then it prints membership already activated
    public void activateMembership()
    {
        if(activeStatus==false)
        {
            this.activeStatus=true;
        }
    }
    //this method is used to deactivate membership and if the user has already deactivated the membership then it displays membership already deactivated
    public void deactiveMembership()
    {
        if(activeStatus==true)
        {
            this.activeStatus=false;
        }
    }
    //this method is used to reset the membership of the member
    public void resetMember()
    {
        this.activeStatus=false;
        this.attendance=0;
        this.loyaltyPoints=0;
    }
    //display method is used to display the information of the members
    public void display()
    {
        System.out.println("The id of member is "+id);
        System.out.println("The name of member is "+name);
        System.out.println("The location of member is "+location);
        System.out.println("The phone of member is "+phone);
        System.out.println("The email of member is "+email);
        System.out.println("The DOB of member is "+DOB);
        System.out.println("The membershipStartDate of member is "+membershipStartDate);
        System.out.println("The attendance of member is "+attendance);
        System.out.println("The loyaltyPoints of member is "+loyaltyPoints);
        System.out.println("The activeStatus of member is "+activeStatus);
    }
}
