package com.example.administrator.t3.util;

/**
 * Created by Administrator on 2015/8/10.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}

