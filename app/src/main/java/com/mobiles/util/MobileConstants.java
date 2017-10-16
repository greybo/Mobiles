package com.mobiles.util;

/**
 * Created by m on 16.10.2017.
 */

public class MobileConstants {
    public final static String TAG = MobileConstants.class.getSimpleName();
    public final static String CONST_COMING = "coming";
    public final static String CONST_OUTPUT = "output";
    public final static int HANDLER_RESULT_OK = 10101;
    public final static int HANDLER_RESULT_LIST = 10102;
    public final static int HANDLER_NOT_FOUND = 10103;
    public final static int HANDLER_RESULT_ERR = 10104;

    public final static int HANDLER_USER_EXSIST_OK = 10111;
    public final static int HANDLER_USER_NOT_FOUND = 10112;
    public final static int HANDLER_USER_NEW_CREATE = 10113;
    public final static int HANDLER_USER_RESULT_ERR = 10114;

    public static final int HANDLER_MEAT_FITER_LIST_OK =10121 ;

    public static int REQUEST_CODE_REGISTER = 2000;
    public static String STR_EXTRA_ACTION_LOGIN = "login";
    public static String STR_EXTRA_ACTION_RESET = "resetpass";
    public static String STR_EXTRA_ACTION = "action";
    public static String STR_EXTRA_USERNAME = "username";
    public static String STR_EXTRA_PASSWORD = "password";
    public static String STR_DEFAULT_BASE64 = "default";
    public static String UID = "";
    //TODO only use this UID for debug mode
//    public static String UID = "6kU0SbJPF5QJKZTfvW1BqKolrx22";
    public static String INTENT_KEY_CHAT_FRIEND = "friendname";
    public static String INTENT_KEY_CHAT_AVATA = "friendavata";
    public static String INTENT_KEY_CHAT_ID = "friendid";
    public static String INTENT_KEY_CHAT_ROOM_ID = "roomid";
    public static long TIME_TO_REFRESH = 10 * 1000;
    public static long TIME_TO_OFFLINE = 2 * 60 * 1000;

}
