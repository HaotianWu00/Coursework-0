import java.util.Scanner;

public class CheckPassword {
	  public static boolean longEnough(String password) {
		  if(password.length() >= 12){
			  return true;
		  }else{
			  return false;
		  }
	  }

	  public static boolean atLeastTwoDigits(String password) {
		  int i = 0;
		  for(int j = 0; j < password.length(); j++){
			  if((int)(password.charAt(j)) >= 48 && (int)(password.charAt(j)) <= 57){
				  i++;
			  }
		  }
		  if(i >= 2){
			  return true;
		  }else{
			  return false;
		  }
	  }

	  public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  String password = input.nextLine();
		  if(password.length() == 0){
			  System.err.println("Usage: java CheckPassword <password>");
			  System.exit(1);
		  }
		  if(atLeastTwoDigits(password) && longEnough(password)){
			  System.out.println("Password is valid.");
		  }else{
			  System.out.println("Password is not valid.");
		  }
	  }
	}

