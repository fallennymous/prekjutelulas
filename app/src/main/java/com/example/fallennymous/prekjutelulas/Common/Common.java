package com.example.fallennymous.prekjutelulas.Common;

import com.example.fallennymous.prekjutelulas.Model.User;

/**
 * Created by fallennymous on 06/06/2018.
 */

public class Common {
    public static User currenUser;

    public static String convertCodeToStatus(String status) {
        if (status.equals("0"))
            return "Ditempat";
        else if (status.equals("1"))
            return "Dalam Perjalanan";
        else
            return "Dikirim";
    }
}
