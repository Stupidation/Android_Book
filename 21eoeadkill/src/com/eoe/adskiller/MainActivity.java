package com.eoe.adskiller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private static final String TAG = "com.eoe.adskiller.MainActivity";
	private Button scanbtn, setbtn;
	private ImageView myimg;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		scanbtn = (Button) findViewById(R.id.check);
		setbtn = (Button) findViewById(R.id.setting);
		myimg = (ImageView) findViewById(R.id.imageView1);

		// ��Ļ�����أ��磺480px��
		int screenHeight = getWindowManager().getDefaultDisplay().getHeight();

		myimg.setMaxHeight(screenHeight - 568);

		scanbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				Intent scanIntent = new Intent(MainActivity.this, ScanResult.class);
				MainActivity.this.startActivity(scanIntent);
				// Log.d("start scan activity", "start time");
			}
		});
		setbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				Intent setIntent = new Intent(MainActivity.this, SettingActivity.class);
				MainActivity.this.startActivity(setIntent);
			}
		});
	}
}
