package com.example.synchronization_food;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List; 
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class potdish extends Activity{
	String show="0";
	TextView wl,zl,tl,yd,gd,yy,view3,viewtop;
	String temp; 
	String a="0";
	int b=0,b0=0;     //b用来记录数量，b0用来统计价格
	String cost;
	String time,tablenumber="1号",main="空",pepper="微辣",Main="空",Small="空",cardNumber="1号";
	ArrayList<String> info=new ArrayList<String>();
	ArrayList<String> info1=new ArrayList<String>();
    private Spinner  spinnerCardNumber,spinnermain; 
	private ArrayAdapter<String> adapter; 
	long mExitTime=0;
	List<String> Ltablenumber=new ArrayList<String>();
	List<String> Lpepper=new ArrayList<String>();
	Builder builder;
	Boolean flaghandin=false;
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.pot_dish);
		
		flaghandin=false;
		Button bn5=(Button)findViewById(R.id.Button5);
		Button bn6=(Button)findViewById(R.id.Button6);
		Button bn7=(Button)findViewById(R.id.Button7);
		Button bn8=(Button)findViewById(R.id.Button8 );
		Button bn9=(Button)findViewById(R.id.Button9 );
		Button bn14=(Button)findViewById(R.id.Button14);
		
		ImageButton bwl=(ImageButton)findViewById(R.id.Bwl);
		ImageButton bwl1=(ImageButton)findViewById(R.id.Bwl1);
		ImageButton bzl=(ImageButton)findViewById(R.id.Bzl);
		ImageButton bzl1=(ImageButton)findViewById(R.id.Bzl1);
		ImageButton btl=(ImageButton)findViewById(R.id.Btl);
		ImageButton btl1=(ImageButton)findViewById(R.id.Btl1);
		ImageButton byy=(ImageButton)findViewById(R.id.Byy);
		ImageButton byy1=(ImageButton)findViewById(R.id.Byy1);
		ImageButton byd=(ImageButton)findViewById(R.id.Byd);
		ImageButton byd1=(ImageButton)findViewById(R.id.Byd1);
		ImageButton bgd=(ImageButton)findViewById(R.id.Bgd);
		ImageButton bgd1=(ImageButton)findViewById(R.id.Bgd1);
		ImageButton bn15=(ImageButton)findViewById(R.id.Button15);
			
		bn5.setOnClickListener(new MyButton());
		bn6.setOnClickListener(new MyButton());
		bn7.setOnClickListener(new MyButton());
		bn8.setOnClickListener(new MyButton());
		bn9.setOnClickListener(new MyButton());
		bn14.setOnClickListener(new MyButton());
		bwl.setOnClickListener(new MyButton1());
		bwl1.setOnClickListener(new MyButton1());
		bzl.setOnClickListener(new MyButton1());
		bzl1.setOnClickListener(new MyButton1());
		btl.setOnClickListener(new MyButton1());
		btl1.setOnClickListener(new MyButton1());	
		byy.setOnClickListener(new MyButton1());
		byy1.setOnClickListener(new MyButton1());
		byd.setOnClickListener(new MyButton1());
		byd1.setOnClickListener(new MyButton1());
		bgd.setOnClickListener(new MyButton1());
		bgd1.setOnClickListener(new MyButton1());
		bn15.setOnClickListener(new MyButton());
		
		viewtop=(TextView)findViewById(R.id.TextView1);
		wl=(TextView)findViewById(R.id.Twl1);
		zl=(TextView)findViewById(R.id.Tzl1);
		tl=(TextView)findViewById(R.id.Ttl1);
		yy=(TextView)findViewById(R.id.Tyy1);
		yd=(TextView)findViewById(R.id.Tyd1);
		gd=(TextView)findViewById(R.id.Tgd1);
		view3=(TextView)findViewById(R.id.TextView7);
		Log.d("show_create_mainactivity",show);
		builder=new AlertDialog.Builder(this);

		info = getIntent().getStringArrayListExtra("information1");
		for(int i=0;i<info.size();i++)
		{
			info1.add(info.get(i));
		}
		
		for(int i=0;i<info.size();i++)
		{
			temp=info.get(i);
			String str=temp.substring(0,temp.indexOf("("));
			if(str.equals("1号"))
			{
				cardNumber="1号";
				viewtop.setText("1号桌");
			}
			if(str.equals("2号"))
			{
				cardNumber="2号";
				viewtop.setText("2号桌");
			}
			if(str.equals("3号"))
			{
				cardNumber="3号";
				viewtop.setText("3号桌");
			}
			if(str.equals("4号"))
			{
				cardNumber="4号";
				viewtop.setText("4号桌");
			}
			if(str.equals("5号"))
			{
				cardNumber="5号";
				viewtop.setText("5号桌");
			}
			if(str.equals("6号"))
			{
				cardNumber="6号";
				viewtop.setText("6号桌");
			}
			if(str.equals("7号"))
			{
				cardNumber="7号";
				viewtop.setText("7号桌");
			}
			if(str.equals("8号"))
			{
				cardNumber="8号";
				viewtop.setText("8号桌");
			}			
			if(str.equals("9号"))
			{
				cardNumber="9号";
				viewtop.setText("9号桌");
			}
			if(str.equals("10号"))
			{
				cardNumber="10号";
				viewtop.setText("10号桌");
			}
			if(str.equals("11号"))
			{
				cardNumber="11号";
				viewtop.setText("11号桌");
			}			
			if(str.equals("12号"))
			{
				cardNumber="12号";
				viewtop.setText("12号桌");
			}
			if(str.equals("13号"))
			{
				cardNumber="13号";
				viewtop.setText("13号桌");
			}
			if(str.equals("14号"))
			{
				cardNumber="14号";
				viewtop.setText("14号桌");
			}
			if(str.equals("15号"))
			{
				cardNumber="15号";
				viewtop.setText("15号桌");
			}
			if(str.equals("16号"))
			{
				cardNumber="16号";
				viewtop.setText("16号桌");
			}
			if(str.equals("17号"))
			{
				cardNumber="17号";
				viewtop.setText("17号桌");
			}
			if(str.equals("18号"))
			{
				cardNumber="18号";
				viewtop.setText("18号桌");
			}
			if(str.equals("19号"))
			{
				cardNumber="19号";
				viewtop.setText("19号桌");
			}
			if(str.equals("20号"))
			{
				cardNumber="20号";
				viewtop.setText("20号桌");
			}
			if(str.equals("21号"))
			{
				cardNumber="21号";
				viewtop.setText("21号桌");
			}
			if(str.equals("22号"))
			{
				cardNumber="22号";
				viewtop.setText("22号桌");
			}
			if(str.equals("23号"))
			{
				cardNumber="23号";
				viewtop.setText("23号桌");
			}
			if(str.equals("24号"))
			{
				cardNumber="24号";
				viewtop.setText("24号桌");
			}
			if(str.equals("25号"))
			{
				cardNumber="25号";
				viewtop.setText("25号桌");
			}
			if(str.equals("26号"))
			{
				cardNumber="26号";
				viewtop.setText("26号桌");
			}
		}
		
		temp=wl.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("红锅微辣(18)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		wl.setText(show);
		
		temp=zl.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("红锅中辣(18)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		zl.setText(show);
		
		temp=tl.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("红锅特辣(18)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		tl.setText(show);
		
		temp=yy.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("鸳鸯锅(22)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		yy.setText(show);
		
		temp=yd.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("油碟(4)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		yd.setText(show);
		
		temp=gd.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("干碟(4)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		gd.setText(show);
		
		cost=view3.getText().toString();
		a=cost.substring(0,2);
		b=Integer.parseInt(cost.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("红锅微辣(18)")) 
			  { 
			    b=b+18;
			  }
			  if (info.get(i).equals("红锅中辣(18)")) 
			  { 
			    b=b+18;
			  }
			  if (info.get(i).equals("红锅特辣(18)")) 
			  { 
			    b=b+18;
			  }
			  if (info.get(i).equals("鸳鸯锅(22)")) 
			  { 
			    b=b+22;
			  }
			  if (info.get(i).equals("油碟(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("干碟(4)")) 
			  { 
			    b=b+4;
			  }
		  }
		show=a+String.valueOf(b);
		view3.setText(show);
		
		MyApplication.getInstance().addActivity(this);
		MyApplication.getInstance().showActivity();
	}
	
	
	
	public void onStart()
	{
		super.onStart(); 
		Log.d("show_start_mainactivity",show);
	}
	public void onPause()
	{
		super.onPause();
		//show=a+String.valueOf(b);
		Log.d("show_pause_mainactivity",show);
	}
	public void onStop()
	{
		super.onStop();
		Log.d("show_stop_mainactivity",show);
	}
	public void onDestroy()
	{
		super.onStop();
		Log.d("show_destroy_mainactivity",show);
	}
	

	
	
	class MyButton implements View.OnClickListener
	{
		public void onClick(View source)
		{
			 
			switch(source.getId())
			{

				case R.id.Button5:
					 if(MyApplication.getInstance().isexistActivity("com.example.synchronization_food.wine"))
					  {
			  			Intent intent1=getIntent();
			  			if(flaghandin)
			  			{
			  				intent1.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent1.putStringArrayListExtra("information1", info1);
			  			}
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.potdish");
		  			  	data1.putString("package_aim","com.example.synchronization_food.wine");
		  			  	intent1.putExtras(data1);
		        		potdish.this.setResult(1,intent1);
		        		potdish.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(potdish.this,wine.class);
			        	intent1.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			  			if(flaghandin)
			  			{
			  				intent1.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent1.putStringArrayListExtra("information1", info1);
			  			}
			  			startActivityForResult(intent1,0); 
					  }
					break;
				case R.id.Button6:
					 if(MyApplication.getInstance().isexistActivity("com.example.synchronization_food.Drink"))
					  {
			  			Intent intent1=getIntent();
			  			if(flaghandin)    //修改值
			  			{
			  				intent1.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent1.putStringArrayListExtra("information1", info1);
			  			}
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.potdish");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Drink");
		  			  	intent1.putExtras(data1);
		        		potdish.this.setResult(2,intent1);
		        		potdish.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(potdish.this,Drink.class);
			        	intent1.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			  			if(flaghandin)    //修改值
			  			{
			  				intent1.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent1.putStringArrayListExtra("information1", info1);
			  			}
			  			startActivityForResult(intent1,0); 
					  }
					break;
				case R.id.Button7:
					 if(MyApplication.getInstance().isexistActivity("com.example.synchronization_food.Staple_food"))
					  {
			  			Intent intent1=getIntent();
			  			if(flaghandin)    //修改值
			  			{
			  				intent1.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent1.putStringArrayListExtra("information1", info1);
			  			}
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.potdish");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Staple_food");
		  			  	intent1.putExtras(data1);
		        		potdish.this.setResult(2,intent1);
		        		potdish.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(potdish.this,Staple_food.class);
			        	intent1.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			  			if(flaghandin)    //修改值
			  			{
			  				intent1.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent1.putStringArrayListExtra("information1", info1);
			  			}
			  			startActivityForResult(intent1,0); 
					  }
					break;
				case R.id.Button8:
					 if(MyApplication.getInstance().isexistActivity("com.example.synchronization_food.yakitoui"))
					  {
			  			Intent intent1=getIntent();
			  			if(flaghandin)    //修改值
			  			{
			  				intent1.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent1.putStringArrayListExtra("information1", info1);
			  			}
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.potdish");
		  			  	data1.putString("package_aim","com.example.synchronization_food.yakitoui");
		  			  	intent1.putExtras(data1);
		        		potdish.this.setResult(2,intent1);
		        		potdish.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(potdish.this,yakitoui.class);
			        	intent1.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			  			if(flaghandin)    //修改值
			  			{
			  				intent1.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent1.putStringArrayListExtra("information1", info1);
			  			}
			  			startActivityForResult(intent1,0); 
					  }
					break;
			 	case R.id.Button9:
					 if(MyApplication.getInstance().isexistActivity("com.example.synchronization_food.Plate"))
					  {
			  			Intent intent1=getIntent();
			  			if(flaghandin)    //修改值
			  			{
			  				intent1.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent1.putStringArrayListExtra("information1", info1);
			  			}
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.potdish");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Plate");
		  			  	intent1.putExtras(data1);
		        		potdish.this.setResult(2,intent1);
		        		potdish.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(potdish.this,Plate.class);
			        	intent1.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			  			if(flaghandin)    //修改值
			  			{
			  				intent1.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent1.putStringArrayListExtra("information1", info1);
			  			}
			  			startActivityForResult(intent1,0); 
					  }
			 		break;
			 		
			 	case R.id.Button15:
		  			Intent intent=getIntent();
		  			if(flaghandin)
		  			{
		  				Log.d("hello","hello");
		  				intent.putStringArrayListExtra("information1", info);
		  			}
		  			else
		  			{
		  				Log.d("hello_info1","hello");
		  				for(int i=0;i<info1.size();i++)
		  				{
		  					Log.d("info1",info1.get(i));
		  				}
		  				intent.putStringArrayListExtra("information1", info1);
		  			}
		  			Bundle data=new Bundle();
		  			data.putString("package_self","com.example.synchronization_food.potdish");
		  			data.putString("package_aim","com.example.synchronization_food.One");
		  			intent.putExtras(data);
		  			potdish.this.setResult(1,intent);
	        		potdish.this.finish(); 
			 		
			 		break;
			 	case R.id.Button14:
				    builder.setTitle("用户你好！");
			 		builder.setMessage("点击确定将提交账单");
			 		builder.setPositiveButton("确定",new OnClickListener(){
			 			public void onClick(DialogInterface dialog,int which)
			 			{
			 				//暂时这么处理
			 				for(int i=0;i<info.size();i++)
			 				{
			 					Log.d("info",info.get(i));
			 				}
			 				
			 				flaghandin=true;
			 				int main[]={0,0,0,0};
			 				int smallplate[]={0,0};
			 				int mainkey[]={1,1,1,1};
			 				int smallplatekey[]={1,1};
			 				Main="空";
			 				Small="空";
			 				String str;
			 				for(int i=0;i<info.size();i++)
			 				{
			 					temp=info.get(i);
			 					str=temp.substring(0,temp.indexOf("("));
			 					if(str.equals("红锅微辣"))
			 					{
			 						main[0]++;
			 					    continue;
			 					}
			 					if(str.equals("红锅中辣"))
			 					{
			 						main[1]++;
			 					    continue;
			 					}
			 					if(str.equals("红锅特辣"))
			 					{
			 						main[2]++;
			 					    continue;
			 					}
			 					if(str.equals("鸳鸯锅"))
			 					{
			 						main[3]++;
			 					    continue;
			 					}
			 					if(str.equals("油碟"))
			 					{
			 						smallplate[0]++;
			 					    continue;
			 					}
			 					if(str.equals("干碟"))
			 					{
			 						smallplate[1]++;
			 					    continue;
			 					}
			 				}
			 				
			 				for(int i=0;i<info.size();i++)
			 				{
			 					temp=info.get(i);
			 					str=temp.substring(0,temp.indexOf("("));
			 					if((str.equals("红锅微辣"))&&(mainkey[0]==1))
			 					{
			 						mainkey[0]=0;
			 					    if(Main.equals("空"))
			 					    {
			 					        Main=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(main[0])+")";
			 					    }
			 					    else
			 					    {
			 					    	Main=Main+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(main[0])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("红锅中辣"))&&(mainkey[1]==1))
			 					{
			 						mainkey[1]=0;
			 					    if(Main.equals("空"))
			 					    {
			 					        Main=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(main[1])+")";
			 					    }
			 					    else
			 					    {
			 					    	Main=Main+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(main[1])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("红锅特辣"))&&(mainkey[2]==1))
			 					{
			 						mainkey[2]=0;
			 					    if(Main.equals("空"))
			 					    {
			 					        Main=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(main[2])+")";
			 					    }
			 					    else
			 					    {
			 					    	Main=Main+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(main[2])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("鸳鸯锅"))&&(mainkey[3]==1))
			 					{
			 						mainkey[3]=0;
			 					    if(Main.equals("空"))
			 					    {
			 					        Main=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(main[3])+")";
			 					    }
			 					    else
			 					    {
			 					    	Main=Main+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(main[3])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("油碟"))&&(smallplatekey[0]==1))
			 					{
			 						smallplatekey[0]=0;
			 					    if(Small.equals("空"))
			 					    {
			 					       Small=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(smallplate[0])+")";
			 					    }
			 					    else
			 					    {
			 					    	Small=Small+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(smallplate[0])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("干碟"))&&(smallplatekey[1]==1))
			 					{
			 						smallplatekey[1]=0;
			 					    if(Small.equals("空"))
			 					    {
			 					       Small=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(smallplate[1])+")";
			 					    }
			 					    else
			 					    {
			 					    	Small=Small+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(smallplate[1])+")";
			 					    }
			 					    continue;
			 					}
			 				}
			 				
			 				Log.d("Main",Main);
			 				Log.d("Small",Small);
			 				Log.d("show",show);
			 				new SendpotdishToServe(handler).SendDataToServer(cardNumber,Main,Small,show);
			 				
			 			}
			 		}); 
			 			builder.setNegativeButton("取消", new OnClickListener()
			 			{
			 				public void onClick(DialogInterface dialog,int which)
			 				{
			 				
			 				}
			 			});
			 			builder.create().show();
			 		
			 		break;
			}
		}
	}
	
    Handler handler=new Handler(){  
        public void handleMessage(Message msg) {  
            switch (msg.what) {  
            case SendDateToServer.SEND_SUCCESS:  
                Toast.makeText(potdish.this, "数据提交成功", Toast.LENGTH_SHORT).show();
                break;  
            case SendDateToServer.SEND_FAIL:  
                Toast.makeText(potdish.this, "数据提交失败，请重新尝试", Toast.LENGTH_SHORT).show();
                break;   
            }  
        };        
    }; 
	
	public void onActivityResult(int requestCode,int resultCode,Intent intent)
	{
		wl.setText("× 0");
		zl.setText("× 0");
		tl.setText("× 0");
		gd.setText("× 0");
		yd.setText("× 0");
		yy.setText("× 0");
		view3.setText("¥ 0");
		info = intent.getStringArrayListExtra("information1");
		info1.clear();
		for(int i=0;i<info.size();i++)
		{
			info1.add(info.get(i));
			Log.d("info",info.get(i));
		}
		flaghandin=false;
		
		if(requestCode==0&&resultCode==2)   //碟子对酒的反馈信息
		{
			flaghandin=false;
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.potdish"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.potdish");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.One"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.Staple_food"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.Drink"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.Plate"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.yakitoui"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tat",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
		}
		
		if(requestCode==0&&resultCode==3)   //碟子对酒的反馈信息
		{
			flaghandin=false;
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.potdish"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.potdish");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.One"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.Staple_food"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.wine"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.Plate"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.yakitoui"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tat",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
		}
		
		if(requestCode==0&&resultCode==4)   //碟子对酒的反馈信息
		{
			flaghandin=false;
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.potdish"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.potdish");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.One"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.Drink"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.wine"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.Plate"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.yakitoui"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		
		if(requestCode==0&&resultCode==5)   //碟子对酒的反馈信息
		{
			flaghandin=false;
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.potdish"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.potdish");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.One"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.Drink"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.wine"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.Plate"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.Staple_food"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		
		if(requestCode==0&&resultCode==6)   //碟子对酒的反馈信息
		{
			flaghandin=false;
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Plate"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.potdish");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.One"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.Staple_food"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.wine"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.Drink"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.potdish").equals("com.example.synchronization_food.yakitoui"))
				{
					potdish.this.setResult(1,intent);
					potdish.this.finish();
				}
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tat",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
		}
		
		temp=wl.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("红锅微辣(18)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		wl.setText(show);
		
		temp=zl.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("红锅中辣(18)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		zl.setText(show);
		
		temp=tl.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("红锅特辣(18)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		tl.setText(show);
		
		temp=yy.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("鸳鸯锅(22)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		yy.setText(show);
		
		temp=yd.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("油碟(4)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		yd.setText(show);
		
		temp=gd.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("干碟(4)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		gd.setText(show);
		
		cost=view3.getText().toString();
		a=cost.substring(0,2);
		b=Integer.parseInt(cost.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("红锅微辣(18)")) 
			  { 
			    b=b+18;
			  }
			  if (info.get(i).equals("红锅中辣(18)")) 
			  { 
			    b=b+18;
			  }
			  if (info.get(i).equals("红锅特辣(18)")) 
			  { 
			    b=b+18;
			  }
			  if (info.get(i).equals("鸳鸯锅(22)")) 
			  { 
			    b=b+22;
			  }
			  if (info.get(i).equals("油碟(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("干碟(4)")) 
			  { 
			    b=b+4;
			  }
		  }
		show=a+String.valueOf(b);
		view3.setText(show);
		
	}
	
	class MyButton1 implements View.OnClickListener
	{
		public void onClick(View source)
		{
			
			switch(source.getId())
			{
			  case R.id.Bwl1:      //加号的处理  
					  temp=wl.getText().toString(); 
					  a=temp.substring(0,2);
					  b=Integer.parseInt(temp.substring(2));
					  b++;
					  show=a+String.valueOf(b);
					  wl.setText(show);
				  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b0=Integer.parseInt(cost.substring(2));
					  b0=b0+18;
					  show=a+String.valueOf(b0);
					  view3.setText(show);
					  info.add("红锅微辣(18)");
				  break;
			  case R.id.Bwl:
					   temp=wl.getText().toString(); 
					   a=temp.substring(0,2);
					   b=Integer.parseInt(temp.substring(2));
					   if(b!=0)
					   {
						  b--;
						  show=a+String.valueOf(b);
						  wl.setText(show);
						  for (int i = 0; i < info.size(); i++) 
						  { 
							  if (info.get(i).equals("红锅微辣(18)")) 
							  { 
							    info.remove(i); 
							    i--; 
							    break;
							  }
						  }

						  cost=view3.getText().toString();
						  a=cost.substring(0,2);
						  b0=Integer.parseInt(cost.substring(2));
						  b0=b0-18;
						  show=a+String.valueOf(b0);
						  view3.setText(show);
						 
					    }

				  break;
			  case R.id.Bzl1:      //加号的处理  
				  temp=zl.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  zl.setText(show);
			  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b0=Integer.parseInt(cost.substring(2));
				  b0=b0+18;
				  show=a+String.valueOf(b0);
				  view3.setText(show);
				  info.add("红锅中辣(18)");
				  break;
			  case R.id.Bzl:
				   temp=zl.getText().toString(); 
				   a=temp.substring(0,2);
				   b=Integer.parseInt(temp.substring(2));
				   if(b!=0)
				   {
					  b--;
					  show=a+String.valueOf(b);
					  zl.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("红锅中辣(18)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }

					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b0=Integer.parseInt(cost.substring(2));
					  b0=b0-18;
					  show=a+String.valueOf(b0);
					  view3.setText(show);
					 
				    }

			  break;
		  case R.id.Btl1:      //加号的处理  
			  temp=tl.getText().toString(); 
			  a=temp.substring(0,2);
			  b=Integer.parseInt(temp.substring(2));
			  b++;
			  show=a+String.valueOf(b);
			  tl.setText(show);
		  
			  cost=view3.getText().toString();
			  a=cost.substring(0,2);
			  b0=Integer.parseInt(cost.substring(2));
			  b0=b0+18;
			  show=a+String.valueOf(b0);
			  view3.setText(show);
			  info.add("红锅特辣(18)");
		  break;
		  case R.id.Btl:
			   temp=tl.getText().toString(); 
			   a=temp.substring(0,2);
			   b=Integer.parseInt(temp.substring(2));
			   if(b!=0)
			   {
				  b--;
				  show=a+String.valueOf(b);
				  tl.setText(show);
				  for (int i = 0; i < info.size(); i++) 
				  { 
					  if (info.get(i).equals("红锅特辣(18)")) 
					  { 
					    info.remove(i); 
					    i--; 
					    break;
					  }
				  }

				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b0=Integer.parseInt(cost.substring(2));
				  b0=b0-18;
				  show=a+String.valueOf(b0);
				  view3.setText(show);
				 
			    }

		  break;
	  case R.id.Byy1:      //加号的处理  
		  temp=yy.getText().toString(); 
		  a=temp.substring(0,2);
		  b=Integer.parseInt(temp.substring(2));
		  b++;
		  show=a+String.valueOf(b);
		  yy.setText(show);
	  
		  cost=view3.getText().toString();
		  a=cost.substring(0,2);
		  b0=Integer.parseInt(cost.substring(2));
		  b0=b0+22;
		  show=a+String.valueOf(b0);
		  view3.setText(show);
		  info.add("鸳鸯锅(22)");
	  break;
	  case R.id.Byy:
		   temp=yy.getText().toString(); 
		   a=temp.substring(0,2);
		   b=Integer.parseInt(temp.substring(2));
		   if(b!=0)
		   {
			  b--;
			  show=a+String.valueOf(b);
			  yy.setText(show);
			  for (int i = 0; i < info.size(); i++) 
			  { 
				  if (info.get(i).equals("鸳鸯锅(22)")) 
				  { 
				    info.remove(i); 
				    i--; 
				    break;
				  }
			  }

			  cost=view3.getText().toString();
			  a=cost.substring(0,2);
			  b0=Integer.parseInt(cost.substring(2));
			  b0=b0-22;
			  show=a+String.valueOf(b0);
			  view3.setText(show);
			 
		    }

		   break;
  		case R.id.Bgd1:      //加号的处理  
  			temp=gd.getText().toString(); 
  			a=temp.substring(0,2);
  			b=Integer.parseInt(temp.substring(2));
  			b++;
  			show=a+String.valueOf(b);
  			gd.setText(show);
  
  			cost=view3.getText().toString();
  			a=cost.substring(0,2);
  			b0=Integer.parseInt(cost.substring(2));
  			b0=b0+4;
  			show=a+String.valueOf(b0);
  			view3.setText(show);
  			info.add("干碟(4)");
  			break;
  		case R.id.Bgd:
  				temp=gd.getText().toString(); 
  				a=temp.substring(0,2);
  				b=Integer.parseInt(temp.substring(2));
  				if(b!=0)
  				{
  					b--;
  					show=a+String.valueOf(b);
  					gd.setText(show);
  					for (int i = 0; i < info.size(); i++) 
  					{ 
  						if (info.get(i).equals("干碟(4)")) 
  						{ 
  							info.remove(i); 
  							i--; 
  							break;
  						}	
  					}

		  		cost=view3.getText().toString();
		  		a=cost.substring(0,2);
		  		b0=Integer.parseInt(cost.substring(2));
		  		b0=b0-4;
		  		show=a+String.valueOf(b0);
		  		view3.setText(show);
		 
	    	  }

	   		  break;
  		case R.id.Byd1:      //加号的处理  
  			temp=yd.getText().toString(); 
  			a=temp.substring(0,2);
  			b=Integer.parseInt(temp.substring(2));
  			b++;
  			show=a+String.valueOf(b);
  			yd.setText(show);
  
  			cost=view3.getText().toString();
  			a=cost.substring(0,2);
  			b0=Integer.parseInt(cost.substring(2));
  			b0=b0+4;
  			show=a+String.valueOf(b0);
  			view3.setText(show);
  			info.add("油碟(4)");
  			break;
  		case R.id.Byd:
  				temp=yd.getText().toString(); 
  				a=temp.substring(0,2);
  				b=Integer.parseInt(temp.substring(2));
  				if(b!=0)
  				{
  					b--;
  					show=a+String.valueOf(b);
  					yd.setText(show);
  					for (int i = 0; i < info.size(); i++) 
  					{ 
  						if (info.get(i).equals("油碟(4)")) 
  						{ 
  							info.remove(i); 
  							i--; 
  							break;
  						}	
  					}
	
		  		cost=view3.getText().toString();
		  		a=cost.substring(0,2);
		  		b0=Integer.parseInt(cost.substring(2));
		  		b0=b0-4;
		  		show=a+String.valueOf(b0);
		  		view3.setText(show);
		 
	    	  }

	   		  break;	   		  
			  case R.id.Button15:

			}
		}
	}
	

    
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                    Object mHelperUtils;
                    Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                    mExitTime = System.currentTimeMillis();

            } else {
            	MyApplication.getInstance().exit();
            }
            return true;
    }
    return super.onKeyDown(keyCode, event);
    }
    

}

