package com.eoe.adskiller;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class SettingActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);

		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.settings, android.R.layout.simple_list_item_1);

		setListAdapter(adapter);

		getListView().setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				// TODO �Զ����ɵķ������
				switch (arg2) {
				case 0:
					Alerts.ShowAlerts("����", SettingActivity.this, "ʹ��������������BUG���뷢�������Ϣ��QQ��593330820");
					break;
				case 1:
					Alerts.ShowAlerts("����", SettingActivity.this, "�����������Android�����߿�����һ��������СӦ��,����������,eoe���������Һܶ����,��лeoe!");
					break;
				case 2:

					break;
				case 3:

					break;
				default:
					break;
				}

			}
		});
	}

}
