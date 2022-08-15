package com.example.viewandscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    //01. daftarkan widget
    TextView tvDeskripsi;
    VideoView vvTampilkanVideo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //02. daftarka id widget/komponen
        tvDeskripsi = (TextView) findViewById(R.id.textView2);
        vvTampilkanVideo = (VideoView) findViewById(R.id.videoView);

        //coding video
        vvTampilkanVideo.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.batu));
        vvTampilkanVideo.setMediaController(new MediaController(this));
        vvTampilkanVideo.start();

        //3. koding deskripsi
        tvDeskripsi.setText("Universitas Darussalam (UNIDA) Gontor merupakan perguruan tinggi " +
                "waqaf yang berada di bawah naungan Pondok Modern Darussalam Gontor. " +
                "oleh sebab itu, dalam melaksanakan Tri Dharmanya, UNIDA Gontor " +
                "mempertahankan visi, misi, dan jiwa pesantren."+
                "\n\n"+
                "Universitas ini didirikan oleh tiga bersaudara almarhum KH Ahmad Sahal, " +
                "K.H. Zainuddin Fannani, dan K.H. Imam Zarkasyi, tidak lama setelah mereka " +
                "mendirikan Lembaga Islam Modern (Pondok Modern) Darussalam Gontor, Ponorogo, " +
                "Indonesia pada tahun 1926."+
                "\n\n"+
                "Kemajuan sekolah yang pesat dan pencapaiannya yang cemerlang segera memunculkan " +
                "gagasan untuk mendirikan universitas Islam kelas dunia. Mereka berhasrat " +
                "untuk mendirikan lembaga pendidikan tinggi Islam yang dapat menghasilkan " +
                "ulama (ulama) yang sejati dan berwibawa. Upaya pertama yang dilakukan para pendiri " +
                "setelah sekolah tersebut lulus pertama kali pada tahun 1942, adalah mendirikan " +
                "perguruan tinggi yang kemudian disebut Underbow dan Bovenbow. Namun, " +
                "karena situasi kolonial dan perang, program tersebut tidak dapat dilanjutkan lagi. " +
                "Dengan demikian dalam Piagam Wakaf Lembaga Pendidikan Islam Modern Darussalam " +
                "tahun 1958 ditegaskan antara lain bahwa sekolah itu bukan lagi milik pribadinya " +
                "karena sekarang menjadi milik Wakaf Umat Islam, dan harus dikembangkan lebih lanjut " +
                "menjadi Universitas Islam dan menjadi pusat utama Studi Arab dan Islam.");

    }
}