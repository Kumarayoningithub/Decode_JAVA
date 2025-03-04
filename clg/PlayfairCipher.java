package Recursion;

import java.awt.Point;
import java.util.Scanner;

public class PlayfairCipher {
    private int len = 0;
    private String[][] tab;

    public static void main(String[] args) {
        new PlayfairCipher();
    }

    private PlayfairCipher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key: ");
        String key = parseInput(sc);
        while (key.isEmpty()) {
            System.out.print("Key cannot be empty. Enter the key again: ");
            key = parseInput(sc);
        }
        tab = cipherTable(key);
        System.out.print("Enter the plaintext: ");
        String input = parseInput(sc);
        while (input.isEmpty()) {
            System.out.print("Plaintext cannot be empty. Enter the plaintext again: ");
            input = parseInput(sc);
        }
        String encryptedText = cipher(input);
        String decryptedText = decode(encryptedText);
        printResults(encryptedText, decryptedText);
        sc.close();
    }

    private String parseInput(Scanner sc) {
        String input = sc.nextLine().toUpperCase().replaceAll("[^A-Z]", "");
        return input.replace("J", "I");
    }

    private String[][] cipherTable(String key) {
        String[][] table = new String[5][5];
        String keyStr = key + "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        boolean[] used = new boolean[26];
        int index = 0;
        for (int i = 0; i < keyStr.length(); i++) {
            char c = keyStr.charAt(i);
            if (!used[c - 'A']) {
                table[index / 5][index % 5] = String.valueOf(c);
                used[c - 'A'] = true;
                index++;
            }
        }
        return table;
    }

    private String cipher(String input) {
        len = input.length() / 2 + input.length() % 2;
        for (int i = 0; i < (len - 1); i++) {
            if (input.charAt(2 * i) == input.charAt(2 * i + 1)) {
                input = new StringBuilder(input).insert(2 * i + 1, 'X').toString();
                len = input.length() / 2 + input.length() % 2;
            }
        }
        if (input.length() % 2 != 0) {
            input += "X";
        }
        String[] pairs = new String[len];
        for (int i = 0; i < len; i++) {
            pairs[i] = input.charAt(2 * i) + "" + input.charAt(2 * i + 1);
        }
        StringBuilder encrypted = new StringBuilder();
        String[] encodedPairs = encodePairs(pairs);
        for (String pair : encodedPairs) {
            encrypted.append(pair);
        }
        return encrypted.toString();
    }

    private String[] encodePairs(String[] pairs) {
        String[] encrypted = new String[len];
        for (int i = 0; i < len; i++) {
            char a = pairs[i].charAt(0);
            char b = pairs[i].charAt(1);
            Point p1 = getPoint(a);
            Point p2 = getPoint(b);
            if (p1.x == p2.x) {
                encrypted[i] = tab[p1.x][(p1.y + 1) % 5] + tab[p2.x][(p2.y + 1) % 5];
            } else if (p1.y == p2.y) {
                encrypted[i] = tab[(p1.x + 1) % 5][p1.y] + tab[(p2.x + 1) % 5][p2.y];
            } else {
                encrypted[i] = tab[p1.x][p2.y] + tab[p2.x][p1.y];
            }
        }
        return encrypted;
    }

    private String decode(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < encrypted.length() / 2; i++) {
            char a = encrypted.charAt(2 * i);
            char b = encrypted.charAt(2 * i + 1);
            Point p1 = getPoint(a);
            Point p2 = getPoint(b);
            if (p1.x == p2.x) {
                decrypted.append(tab[p1.x][(p1.y + 4) % 5]).append(tab[p2.x][(p2.y + 4) % 5]);
            } else if (p1.y == p2.y) {
                decrypted.append(tab[(p1.x + 4) % 5][p1.y]).append(tab[(p2.x + 4) % 5][p2.y]);
            } else {
                decrypted.append(tab[p1.x][p2.y]).append(tab[p2.x][p1.y]);
            }
        }
        return decrypted.toString();
    }

    private Point getPoint(char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (tab[i][j].equals(String.valueOf(c))) {
                    return new Point(i, j);
                }
            }
        }
        return null;
    }

    private void printResults(String encrypted, String decrypted) {
        System.out.println("Encryption complete: " + encrypted);
        System.out.println("Decryption complete: " + decrypted);
    }
}
