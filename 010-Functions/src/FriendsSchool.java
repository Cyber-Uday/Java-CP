import java.util.*;
public class FriendsSchool
{
    public static void main(String[] args) {

        System.out.println("SOHAM SAY's : WHCIH IS YOUR FAV GAME UD :");
        Scanner sc=new Scanner(System.in);
        String str1= sc.next();
        System.out.println(SOHAM(str1));
    }

    static String str2;

    public static String SOHAM(String str1)
    {
        String str2="PUBG";
        if(Objects.equals(str1, str2))
        {
            str2="YES SOHAM UDAY ALSO WANT PLAY PUBG WITH YOU ";
        }
        else
        {
            str2="Sorry soham that game will not play by me ";
        }
        return str2;
    }

}
