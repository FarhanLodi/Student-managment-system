import java.util.*;
import java.sql.*;
class Student{
	private String enroll;
	private String fname;
	private String mname;
	private String lname; 
	private String dob;
	private String gender;
	private String email;
	private String mobnum;
	private String category;
	private String housenum;
	private String street;
	private String pincode;
	private String city;
	private String district;
	private String state;
	private String country;
	private String religion;
	private String fathername;
	private String foccupasion; 
	private String fmobnum;
	private String mothername;
	private String moccupasion;
	private String mmobnum;
	private String income;
	private String aadharnum;
	private String samagraid;
	private String per10;
	private String per12;
	private String collname;
	private String coursename;
	private String cyear;
	private String csem;
	private String branch;
	private String deptname;
	private String adddate;
	private String bankname;
	private String accnum;
	private String ifsccode;
    static private int i=0;
	public static void password(Scanner sc)throws Exception {
       String s ="pass";
	   String e = "exit";
       System.out.printf("\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t WELCOME To Student Record Management System \n");
       System.out.printf("\n\t\t\t\t\t\t\t*****************************************************************************");
       System.out.printf("\n\n\n\t\t\t\t\t\t\t\t\t Project Name :- STUDENT RECORD MANAGEMENT SYSTEM");
       System.out.printf("\n\n\n\t\t\t\t\t\t\t\t\t Application Developed By : Farhan Lodi   / 0805CS191034");
       System.out.printf("\n\n\n\t\t\t\t\t\t\t*****************************************************************************");
       System.out.printf("\n\n\n\t\t\t\t\t\t\t\t\t\t Enter Password:(pass/exit)");
	   String s1 = sc.nextLine();
		   if(s.equals(s1)) {
               System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Password matched!!");
		   }
		   else if(e.equals(s1)) {
		       System.exit(1);
		   }
		   else {
               System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t\tWarning!! \n\t\t\t\t\t\t\t\t\t\t\t   Incorrect Password");
			   i++;
			   if(i<4)
			      Student.password(sc);
			   else {
                   System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t\tToo Many Failed Attempt!");
				   System.out.println();
				   System.exit(0);
			   }
		   }
	}
	public static void insert(Scanner sc,Connection con,Student s1)throws Exception {
		sc.nextLine();
		String s = "insert into Student (enroll,fname,mname,lname,dob,gender,email,smobnum,category,housenum,street,pincode,city,district,state,country,religion,fathername,foccupasion,fmobnum,mothername,moccupasion,mmobnum,income,aadharnum,samagraid,per10,per12,collname,coursename,cyear,csem,branch,deptname,adddate,bankname,accnum,ifsccode) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(s);
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Enrollment Number :");
		s1.enroll = sc.nextLine();
        System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student First Name :");
		s1.fname = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Middle Name :");
		s1.mname = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Last Name :");
		s1.lname = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Date Of Birth :");
		s1.dob = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Gender :");
		s1.gender = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Email :");
		s1.email = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Mobile Number :");
		s1.mobnum = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Category(st/sc/obc/gen) :");
		s1.category = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student House Number :");
		s1.housenum = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Street :");
		s1.street = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Pincode :");
		s1.pincode = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student City :");
		s1.city = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student District :");
		s1.district = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student State :");
		s1.state = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Country :");
		s1.country = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Religion :");
		s1.religion = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Father's Name :");
		s1.fathername = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Father's Occupasion :");
		s1.foccupasion = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Father's Mobile Number :");
		s1.fmobnum = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Mother's Name :");
		s1.mothername = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Mother's Occupasion :");
		s1.moccupasion = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Mother's Mobile Number :");
		s1.mmobnum = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Family Income :");
		s1.income = sc.nextLine();
        System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Aadharcard Number :");
		s1.aadharnum = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Samagra Id Number :");
		s1.samagraid = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student 10th Percentage :");
		s1.per10= sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student 12th Percentage :");
		s1.per12 = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Collage Name :");
		s1.collname= sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Course Name :");
		s1.coursename = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Current Year(1/2/3/4) :");
		s1.cyear = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Current Semester(1/2/3/4/5/6/7/8) :");
		s1.csem = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Branch :");
		s1.branch = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Department Name :");
		s1.deptname = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Admission Date  :");
		s1.adddate = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Bank Name :");
		s1.bankname = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Account Number :");
		s1.accnum = sc.nextLine();
		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student IFSC Code:");
		s1.ifsccode = sc.nextLine();
		ps.setString(1,s1.enroll);
		ps.setString(2,s1.fname);
		ps.setString(3,s1.mname);
		ps.setString(4,s1.lname);
		ps.setString(5,s1.dob);
		ps.setString(6,s1.gender);
		ps.setString(7,s1.email);
		ps.setString(8,s1.mobnum);
		ps.setString(9,s1.category);
		ps.setString(10,s1.housenum);
		ps.setString(11,s1.street);
		ps.setString(12,s1.pincode);
		ps.setString(13,s1.city);
		ps.setString(14,s1.district);
		ps.setString(15,s1.state);
		ps.setString(16,s1.country);
		ps.setString(17,s1.religion);
		ps.setString(18,s1.fathername);
		ps.setString(19,s1.foccupasion);
		ps.setString(20,s1.fmobnum);
		ps.setString(21,s1.mothername);
		ps.setString(22,s1.moccupasion);	
		ps.setString(23,s1.mmobnum);
		ps.setString(24,s1.income);
		ps.setString(25,s1.aadharnum);
		ps.setString(26,s1.samagraid);
        ps.setString(27,s1.per10);
		ps.setString(28,s1.per12);
		ps.setString(29,s1.collname);
		ps.setString(30,s1.coursename);
		ps.setString(31,s1.cyear);
		ps.setString(32,s1.csem);
		ps.setString(33,s1.branch);
		ps.setString(34,s1.deptname);
		ps.setString(35,s1.adddate);
		ps.setString(36,s1.bankname);
		ps.setString(37,s1.accnum);
		ps.setString(38,s1.ifsccode);
		ps.executeUpdate();
		System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Enter Sucessfully!");
		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t------------------------------");
	    System.out.println("\t\t\t\t\t\t\t\t\t\tEnter any key to continue!");
		System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------");
		sc.nextLine();
		ps.close();
	}
	public static void display(Connection con,Student s2,Scanner sc)throws Exception {
		System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Management System");
		System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
		String q = "Select * from student";
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery(q); 
		while(res.next()) {
			System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
			s2.enroll   =   res.getString("enroll");
			s2.fname    =   res.getString("fname");
			s2.mname    =   res.getString("mname");
			s2.lname    =   res.getString("lname");
			s2.dob      =   res.getString("dob");
		    s2.gender   =   res.getString("gender");
		    s2.email    =   res.getString("email");
		    s2.mobnum   =   res.getString("smobnum");
		    s2.category =   res.getString("category");
		    s2.housenum =   res.getString("housenum");
		    s2.street   =   res.getString("street");
		    s2.pincode  =    res.getString("pincode");
		    s2.city     =    res.getString("city");
		    s2.district =    res.getString("district");
		    s2.state    =    res.getString("state");
		    s2.country  =    res.getString("country");
		    s2.religion =    res.getString("religion");
		    s2.fathername  = res.getString("fathername");
		    s2.foccupasion = res.getString("foccupasion");
		    s2.fmobnum   =   res.getString("fmobnum");
		    s2.mothername =  res.getString("mothername");
		    s2.moccupasion = res.getString("moccupasion");	
		    s2.mmobnum    =  res.getString("mmobnum");
		    s2.income     =  res.getString("income");
		    s2.aadharnum  =  res.getString("aadharnum");
		    s2.samagraid  =  res.getString("samagraid");
            s2.per10      =  res.getString("per10");
		    s2.per12      =  res.getString("per12");
		    s2.collname   =  res.getString("collname");
	        s2.coursename =  res.getString("coursename");
		    s2.cyear      =  res.getString("cyear");
		    s2.csem       =  res.getString("csem");
		    s2.branch     =  res.getString("branch");
		    s2.deptname   =  res.getString("deptname");
		    s2.adddate    =  res.getString("adddate");
		    s2.bankname   =  res.getString("bankname");
		    s2.accnum     =  res.getString("accnum");
		    s2.ifsccode   =  res.getString("ifsccode");
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Enrollment Numbe : "+s2.enroll);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student First Name : "+s2.fname);
			if(s2.mname != null)
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Middile Name : "+s2.mname);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Last Name : "+s2.lname);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Date Of Birth : "+s2.dob);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Gender : "+s2.gender); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Email : "+s2.email);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mobile Number : "+s2.mobnum);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Category : "+s2.category); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student House Number : "+s2.housenum);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Street : "+s2.street); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Pincode : "+s2.pincode); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student City : "+s2.city);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student District : "+s2.district); 
	     	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student State : "+s2.state); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Country : "+s2.country); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Religion : "+s2.religion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Name : "+s2.fathername);  
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Occupasion : "+s2.foccupasion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Mobile Number : "+s2.fmobnum);  
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Name : "+s2.mothername); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Occupasion : "+s2.moccupasion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Mobile Number : "+s2.mmobnum); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Family Income : "+s2.income); 
            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Aadharcard Number : "+s2.aadharnum); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Samagra Id Number : "+s2.samagraid); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student 10th Percentage : "+s2.per10);
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student 12th Percentage : "+s2.per12); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Collage Name : "+s2.collname);
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Course Name : "+s2.coursename); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Current Year : "+s2.cyear); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Current Semester : "+s2.csem); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Branch : "+s2.branch); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Department Name : "+s2.deptname);
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Admission Date  : "+s2.adddate); 
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Bank Name : "+s2.bankname); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Account Number : "+s2.accnum); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student IFSC Code : "+s2.ifsccode);
		}
		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t------------------------------");
	    System.out.println("\t\t\t\t\t\t\t\t\t\tEnter any key to continue!");
		System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------");
		sc.nextLine();
		sc.nextLine();
		res.close();
		stmt.close();
	}
	public static void modify(Scanner sc,Connection con,Student s1)throws Exception {
		sc.nextLine();
		int isfound = 0;
		System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Management System");
		System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
        System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Enter Student Enrollment Number :");
		String en = sc.nextLine();
        String a = "Select enroll from Student";
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery(a);
		String q = "Update Student set enroll=?,fname=?,mname= ? ,lname=? ,dob= ? ,gender= ? ,email= ? ,smobnum= ? ,category= ? ,housenum= ? ,street= ? ,pincode= ? ,city= ? ,district= ? ,state= ? ,country= ? ,religion= ? ,fathername= ? ,foccupasion= ? ,fmobnum= ? ,mothername= ? ,moccupasion= ? ,mmobnum= ? ,income= ? ,aadharnum= ? ,samagraid= ? ,per10= ? ,per12= ? ,collname= ? ,coursename= ? ,cyear= ? ,csem= ? ,branch= ? ,deptname= ? ,adddate= ? ,bankname= ? ,accnum= ? ,ifsccode= ?  where enroll = ?";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(39,en);
		while(res.next()) {
		     	s1.enroll = res.getString("enroll");
		        if(en.equalsIgnoreCase(s1.enroll)) {
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Enrollment Number :");
		            s1.enroll = sc.nextLine();
                    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student First Name :");
		            s1.fname = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Middle Name :");
	            	s1.mname = sc.nextLine();
            		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Last Name :");
            		s1.lname = sc.nextLine();
            		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Date Of Birth :");
            		s1.dob = sc.nextLine();
            		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Gender(st/sc/obc) :");
            		s1.gender = sc.nextLine();
            		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Email :");
            		s1.email = sc.nextLine();
            		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Mobile Number :");
	            	s1.mobnum = sc.nextLine();
             		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Category :");
            		s1.category = sc.nextLine();
             		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student House Number :");
            		s1.housenum = sc.nextLine();
             		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Street :");
	            	s1.street = sc.nextLine();
            		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Pincode :"); 
             		s1.pincode = sc.nextLine();
             		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student City :");
            		s1.city = sc.nextLine();
            		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student District :");
		            s1.district = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student State :");
		            s1.state = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Country :");
		            s1.country = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Religion :");
		            s1.religion = sc.nextLine();
	             	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Father's Name :");
		            s1.fathername = sc.nextLine();
	              	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Father's Occupasion :");
		            s1.foccupasion = sc.nextLine();
	             	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Father's Mobile Number :");
	             	s1.fmobnum = sc.nextLine();
	               	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Mother's Name :");
               		s1.mothername = sc.nextLine();
             		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Mother's Occupasion :");
             		s1.moccupasion = sc.nextLine();
              		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Mother's Mobile Number :");
            		s1.mmobnum = sc.nextLine();
             		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Family Income :");
            		s1.income = sc.nextLine();
                    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Aadharcard Number :");
                    s1.aadharnum = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Samagra Id Number :");
		            s1.samagraid = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student 10th Percentage :");
		            s1.per10= sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student 12th Percentage :");
		            s1.per12 = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Collage Name :");
		            s1.collname= sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Course Name :");
		            s1.coursename = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Current Year(1/2/3/4) :");
		            s1.cyear = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Current Semester(1/2/3/4/5/6/7/8) :");
		            s1.csem = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Branch :");
		            s1.branch = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Department Name :");
		            s1.deptname = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Admission Date  :");
		            s1.adddate = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Bank Name :");
		            s1.bankname = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student Account Number :");
		            s1.accnum = sc.nextLine();
		            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tEnter Student IFSC Code:");
		            s1.ifsccode = sc.nextLine();
		            ps.setString(1,s1.enroll);
		            ps.setString(2,s1.fname);
		            ps.setString(3,s1.mname);
		            ps.setString(4,s1.lname);
		            ps.setString(5,s1.dob);
		            ps.setString(6,s1.gender);
		            ps.setString(7,s1.email);
		            ps.setString(8,s1.mobnum);
		            ps.setString(9,s1.category);
		            ps.setString(10,s1.housenum);
		            ps.setString(11,s1.street);
		            ps.setString(12,s1.pincode);
		            ps.setString(13,s1.city);
		            ps.setString(14,s1.district);
		            ps.setString(15,s1.state);
		            ps.setString(16,s1.country);
		            ps.setString(17,s1.religion);
		            ps.setString(18,s1.fathername);
		            ps.setString(19,s1.foccupasion);
		            ps.setString(20,s1.fmobnum);
		            ps.setString(21,s1.mothername);
		            ps.setString(22,s1.moccupasion);	
		            ps.setString(23,s1.mmobnum);
		            ps.setString(24,s1.income);
		            ps.setString(25,s1.aadharnum);
		            ps.setString(26,s1.samagraid);
                    ps.setString(27,s1.per10);
		            ps.setString(28,s1.per12);
		            ps.setString(29,s1.collname);
		            ps.setString(30,s1.coursename);
		            ps.setString(31,s1.cyear);
		            ps.setString(32,s1.csem);
		            ps.setString(33,s1.branch);
		            ps.setString(34,s1.deptname);
		            ps.setString(35,s1.adddate);
		            ps.setString(36,s1.bankname);
		            ps.setString(37,s1.accnum);
		            ps.setString(38,s1.ifsccode);
		            ps.executeUpdate();
		            System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Update Sucessfully!");
					isfound++;
				}
		}
		if(isfound == 0 )
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tStudent Record Not Found!");
		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t------------------------------");
	    System.out.println("\t\t\t\t\t\t\t\t\t\tEnter any key to continue!");
		System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------");
		sc.nextLine();
		ps.close();
		res.close();
		stmt.close();
	}
	public static void delete(Scanner sc,Connection con,Student s1)throws Exception {
		sc.nextLine();
		int isfound = 0;
		System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Management System");
		System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
        System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Enter Student Enrollment Number :");
		String en = sc.nextLine();
        String a = "Select enroll from Student";
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery(a);
		String q = "delete from student where enroll=?";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1,en);
		while(res.next()) {
			s1.enroll = res.getString("enroll");
			if(en.equalsIgnoreCase(s1.enroll)) {
				ps.executeUpdate();
				System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\tStudent Record Deleted!");
				isfound++;
			}
		}
		if (isfound == 0) {
			    System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\tStudent Record Not Found!");
		}
		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t------------------------------");
	    System.out.println("\t\t\t\t\t\t\t\t\t\tEnter any key to continue!");
		System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------");
		sc.nextLine();
	}
	public static void displayEn(Connection con,Student s2,String s,Scanner sc)throws Exception{
		System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Management System");
		System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
		String q = "Select * from student where enroll = ?";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1,s);
		ResultSet res = ps.executeQuery(); 
		while(res.next()) {
			s2.enroll   =   res.getString("enroll");
			s2.fname    =   res.getString("fname");
			s2.mname    =   res.getString("mname");
			s2.lname    =   res.getString("lname");
			s2.dob      =   res.getString("dob");
		    s2.gender   =   res.getString("gender");
		    s2.email    =   res.getString("email");
		    s2.mobnum   =   res.getString("smobnum");
		    s2.category =   res.getString("category");
		    s2.housenum =   res.getString("housenum");
		    s2.street   =   res.getString("street");
		    s2.pincode  =    res.getString("pincode");
		    s2.city     =    res.getString("city");
		    s2.district =    res.getString("district");
		    s2.state    =    res.getString("state");
		    s2.country  =    res.getString("country");
		    s2.religion =    res.getString("religion");
		    s2.fathername  = res.getString("fathername");
		    s2.foccupasion = res.getString("foccupasion");
		    s2.fmobnum   =   res.getString("fmobnum");
		    s2.mothername =  res.getString("mothername");
		    s2.moccupasion = res.getString("moccupasion");	
		    s2.mmobnum    =  res.getString("mmobnum");
		    s2.income     =  res.getString("income");
		    s2.aadharnum  =  res.getString("aadharnum");
		    s2.samagraid  =  res.getString("samagraid");
            s2.per10      =  res.getString("per10");
		    s2.per12      =  res.getString("per12");
		    s2.collname   =  res.getString("collname");
	        s2.coursename =  res.getString("coursename");
		    s2.cyear      =  res.getString("cyear");
		    s2.csem       =  res.getString("csem");
		    s2.branch     =  res.getString("branch");
		    s2.deptname   =  res.getString("deptname");
		    s2.adddate    =  res.getString("adddate");
		    s2.bankname   =  res.getString("bankname");
		    s2.accnum     =  res.getString("accnum");
		    s2.ifsccode   =  res.getString("ifsccode");
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Enrollment Numbe : "+s2.enroll);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student First Name : "+s2.fname);
			if(s2.mname != null)
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Middile Name : "+s2.mname);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Last Name : "+s2.lname);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Date Of Birth : "+s2.dob);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Gender : "+s2.gender); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Email : "+s2.email);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mobile Number : "+s2.mobnum);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Category : "+s2.category); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student House Number : "+s2.housenum);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Street : "+s2.street); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Pincode : "+s2.pincode); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student City : "+s2.city);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student District : "+s2.district); 
	     	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student State : "+s2.state); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Country : "+s2.country); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Religion : "+s2.religion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Name : "+s2.fathername);  
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Occupasion : "+s2.foccupasion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Mobile Number : "+s2.fmobnum);  
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Name : "+s2.mothername); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Occupasion : "+s2.moccupasion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Mobile Number : "+s2.mmobnum); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Family Income : "+s2.income); 
            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Aadharcard Number : "+s2.aadharnum); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Samagra Id Number : "+s2.samagraid); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student 10th Percentage : "+s2.per10);
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student 12th Percentage : "+s2.per12); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Collage Name : "+s2.collname);
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Course Name : "+s2.coursename); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Current Year : "+s2.cyear); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Current Semester : "+s2.csem); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Branch : "+s2.branch); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Department Name : "+s2.deptname);
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Admission Date  : "+s2.adddate); 
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Bank Name : "+s2.bankname); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Account Number : "+s2.accnum); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student IFSC Code : "+s2.ifsccode);
		}
		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t------------------------------");
	    System.out.println("\t\t\t\t\t\t\t\t\t\tEnter any key to continue!");
		System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------");
		sc.nextLine();
		ps.close();
		res.close();
		
	}
	public static void displayFname(Connection con,Student s2,String s,Scanner sc)throws Exception{
		System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Management System");
		System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
		String q = "Select * from student where fname = ?";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1,s);
		ResultSet res = ps.executeQuery(); 
		while(res.next()) {
			s2.enroll   =   res.getString("enroll");
			s2.fname    =   res.getString("fname");
			s2.mname    =   res.getString("mname");
			s2.lname    =   res.getString("lname");
			s2.dob      =   res.getString("dob");
		    s2.gender   =   res.getString("gender");
		    s2.email    =   res.getString("email");
		    s2.mobnum   =   res.getString("smobnum");
		    s2.category =   res.getString("category");
		    s2.housenum =   res.getString("housenum");
		    s2.street   =   res.getString("street");
		    s2.pincode  =    res.getString("pincode");
		    s2.city     =    res.getString("city");
		    s2.district =    res.getString("district");
		    s2.state    =    res.getString("state");
		    s2.country  =    res.getString("country");
		    s2.religion =    res.getString("religion");
		    s2.fathername  = res.getString("fathername");
		    s2.foccupasion = res.getString("foccupasion");
		    s2.fmobnum   =   res.getString("fmobnum");
		    s2.mothername =  res.getString("mothername");
		    s2.moccupasion = res.getString("moccupasion");	
		    s2.mmobnum    =  res.getString("mmobnum");
		    s2.income     =  res.getString("income");
		    s2.aadharnum  =  res.getString("aadharnum");
		    s2.samagraid  =  res.getString("samagraid");
            s2.per10      =  res.getString("per10");
		    s2.per12      =  res.getString("per12");
		    s2.collname   =  res.getString("collname");
	        s2.coursename =  res.getString("coursename");
		    s2.cyear      =  res.getString("cyear");
		    s2.csem       =  res.getString("csem");
		    s2.branch     =  res.getString("branch");
		    s2.deptname   =  res.getString("deptname");
		    s2.adddate    =  res.getString("adddate");
		    s2.bankname   =  res.getString("bankname");
		    s2.accnum     =  res.getString("accnum");
		    s2.ifsccode   =  res.getString("ifsccode");
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Enrollment Numbe : "+s2.enroll);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student First Name : "+s2.fname);
			if(s2.mname != null)
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Middile Name : "+s2.mname);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Last Name : "+s2.lname);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Date Of Birth : "+s2.dob);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Gender : "+s2.gender); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Email : "+s2.email);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mobile Number : "+s2.mobnum);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Category : "+s2.category); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student House Number : "+s2.housenum);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Street : "+s2.street); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Pincode : "+s2.pincode); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student City : "+s2.city);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student District : "+s2.district); 
	     	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student State : "+s2.state); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Country : "+s2.country); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Religion : "+s2.religion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Name : "+s2.fathername);  
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Occupasion : "+s2.foccupasion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Mobile Number : "+s2.fmobnum);  
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Name : "+s2.mothername); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Occupasion : "+s2.moccupasion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Mobile Number : "+s2.mmobnum); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Family Income : "+s2.income); 
            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Aadharcard Number : "+s2.aadharnum); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Samagra Id Number : "+s2.samagraid); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student 10th Percentage : "+s2.per10);
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student 12th Percentage : "+s2.per12); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Collage Name : "+s2.collname);
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Course Name : "+s2.coursename); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Current Year : "+s2.cyear); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Current Semester : "+s2.csem); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Branch : "+s2.branch); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Department Name : "+s2.deptname);
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Admission Date  : "+s2.adddate); 
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Bank Name : "+s2.bankname); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Account Number : "+s2.accnum); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student IFSC Code : "+s2.ifsccode);
		}
		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t------------------------------");
	    System.out.println("\t\t\t\t\t\t\t\t\t\tEnter any key to continue!");
		System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------");
		sc.nextLine();
		res.close();
		ps.close();
	}
	public static void displayBranch(Connection con,Student s2,String s,Scanner sc)throws Exception{
		System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Management System");
		System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
		String q = "Select * from student where enroll = ?";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1,s);
		ResultSet res = ps.executeQuery(); 
		while(res.next()) {
			s2.enroll   =   res.getString("enroll");
			s2.fname    =   res.getString("fname");
			s2.mname    =   res.getString("mname");
			s2.lname    =   res.getString("lname");
			s2.dob      =   res.getString("dob");
		    s2.gender   =   res.getString("gender");
		    s2.email    =   res.getString("email");
		    s2.mobnum   =   res.getString("smobnum");
		    s2.category =   res.getString("category");
		    s2.housenum =   res.getString("housenum");
		    s2.street   =   res.getString("street");
		    s2.pincode  =    res.getString("pincode");
		    s2.city     =    res.getString("city");
		    s2.district =    res.getString("district");
		    s2.state    =    res.getString("state");
		    s2.country  =    res.getString("country");
		    s2.religion =    res.getString("religion");
		    s2.fathername  = res.getString("fathername");
		    s2.foccupasion = res.getString("foccupasion");
		    s2.fmobnum   =   res.getString("fmobnum");
		    s2.mothername =  res.getString("mothername");
		    s2.moccupasion = res.getString("moccupasion");	
		    s2.mmobnum    =  res.getString("mmobnum");
		    s2.income     =  res.getString("income");
		    s2.aadharnum  =  res.getString("aadharnum");
		    s2.samagraid  =  res.getString("samagraid");
            s2.per10      =  res.getString("per10");
		    s2.per12      =  res.getString("per12");
		    s2.collname   =  res.getString("collname");
	        s2.coursename =  res.getString("coursename");
		    s2.cyear      =  res.getString("cyear");
		    s2.csem       =  res.getString("csem");
		    s2.branch     =  res.getString("branch");
		    s2.deptname   =  res.getString("deptname");
		    s2.adddate    =  res.getString("adddate");
		    s2.bankname   =  res.getString("bankname");
		    s2.accnum     =  res.getString("accnum");
		    s2.ifsccode   =  res.getString("ifsccode");
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Enrollment Numbe : "+s2.enroll);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student First Name : "+s2.fname);
			if(s2.mname != null)
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Middile Name : "+s2.mname);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Last Name : "+s2.lname);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Date Of Birth : "+s2.dob);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Gender : "+s2.gender); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Email : "+s2.email);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mobile Number : "+s2.mobnum);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Category : "+s2.category); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student House Number : "+s2.housenum);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Street : "+s2.street); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Pincode : "+s2.pincode); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student City : "+s2.city);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student District : "+s2.district); 
	     	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student State : "+s2.state); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Country : "+s2.country); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Religion : "+s2.religion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Name : "+s2.fathername);  
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Occupasion : "+s2.foccupasion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Mobile Number : "+s2.fmobnum);  
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Name : "+s2.mothername); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Occupasion : "+s2.moccupasion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Mobile Number : "+s2.mmobnum); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Family Income : "+s2.income); 
            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Aadharcard Number : "+s2.aadharnum); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Samagra Id Number : "+s2.samagraid); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student 10th Percentage : "+s2.per10);
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student 12th Percentage : "+s2.per12); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Collage Name : "+s2.collname);
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Course Name : "+s2.coursename); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Current Year : "+s2.cyear); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Current Semester : "+s2.csem); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Branch : "+s2.branch); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Department Name : "+s2.deptname);
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Admission Date  : "+s2.adddate); 
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Bank Name : "+s2.bankname); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Account Number : "+s2.accnum); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student IFSC Code : "+s2.ifsccode);
		}
		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t------------------------------");
	    System.out.println("\t\t\t\t\t\t\t\t\t\tEnter any key to continue!");
		System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------");
		sc.nextLine();
		res.close();
		ps.close();
	}
	public static void displayPincode(Connection con,Student s2,String s,Scanner sc1)throws Exception{
		System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Management System");
		System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
		String q = "Select * from student where pincode = ?";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1,s);
		ResultSet res = ps.executeQuery(); 
		while(res.next()) {
			s2.enroll   =   res.getString("enroll");
			s2.fname    =   res.getString("fname");
			s2.mname    =   res.getString("mname");
			s2.lname    =   res.getString("lname");
			s2.dob      =   res.getString("dob");
		    s2.gender   =   res.getString("gender");
		    s2.email    =   res.getString("email");
		    s2.mobnum   =   res.getString("smobnum");
		    s2.category =   res.getString("category");
		    s2.housenum =   res.getString("housenum");
		    s2.street   =   res.getString("street");
		    s2.pincode  =    res.getString("pincode");
		    s2.city     =    res.getString("city");
		    s2.district =    res.getString("district");
		    s2.state    =    res.getString("state");
		    s2.country  =    res.getString("country");
		    s2.religion =    res.getString("religion");
		    s2.fathername  = res.getString("fathername");
		    s2.foccupasion = res.getString("foccupasion");
		    s2.fmobnum   =   res.getString("fmobnum");
		    s2.mothername =  res.getString("mothername");
		    s2.moccupasion = res.getString("moccupasion");	
		    s2.mmobnum    =  res.getString("mmobnum");
		    s2.income     =  res.getString("income");
		    s2.aadharnum  =  res.getString("aadharnum");
		    s2.samagraid  =  res.getString("samagraid");
            s2.per10      =  res.getString("per10");
		    s2.per12      =  res.getString("per12");
		    s2.collname   =  res.getString("collname");
	        s2.coursename =  res.getString("coursename");
		    s2.cyear      =  res.getString("cyear");
		    s2.csem       =  res.getString("csem");
		    s2.branch     =  res.getString("branch");
		    s2.deptname   =  res.getString("deptname");
		    s2.adddate    =  res.getString("adddate");
		    s2.bankname   =  res.getString("bankname");
		    s2.accnum     =  res.getString("accnum");
		    s2.ifsccode   =  res.getString("ifsccode");
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Enrollment Numbe : "+s2.enroll);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student First Name : "+s2.fname);
			if(s2.mname != null)
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Middile Name : "+s2.mname);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Last Name : "+s2.lname);
			System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Date Of Birth : "+s2.dob);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Gender : "+s2.gender); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Email : "+s2.email);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mobile Number : "+s2.mobnum);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Category : "+s2.category); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student House Number : "+s2.housenum);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Street : "+s2.street); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Pincode : "+s2.pincode); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student City : "+s2.city);
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student District : "+s2.district); 
	     	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student State : "+s2.state); 
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Country : "+s2.country); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Religion : "+s2.religion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Name : "+s2.fathername);  
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Occupasion : "+s2.foccupasion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Father's Mobile Number : "+s2.fmobnum);  
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Name : "+s2.mothername); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Occupasion : "+s2.moccupasion); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Mother's Mobile Number : "+s2.mmobnum); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Family Income : "+s2.income); 
            System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Aadharcard Number : "+s2.aadharnum); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Samagra Id Number : "+s2.samagraid); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student 10th Percentage : "+s2.per10);
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student 12th Percentage : "+s2.per12); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Collage Name : "+s2.collname);
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Course Name : "+s2.coursename); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Current Year : "+s2.cyear); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Current Semester : "+s2.csem); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Branch : "+s2.branch); 
	    	System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Department Name : "+s2.deptname);
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Admission Date  : "+s2.adddate); 
     		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Bank Name : "+s2.bankname); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student Account Number : "+s2.accnum); 
    		System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t Student IFSC Code : "+s2.ifsccode);
		}
		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t------------------------------");
		System.out.println("\t\t\t\t\t\t\t\t\t\tEnter any key to continue!");
		System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------");
		sc1.nextLine();
		res.close();
		ps.close();
	}
	public static void searchByEn(Scanner sc,Connection con,Student s1)throws Exception {
		 System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Management System");
		 System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
         sc.nextLine();
		 int a = 0;
		 System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Enter Student Enrollment Number : ");
		 String s = sc.nextLine();
		 String q = "Select enroll from student where enroll = ?";
		 PreparedStatement ps = con.prepareStatement(q);
		 ps.setString(1,s);
		 ResultSet res = ps.executeQuery();
		 while(res.next()) {
			  s1.enroll = res.getString("enroll");
			  if(s.equalsIgnoreCase(s1.enroll)) { 
				displayEn(con,s1,s,sc);
				a++;
			  }
		 }
		 if(a==0)
			 System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tStudent Record Not Found!");
		 System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t------------------------------");
		 System.out.println("\t\t\t\t\t\t\t\t\t\tEnter any key to continue!");
		 System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------");
			sc.nextLine();
		 res.close();
		 ps.close();
	}
	public static void searchByName(Scanner sc,Connection con,Student s1)throws Exception {
		 System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Management System");
		 System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
         sc.nextLine();
		 int a = 0;
		 System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Enter Student First Name : ");
		 String s = sc.nextLine();
		 String q = "Select fname from student where fname = ?";
		 PreparedStatement ps = con.prepareStatement(q);
		 ps.setString(1,s);
		 ResultSet res = ps.executeQuery();
		 while(res.next()) {
			  s1.fname = res.getString("fname");
			  if(s.equalsIgnoreCase(s1.fname)) { 
				displayFname(con,s1,s,sc);
				a++;
			  }
		 }
		 if(a==0)
			 System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tStudent Record Not Found!");
		 System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t------------------------------");
		 System.out.println("\t\t\t\t\t\t\t\t\t\tEnter any key to continue!");
		 System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------");
			sc.nextLine();
		res.close();
		ps.close();
	}
	public static void searchByBranch(Scanner sc,Connection con,Student s1)throws Exception {
		 System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Management System");
		 System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
         sc.nextLine();
		 int a = 0;
		 System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Enter Student Branch : ");
		 String s = sc.nextLine();
		 String q = "Select branch from student where branch = ?";
		 PreparedStatement ps = con.prepareStatement(q);
		 ps.setString(1,s);
		 ResultSet res = ps.executeQuery();
		 while(res.next()) {
			  s1.branch = res.getString("branch");
			  if(s.equalsIgnoreCase(s1.branch)) { 
				displayBranch(con,s1,s,sc);
				a++;
			  }
		 }
		 if(a==0)
			 System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tStudent Record Not Found!");
		 System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t------------------------------");
		 System.out.println("\t\t\t\t\t\t\t\t\t\tEnter any key to continue!");
		 System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------");
			sc.nextLine();
		res.close();
		ps.close();
	}
	public static void searchByPincode(Scanner sc,Connection con,Student s1)throws Exception {
		 System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Management System");
		 System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
         sc.nextLine();
		 int a = 0;
		 System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Enter Student Pincode : ");
		 String s = sc.nextLine();
		 String q = "Select pincode from student where pincode = ?";
		 PreparedStatement ps = con.prepareStatement(q);
		 ps.setString(1,s);
		 ResultSet res = ps.executeQuery();
		 while(res.next()) {
			  s1.pincode = res.getString("pincode");
			  if(s.equalsIgnoreCase(s1.pincode)) { 
				displayPincode(con,s1,s,sc);
				a++;
			  }
		 }
		 if(a==0)
			 System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tStudent Record Not Found!");
		 System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t------------------------------");
		 System.out.println("\t\t\t\t\t\t\t\t\t\tEnter any key to continue!");
		 System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------");
	     sc.nextLine();
		 res.close();
		 ps.close();
	}
	public static void searchByCaste(Scanner sc,Connection con,Student s1)throws Exception {
		 System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Management System");
		 System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
         sc.nextLine();
		 int a = 0;
		 System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Enter Student Caste : ");
		 String s = sc.nextLine();
		 String q = "Select category from student where category = ?";
		 PreparedStatement ps = con.prepareStatement(q);
		 ps.setString(1,s);
		 ResultSet res = ps.executeQuery();
		 while(res.next()) {
			  s1.category = res.getString("category");
			  if(s.equalsIgnoreCase(s1.category)) { 
				display(con,s1,sc);
				a++;
			  }
		 }
		 if(a==0)
			 System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tStudent Record Not Found!");
		 System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t------------------------------");
		 System.out.println("\t\t\t\t\t\t\t\t\t\tEnter any key to continue!");
		 System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------");
			sc.nextLine();
		res.close();
		ps.close();
	}
}
public class StudentProject extends Student{
	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","FARHAN","fklodi");
		Scanner sc = new Scanner(System.in);
		int c,ch;
	    boolean b = true;
		Student s1 = new Student();
		Student.password(sc);
		try
		{
		while(true) {
			b=true;
            System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t Student Record Management System");
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
		    System.out.printf("\n\n\n\t\t\t\t\t\t\t\t\t\t<1> Insert Student Record");
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t<2> Remove Student Record");
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t<3> Search Student Record");
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t<4> View Record's list");
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t<5> Modify Student Record");
		    System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t<6> Close application");
		    System.out.printf("\n\n\n\t\t\t\t\t\t\t\t\t\t  Enter your choice:");
            c = sc.nextInt();
			switch(c) {
				case 1 : {
					Student.insert(sc,con,s1);
				    break;
			   }
			   case 2: {
				   Student.delete(sc,con,s1);
                   break; 
			   }
			   case 3 : {
				  while(b) {
					System.out.printf("\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t SEARCH STUDENT RECORDS");
					System.out.printf("\n\n\n\t\t\t\t\t\t\t\t*****************************************************************************");
					System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t<1> Student Record searching by Enrollment number :  ");
					System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t<2> Student Record searching by Name :");
					System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t<3> Student Record searching by Branch :");
					System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t<4> Student Record searching by Address(pincode only) :");
					System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t<5> Student Record searching by cast(ST/SC/OBC) :");
					System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\t<6> Close Application");
					System.out.printf("\n\n\n\t\t\t\t\t\t\t\t\t\t  Enter your choice:");
					ch = sc.nextInt();
					switch(ch) {
						case 1: {
							Student.searchByEn(sc,con,s1);
							break;
						}
						case 2: {
							Student.searchByName(sc,con,s1);
							break;
						}
						case 3: {
							Student.searchByBranch(sc,con,s1);
							break;
						}
					    case 4: {
							Student.searchByPincode(sc,con,s1);
							break;
					   }
						case 5: {
							Student.searchByCaste(sc,con,s1);
							break;
					    }
						case 6: {
							b = false;
							break;
	 				    }
						default :
						   System.out.printf("\n\n\n\t\t\t\t\t\t\t\t\t\tInvalid Choice!");
					}
				 }
			   }
			   case 4 : {
                    Student.display(con,s1,sc);
					break;
			   }
			   case 5 : {
				   Student.modify(sc,con,s1);
				   break;
			   }
               case 6 :
				   con.close();
			       s1 = null;
				   System.exit(0);
			  default :
				  System.out.printf("\n\n\t\t\t\t\t\t\t\t\t\tInvalid Choice!");

			}
	   }
	   }
	   catch(java.util.InputMismatchException e) {
	       System.out.println("\n\n\t\t\t\t\t\t\t\t\t\tInvalid Choice");
	   }
   } 		 
}