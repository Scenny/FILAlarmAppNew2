package com.FourIL.AlarmApp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class StartMainActivity extends Activity {

	public Button setAlarmButton;
	public Button enterDownloadButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_main);
        
        setAlarmButton = (Button) findViewById(R.id.SetAlarm);
        setAlarmButton.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(StartMainActivity.this, DeskClockMainActivity.class));
				
			}
		});
        enterDownloadButton = (Button) findViewById(R.id.Download);
        enterDownloadButton.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(StartMainActivity.this, DownloadPageActivity.class));
			}
		});
        
        Button submit = 
        		(Button) findViewById(R.id.submitinfo);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent intent = new Intent(StartMainActivity.this, SubmitInfoActivity.class);
            	intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
            	startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.start_main, menu);
        return true;
    }
}
