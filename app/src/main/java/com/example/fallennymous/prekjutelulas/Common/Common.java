package com.example.fallennymous.prekjutelulas.Common;

import com.example.fallennymous.prekjutelulas.Model.User;

/**
 * Created by fallennymous on 06/06/2018.
 */

public class Common {
    public static User currenUser;

    public static String convertCodeToStatus(String status) {
        if (status.equals("0"))
            return "Pesanan diproses";
        else if (status.equals("1"))
            return "Pesanan dalam perjalanan ";
        else
            return "pesanan diterima";
    }
}
