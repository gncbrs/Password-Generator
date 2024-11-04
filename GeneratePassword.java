import java.util.Random;

public class GeneratePassword {
    Random random = new Random();//For random choose we need random library.
    
    private String chars= "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm!^+%&/()=?_-*;:.,{[]}|";//The password gets characters form this string.
    private String password = "";

    public String getChars() {
        return chars;
    }

    public void setChars(String chars) {
        this.chars = chars;
    }

    public String getPassword() {
        //If user want to see the password this method should call.
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void generate_password(int length) {
        StringBuilder sb = new StringBuilder();//For add the choosen character to password we have to use StringBuilder.
        
        //Until the lenth of password reach the length that user wanted it continues to choose random character and append it to sb.
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }
        password = sb.toString();//All work've done so password should be equal to sb.
    }
}
