package microguest.copyview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/**
 * Created by wuyajun on 15/12/16.
 * Detail:
 */
public class CopyView extends WebView {

    private String encoding = "UTF-8";
    private String mimeType = "text/html; charset=UTF-8";

    protected final String NEW_LINE = "<br>";

    private final int    DEFAULT_VIEW_BACKGROUND = 0x00000000;
    private final String DEFAULT_TEXT_COLOR = "#000000";
    private final int    DEFAULT_TEXT_SIZE = 3;

    private String mTextColor = DEFAULT_TEXT_COLOR;
    private int mTextSize = DEFAULT_TEXT_SIZE;

    public CopyView(Context context) {
        super(context);
        this.getSettings().setDefaultTextEncodingName(encoding);//设置默认为utf-8
        this.setBackgroundColor(DEFAULT_VIEW_BACKGROUND);  //透明背景
    }

    public CopyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.getSettings().setDefaultTextEncodingName(encoding);//设置默认为utf-8
        this.setBackgroundColor(DEFAULT_VIEW_BACKGROUND);  //透明背景
    }

    public CopyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.getSettings().setDefaultTextEncodingName(encoding);//设置默认为utf-8
        this.setBackgroundColor(DEFAULT_VIEW_BACKGROUND);  //透明背景
    }

    public void setText(CharSequence text) {
        this.loadData(getContent(text.toString()), mimeType, null);
        this.reload();
    }

    private String getContent(String content) {
        content = content.replaceAll("\n", NEW_LINE);
        content = "<font color=" + mTextColor + " size=" + mTextSize + ">" + content + "</font>";
        return content;
    }

    public String getTextColor() {
        return mTextColor;
    }

    public void setTextColor(String mTextColor) {
        this.mTextColor = mTextColor;
    }

    public int getTextSize() {
        return mTextSize;
    }

    public void setTextSize(int mTextSize) {
        this.mTextSize = mTextSize;
    }
}
