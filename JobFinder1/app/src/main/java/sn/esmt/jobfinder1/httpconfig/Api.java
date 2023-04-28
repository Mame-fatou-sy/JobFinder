package sn.esmt.jobfinder1.httpconfig;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("/all")
    public Call<ArrayList<CvsResponse>> all();
}
