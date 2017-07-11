package com.example.synchronization_food;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class menushow extends Activity{
	String cost,dish="",str="";
	ArrayList<String> info=new ArrayList<String>();
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.menushow);
		Button bn=(Button)findViewById(R.id.Button14);
		TextView v1=(TextView)findViewById(R.id.TextView6);
		TextView v2=(TextView)findViewById(R.id.TextView7);
		info = getIntent().getStringArrayListExtra("information1");
		for(int i=0;i<info.size();i++)
		{
		Log.d("id",info.get(0));
		}
		RecyclemenushowFromServer one=new RecyclemenushowFromServer(handler1,info.get(0)); 
		ExecutorService executor=Executors.newSingleThreadExecutor();
		Future future=executor.submit(one);
		try {
			str=(String)future.get();
			String[] Dish=str.split("t");
			for(int i=0;i<Dish.length;i++)
			{
				if(i<Dish.length-1)
				{
					if(Dish[i].equals("空"))
					{
						continue;
					}
					else
					{
						dish=dish+Dish[i]+"\n";
					}
				}
				else
				{
					break;
				}
			}
			cost=Dish[Dish.length-1];
		}  catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		//time=data.getString("time");
		//cost=data.getString("cost");
		//table_number=data.getString("table_number");
		//dish=data.getString("menu");
		v1.setText("\n"+dish);
		v2.setText("¥"+" "+cost);
		bn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
            	menushow.this.finish();                
           }
         });
	}
	 public boolean onKeyDown(int keyCode, KeyEvent event) {
	       
	    	if (keyCode == KeyEvent.KEYCODE_BACK) 
	    	{
	    		menushow.this.finish();
	    	}
	    	return super.onKeyDown(keyCode, event);  
	    }
	 
	    Handler handler1=new Handler(){  
	        public void handleMessage(Message msg) {  
	            switch (msg.what) {  
	            case RecyclemenushowFromServer.SEND_SUCCESS:  
	                Toast.makeText(menushow.this, "查账成功", Toast.LENGTH_SHORT).show();
	                break;  
	            case RecyclemenushowFromServer.SEND_FAIL:  
	                Toast.makeText(menushow.this, "查账失败，请重新尝试", Toast.LENGTH_SHORT).show();
	                break;   
	            }  
	        };        
	    };
}
