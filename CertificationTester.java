package sab;


public class CertificationTester {
    public static void main(String[] args) {
        RegularCourseCertification r = new RegularCourseCertification("Sabeeha", "Ai", 89, 4);
        System.out.println("Regular Course Details");
        System.out.println("**************************************");
        System.out.println("Student Name: " + r.getStudentName());
        System.out.println("Course Name: " + r.getCourseName());
        System.out.println("Course Name: " + r.getDuration() +" Months");
        System.out.println("Registration ID: " + r.getRegistrationId());
        System.out.println("Total Fees: " + r.calculateFee());
        
        CrashCourseCertification c = new CrashCourseCertification("anzum", "Angular", 88);
        System.out.println("\nCrash Course Details");
        System.out.println("**************************************");
        System.out.println("Student Name: " + c.getStudentName());
        System.out.println("Course Name: " + c.getCourseName());
        System.out.println("Course Name: " + c.getDuration() +" Months");
        System.out.println("Registration ID: " + c.getRegistrationId());
        System.out.println("Total Fees: " + c.calculateFee());
    }
}

	        
	    


