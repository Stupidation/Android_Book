package com.eoeandroid.wikirecent;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.Context;
/**
 * {@link AppWidgetProvider} ����Ӧ��ֻ��Ҫ��onUpdate()����������һ��{@link AsyncTask} ȥ��ȡ����
 * @author <a href="mailto:kris1987@qq.com">Kris.lee</a>
 * @date 2012-10-20
 * @version 1.0.0
 *
 */
public class WikiRecent extends AppWidgetProvider {

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		new RecentAsyncTask(context).execute();
	}

}
