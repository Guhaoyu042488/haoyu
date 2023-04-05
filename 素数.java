package 谷浩雨的Java;

import java.util.Scanner;

public class 素数  { 
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要判断的数字：");
        int n = sc.nextInt();
        int i = 0;
 
        for ( i = 2; i <= n-1 ; i++) {
            if(n % i == 0){
                System.out.println(n+"不是素数");
                break;
            }
        }
        if(i == n){
            System.out.println(n+"是素数");
        }
    }


}
