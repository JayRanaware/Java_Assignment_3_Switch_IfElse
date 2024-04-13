

class SwitchDemo{

	public static void main(String[] args){
	
	
	int Budget= 15000;


	switch(Budget){
	
		case 15000:
			System.out.println("For budget " + Budget + " destination is Jammu and Kashmir");
	                break;
	
		case 10000:
			System.out.println("For budget " + Budget + " destination is Manali");
	                break;
	
		case 6000:
			System.out.println("For budget " + Budget + " destination is Amritsar");
	                break;

		case 2000:
			System.out.println("For budget " + Budget + " destination is Mahabaleshwar");
	                break;

		default :
			System.out.println("For other budgets try next time ");
	                break;


	}
	
	
	
	}




}
