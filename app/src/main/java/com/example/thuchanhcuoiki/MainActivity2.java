package com.example.thuchanhcuoiki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    ArrayList<Thongtin> arrayList;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.listview);
        arrayList = new ArrayList<>();
        arrayList.add(new Thongtin( "Huy Cận", "guyễn Du (chữ Hán: 阮攸; 3 tháng 1 năm 1766 – 1820[1]) tên tự là Tố Như (素如), hiệu là Thanh Hiên (清軒), biệt hiệu là Hồng Sơn lạp hộ (鴻山獵戶), Nam Hải điếu đồ (南海釣屠), là một nhà thơ, nhà văn hóa lớn thời Lê mạt Nguyễn sơ ở Việt Nam. Ông được người Việt kính trọng tôn xưng là \\\"Đại thi hào dân tộc\\\"[2] và được UNESCO vinh danh là \\\"Danh nhân văn hóa thế giới\\\".[3]\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Tác phẩm Truyện Kiều của ông được xem là một kiệt tác văn học, một trong những thành tựu tiêu biểu nhất trong nền văn học trung đại Việt Nam.", R.drawable.huycan));
        arrayList.add(new Thongtin( "Tác  giả : Nguyễn Du","Nguyễn Du (chữ Hán: 阮攸; 3 tháng 1 năm 1766 – 1820[1]) tên tự là Tố Như (素如), hiệu là Thanh Hiên (清軒), biệt hiệu là Hồng Sơn lạp hộ (鴻山獵戶), Nam Hải điếu đồ (南海釣屠), là một nhà thơ, nhà văn hóa lớn thời Lê mạt Nguyễn sơ ở Việt Nam. Ông được người Việt kính trọng tôn xưng là \"Đại thi hào dân tộc\"[2] và được UNESCO vinh danh là \"Danh nhân văn hóa thế giới\".[3]\n" +
                "\n" +
                "Tác phẩm Truyện Kiều của ông được xem là một kiệt tác văn học, một trong những thành tựu tiêu biểu nhất trong nền văn học trung đại Việt Nam.",R.drawable.nguyendu));
        arrayList.add(new Thongtin( "Tác  giả :Huy Cận","Cù Huy Cận (1919 – 2005), bút danh hoạt động nghệ thuật là Huy Cận, là một chính khách, từng giữ nhiều chức vụ lãnh đạo cao cấp trong chính phủ Việt Nam như Bộ trưởng Bộ Canh nông (nay là Bộ Nông nghiệp và Phát triển nông thôn), Thứ trưởng Bộ Văn hóa Nghệ thuật, Bộ trưởng Bộ Văn hóa Giáo dục, Thứ trưởng Bộ Nội vụ, Bộ Kinh tế, Bộ trưởng Tổng Thư ký Hội đồng Bộ trưởng (nay là Bộ trưởng Chủ nhiệm Văn phòng Chính phủ), ngoài ra ông còn là một nhà lãnh đạo chủ chốt của Đảng Dân chủ Việt Nam, đảng viên Đảng Cộng sản Việt Nam[1][2], đồng thời cũng là một trong những thi sĩ xuất sắc nhất của phong trào Thơ mới. Ông từng là Viện sĩ Viện Hàn lâm Thơ Thế giới và Chủ tịch Ủy ban Liên hiệp các Hiệp hội Văn học Việt Nam giai đoạn 1984-1995",R.drawable.huycan));
        arrayList.add(new Thongtin( "Tác giả:Mạc Ngôn","Mạc Ngôn (sinh ngày 17 tháng 2 năm 1955) là một nhà văn người Trung Quốc xuất thân từ nông dân. Ông đã từng được thế giới biết đến với tác phẩm Cao lương đỏ đã được đạo diễn nổi tiếng Trương Nghệ Mưu chuyển thể thành phim. Bộ phim đã được giải Gấu vàng tại Liên hoan phim quốc tế Berlin năm 1988.\n" +
                "\n" +
                "Ngày 11 tháng 10 năm 2012, ông được trao giải Nobel Văn học năm 2012[1], là nhà văn đầu tiên mang quốc tịch Trung Quốc nhận được giải thưởng danh giá này.",R.drawable.macngon));
        arrayList.add(new Thongtin( "Tác giả : Shakespeare","William Shakespeare (tên phiên âm: Uy-li-am Sếch-xpia; không rõ ngày sinh của ông, nhưng theo truyền thống được ghi nhận là vào ngày 23 tháng 4 năm 1564, ngày thánh George; mất ngày 23 tháng 4 năm 1616 theo lịch Julius hoặc ngày 3 tháng 5 năm 1616 theo lịch Gregorius) là một nhà văn và nhà viết kịch Anh, được coi là nhà văn vĩ đại nhất của Anh và là nhà viết kịch đi trước thời đại.[1] Ông còn được vinh danh là nhà thơ tiêu biểu của nước Anh và là \"Thi sĩ của dòng sông Avon\" (Avon là dòng sông nơi sinh của Shakespeare, Stratford-upon-Avon).[2] Những tác phẩm của ông, bao gồm cả những tác phẩm đồng tác giả, bao gồm 39 vở kịch, 154 bản sonnet, hai bản thơ tường thuật dài, và vài bài thơ ngắn. Những vở kịch của ông đã được dịch ra thành rất nhiều ngôn ngữ lớn và được trình diễn nhiều hơn bất kì nhà viết kịch nào.",R.drawable.ongtay));
        arrayList.add(new Thongtin( "Tác  giả : Hemingway","Ernest Miller Hemingway (21 tháng 7 năm 1899 – 2 tháng 7 năm 1961) là một tiểu thuyết gia người Mỹ, nhà văn viết truyện ngắn và là một nhà báo. Ông là một phần của cộng đồng những người xa xứ ở Paris trong thập niên 20 của thế kỷ XX và là một trong những cựu quân nhân trong Chiến tranh thế giới I, sau đó được biết đến qua \"Thế hệ đã mất\". Ông đã nhận được Giải Pulitzer năm 1953 với tiểu thuyết Ông già và biển cả và Giải Nobel Văn học năm 1954.\n" +
                "\n" +
                "Nguyên lý tảng băng trôi là đặc điểm trong văn phong của Hemingway. Nó được mô tả là sự kiệm lời, súc tích và có tầm ảnh hưởng quan trọng trong sự phát triển của văn chương thế kỉ XX. Nhân vật trung tâm trong tác phẩm của ông là những người mang đặc trưng của chủ nghĩa khắc kỷ. Nhiều tác phẩm của ông hiện nay được coi là những tác phẩm kinh điển của nền văn học Mỹ.", R.drawable.ongtay2));
        adapter = new Adapter( MainActivity2.this,R.layout.monan, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this, com.example.thuchanhcuoiki.huycan.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this, com.example.thuchanhcuoiki.tuonglai.class);
                    startActivity(intent);
                }
            }
        });
    }
}