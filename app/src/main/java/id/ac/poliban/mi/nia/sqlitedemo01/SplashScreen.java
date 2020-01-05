package id.ac.poliban.mi.nia.sqlitedemo01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView logo = findViewById(R.id.logo);

        Glide.with(this)
                .load(Uri.parse("https://solusik.com/wp-content/uploads/tutorial-tips-cara-belajar-main-ling.jpg"))
                .into(logo);

        new Handler().postDelayed(()->{
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }, 3000);
    }
}
