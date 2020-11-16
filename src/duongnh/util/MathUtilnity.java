/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongnh.util;

/**
 *
 * @author PC
 */
public class MathUtilnity {
    //mình sẽ là class này fake y chang class Math của JDK với các hàm static để sài chung mọi nơi
    //math.PI .abs() .sqrt() . pow() . sin()
    //cái gì mà là đồ xài chung, không lưu trữ riêng lẻ infor ta sẽ chơi static
    public static final double PI = 3.1415;
    //xài: MathUtility.PI y chang Math.PI
    
    // hàm tính n!  = 1.2.3.4....n
    //n phải >=0 ,0! = 1! =1; quy ước
    //n! tăng nhanh, cho nên 21! tràn long rồi ta chit tính n! từ 0->20
    //ngoài cùng này, dù âm hay lố 20, éo tính , chửi = exception
    //học cách ném ngoại lệ luôn
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0...20");
        
        if(n == 0 || n == 1)
            return 1;
        
        //cho nay k sai else
        long result = 1;
        for (int i = 2; i < n; i++) 
            result *= i;
        
        return result;
    }
}
//ta tự tin hàm ta chạy ngon, chạy đúng
//nhưng : team thì cần chứng minh điều đó , đảm bảo chất luowjgn ceode, 
//chất lương hàm
//muôn chứng minh hàm chjay đúng hay không ta cần tets thử 
//test nghĩ là đưa hàm ra xài, gọi với các tham số khác nhau
//ví dụ gọi hàm getFactorial(với các số khác nhau đưa vào)
//getF(-5), getF(-1), getF(0), getF(20)....
//các giá trị đầy vào đại diện cho việc xài hàm,
//ta còn gọi là test cases, các tình huống cần test, các tình huống xài hàm khi ta test hàm
//khi ta test hàm ta cần quan tâm tới 2 việc
/*
1. dự kiến hàm trả về giá trị gì khi hàm chạt với 1 đầu vào nào đó
dự kueen hàm trả về giá trị, tui gọi là EXPECTED VALUE
ví dụ: hàm sẽ trả về 120 khi gọi getF(5)
2. hàm khi chạy với 1 đầu vào nào đó, thì nó sẽ return về 1 value
cái value trả về của hàm khi chạt đc gọi là ACTUAL VALUE


NGHỀ TEST CHUSNH LÀ: SO SÁNH COI EXPECTED VALUE CÓ BẰNG VỚI ACTUAL VALUE K?
NẾU CÓ, HÀM ĐÚNG CHO CASE NÀY
MẾU K, HÀM TÍNH TOÁN SAI HOẶC KÌ VỌNG SAI


HÀM MÀ TỐT THÌ PHÀI LÀ EXPECTED == ACTUAL MỌI TÌNH HUỐNG
NẾU TỐT TA MỚI ĐEM RA XÀI, BÁN, PUBLIC CỘNG ĐỒNG XÀI

LÀM SAO ĐỂ TEST HÀM COI CÓ TỐT K, EXPECTED == ACTUAL
HAI KĨ THUẬT ĐC ÁP DỤNG
KĨ THUẬT 1: Nhìn bằng mắt so sánh từng cấp expected vs actual
    chính là kĩ thuật sout(expected), sout(actual - hàm ói về gì khi chạy)
kĩ thuật này đơn giản, dễ làm, nhưng mắc sai sót do có quá nhiều cặp expected actual cần so sánh bằng mắt

KĨ THUẬT 2:Nhìn bằng mắt, k cần so sánh từng cặp, dể máy so sánh giùm luôn
    mắt chủ nhùn 2 màu XANH - ĐỎ DUY NHẤT
nếu tât cả các căp actual vs expected đều thỏa, MÀU XANH CHO TÂT CẢ
nếu HẦU HẾT các cặp actual vss expected đều thỏa, có 1 vàu cái k thỏa 
THÌ KẾT LUẬN NGAY, HÀM SAI , MÀU ĐỎ CHO TÂT CẢ
điều này giải thích là: đsung thì phải đúng cho mọi thufnh huống hàm chạy, chỉ cần 1 thằng sau -> hàm sai



tương đương câu : hàm tui chạt nogn lắm, đúng 99,99% lâu lâu sai tí
nói câu đó => hàm đ tin cậy để xàu

KĨ THUẬT @ NÀY DÙNG MÀU SẮC , MUỐN LÀM V THÌ PHẢI XÀI THƯ VIỆN BỔ SUNG THÊM CHÍNH LÀ FILE .JAR, .DLL ĐƯỢC CUNG CẤP THÊM NGOÀI JDK
CCASC THƯ VIỆN NÀY TÙY THƯỢC NGÔN GNUWX LAAJO TRÌNH ĐƯỢC GỌI CHUNG LÀ 
UNIT TEST FRAMEWORK,
C#: thư viện cụ thể NUnit, MSUnit, xUnit
JAVA: thư viện cụ thể JUnit, TestNG, xUnit
PHP: PHPUnit
C++: CPPUnit


*/
