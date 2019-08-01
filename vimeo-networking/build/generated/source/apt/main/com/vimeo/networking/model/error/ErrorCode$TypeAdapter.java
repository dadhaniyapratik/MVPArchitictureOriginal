package com.vimeo.networking.model.error;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;

public final class ErrorCode$TypeAdapter extends TypeAdapter<ErrorCode> {
  public static final TypeToken<ErrorCode> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.error.ErrorCode.class);

  private static final HashMap<String, ErrorCode> NAME_TO_CONSTANT;

  private static final HashMap<ErrorCode, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(149);
    NAME_TO_CONSTANT.put("2276", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_TITLE_TYPE);
    NAME_TO_CONSTANT.put("2275", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_PORTRAIT_TYPE);
    NAME_TO_CONSTANT.put("2274", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_BYLINE_TYPE);
    NAME_TO_CONSTANT.put("2273", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_PASSWORD_EMPTY_PASSWORD);
    NAME_TO_CONSTANT.put("2272", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_COLOR_TYPE);
    NAME_TO_CONSTANT.put("2271", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_VOLUME_TYPE);
    NAME_TO_CONSTANT.put("2270", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_PLAYBAR_URL_TYPE);
    NAME_TO_CONSTANT.put("2306", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_NO_TOKEN);
    NAME_TO_CONSTANT.put("2305", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_MALFORMED_TOKEN);
    NAME_TO_CONSTANT.put("2700", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NON_JSON_CONTENT_TYPE);
    NAME_TO_CONSTANT.put("2304", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_NON_EXISTENT_PROPERTY);
    NAME_TO_CONSTANT.put("2303", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_INVALID_TOKEN);
    NAME_TO_CONSTANT.put("2302", com.vimeo.networking.model.error.ErrorCode.MALFORMED_TOKEN);
    NAME_TO_CONSTANT.put("2269", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_CUSTOM_LOGO_LINK_URL_TYPE);
    NAME_TO_CONSTANT.put("2301", com.vimeo.networking.model.error.ErrorCode.NON_EXISTENT_PROPERTY);
    NAME_TO_CONSTANT.put("3115", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_RECEIPT_VALIDATION_UNSUCCESSFUL);
    NAME_TO_CONSTANT.put("2268", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_CUSTOM_LOGO_STICKY_TYPE);
    NAME_TO_CONSTANT.put("2300", com.vimeo.networking.model.error.ErrorCode.INVALID_TOKEN);
    NAME_TO_CONSTANT.put("2267", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_CUSTOM_LOGO_TYPE);
    NAME_TO_CONSTANT.put("3113", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_GOOGLE_RECEIPT_VALIDATION_FAILED);
    NAME_TO_CONSTANT.put("2266", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_VIMEO_LOGO_TYPE);
    NAME_TO_CONSTANT.put("2308", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_TOKEN_TOO_LONG);
    NAME_TO_CONSTANT.put("2307", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_TOKEN_CAN_NOT_DECRYPT);
    NAME_TO_CONSTANT.put("8300", com.vimeo.networking.model.error.ErrorCode.DRM_INVALID_CREDENTIALS);
    NAME_TO_CONSTANT.put("6000", com.vimeo.networking.model.error.ErrorCode.METHOD_NOT_IMPLEMENTED);
    NAME_TO_CONSTANT.put("4101", com.vimeo.networking.model.error.ErrorCode.UPLOAD_QUOTA_SIZE_EXCEEDED);
    NAME_TO_CONSTANT.put("4102", com.vimeo.networking.model.error.ErrorCode.UPLOAD_QUOTA_COUNT_EXCEEDED);
    NAME_TO_CONSTANT.put("2315", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_CAN_NOT_VALIDATE_TOKEN);
    NAME_TO_CONSTANT.put("2314", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_TOKEN_TOO_LONG);
    NAME_TO_CONSTANT.put("2313", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_TOKEN_CAN_NOT_DECRYPT);
    NAME_TO_CONSTANT.put("2312", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_NO_TOKEN);
    NAME_TO_CONSTANT.put("2311", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_MALFORMED_TOKEN);
    NAME_TO_CONSTANT.put("3400", com.vimeo.networking.model.error.ErrorCode.USER_NOT_ALLOWED_TO_UPLOAD_VIDEO_UNVERIFIED_EMAIL);
    NAME_TO_CONSTANT.put("2310", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_NON_EXISTENT_PROPERTY);
    NAME_TO_CONSTANT.put("2277", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_SCALING_BUTTON_TYPE);
    NAME_TO_CONSTANT.put("7100", com.vimeo.networking.model.error.ErrorCode.SERVER_OVERLOADED);
    NAME_TO_CONSTANT.put("1000", com.vimeo.networking.model.error.ErrorCode.BAD_REQUEST);
    NAME_TO_CONSTANT.put("2210", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_PASSWORD_TOO_SHORT);
    NAME_TO_CONSTANT.put("2331", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_CAN_NOT_VALIDATE_TOKEN_GOOGLE);
    NAME_TO_CONSTANT.put("2298", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_LOGGING_PLAY_TYPE);
    NAME_TO_CONSTANT.put("3420", com.vimeo.networking.model.error.ErrorCode.USER_HIT_STREAM_LIMITS_FOR_VIDEO);
    NAME_TO_CONSTANT.put("2330", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_INSUFFICIENT_PERMISSIONS_GOOGLE);
    NAME_TO_CONSTANT.put("2297", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_DRM_NOT_ENABLED_ON_CLIP);
    NAME_TO_CONSTANT.put("2207", com.vimeo.networking.model.error.ErrorCode.INVALID_NO_INPUT);
    NAME_TO_CONSTANT.put("2328", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_NON_EXISTENT_PROPERTY_GOOGLE);
    NAME_TO_CONSTANT.put("2206", com.vimeo.networking.model.error.ErrorCode.INVALID_ACCEPT_HEADER);
    NAME_TO_CONSTANT.put("2327", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_NO_TOKEN_GOOGLE);
    NAME_TO_CONSTANT.put("2205", com.vimeo.networking.model.error.ErrorCode.INVALID_BODY);
    NAME_TO_CONSTANT.put("2326", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_TOKEN_TOO_LONG_GOOGLE);
    NAME_TO_CONSTANT.put("2204", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT);
    NAME_TO_CONSTANT.put("2325", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_MISSING_EMAIL_GOOGLE);
    NAME_TO_CONSTANT.put("2203", com.vimeo.networking.model.error.ErrorCode.INVALID_AUTHENTICATION_INFO);
    NAME_TO_CONSTANT.put("2202", com.vimeo.networking.model.error.ErrorCode.INVALID_URI);
    NAME_TO_CONSTANT.put("2201", com.vimeo.networking.model.error.ErrorCode.INVALID_QUERY_PARAM_VALUE);
    NAME_TO_CONSTANT.put("2200", com.vimeo.networking.model.error.ErrorCode.INVALID_HEADER_VALUE);
    NAME_TO_CONSTANT.put("2209", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_PASSWORD);
    NAME_TO_CONSTANT.put("3419", com.vimeo.networking.model.error.ErrorCode.USER_CANNOT_STREAM_CLIP);
    NAME_TO_CONSTANT.put("2208", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NAME_TOO_LONG);
    NAME_TO_CONSTANT.put("2329", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_EMAIL_NOT_FOUND_VIA_TOKEN_GOOGLE);
    NAME_TO_CONSTANT.put("4000", com.vimeo.networking.model.error.ErrorCode.OPERATION_TIMED_OUT);
    NAME_TO_CONSTANT.put("4003", com.vimeo.networking.model.error.ErrorCode.UPLOAD_TICKET_CREATION_ERROR);
    NAME_TO_CONSTANT.put("2100", com.vimeo.networking.model.error.ErrorCode.UNSUPPORTED_HEADER);
    NAME_TO_CONSTANT.put("2221", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_VIEW_TYPE);
    NAME_TO_CONSTANT.put("2220", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_EMBED_TYPE);
    NAME_TO_CONSTANT.put("2218", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_PASSWORD_EMAIL_MISMATCH);
    NAME_TO_CONSTANT.put("3428", com.vimeo.networking.model.error.ErrorCode.UPLOAD_QUOTA_SIZE_EXCEEDED_CAP);
    NAME_TO_CONSTANT.put("2217", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_EMAIL_NOT_RECOGNIZED);
    NAME_TO_CONSTANT.put("1006", com.vimeo.networking.model.error.ErrorCode.SERVICE_UNAVAILABLE);
    NAME_TO_CONSTANT.put("2216", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_EMAIL_TOO_LONG);
    NAME_TO_CONSTANT.put("2337", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_GOOGLE_COULD_NOT_VERIFY_TOKEN);
    NAME_TO_CONSTANT.put("1005", com.vimeo.networking.model.error.ErrorCode.NOT_IMPLEMENTED);
    NAME_TO_CONSTANT.put("2215", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_RFC_822_EMAIL);
    NAME_TO_CONSTANT.put("2336", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_GOOGLE_COULD_NOT_VERIFY_TOKEN);
    NAME_TO_CONSTANT.put("1004", com.vimeo.networking.model.error.ErrorCode.INTERNAL_SERVER_ERROR);
    NAME_TO_CONSTANT.put("2214", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_EMAIL);
    NAME_TO_CONSTANT.put("2335", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_DAILY_LIMIT_GOOGLE);
    NAME_TO_CONSTANT.put("1003", com.vimeo.networking.model.error.ErrorCode.NOT_FOUND);
    NAME_TO_CONSTANT.put("2213", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_NAME);
    NAME_TO_CONSTANT.put("2334", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_CAN_NOT_VALIDATE_TOKEN_GOOGLE);
    NAME_TO_CONSTANT.put("1002", com.vimeo.networking.model.error.ErrorCode.FORBIDDEN);
    NAME_TO_CONSTANT.put("2212", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_PASSWORD_TOO_OBVIOUS);
    NAME_TO_CONSTANT.put("2333", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_INSUFFICIENT_PERMISSIONS_GOOGLE);
    NAME_TO_CONSTANT.put("1001", com.vimeo.networking.model.error.ErrorCode.UNAUTHORIZED);
    NAME_TO_CONSTANT.put("2211", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_PASSWORD_TOO_SIMPLE);
    NAME_TO_CONSTANT.put("2332", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_DAILY_LIMIT_GOOGLE);
    NAME_TO_CONSTANT.put("3421", com.vimeo.networking.model.error.ErrorCode.USER_HIT_DEVICE_LIMIT);
    NAME_TO_CONSTANT.put("2219", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_GRANT_TYPE);
    NAME_TO_CONSTANT.put("7000", com.vimeo.networking.model.error.ErrorCode.SERVER_BUSY);
    NAME_TO_CONSTANT.put("2232", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_VIEW);
    NAME_TO_CONSTANT.put("2231", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_CLIP_NAME);
    NAME_TO_CONSTANT.put("2230", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_UPLOAD_TYPE);
    NAME_TO_CONSTANT.put("2501", com.vimeo.networking.model.error.ErrorCode.APP_DOES_NOT_HAVE_PROTECTED_VIDEO_CAPABILITY);
    NAME_TO_CONSTANT.put("2500", com.vimeo.networking.model.error.ErrorCode.APP_DOES_NOT_HAVE_DELETE_CAPABILITY);
    NAME_TO_CONSTANT.put("2223", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_VIDEO_NO_PASSWORD);
    NAME_TO_CONSTANT.put("2101", com.vimeo.networking.model.error.ErrorCode.UNSUPPORTED_QUERY_PARAM);
    NAME_TO_CONSTANT.put("2222", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_VIDEO_PASSWORD_MISMATCH);
    NAME_TO_CONSTANT.put("2507", com.vimeo.networking.model.error.ErrorCode.PRODUCT_NOT_FOUND);
    NAME_TO_CONSTANT.put("2001", com.vimeo.networking.model.error.ErrorCode.MISSING_REQUIRED_QUERY_PARAM);
    NAME_TO_CONSTANT.put("2000", com.vimeo.networking.model.error.ErrorCode.MISSING_REQUIRED_HEADER);
    NAME_TO_CONSTANT.put("2242", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_USER_URI);
    NAME_TO_CONSTANT.put("2241", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_USER_URI);
    NAME_TO_CONSTANT.put("2240", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_COMMENTS);
    NAME_TO_CONSTANT.put("2239", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_EMBED);
    NAME_TO_CONSTANT.put("2238", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_DOWNLOAD);
    NAME_TO_CONSTANT.put("2237", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_ADD);
    NAME_TO_CONSTANT.put("2236", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_REVIEW_LINK);
    NAME_TO_CONSTANT.put("2235", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_LANGUAGE_TYPE);
    NAME_TO_CONSTANT.put("2234", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_LICENSE_TYPE);
    NAME_TO_CONSTANT.put("2233", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_CLIP_PRIVACY_PASSWORD_MISSING_PASSWORD2233);
    NAME_TO_CONSTANT.put("5000", com.vimeo.networking.model.error.ErrorCode.RESOURCE_NOT_FOUND);
    NAME_TO_CONSTANT.put("5001", com.vimeo.networking.model.error.ErrorCode.ACCESS_TOKEN_NOT_GENERATED);
    NAME_TO_CONSTANT.put("2254", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SIZE_TYPE);
    NAME_TO_CONSTANT.put("2253", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_EMPTY_USER_NAME);
    NAME_TO_CONSTANT.put("2252", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_NAME_TYPE);
    NAME_TO_CONSTANT.put("2251", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_CLIP_DESCRIPTION_TOO_LONG);
    NAME_TO_CONSTANT.put("2250", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_CLIP_NAME_TOO_LONG);
    NAME_TO_CONSTANT.put("2404", com.vimeo.networking.model.error.ErrorCode.URL_UNAVAILABLE);
    NAME_TO_CONSTANT.put("2403", com.vimeo.networking.model.error.ErrorCode.PURGATORY_USER);
    NAME_TO_CONSTANT.put("2249", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_DESCRIPTION_TYPE);
    NAME_TO_CONSTANT.put("2402", com.vimeo.networking.model.error.ErrorCode.SPAMMER_USER);
    NAME_TO_CONSTANT.put("2248", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_FOR_SETTING_USERS);
    NAME_TO_CONSTANT.put("2401", com.vimeo.networking.model.error.ErrorCode.EMAIL_BLOCKED);
    NAME_TO_CONSTANT.put("2247", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_CLIP_PRIVACY_WHEN_SETTING_USERS);
    NAME_TO_CONSTANT.put("2400", com.vimeo.networking.model.error.ErrorCode.USER_EXISTS);
    NAME_TO_CONSTANT.put("2246", com.vimeo.networking.model.error.ErrorCode.CLIP_PRIVACY_NOT_SET_TO_USERS);
    NAME_TO_CONSTANT.put("2245", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_EMPTY_USERS_ARRAY);
    NAME_TO_CONSTANT.put("2002", com.vimeo.networking.model.error.ErrorCode.MISSING_REQUIRED_BODY);
    NAME_TO_CONSTANT.put("2244", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_CLIP_USERS);
    NAME_TO_CONSTANT.put("2409", com.vimeo.networking.model.error.ErrorCode.USER_NOT_ALLOWED_TO_SET_PUBLIC_OR_NOBODY_CLIP_PRIVACY);
    NAME_TO_CONSTANT.put("2406", com.vimeo.networking.model.error.ErrorCode.USER_NOT_AUTHORIZED_TO_DELETE_ACCOUNT);
    NAME_TO_CONSTANT.put("8002", com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_UPLOAD_VIDEO_MISSING_USER_ID_FOR_AUTHENTICATION_TOKEN);
    NAME_TO_CONSTANT.put("8003", com.vimeo.networking.model.error.ErrorCode.EMPTY_AUTHENTICATION);
    NAME_TO_CONSTANT.put("8000", com.vimeo.networking.model.error.ErrorCode.INVALID_CREDENTIALS);
    NAME_TO_CONSTANT.put("8001", com.vimeo.networking.model.error.ErrorCode.UNAUTHORIZED_CLIENT);
    NAME_TO_CONSTANT.put("2265", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_FULLSCREEN_BUTTON_TYPE);
    NAME_TO_CONSTANT.put("2264", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_ALLOW_HD_EMBED_TYPE);
    NAME_TO_CONSTANT.put("2263", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_EMBED_BUTTON_TYPE);
    NAME_TO_CONSTANT.put("2262", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_SHARE_BUTTON_TYPE);
    NAME_TO_CONSTANT.put("2261", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_WATCH_LATER_BUTTON);
    NAME_TO_CONSTANT.put("2260", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_LIKE_BUTTON_TYPE);
    NAME_TO_CONSTANT.put("2259", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_CONTENT_RATINGS_TYPE);
    NAME_TO_CONSTANT.put("2412", com.vimeo.networking.model.error.ErrorCode.USER_NOT_ALLOWED_TO_SET_CONTACTS_CLIP_PRIVACY);
    NAME_TO_CONSTANT.put("2258", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_CREATE_CLIP_TYPE);
    NAME_TO_CONSTANT.put("2411", com.vimeo.networking.model.error.ErrorCode.USER_NOT_ALLOWED_TO_SET_DISABLE_CLIP_PRIVACY);
    NAME_TO_CONSTANT.put("2257", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_MACHINE_ID_TYPE);
    NAME_TO_CONSTANT.put("2410", com.vimeo.networking.model.error.ErrorCode.USER_NOT_ALLOWED_TO_SET_USERS_CLIP_PRIVACY);
    NAME_TO_CONSTANT.put("2256", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_REDIRECT_URL_TYPE);
    NAME_TO_CONSTANT.put("2255", com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_UPGRADE_TO_1080_TYPE);
    NAME_TO_CONSTANT.put("DEFAULT", com.vimeo.networking.model.error.ErrorCode.DEFAULT);

    CONSTANT_TO_NAME = new HashMap<>(149);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_EMPTY_USERS_ARRAY, "2245");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_PASSWORD_TOO_SHORT, "2210");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_UPLOAD_TYPE, "2230");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_CREATE_CLIP_TYPE, "2258");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_CAN_NOT_VALIDATE_TOKEN, "2315");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_EMBED_TYPE, "2220");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_EMAIL_TOO_LONG, "2216");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_NAME_TYPE, "2252");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_TOKEN, "2300");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_GOOGLE_RECEIPT_VALIDATION_FAILED, "3113");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_TOKEN_TOO_LONG, "2314");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SIZE_TYPE, "2254");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_TOKEN_TOO_LONG_GOOGLE, "2326");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.USER_NOT_ALLOWED_TO_SET_USERS_CLIP_PRIVACY, "2410");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_UPGRADE_TO_1080_TYPE, "2255");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_CUSTOM_LOGO_STICKY_TYPE, "2268");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_CLIP_NAME_TOO_LONG, "2250");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.USER_HIT_DEVICE_LIMIT, "3421");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_PASSWORD_TOO_SIMPLE, "2211");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.URL_UNAVAILABLE, "2404");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_AUTHENTICATION_INFO, "2203");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_GOOGLE_COULD_NOT_VERIFY_TOKEN, "2336");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_TOKEN_CAN_NOT_DECRYPT, "2307");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_PLAYBAR_URL_TYPE, "2270");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_CONTENT_RATINGS_TYPE, "2259");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_TOKEN_CAN_NOT_DECRYPT, "2313");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.USER_NOT_AUTHORIZED_TO_DELETE_ACCOUNT, "2406");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_MISSING_EMAIL_GOOGLE, "2325");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_REDIRECT_URL_TYPE, "2256");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.FORBIDDEN, "1002");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.USER_NOT_ALLOWED_TO_SET_PUBLIC_OR_NOBODY_CLIP_PRIVACY, "2409");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_VOLUME_TYPE, "2271");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_PASSWORD_TOO_OBVIOUS, "2212");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.NOT_IMPLEMENTED, "1005");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_PASSWORD_EMAIL_MISMATCH, "2218");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_CLIP_NAME, "2231");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.SPAMMER_USER, "2402");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.MALFORMED_TOKEN, "2302");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_CLIP_DESCRIPTION_TOO_LONG, "2251");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_INVALID_TOKEN, "2303");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_EMBED_BUTTON_TYPE, "2263");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_SCALING_BUTTON_TYPE, "2277");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.RESOURCE_NOT_FOUND, "5000");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_CREDENTIALS, "8000");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.MISSING_REQUIRED_HEADER, "2000");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNSUPPORTED_HEADER, "2100");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_FULLSCREEN_BUTTON_TYPE, "2265");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_VIEW_TYPE, "2221");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_MACHINE_ID_TYPE, "2257");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_CLIP_PRIVACY_PASSWORD_MISSING_PASSWORD2233, "2233");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_DESCRIPTION_TYPE, "2249");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNSUPPORTED_QUERY_PARAM, "2101");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_VIDEO_NO_PASSWORD, "2223");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_VIDEO_PASSWORD_MISMATCH, "2222");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.BAD_REQUEST, "1000");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.DEFAULT, "DEFAULT");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_LICENSE_TYPE, "2234");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.EMPTY_AUTHENTICATION, "8003");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_WATCH_LATER_BUTTON, "2261");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.USER_HIT_STREAM_LIMITS_FOR_VIDEO, "3420");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.NON_EXISTENT_PROPERTY, "2301");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_COLOR_TYPE, "2272");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.APP_DOES_NOT_HAVE_PROTECTED_VIDEO_CAPABILITY, "2501");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.SERVER_OVERLOADED, "7100");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.CLIP_PRIVACY_NOT_SET_TO_USERS, "2246");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UPLOAD_QUOTA_SIZE_EXCEEDED_CAP, "3428");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_EMAIL_NOT_FOUND_VIA_TOKEN_GOOGLE, "2329");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_INSUFFICIENT_PERMISSIONS_GOOGLE, "2333");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_BYLINE_TYPE, "2274");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.DRM_INVALID_CREDENTIALS, "8300");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_DAILY_LIMIT_GOOGLE, "2335");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UPLOAD_TICKET_CREATION_ERROR, "4003");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NAME_TOO_LONG, "2208");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_NO_TOKEN, "2306");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.USER_CANNOT_STREAM_CLIP, "3419");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_GRANT_TYPE, "2219");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_CUSTOM_LOGO_TYPE, "2267");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_URI, "2202");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_CAN_NOT_VALIDATE_TOKEN_GOOGLE, "2334");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_PASSWORD_EMPTY_PASSWORD, "2273");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.USER_NOT_ALLOWED_TO_SET_DISABLE_CLIP_PRIVACY, "2411");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_REVIEW_LINK, "2236");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_CAN_NOT_VALIDATE_TOKEN_GOOGLE, "2331");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_PASSWORD, "2209");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_NO_INPUT, "2207");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.APP_DOES_NOT_HAVE_DELETE_CAPABILITY, "2500");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_HEADER_VALUE, "2200");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_USER_URI, "2242");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_DAILY_LIMIT_GOOGLE, "2332");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_QUERY_PARAM_VALUE, "2201");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UPLOAD_QUOTA_COUNT_EXCEEDED, "4102");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_BODY, "2205");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.USER_EXISTS, "2400");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.SERVICE_UNAVAILABLE, "1006");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_COMMENTS, "2240");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_GOOGLE_COULD_NOT_VERIFY_TOKEN, "2337");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.SERVER_BUSY, "7000");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_TITLE_TYPE, "2276");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NON_JSON_CONTENT_TYPE, "2700");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_NON_EXISTENT_PROPERTY_GOOGLE, "2328");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INTERNAL_SERVER_ERROR, "1004");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT, "2204");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_RECEIPT_VALIDATION_UNSUCCESSFUL, "3115");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_NON_EXISTENT_PROPERTY, "2310");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_USER_URI, "2241");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_CUSTOM_LOGO_LINK_URL_TYPE, "2269");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_VIMEO_LOGO_TYPE, "2266");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.USER_NOT_ALLOWED_TO_UPLOAD_VIDEO_UNVERIFIED_EMAIL, "3400");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_TOKEN_TOO_LONG, "2308");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.ACCESS_TOKEN_NOT_GENERATED, "5001");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_SHARE_BUTTON_TYPE, "2262");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_INSUFFICIENT_PERMISSIONS_GOOGLE, "2330");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_NON_EXISTENT_PROPERTY, "2304");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.METHOD_NOT_IMPLEMENTED, "6000");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.EMAIL_BLOCKED, "2401");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_EMAIL, "2214");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.MISSING_REQUIRED_QUERY_PARAM, "2001");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.USER_NOT_ALLOWED_TO_SET_CONTACTS_CLIP_PRIVACY, "2412");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_NO_TOKEN_GOOGLE, "2327");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_LOGGING_PLAY_TYPE, "2298");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_ACCEPT_HEADER, "2206");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.PRODUCT_NOT_FOUND, "2507");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_PORTRAIT_TYPE, "2275");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNAUTHORIZED, "1001");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.MISSING_REQUIRED_BODY, "2002");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_EMPTY_USER_NAME, "2253");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_ALLOW_HD_EMBED_TYPE, "2264");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_DOWNLOAD, "2238");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_ADD, "2237");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_NO_TOKEN, "2312");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_VIEW, "2232");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UPLOAD_QUOTA_SIZE_EXCEEDED, "4101");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.OPERATION_TIMED_OUT, "4000");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_UPLOAD_VIDEO_MISSING_USER_ID_FOR_AUTHENTICATION_TOKEN, "8002");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_CLIP_USERS, "2244");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_LOGIN_MALFORMED_TOKEN, "2311");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.NOT_FOUND, "1003");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNAUTHORIZED_CLIENT, "8001");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_DRM_NOT_ENABLED_ON_CLIP, "2297");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_LANGUAGE_TYPE, "2235");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_NAME, "2213");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_CLIP_PRIVACY_WHEN_SETTING_USERS, "2247");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_EMAIL_NOT_RECOGNIZED, "2217");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_FOR_SETTING_USERS, "2248");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_SHOW_LIKE_BUTTON_TYPE, "2260");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.UNABLE_TO_CREATE_USER_MALFORMED_TOKEN, "2305");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.PURGATORY_USER, "2403");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_BAD_CLIP_PRIVACY_EMBED, "2239");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.error.ErrorCode.INVALID_INPUT_NO_RFC_822_EMAIL, "2215");
  }

  public ErrorCode$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, ErrorCode object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public ErrorCode read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
