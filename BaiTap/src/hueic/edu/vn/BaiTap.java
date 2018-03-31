package hueic.edu.vn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaiTap {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        double n = Double.parseDouble(a);
        double n1 = Double.parseDouble(b);
        System.out.println((n+n1));
        InSao();
    }
    public static void InSao(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
	}

