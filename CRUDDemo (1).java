import java.util.*;
class Hospital{
	private int hosno;
	private String hosname;
	private int salary;
	
	
	Hospital(int hosno, String hosname, int salary){
		this.hosno = hosno;
		this.hosname = hosname;
		this.salary = salary;
	}
	public int getHosno(){
		return hosno;
	}
	public int getSalary(){
		return salary;
	}
	public String getHosname(){
		return hosname;
	}
	public String toString(){
		return hosno+ " "+hosname+" "+salary;
	}
}

class CRUDDemo{
	public static void main(String[] args ){
		
		Collection<Hospital> c = new ArrayList<Hospital>();
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		int ch;
		do{
			System.out.println("1.CREATE");
			System.out.println("2.READ");
			System.out.println("3.UPDATE");
			System.out.println("4.DELETE");
			System.out.print("Enter your choice :");
			ch=s.nextInt();
			
			switch(ch){
				case 1:
					System.out.print("Enter Hosno : ");
					int hosno = s.nextInt();
					System.out.print("Enter Hosname : ");
					String hosname = s1.nextLine();
					System.out.print("Enter Salary : ");
					int salary = s.nextInt();
					
					c.add(new Hospital(hosno,hosname,salary));
				break;
				case 2:
					System.out.println("---------------------------------");
					Iterator<Hospital> i = c.iterator();
					while(i.hasNext()){
						Hospital h = i.next();
						System.out.println(h);
					}
					System.out.println("---------------------------------");
				break;
					case 3:
						boolean found = false;
					System.out.print("Enter the Hosno to Search :");
					hosno = s.nextInt();	 
					System.out.println("---------------------------------");
					i = c.iterator();
					while(i.hasNext()){
						Hospital h = i.next();
						if(h.getHosno() == hosno) {
						System.out.println(h);
						found = true;
						}
					}
				
					if(!found){
						System.out.println("Record Not Found");
					}
					System.out.println("---------------------------------");
				break;
			
					case 4:
				 found = false;
					System.out.print("Enter Hosno to Delete :");
					hosno = s.nextInt();	 
					System.out.println("---------------------------------");
					i = c.iterator();
					while(i.hasNext()){
						Hospital h = i.next();
						if(h.getHosno() == hosno) {
						i.remove();
						found = true;
						}
					}
				
					if(!found){
						System.out.println("Record Not Found");
					}else{
						System.out.println("Record is Deleted Successfully...!");
					}
					System.out.println("---------------------------------");
				break;
			
			}
		}while(ch!=0);
	}
}