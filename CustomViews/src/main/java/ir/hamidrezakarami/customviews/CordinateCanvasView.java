package ir.hamidrezakarami.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class CordinateCanvasView extends View {

    Context context;
    Paint oddPaint;
    Paint evenPaint;

    public CordinateCanvasView(Context context) {
        super(context);
        Log.i("hrka", "constructor 1");
        init(context, null);
    }

    public CordinateCanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.i("hrka", "constructor 2");
        init(context, attrs);
    }

    public CordinateCanvasView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.i("hrka", "constructor 3");
        init(context, attrs);
    }

    public CordinateCanvasView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
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

        for (int i = 0; i < 100; i++) {
            canvas.drawLine(dp2px(i * 10), dp2px(0), dp2px(i * 10), dp2px(3000), i % 2 == 0 ? evenPaint : oddPaint);
            canvas.drawLine(dp2px(0), dp2px(i * 10), dp2px(500), dp2px(i * 10), i % 2 == 0 ? evenPaint : oddPaint);
        }
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
        oddPaint = new Paint();
        evenPaint = new Paint();
        oddPaint.setStrokeWidth(dp2px(0.1f));
        evenPaint.setStrokeWidth(dp2px(0.1f));
        oddPaint.setColor(Color.BLACK);
        evenPaint.setColor(Color.GRAY);
    }
}
