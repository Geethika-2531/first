package first;

class chocolate1 {
	
	String brand="kitkat";

}
class kitkat extends chocolate1{
	
	String brand1="kitkat1";
}
public class chocolate{
	public static void main(String[] args) {
		
		kitkat k= new kitkat();
		
		System.out.println(k.brand);
		System.out.println(k.brand1);
	}
}
