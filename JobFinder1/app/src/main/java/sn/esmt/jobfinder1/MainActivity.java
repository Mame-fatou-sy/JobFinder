package sn.esmt.jobfinder1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sn.esmt.jobfinder1.httpconfig.Api;
import sn.esmt.jobfinder1.httpconfig.CvsResponse;

public class MainActivity extends AppCompatActivity {

    private Button viewcvButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewcvButton = (Button) findViewById(R.id.viewcvButton);
        viewcvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CvActivity.class));
            }
        });


    }
}