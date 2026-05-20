/**
 * RegularMember class which is a sub class of GymMember class is made to hold the regular member of the gym
 * and display the details of the regular members.
 *
 * @author (Sabin Shrestha)
 * @version (2025-03-08)
 */
public class RegularMember extends GymMember//RegularMember class being sub class of GymMember
{
    /*
     * attributes of class RegularMember with private access modifier
     */
    final private int attendanceLimit;
    private boolean isEligibleForUpgrade;
    private String removalReason;
    private String referralSource;
    private String plan;
    private double price;

    //parameter of constructor of RegularMember class
    public RegularMember(int id,String name,String location,String phone,String email,String gender,String DOB,String membershipStartDate,String referralSource)
    {
        super(id,name,location,phone,email,gender,DOB,membershipStartDate);//calling constructor of parent class

        this.id = id;
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.DOB = DOB;
        this.membershipStartDate = membershipStartDate;
        this.referralSource = referralSource;
        /*
         * when adding a member this value is set as default
         */
        this.isEligibleForUpgrade=false;
        this.attendanceLimit=30;
        this.plan="basic";
        this.price=6500;
        this.removalReason="";

        this.referralSource=referralSource;
    }
    //getter method for attendanceLimit
    public int Get_attendanceLimit()
    {
        return this.attendanceLimit;
    } 
    //getter method for isEligibleForUpgrade
    public boolean Get_isEligibleForUpgrade()
    {
        return this.isEligibleForUpgrade;
    }
    //getter method for removalReason
    public String Get_removalReason()
    {
        return this.removalReason=removalReason;
    }
    //getter method for referralSource
    public String Get_referralSource()
    {
        return this.referralSource=referralSource;
    }
    //getter method for plan
    public String Get_plan()
    {
        return this.plan;
    }
    //getter method for price
    public double Get_price()
    {
        return this.price;
    }

    /*
     * this method help to mark attendance and increase the attendance by 1 and loyality points by 5 and if the attendance reaches the attendance limit 
     * the membership upgrade plan becomes true and if the activeStatus of the member is false then it says account is deactivated
     */
    public void markAttendance()
    {
        if(activeStatus==true)
        {
            this.attendance++;
            this.loyaltyPoints+=5;

            if(attendance==attendanceLimit)
            {
                this.isEligibleForUpgrade=true;
            }
        }
        else
        {
            System.out.println(id+" account is deactive");
        }
    }

    /*
     * this method helps to return the price of the plans
     */
    public double getPlanPrice(String plan)
    {
        switch(plan.toLowerCase())
        {
            case "basic":
                return 6500;
            case "standard":
                return 12500;
            case "deluxe":
                return 18500;
            default:
                System.out.println("Invalid plan");
                return -1;
        }
    }

    /*
     * this method helps to upgrade the plan of the members if elegible and returns the information accordingly
     */
    public String upgradePlan(String plan)
    {
        if(isEligibleForUpgrade != true)
        {
            return this.id+" is not eligible for Upgrade";
        }
        else{
            if(getPlanPrice(plan) == -1)
            {
                return "invalid plan";
            }
            else
            {
                this.plan = plan;
                this.price = getPlanPrice(plan);
                return "Succesfully upgraded to "+plan;
            }
        }
    }

    /*
     * revertRegularMember method is made this accepts the parameter removalReason and calls the resetMember from parent class
     */
    public void revertRegularMember(String removalReason)
    {
        super.resetMember();
        this.isEligibleForUpgrade=false;
        this.plan="basic";
        this.price=6500;
        this.removalReason=removalReason;
    }

    /*
     * displayRegularMember method is made to show the details of the members and display method is called from the parent class
     */
    public void display()
    {
        super.display();
        System.out.println("The plan of member is "+this.plan);
        System.out.println("The price of plan is "+this.price);

        if(removalReason !="")
        {
            System.out.println(this.removalReason);
        }
    }
}
