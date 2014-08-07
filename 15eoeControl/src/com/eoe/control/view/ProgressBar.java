package com.eoe.control.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eoe.control.R;

public class ProgressBar extends LinearLayout {

	protected TextView mTextView;

	public ProgressBar(Context context) {
		super(context);
		draw();
	}

	public ProgressBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray attr = context.obtainStyledAttributes(attrs, R.styleable.progress);
		draw();
		setText(attr.getString(R.styleable.progress_text)); // attr.getString(R.styleable.progress_text)
		setSize(attr.getDimension(R.styleable.progress_titleSize, 16));
		attr.recycle();
	}

	private void draw() {
		LayoutInflater.from(getContext()).inflate(R.layout.progress_bar, this);
		mTextView = (TextView) findViewById(R.id.ProgressTextView);
	}

	public void setText(int resid) {
		mTextView.setText(resid);
	}

	public void setText(String title) {
		if (title != null) {
			mTextView.setText(title);
		}
	}

	public void setSize(Float size) {
		mTextView.setTextSize(size);
	}

}
