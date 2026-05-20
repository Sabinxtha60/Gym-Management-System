/**
 * PremiumMember class which is a sub class of GymMember is made to get the details of the permium member of the gym.
 *
 * @author (Sabin Shrestha)
 * @version (2025-03-08)
 */
public class PremiumMember extends GymMember//PremiumMember class being sub class of GymMember
{
    /*
     * attributes of PremiumMember class with private access modifier
     */
    private final double premiumCharge;
    private String personalTrainer;
    private boolean isFullPayment;
    private double paidAmount;
    private double discountAmount;
    private double remainingAmount;

    //parameter of constructor of PremiumMember class
    public PremiumMember(int id,String name,String location,String phone,String email,String gender,String DOB,String membershipStartDate,String personalTrainer)
    {
        super(id,name,location,phone,email,gender,DOB,membershipStartDate);//calling constructor of super class

        /*
         * when adding the member this value are set as default
         */
        this.id = id;
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.DOB = DOB;
        this.membershipStartDate = membershipStartDate;
        this.personalTrainer = personalTrainer;

        this.premiumCharge=50000;
        this.paidAmount=0;
        this.isFullPayment=false;
        this.discountAmount=0;
        this.personalTrainer=personalTrainer;

    }
    //getter method for premiumCharge
    public double Get_premiumCharge()
    {
        return this.premiumCharge;
    }
    //getter method for personalTrainer
    public String Get_personalTrainer()
    {
        return this.personalTrainer;
    } 
    //getter method for isFullPayment
    public boolean Get_isFullPayment()
    {
        return this.isFullPayment;
    }
    //getter method for paidAmount
    public double Get_paidAmount()
    {
        return this.paidAmount;
    }
    //getter method for discountAmount
    public double Get_discountAmount()
    {
        return this.discountAmount;
    }

    /*
     * markAttendance method is made to mark the attendence of the member and increase the attendance by 1 and loyalty points by 10 if the activeStatus is true and 
     * if the active status is false then it reply account is deactivated.
     */
    public void markAttendance()
    {
        if(this.activeStatus ==true)
        {
            this.attendance++;
            this.loyaltyPoints +=10;
        }
        else
        {
            System.out.println(this.id+" account is deactivated");  
        }
    }

    /*
     * payDueAmount method is made to pay the amount of the member if the payment is already done then the isFullPayment becomes true and retuns already done fullpayment,
     * if the amount is more than the charge then it returns has done more than the charge, and if the paid amount is less than the charge then it returns the paid amount 
     * and the remaining amount to be paid, and if the member pays full amount is returns has successfully paid full amount.
     */

    public String payDueAmount(double paidAmount) {
        if (isFullPayment) {
            return id + " has already completed full payment.";
        }

        // Check if overpayment BEFORE updating member details
        if (this.paidAmount + paidAmount > this.premiumCharge) {
            return id + " has overpaid. Please review the payment.";
        }

        this.paidAmount += paidAmount; // Only update if it's a valid amount
        this.remainingAmount = this.premiumCharge - this.paidAmount;

        if (this.paidAmount < this.premiumCharge) {
            return id + " has paid " + this.paidAmount + " and the remaining amount is " + this.remainingAmount + ".";
        } else {
            this.isFullPayment = true;
            return id + " has successfully completed full payment.";
        }
    }

    /*
     * calculateDiscount method is made to calculate the discount of members,member becomes eligible for the discount if the full payment is done then they get 10% discount and if the full 
     * payment is not done its returns not eligible for the discount'
     */
    public void calculateDiscount()
    {
        if(isFullPayment==true)
        {
            discountAmount=(0.1)*this.premiumCharge;
        }
        else
        {

        }
    }

    /*
     * revertPremiumMember method is made to revert the membership and it calls the resetMember from super class
     */
    public void revertPremiumMember(String removalReason)
    {
        super.resetMember();
        this.personalTrainer="";
        this.isFullPayment=false;
        this.remainingAmount=50000.0;
        this.paidAmount=0;
        this.discountAmount=0;
    }

    /*
     * displayPremiumMember display the details of the member and it also calls the display method of the super class and also display the discount of the member if the payment is fully paid
     */
    public void display()
    {
        super.display();
        System.out.println(this.id+"member personal trainer is "+this.personalTrainer);
        System.out.println(this.id+"member paid amount is "+this.paidAmount);
        System.out.println(this.id+"member full payment status "+this.isFullPayment);
        System.out.println(this.id+"member remaining amount to be paid is "+this.remainingAmount);

        if(isFullPayment==true)
        {
            System.out.println(this.id+" member discount amount is "+this.discountAmount);
        }
    }
}
