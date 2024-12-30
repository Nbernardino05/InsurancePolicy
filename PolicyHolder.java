//Project 3 solution
public class PolicyHolder
{
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   /**
   No-arg constructor that explicitly initializes all fields
   */
   public PolicyHolder()
   {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
   Constructor that accepts arguments for each field
   @param firstName The Policyhodler's first name
   @param lastName The Policyholder's last name
   @param age The Policyholder's age
   @param smokingStatus The Policyholder's smoking status
   @param height The Policyholder's height
   @param wweight The Policytholder's weight
   */
   public PolicyHolder(String firstName, String lastName,int age, String smokingStatus, double height, double weight)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   /**
   Copy Constructor that returns a copy of the PolicyHolder object
   @param obj2 The PolicyHolder to return a copy of
   */
   public PolicyHolder(PolicyHolder obj2)
   {
      this.firstName = obj2.getfirstName();
      this.lastName = obj2.getlastName();
      this.age = obj2.getAge();
      this.smokingStatus = obj2.getSmokingStatus();
      this.height = obj2.getHeight();
      this.weight = obj2.getWeight();
   }
   
   //getters//
   
   /**
   @return The Policyholder's first name
   */
   public String getfirstName()
   {
      return firstName;
   }
   
   /**
   @return The Policyholder's last name
   */
   public String getlastName()
   {
      return lastName;
   }
   
   /**
   @return The Policyholder's age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
   @return The Policyholder's smoking status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   @return The Policyholder's height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   @return The Policyholder's weight
   */
   public double getWeight()
   {
      return weight;
   }

   
   //setters//
   
   /**
   @param firstName The PolicyHolder's first name
   */
   public void setfirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   /**
   @param lastName The PolicyHolder's last name
   */
   public void setlastName(String lastName)
   {
      this.lastName = lastName;
   }
   
   /**
   @param age The PolicyHolder's age
   */
   public void setAge(int age)
   {
      this.age = age;
   }
   
   /**
   @param smokingStatus The PolicyHolder's smoking status
   */
   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }
   
   /**
   @param height The PolicyHolder's height
   */
   public void setHeight(double height)
   {
      this.height = height;
   }
   
   /**
   @param weight The PolicyHolder's weight
   */
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   
   /**
   Calculates the Policyholder's BMI
   @return The BMI of the Policyholder
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
   /**
   @return A String that describes the PolicyHolder
   */
   public String toString()
   {
      return String.format("Policyholder's First Name: " + firstName + 
                           "\nPolicyholder's Last Name: " + lastName + 
                           "\nPolicyholder's Age: " + age +
                           "\nPolicyholder's Smoking Status: " + smokingStatus +
                           "\nPolicyholder's Height: " + height + " inches" +
                           "\nPolicyholder's Weight: " + weight + " pounds" +
                           "\nPolicyholder's BMI: %.2f" , getBMI());
   }
}