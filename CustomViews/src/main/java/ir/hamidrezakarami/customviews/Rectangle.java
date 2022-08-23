package ir.hamidrezakarami.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class Rectangle extends View {

    Context context;
    Paint emptyPaint;
    Paint fillPaint;
    Paint fillAndStrokePaint;

    public Rectangle(Context context) {
        super(context);
        Log.i("hrka", "constructor 1");
        init(context, null);
    }

    public Rectangle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.i("hrka", "constructor 2");
        init(context, attrs);
    }

    public Rectangle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.i("hrka", "constructor 3");
        init(context, attrs);
    }

    public Rectangle(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
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

        canvas.drawRect(dp2px(100),dp2px(20),dp2px(150),dp2px(50),fillAndStrokePaint);
        canvas.drawRect(dp2px(170),dp2px(30),dp2px(220),dp2px(60),fillPaint);
        canvas.drawRect(dp2px(240),dp2px(40),dp2px(290),dp2px(70),emptyPaint);
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
        emptyPaint = new Paint();
        emptyPaint.setStrokeWidth(dp2px(1f));
        emptyPaint.setColor(Color.BLUE);
        emptyPaint.setStyle(Paint.Style.STROKE);

        fillPaint = new Paint();
        fillPaint.setStrokeWidth(dp2px(1f));
        fillPaint.setColor(Color.BLACK);
        fillPaint.setStyle(Paint.Style.FILL);

        fillAndStrokePaint = new Paint();
        fillAndStrokePaint.setStrokeWidth(dp2px(1f));
        fillAndStrokePaint.setColor(Color.GRAY);
        fillAndStrokePaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }
}
