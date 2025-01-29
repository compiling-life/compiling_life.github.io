import java.security.SecureRandom;

public class PasswordGenerator
{
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:,.<>?";
    
    public static void main(String[] args)
    {
        int length = 16; 
        
        String password = generatePassword(length);
        
        System.out.println("Generated Password: " + password);
    }
    
    public static String generatePassword(int length)
    {
        String allCharacters = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;
        
        SecureRandom random = new SecureRandom();
        
        StringBuilder password = new StringBuilder(length);
        
        password.append(getRandomCharacter(LOWERCASE, random));
        password.append(getRandomCharacter(UPPERCASE, random));
        password.append(getRandomCharacter(DIGITS, random));
        password.append(getRandomCharacter(SPECIAL_CHARACTERS, random));
        
        for (int i = 4; i < length; i++)
        {
            password.append(getRandomCharacter(allCharacters, random));
        }
        
        return shufflePassword(password.toString(), random);
    }
    
    public static char getRandomCharacter(String characters, SecureRandom random)
    {
        int index = random.nextInt(characters.length());
        return characters.charAt(index);
    }
    
    public static String shufflePassword(String password, SecureRandom random)
    {
        char[] passwordArray = password.toCharArray();
        
        // Shuffle the characters in the password array
        for (int i = 0; i < passwordArray.length; i++)
        {
            int j = random.nextInt(passwordArray.length);
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[j];
            passwordArray[j] = temp;
        }
        
        return new String(passwordArray);
    }
}
