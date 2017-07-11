 package com.example.synchronization_food;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class menu extends Activity{
    SQLiteDatabase db;
	String time,cost,table_number,menu,name=" ",str;
	int totalcost=0;
	int number=0;
	TextView view;
	ArrayList<String> infoone=new ArrayList<String>();
	ArrayList<String> Time=new ArrayList<String>();
	ArrayList<String> Cost=new ArrayList<String>();
	ArrayList<String> Table=new ArrayList<String>();
	ArrayList<String> Menu=new ArrayList<String>();
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.menu);
		LinearLayout root=(LinearLayout)findViewById(R.id.root);
		Button bn1=(Button)findViewById(R.id.Button1);
		bn1.setOnClickListener(new MyButton());
		view=(TextView)findViewById(R.id.TextView7);
		
		SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd");     
		time=sDateFormat.format(new java.util.Date());
		
		//time="2017-01-23";
		RecyclecostFromServer one=new RecyclecostFromServer(handler1,time); 
		ExecutorService executor=Executors.newSingleThreadExecutor();
		Future future=executor.submit(one);
		try {
			str=(String)future.get();
			String[] todaycost=str.split("\n");
			//db=SQLiteDatabase.openOrCreateDatabase(menu.this.getFilesDir().toString()+"/my.db3",null);
			//db.execSQL("create table if not exists food(_id integer primary key autoincrement,time text,table_number text,cost text,dish text)");
			//final Cursor cursor = db.rawQuery("select * from food where time='"+time+"'",null);
			if(todaycost.length>0)
			{
				final Button[] b = new Button[1200];
				for(int i=0;i<todaycost.length;i++)
				{
					final String[] costlist=todaycost[i].split("t");
					final LinearLayout layout=new LinearLayout(this);  
					root.addView(layout);
					layout.setOrientation(LinearLayout.VERTICAL); 
					LinearLayout.LayoutParams params0 = (LinearLayout.LayoutParams) layout.getLayoutParams();
					params0.width = LinearLayout.LayoutParams.MATCH_PARENT;
					params0.height = LinearLayout.LayoutParams.WRAP_CONTENT;
					layout.setLayoutParams(params0);
					            

					 final TextView text=new TextView(this);
					 layout.addView(text);
					 text.setTextSize(TypedValue.COMPLEX_UNIT_DIP,18);  //设置字体大小
					 text.setText(time+"     "+costlist[0]);
					 TextPaint tp = text.getPaint();    //设置字体粗细
					 tp.setFakeBoldText(true); 
					 LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) text.getLayoutParams();  
					 params.width = LinearLayout.LayoutParams.MATCH_PARENT;
					 params.height = LinearLayout.LayoutParams.WRAP_CONTENT;
					 text.setLayoutParams(params); 
					 text.setPadding(44,10,0,0);
					            
					 final LinearLayout layout1=new LinearLayout(this);
					 layout.addView(layout1);
					 layout1.setOrientation(LinearLayout.HORIZONTAL);
					 LinearLayout.LayoutParams params2 = (LinearLayout.LayoutParams) layout1.getLayoutParams();
					 params2.width = LinearLayout.LayoutParams.MATCH_PARENT;
					 params2.height = LinearLayout.LayoutParams.WRAP_CONTENT;
					 params2.setMargins(0, 20, 0, 0);
					 layout1.setLayoutParams(params2);
					 layout1.setBackgroundResource(R.drawable.shape1);
					            
					 final TextView text1=new TextView(this);
					 layout1.addView(text1);
					 text1.setTextSize(TypedValue.COMPLEX_UNIT_DIP,20);  //设置字体大小
					 LinearLayout.LayoutParams params3 = (LinearLayout.LayoutParams) text1.getLayoutParams();  
					 params3.width = LinearLayout.LayoutParams.WRAP_CONTENT;
					 params3.height = LinearLayout.LayoutParams.WRAP_CONTENT;
					 params3.setMargins(25,-10,0,0);
					 text1.setLayoutParams(params3);
					 text1.setText("金额:");
					            
					 final TextView text2=new TextView(this);
					 layout1.addView(text2);
					 text2.setTextSize(TypedValue.COMPLEX_UNIT_DIP,20);  //设置字体大小
					 LinearLayout.LayoutParams params4 = (LinearLayout.LayoutParams) text2.getLayoutParams();  
					 params4.width = LinearLayout.LayoutParams.WRAP_CONTENT;
					 params4.height = LinearLayout.LayoutParams.WRAP_CONTENT;
					 params4.setMargins(25,-10, 0, 0);
					 text2.setLayoutParams(params4);
					 text2.setText("¥"+" "+costlist[1]);
					 totalcost=totalcost+Integer.parseInt(costlist[1].substring(0,costlist[1].indexOf("(")));
					 text2.setPadding(10,0,0,0);
					            
					 b[number]=new Button(this);
					 b[number].setId(number); 
					 b[number].setTag(number); 
					 b[number].setText("查看");
					 b[number].setTextSize(TypedValue.COMPLEX_UNIT_DIP,18); 
					 layout1.addView(b[number]);
					 LinearLayout.LayoutParams params5 = (LinearLayout.LayoutParams) b[number].getLayoutParams(); 
					 params5.width = 180;
					 params5.height =150;
					 params5.gravity = Gravity.CENTER; 
					 params5.setMargins(0,-10, 30, 0);
					 b[number].setLayoutParams(params5);  
					 b[number].setOnClickListener(new Button.OnClickListener() {
						               
				                    public void onClick(View v) {
				                        Log.d("number",String.valueOf(number));
				                        Log.d("costlist2",costlist[2]);
				                        infoone.clear();
				                    	Intent intent = new Intent();
				                        intent.setClass(menu.this, menushow.class);
				                        infoone.add(costlist[2]);
				                        intent.putStringArrayListExtra("information1", infoone);
				                        startActivity(intent);
				                   }
				                 });
					            number++;

				 }
			} 
			 
		    else
		    {
	    		final TextView text=new TextView(this);
	    	    root.addView(text);
	    		text.setTextSize(TypedValue.COMPLEX_UNIT_DIP,18);  //设置字体大小
	    		text.setText("对不起，数据库里没有数据。");
	    		TextPaint tp = text.getPaint();    //设置字体粗细
	    		tp.setFakeBoldText(true); 
	    		LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) text.getLayoutParams();  
	            params.width = LinearLayout.LayoutParams.MATCH_PARENT;
	            params.height = LinearLayout.LayoutParams.WRAP_CONTENT;
	            text.setLayoutParams(params); 
	            text.setPadding(44,10,0,0);
		    }
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
      Log.d("totalcost",String.valueOf(totalcost));  
	  view.setText("今日营业额:"+" "+"¥"+" "+String.valueOf(totalcost));
	}
	
    Handler handler1=new Handler(){  
        public void handleMessage(Message msg) {  
            switch (msg.what) {  
            case RecyclecostFromServer.SEND_SUCCESS:  
                Toast.makeText(menu.this, "查账成功", Toast.LENGTH_SHORT).show();
                break;  
            case RecyclecostFromServer.SEND_FAIL:  
                Toast.makeText(menu.this, "查账失败，请重新尝试", Toast.LENGTH_SHORT).show();
                break;   
            }  
        };        
    };
	
	class MyButton implements View.OnClickListener
	{
		public void onClick(View source)
		{
			 
			switch(source.getId())
			{
		 		case R.id.Button1:
	        		menu.this.finish();
			}
		}
	}
	 public boolean onKeyDown(int keyCode, KeyEvent event) {
	       
	    	if (keyCode == KeyEvent.KEYCODE_BACK) 
	    	{
	    		menu.this.finish();
	    	}
	    	return super.onKeyDown(keyCode, event);  
	    }
}