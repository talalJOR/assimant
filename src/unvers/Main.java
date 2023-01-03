package unvers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static studentsDAO stu;
	private static coursesDAO cours;
	private static studentCourseDAO sc;
	@SuppressWarnings("static-access")
	public static void main(String []args) throws NumberFormatException, IOException
	{
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input a number to proceed ");
		System.out.println("1-create student ");
		System.out.println("2-create course");
		System.out.println("3-assign student to course ");
		System.out.println("4-show all students ");
		System.out.println("5-show all courses ");
		System.out.println("6-show how many students in course ");
		System.out.println("7-show how many course  in students ");
		int num = Integer.parseInt(reader.readLine());
		double price;
		int id;
		String name;
        stu = new studentsDAO();
        cours = new coursesDAO();
          sc= new studentCourseDAO();
          try {
        while (num >=1&&num<=7) {
        
        	switch (num) {
			case 1:
				try {
					System.out.println(" please input id :");
			id= Integer.parseInt(reader.readLine());
			System.out.println(" please input name :");
			name=reader.readLine();
			students stud =new students(id, name);
			stu.insertdata(stud);
			
				} catch (Exception e) {
					System.out.println(e);
				}
				
				System.out.println("1- retrun to main page\r\n"
						+ "2- exit program : note you can use the following command to turn off system (System.exit(0);)");
				String maa=reader.readLine();
				if(maa.equalsIgnoreCase("1")){
					main(null);	
				}else {
					System.exit(0);
				}
		    break;
			case 2:
				
				
				try {
					System.out.println(" please input id :");
			id= Integer.parseInt(reader.readLine());
			System.out.println(" please input name :");
			name=reader.readLine();
			System.out.println(" please input price :");
			price= Integer.parseInt(reader.readLine());
			
			courses courss =new courses(id ,name ,price);
				cours.insertdata(courss);
			
						
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("1- retrun to main page\r\n"
						+ "2- exit program : note you can use the following command to turn off system (System.exit(0);)");
				 maa=reader.readLine();
				if(maa.equalsIgnoreCase("1")){
					main(null);	
				}else {
					System.exit(0);
				}
				
				   break;
			case 3:
				try {
					System.out.println("please input studentId :");
			id= Integer.parseInt(reader.readLine());
			System.out.println(" please input CourseId:");
			int id1=Integer.parseInt(reader.readLine());
		      studentCourse stc =new studentCourse(id, id1);
		      sc.insertdata(stc);
				
				
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("1- retrun to main page\r\n"
						+ "2- exit program : note you can use the following command to turn off system (System.exit(0);)");
				 maa=reader.readLine();
				if(maa.equalsIgnoreCase("1")){
					main(null);	
				}else {
					System.exit(0);
				}
				   break;
			case 4:
				try {
		
			stu.fatshdata();
			
					
				} catch (Exception e) {
					System.out.println(e);
				}System.out.println("1- retrun to main page\r\n"
						+ "2- exit program : note you can use the following command to turn off system (System.exit(0);)");
				 maa=reader.readLine();
				if(maa.equalsIgnoreCase("1")){
					main(null);	
				}else {
					System.exit(0);
				}
			
			
		    break;
			case 5:
				try {
				cours.fatshdata();
				
					} catch (Exception e) {
						System.out.println(e);
					}
				System.out.println("1- retrun to main page\r\n"
						+ "2- exit program : note you can use the following command to turn off system (System.exit(0);)");
				 maa=reader.readLine();
				if(maa.equalsIgnoreCase("1")){
					main(null);	
				}else {
					System.exit(0);
				}
				break;
			case 6:
				try {
					System.out.println("please input courseId :");
			id= Integer.parseInt(reader.readLine());
			
		 System.out.println("Number of students "+sc.manystudincor(id)) ;   
				
				System.out.println("1- retrun to main page\r\n"
						+ "2- exit program : note you can use the following command to turn off system (System.exit(0);)");
					String ma=reader.readLine();
					if(ma.equalsIgnoreCase("1")){
						main(null);	
					}else {
						System.exit(0);
					}	
				} catch (Exception e) {
					System.out.println(e);
				}
				   break;
			case 7:
				try {
					System.out.println("please input courseId :");
			id= Integer.parseInt(reader.readLine());
			
		 System.out.println(" Number of courses "+sc.manycorforstu(id)) ;   
			
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("1- retrun to main page\r\n"
						+ "2- exit program : note you can use the following command to turn off system (System.exit(0);)");
				 maa=reader.readLine();
				if(maa.equalsIgnoreCase("1")){
					main(null);	
				}else {
					System.exit(0);
				}
				   break;
			default:
			
				}	
				
			}
              System.out.println("1- retrun to main page\r\n"
					+ "2- exit program : note you can use the following command to turn off system (System.exit(0);)");
				String ma=reader.readLine();
				if(ma.equalsIgnoreCase("1")){
					main(null);	
				}else {
					System.exit(0);
				}	
	
	}catch (Exception e) {
	e.printStackTrace();
				}
	
}
	}
