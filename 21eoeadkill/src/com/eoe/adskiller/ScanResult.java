package com.eoe.adskiller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ScanResult extends Activity {

	ListView rlListView;
	ProgressBar mProgressBar;
	TextView scaning, scanended;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		rlListView = (ListView) findViewById(R.id.listview);
		mProgressBar = (ProgressBar) findViewById(R.id.progressBar);
		scaning = (TextView) findViewById(R.id.textscan);
		scanended = (TextView) findViewById(R.id.scanend);
		Handler backHandler = new TaskHandler(this);
		ScanTask myScanTask = new ScanTask(this, backHandler);
		myScanTask.setPriority(Thread.MAX_PRIORITY);
		myScanTask.start();
		// Log.d("activity create","create  time");
	}

	@Override
	protected void onStart() {
		// TODO �Զ����ɵķ������
		super.onStart();

	}

	@Override
	protected void onResume() {
		// TODO �Զ����ɵķ������
		super.onResume();

	}

	class TaskHandler extends Handler {

		private ScanResult parentActivityResult = null;
		ArrayList<AppInfo> appList = new ArrayList<AppInfo>();

		AppAdapter appAdapter;

		private int count = 0;

		public TaskHandler(ScanResult result) {
			parentActivityResult = result;

		}

		@Override
		public void handleMessage(Message msg) {
			// TODO �Զ����ɵķ������
			super.handleMessage(msg);

			if (msg.what == 0) {
				AppInfo tmpInfo = new AppInfo();
				tmpInfo = (AppInfo) msg.obj;

				if (count == 0) {

					appList.add(tmpInfo);

					appAdapter = new AppAdapter(ScanResult.this, appList);

					rlListView.setDividerHeight(5);
					if (rlListView != null) {
						rlListView.setAdapter(appAdapter);
					}

				} else {

					appAdapter.dataList.add(tmpInfo);
					appAdapter.notifyDataSetChanged();
				}

				count++;

			} else {
				setProgressBarVisibility(false);
				mProgressBar.setVisibility(View.GONE);
				scaning.setVisibility(View.GONE);
				scanended.setVisibility(View.VISIBLE);
			}
		}

	}
}
