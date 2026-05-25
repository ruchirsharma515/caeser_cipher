
public class Caesar_cipher
{
    void main(String str){
        str= str.trim();
        char arr[]= new char[27];
        char brr[]= new char[27];
        arr[0]=' ';
        brr[0]=' ';
        for(char k='A';k<='Z';k++)
        arr[(int)k-64]=k;
        
        for(char k='a';k<='z';k++)
        brr[(int)k-96]=k;
        
        for(int i=0;i<str.length();i++)
        { char ch=str.charAt(i);
            int x=(int)ch;
          if(Character.isUpperCase(ch)==true){
          x=x-64;
          if(x<=13)
          System.out.print(arr[x+13]);
          else
          System.out.print(arr[x-13]);
        }
        else if(Character.isLowerCase(ch)==true){
          x=x-96;
          if(x<=13)
          System.out.print(brr[x+13]);
          else
          System.out.print(brr[x-13]);
        }
        else
        System.out.print(ch);
    }
}
}