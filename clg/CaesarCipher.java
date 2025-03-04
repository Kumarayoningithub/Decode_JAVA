import java.util.Scanner;
public class CaesarCipher {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static String encrypt(String inputs, int shiftKey) {
        inputs = inputs.toLowerCase();
        String encrypts = "";
        for (int i = 0; i < inputs.length(); i++) {
            int pos = ALPHABET.indexOf(inputs.charAt(i));
            int encryptp = (shiftKey + pos) % 26;
            char encryptCh = ALPHABET.charAt(encryptp);
            encrypts += encryptCh;
        }
        return encrypts;
    }
    public static String decrypt(String inputs, int shiftKey) {
        inputs = inputs.toLowerCase();
        String decrypts = "";
        for (int i = 0; i < inputs.length(); i++) {
            int pos = ALPHABET.indexOf(inputs.charAt(i));
            int decryptp = (pos - shiftKey) % 26;
            if (decryptp < 0){
                decryptp = ALPHABET.length() + decryptp;
            }
            char decryptCh = ALPHABET.charAt(decryptp);
            decrypts += decryptCh;
        }
        return decrypts;
    }



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to encrypt using caesar cipher: ");
        String inputs = sc.nextLine();
        System.out.println("Enter the value by which each character in the plaintext message gets shifted: ");
        int shiftKey = Integer.valueOf(sc.nextLine());
        System.out.println("Encrypted Data: "+encrypt(inputs, shiftKey));
        System.out.println("Decrypted Data: "+decrypt(encrypt(inputs, shiftKey), shiftKey));
        sc.close();
    }
}