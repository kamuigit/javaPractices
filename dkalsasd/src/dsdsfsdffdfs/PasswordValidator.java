package dsdsfsdffdfs;

//You are using Java
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class PasswordValidator
{
     public PasswordValidator()
     {
             super();
     }

     public static void main(String[] args)
     {
             // Fill your code
         Scanner sc =new Scanner(System.in);
         String password = sc.nextLine();
         sc.close();
         PasswordValidator pv = new  PasswordValidator();
         pv.passwordValidation(password);
     }

    
     public void passwordValidation(String password)
     {
           // Fill your code
           char [] arr = password.toCharArray();
         
         boolean number = false;
         boolean upcase = false;
         boolean lowcase = false;
         boolean len = false;
         
         if(arr.length<=15 && arr.length>=8){
             len=true;
         }
         for(int i=0;i<arr.length;i++){
             if(Character.isDigit(arr[i])){
                 number = true;
                 break;
             }
         }
         for(int i =0; i<arr.length;i++){
             if(Character.isUpperCase(arr[i])){
                 upcase = true;
                 break;
             }
         }
         for(int i =0; i<arr.length;i++){
             if(Character.isLowerCase(arr[i])){
                 lowcase = true;
                 break;
             }
         }
         
         Pattern p = Pattern.compile("[a-z0-9]", Pattern.CASE_INSENSITIVE);
         
         Matcher m = p.matcher(password);
         boolean special = m.find();
         
         if((number && lowcase && upcase && len && special)==true){
             System.out.println(password+" is a valid password");
             
         }
         else{
              System.out.println(password+" is a invalid password");
         }
             
     }
}
