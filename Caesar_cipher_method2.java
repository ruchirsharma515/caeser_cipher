
public class Caesar_cipher_method2
{
    void main(String str){
        str= str.trim();
        
        for(int i=0;i<str.length();i++)
        { char ch=str.charAt(i);
            int x=(int)ch;
          if(Character.isUpperCase(ch)==true){
          x=x-64;
          if(x<=13)
          System.out.print((char)(x+13+64));
          else
          System.out.print((char)(x-13+64));
        }
        else if(Character.isLowerCase(ch)==true){
          x=x-96;
          if(x<=13)
          System.out.print((char)(x+13+96));
          else
          System.out.print((char)(x-13+96));
        }
        else
        System.out.print(ch);
    }
System.out.println();}
}
