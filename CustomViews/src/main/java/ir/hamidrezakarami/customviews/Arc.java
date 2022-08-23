package ir.hamidrezakarami.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class Arc extends View {

    Context context;
    Paint paint1;
    Paint paint2;
    Paint paint3;

    public Arc(Context context) {
        super(context);
        Log.i("hrka", "constructor 1");
        init(context, null);
    }

    public Arc(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.i("hrka", "constructor 2");
        init(context, attrs);
    }

    public Arc(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.i("hrka", "constructor 3");
        init(context, attrs);
    }

    public Arc(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        Log.i("hrka", "constructor 4");
        init(context, attrs);
    }

    /**
     * View lifecycle
     */
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i("hrka", "onAttachedToWindow");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.i("hrka", "onMeasure");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.i("hrka", "onLayout");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i("hrka", "onDraw");

        canvas.drawArc(dp2px(200),dp2px(150),dp2px(250),dp2px(200),180,90,false, paint1);
        canvas.drawArc(dp2px(250),dp2px(150),dp2px(300),dp2px(200),0,90,false, paint2);
        canvas.drawArc(dp2px(260),dp2px(150),dp2px(290),dp2px(200),180,90,true, paint3);
        canvas.drawArc(dp2px(220),dp2px(150),dp2px(270),dp2px(200),180,90,true, paint1);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Log.i("hrka", "dispatchDraw");
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Log.i("hrka", "draw");
    }

    public int dp2px(float dips) {
        return (int) (dips * context.getResources().getDisplayMetrics().density + 0.5f);
    }

    private void init(Context context, @Nullable AttributeSet attrs) {
        this.context = context;
        paint1 = new Paint();
        paint1.setStrokeWidth(dp2px(1f));
        paint1.setColor(Color.BLUE);
        paint1.setStyle(Paint.Style.STROKE);

        paint2 = new Paint();
        paint2.setStrokeWidth(dp2px(1f));
        paint2.setColor(Color.BLACK);
        paint2.setStyle(Paint.Style.FILL);

        paint3 = new Paint();
        paint3.setStrokeWidth(dp2px(1f));
        paint3.setColor(Color.GRAY);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
    }
}
