package connection_crud.operation;


public class Democrud {

	public static void main(String[] args) {
	
	Personallnfo pi = new Personallnfo();
	Personallnfo pi1 = new Personallnfo("1","yagnik","20","yagnik@gmail.com"," 2023-09-01");
	
	pi.setid("7");
	pi.setname("pinal");
	pi.setage("12");
	pi.setemail("pinal@yahoo.co.in");
	pi.setenrollment_date("2023-09-01");
	
	
		
		CrudOperation cr = new CrudOperation();
		
		
		CrudOperation.insertData(pi.getid(),pi.getname(),pi.getage(),pi.getemail(),pi.getenrollment_date());
	
		CrudOperation.insertData(pi1.getid(),pi1.getname(),pi1.getage(),pi1.getemail(),pi1.getenrollment_date());		
		
        System.out.println(pi);
		
		
		CrudOperation.getData();
	}

}
