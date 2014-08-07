package com.example.teselayout;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

public class ActionItem extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.relativelayout1);
		
		//ActionBar actionBar  = this.getActionBar();
		//actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		//actionBar.setDisplayOptions(ActionBar.DISPLAY_HOME_AS_UP, ActionBar.DISPLAY_HOME_AS_UP);
		//actionBar.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.optionmenu, menu);
		//SearchView searchView = (SearchView) menu.findItem(R.id.actionview).getActionView();
		return true;
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			Toast.makeText(this, "w单击了图标", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.optionitem1:
			Toast.makeText(this, "w单击了选项1", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.optionitem2:
			Toast.makeText(this, "w单击了选项2", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.optionitem3:
			Toast.makeText(this, "w单击了选项3", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.subitem1:
			Toast.makeText(this, "w单击了子菜单选项1", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.subitem2:
			Toast.makeText(this, "w单击了子菜单选项2", Toast.LENGTH_SHORT).show();
			return true;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	

}
