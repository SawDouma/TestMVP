package com.saw.testmvp.model.network.api;

import com.saw.testmvp.model.struct.UserAccount;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Saw on 2016/6/24 0024.
 */
public interface ApiGetHappyPoints {
    @GET("api/UserAccount/{id}")
    public Observable<UserAccount> getHappyPoints(@Path("id") int userId, @Query("token") String token);

}
