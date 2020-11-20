/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongnh.util.test;

import duongnh.util.MathUtilnity;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class MathutilityTest {
    
    @Test //biến cái hàm trong class này thành public static void main() nhờ bộ thư viện JUnit
    //tại sao cần vậy , vì mạc đinh app từ main() chuẩn trong khi đó mình cần test hàm thôi, k can thiệm main()
    //vậy mình cần main() khách, @Test giúp điều đó 
    // nhưng vì có nhiều main() CPU bị bối rối khi nhấn F6
    //F6 giành cho main default
    //shift f6 cho bên này
    
    //cú pháp đặt tên hàm để test hàm khác của TESTER
    public void getFactorial_RunWell_IFValidArgument(){
        assertEquals(120, MathUtilnity.getFactorial(5));
        assertEquals(720, MathUtilnity.getFactorial(6));
        assertEquals(24, MathUtilnity.getFactorial(4));
        assertEquals(6, MathUtilnity.getFactorial(3));
        assertEquals(1, MathUtilnity.getFactorial(0));
    }
    /*
    bắt ngoại lệ như nào
    ngoại lệ exception k phải là 1 value để mà so sánh do dod dùng hàm assertX() là k được, vì k là value để so sánh
    ta phải dùng kĩ thuật khác
    
    */
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidValue(){
         MathUtilnity.getFactorial(-5);
    }
}
