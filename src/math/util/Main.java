/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import duongnh.util.MathUtilnity;

/**
 *
 * @author PC
 */
public class Main {
    
    public static void main(String[] args) {
        long expected = 120; // tao hy vọng 120 ói về nếu
        long actual = MathUtilnity.getFactorial(5); //tao gọi hàm 5
        System.out.println("5!? expected: "+ expected + "; actual: "+actual);
        //dung cho case dau tien
        
        expected = 720;
        actual = MathUtilnity.getFactorial(6); //tao gọi hàm 6
        System.out.println("6!? expected: "+ expected + "; actual: "+actual);
        //dung case 2
    
        //case 3
        System.out.println("0!? expected: 1; actual: "+ MathUtilnity.getFactorial(0));
        
        //case 4:
            //tao ki vong nhan ve ngoai le IllegalArgumentException
            //neu tao go -5!
        MathUtilnity.getFactorial(-5);
        //thay ngoai le lai mung vi ham chay nhu thiet ke
        
    }
}

//checkin code len server github
//cần:
//nhớ kho trên github, url: https://github.com/tên-mình/tên-kho.git
//nhớ username ,pass và email vào github của mình
//cần tool để động bộ code từ máy mình (local) lên server(Github, GitLab, BitBugket)
//tool có thể là :IDE, GUI, cmd
//cất code lên git cần file đặc biệt để git tool biết ai lên server ai ở lại local
//file này đc gọi là .gitignore là file thuần text
//nó sẽ khác nhau content tùy vào IDE mình xài, ngôn ngữ lập trình mình xài
//có 1 gã dev cực kì dễ thương, ;à, sẵng những file ứng với các IDE, NNLT rồi xin về xài
//link: https://gitignore.io
