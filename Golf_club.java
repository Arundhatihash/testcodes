package org.Member;
import java.util.*;
class RegularMember {
    int membershipFee = 0;
    int enrollmentFee = 0;
    
    int Per_month_charges = 20000;
    
    int months;
    
    public RegularMember(int months) {
    	
        super();
        this.months = months;
    }







  public void show_bill() {
        
       
        System.out.println("Membership Fee : "+this.membershipFee );
        System.out.println("Enrollment Fee : "+this.enrollmentFee );
        System.out.println("Charges Per Month : "+Per_month_charges );
        
        int charges = this.months*this.Per_month_charges +this.membershipFee +this.enrollmentFee ;
        System.out.println("Total membership fees : "+charges);
    }
    
    
}

class GoldMember extends RegularMember{
    
    int membershipFee=90000;
    int enrollmentFee=10000;
    
    int Per_month_charges=10000;
    
    public GoldMember(int months) {
        super(months);
    }
    
    @Override
    public void show_bill() {
    	
         System.out.println("Membership Fee : "+this.membershipFee );
         System.out.println("Enrollment Fee : "+this.enrollmentFee );
         System.out.println("Charges Per Month : "+Per_month_charges );
        
        if(months<=6) {
        int charges = this.membershipFee+this.enrollmentFee;
        System.out.println("Total amount : "+charges);
        }
        
        if(months>6)
        {    
            int charges= this.membershipFee+this.enrollmentFee+((this.months-6)*this.Per_month_charges);
            System.out.println("Total amount : "+charges);
        }
    }
    
}






class SilverMember extends RegularMember{
    
    
    int membershipFee=15000;
    int enrollmentFee=5000;
    int Per_month_java=20000;





  public SilverMember(int months) {
        super(months);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void show_bill() {
    	 
         System.out.println("Membership Fee : "+this.membershipFee );
         System.out.println("Enrollment Fee : "+this.enrollmentFee );
         System.out.println("Charges Per Month : "+Per_month_charges );
        
        
        if(months<=6) {
            int charges=+this.membershipeeF+this.enrollmentFee;
            System.out.println("Total amount : "+charges);
        }
        
        
        if(months>6)
        {
            int charges=this.membershipFee+this.enrollmentFee+((this.months-6)*this.Per_month_charges);
            System.out.println("Total amount : "+charges);
        }
    }
    
    
    
}





public class Golf_club {





  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the membership you want regular/gold/silver : ");
        String memebership_type=sc.nextLine();
        System.out.println("enter the number of months you want to enroll yourself : ");
        int months=sc.nextInt();
        
        RegularMember membr ;
        
        switch (memebership_type) {
        
        case "regular":
            membr= new RegularMember(months);
            membr.show_bill();
            break;
        
        case "gold":
            membr = new GoldMember(months);
            membr.show_bill();
            break;
            
        case "silver":
            membr = new SilverMember(months);
            membr.show_bill();
            break;





      default:
            System.out.println("choose one out of regular/gold/silver");
            break;
        }
        
        
//        mb.show_bill();
        
        
        
        
        





  }





}