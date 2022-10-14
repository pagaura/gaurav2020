package forloops;

class ITCompanies{

    private void Capgemini(){
        System.out.print("Cap ");
    }
       private void Cognizant(){
        System.out.print("Cog ");
    }
       public void func(){
        Capgemini();
        Cognizant();
    }
       public ITCompanies(){
        func();
    }
   
   


	public static void main(String[] args) {
	      ITCompanies javaObj = new ITCompanies();
	      javaObj.func();
	}
}
