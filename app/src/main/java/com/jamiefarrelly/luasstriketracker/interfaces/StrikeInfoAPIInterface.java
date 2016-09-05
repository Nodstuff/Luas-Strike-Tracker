package com.jamiefarrelly.luasstriketracker.interfaces;

import com.jamiefarrelly.luasstriketracker.model.StrikeInfoModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by nodstuff on 03/09/2016.
 */
public interface StrikeInfoAPIInterface {

    @GET("Info.json")
    Call<StrikeInfoModel> getStrikeInfo();
}
