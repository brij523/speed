package com.myapplication.interfaces;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public interface Constants {
    String SLASH ="/";
    String FCM_TOKEN="fcm_token";
    String ID = "id";
    String SPACE =" ";
    String MY_PREFERENCE = "eduqik_preferences";
    String IS_MOBILE ="is_mobile";
    String SCHOOL_SHIFT ="school_shift";
    String STUDENT_ID="student_id";
    String IS_LOGIN = "is_login";
    String NOTICE_DATA = "notice_data";
    String EDUQIK="EduQik";
    String FRAGMENT_NAME ="fragmentName";
    String ATTENDANCE_MONTH="attendance_month";
    String SHIFT_START_TIME="shift_start_time";
    String SHIFT_END_TIME="shift_end_time";
    String RF_ID = "rf_id";
    String ATTENDANCE_YEAR="attendance_year";
    String MONTH_TAG ="month";
    String HOMEWORK_DATA ="homeWorkData";
    String DATE_TAG = "date";
    String STATUS="status";
    String MESSAGE= "message";
    String RESULT= "result";
    String USERNAME= "username";
    String EMAIL_ID= "email_id";
    String PASSWORD = "password";
    String IS_ACTIVE= "is_active";
    String CREATED_AT= "created_at";
    String UPDATED_AT= "updated_at";
    String ADDED_BY= "added_by";
    String USER_TYPE= "user_type";
    String STUDENT= "student";
    String USER_PROFILE_IMAGE= "user_profile_image";
    String USER_ID = "user_id";
    String SECTION_ID="section_id";
    String CLASS_ID = "class_id";
    String TOKEN= "token";
    String SUCCESS= "Success";
    String BLANK = "";
    String LIMIT ="limit";
    String BEARER = "Bearer ";
    //this is circular but from backend it is coming notice
    String ZERO="0";
    String ONE="1";
    String SEEN ="seen";
    String NOTIFICATION_ID ="id";
//TODO gothrough in detail
    Map<String,Class> userDetailsAndObjectTypeInSharedPreference = Collections.unmodifiableMap(
            new HashMap<String, Class>() {{
                put(ID,Integer.class);

            }

            }
    );
}