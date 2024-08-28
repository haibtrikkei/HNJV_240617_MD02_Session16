package demo_doc_ghi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class GhiDanhSach {
    public static void main(String[] args) throws ParseException, IOException {
        List<Student> list = new ArrayList<>();

        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        list.add(new Student(1,"Nguyễn Văn Nam",true,sf.parse("21/12/2002"),"Ba Vì - Hà Nội","JV240617"));
        list.add(new Student(2,"Phạm Thị Lan",false,sf.parse("02/02/2002"),"Sóc Sơn - Hà Nội","JV240617"));
        list.add(new Student(3,"Nguyễn Văn Quyết",true,sf.parse("11/11/2003"),"Phổ Yên - Thái Nguyên","JV240617"));
        list.add(new Student(4,"Lê Thanh Huyền",false,sf.parse("07/08/2002"),"Nam Trực - Nam Đinh","JV240617"));
        list.add(new Student(5,"Nguyễn Phương",false,sf.parse("28/12/2003"),"Hà Đông - Hà Nội","JV240617"));

        ObjectOutputStream ghi;
        ghi = new ObjectOutputStream(new FileOutputStream("src/data/sinhvien.abc"));
        ghi.writeObject(list);
        ghi.close();
        System.out.println("Đã ghi xong dữ liệu");
    }
}
