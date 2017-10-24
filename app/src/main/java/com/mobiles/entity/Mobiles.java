package com.mobiles.entity;

/**
 * Created by m on 22.10.2017.
 */

public class Mobiles {
    private String objectId;
    private TypePhone typePhone;
    private String imei;
    private String name;
    private String surname;
    private String numPhone;

    private String repairman;
    private String malfunction;
    private State state;

    enum State {
        NOT_REPLY, REPLY, ISSUED, GIVE_BACK
    }
}

