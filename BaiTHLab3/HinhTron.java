import java.util.Scanner;
public class HinhTron
{
    final float PI=3.14f;
    float r;
    float cv;
    float dt;
    void nhapBanKinh()
    {
        Scaner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính r= ");
        r = sc.nextFloat(); 
    }
    void tinhChuVi()
    {
        cv = 2 * r * PI;
    }
    void tinhDienTich()
    {
        dt = r * r * PI;
    }
    void inThongSo(String name)
    {
        System.out.printf("Chu vi cua hinh tron co r = %f la: %f",r,cv);
        System.out.printf("\nDien tich cua hinh tron co r = %f la: %f",r,dt);
    }
    
}