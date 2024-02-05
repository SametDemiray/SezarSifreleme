package org.example;

// Büyük harflerle girilen kelimeyi belirtilen anahtara göre "Sezar Şifreleme ( Caesar cipher )" algoritmasıyla şifreleyen program

// Sezar şifrelemesi, ilk kez Romalı lider Jül Sezar tarafından kullanılmış olan şifreleme tekniğidir.
// Bu yöntemlerden ilki bir yazıdaki harflerin yerlerini değiştirerek, ikincisi ise harfleri başka harflerle değiştirerek elde edilir.
// Bu şifrelemeyi kullanan belki de en ünlü teknik Sezar Şifresi'dir: Bu şifrede, her harf o harften birkaç sonraki harf kullanılarak
// yazılır. Örneğin, 3 harf atlamalı Sezar Şifresi'nde "deneme" yerine "ghqhph" yazılır.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String m,sm = "";
        int a;
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nLütfen Kelimeyi Giriniz : ");
        m = scanner.nextLine();
        System.out.print("Anahtar : ");
        a = scanner.nextInt();
        for (i=0; i<m.length(); i++)
            sm += (char) ((m.charAt(i)-65+a)%26+65);
        System.out.printf("Şifreli Kelime : %s",sm);
    }
}