package sn.esmt.jobfinder1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sn.esmt.jobfinder1.httpconfig.Api;
import sn.esmt.jobfinder1.httpconfig.CvsResponse;
import sn.esmt.jobfinder1.tools.MyAdapterCv;

public class CvActivity extends AppCompatActivity {

    private ListView list;
    private ArrayList<CvsResponse> cvs = new ArrayList<CvsResponse>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);
        list = (ListView) findViewById(R.id.listCv);
        chargerListe();
    }
    public void chargerListe(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.5:8083") //URL de base de l'API
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        Call<ArrayList<CvsResponse>> call = api.all();

        call.enqueue(new Callback<ArrayList<CvsResponse>>() {
            @Override
            public void onResponse(Call<ArrayList<CvsResponse>> call, Response<ArrayList<CvsResponse>> response) {
                if (response.isSuccessful()) {
                    Log.d("Response :", response.body().get(0).getEmail());
                    response.body().stream().forEach(cvsResponse -> cvs.add(cvsResponse));
                    MyAdapterCv adpt = new MyAdapterCv(CvActivity.this,cvs);
                    Log.d("Debbugage : " , cvs.get(0).getNom());
                    list.setAdapter(adpt);
                } else {
                    Log.d("error message exception", response.toString());
                }
            }
            @Override
            public void onFailure(Call<ArrayList<CvsResponse>> call, Throwable t) {
                Log.d("Error : ", t.getMessage());
            }
        });

    }
}