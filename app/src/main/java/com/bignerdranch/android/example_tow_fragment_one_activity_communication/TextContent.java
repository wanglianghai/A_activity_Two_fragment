package com.bignerdranch.android.example_tow_fragment_one_activity_communication;

/**
 * Created by Administrator on 2017/5/2/002.
 */

public class TextContent {
    private static TextContent sTextContent;
    private String mStringContent;

    private TextContent(){
        mStringContent = null;
    }

    public static TextContent get() {
        if (sTextContent == null) {
            sTextContent = new TextContent();
        }
        return sTextContent;
    }

    public String getStringContent() {
        return mStringContent;
    }

    public void setStringContent(String stringContent) {
        mStringContent = stringContent;
    }
}
