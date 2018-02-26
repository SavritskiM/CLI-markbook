import java.util.*;

public class markbookAssignment {
	static class student{
		int sNum, avg;
		String name;
		ArrayList<Integer>marks;
		student(int a, String b){
			sNum=a;name=b;
			marks=new ArrayList<Integer>();
		}
	}

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<student>markbook=new ArrayList<student>();
    	System.out.println("Input the number of students:");
    	int n=sc.nextInt();
    	for(int i=0;i<n;i++){
    		System.out.println("Input student "+(i+1)+"'s student number");
    		int sNum=sc.nextInt();
    		System.out.println("Input student "+(i+1)+"'s name");
    		sc.nextLine();
    		String name=sc.nextLine();
    		markbook.add(new student(sNum, name));
    	}
    	all:
    	while(true){
    		System.out.println("What would you like to do?");
    		System.out.println("(0) Exit\n(1) Edit Student\n(2) Remove Student\n(3) Add Student");
    		int cmd=sc.nextInt();
    		if(cmd==0)break;
    		else if(cmd==1){
    			System.out.println("Input the current student number of the student you would like to edit:");
    			int edit=sc.nextInt();
    			System.out.println("What would you like to edit?\n(0) Go Back\n(1) Student Number\n(2) Student Name");
    			int cmd2=sc.nextInt();
    			if(cmd2==0)continue;
    			else if(cmd2==1){
    				System.out.println("What would you like to change the student number to?");
    				int newSn=sc.nextInt();
    				for(student i:markbook){
    					if(i.sNum==edit){
    						System.out.println(i.sNum+" change to "+newSn);
    						i.sNum=newSn;
    						continue all;
    					}
    				}
    				System.out.println("Student not found");
    			}else{
    				System.out.println("What would you like to change the name to?");
    				sc.nextLine();
    				String name=sc.nextLine();
    				for(student i:markbook){
    					if(i.sNum==edit){
    						System.out.println(i.name+" change to "+name);
    						i.name=name;
    						continue all;
    					}
    				}
    				System.out.println("Student not found");
    			}
    		}else if(cmd==2){
    			System.out.println("Enter the student number of the student you would like to remove:");
    			int sN=sc.nextInt(), ind=0;
    			for(student i:markbook){
					if(i.sNum==sN){
						System.out.println(i.sNum+" Removed");
						markbook.remove(ind);
						continue all;
					}
					ind++;
				}
    			System.out.println("Student "+sN+" not found");
    		}else if(cmd==3){
    			System.out.println("Enter the new student number:");
    			int sN=sc.nextInt();
    			System.out.println("Enter the new student name:");
    			sc.nextLine();
    			String name=sc.nextLine();
    			markbook.add(new student(sN, name));
    			System.out.println(sN+" added to class");
    		}
    	}
    	
    }
   
}