package com.example.synchronization_food;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class yakitoui  extends Activity{
	String information="";
	TextView view2,viewtop;
	EditText view1;
	String cost,yakitoui_cost,temp="0",Yakitoui="空",str,cardNumber="1号";
	long mExitTime;
	ArrayList<String> info=new ArrayList<String>();
	ArrayList<String> info1=new ArrayList<String>();
	Builder builder;
	Boolean flaghandin=false;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.yakitoui);
		flaghandin=false;
		
		Button bn4=(Button)findViewById(R.id.Button4);
		Button bn5=(Button)findViewById(R.id.Button5);
		Button bn6=(Button)findViewById(R.id.Button6);
		Button bn7=(Button)findViewById(R.id.Button7);
		Button bn9=(Button)findViewById(R.id.Button9 );
		Button bn10=(Button)findViewById(R.id.b10);
		Button bn14=(Button)findViewById(R.id.Button14);
		ImageButton bn15=(ImageButton)findViewById(R.id.Button15);
		
		bn4.setOnClickListener(new MyButton());
		bn5.setOnClickListener(new MyButton());
		bn6.setOnClickListener(new MyButton());
		bn7.setOnClickListener(new MyButton());
		bn9.setOnClickListener(new MyButton());
		bn10.setOnClickListener(new MyButton1());
		bn14.setOnClickListener(new MyButton());
		bn15.setOnClickListener(new MyButton());
		
		builder=new AlertDialog.Builder(this);
		view1=(EditText)findViewById(R.id.number);
		view2=(TextView)findViewById(R.id.TextView7);
		viewtop=(TextView)findViewById(R.id.TextView1);
		
		MyApplication.getInstance().addActivity(this);
		MyApplication.getInstance().showActivity();
		
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
		
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  temp=info.get(i);
			  String str=temp.substring(0, temp.indexOf("("));
			  if (str.equals("串串")) 
			  { 
				    str=temp.substring(temp.indexOf("(")+1,temp.indexOf(")"));	
					view1.setText(str);
					view2.setText("¥"+" "+str);
			  }
		  }
		
	}
	
    Handler handler=new Handler(){  
        public void handleMessage(Message msg) {  
            switch (msg.what) {  
            case SendDateToServer.SEND_SUCCESS:  
                Toast.makeText(yakitoui.this, "数据提交成功", Toast.LENGTH_SHORT).show();
                break;  
            case SendDateToServer.SEND_FAIL:  
                Toast.makeText(yakitoui.this, "数据提交失败，请重新尝试", Toast.LENGTH_SHORT).show();
                break;   
            }  
        };        
    }; 
	
	public void onActivityResult(int requestCode,int resultCode,Intent intent)
	{
		view2.setText("¥ 0");
		info = intent.getStringArrayListExtra("information1");
		info1.clear();
		for(int i=0;i<info.size();i++)
		{
			info1.add(info.get(i));
		}
		flaghandin=false;
		
		if(requestCode==0&&resultCode==1)   //碟子对串串的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.yakitoui"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.yakitoui");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.One"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.Staple_food"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.Drink"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.Plate"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.wine"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==4)   //主食对串串的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.yakitoui"))
			{
				MyApplication.getInstance().deleteActivity("com.examplesynchronization_.food.yakitoui");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.One"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.potdish"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.Drink"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.Plate"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.wine"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==3)   //饮料对串串的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.yakitoui"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.yakitoui");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.One"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.Staple_food"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.potdish"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.Plate"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.wine"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==2)   //酒对串串的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.yakitoui"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.yakitoui");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.One"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.Staple_food"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.Drink"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.Plate"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.potdish"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==6)   //盘子对串串的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.yakitoui"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.yakitoui");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.One"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.Staple_food"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.Drink"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.potdish"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.yakitoui").equals("com.example.synchronization_food.wine"))
				{
					yakitoui.this.setResult(5,intent);
					yakitoui.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  temp=info.get(i);
			  String str=temp.substring(0, temp.indexOf("("));
			  if (str.equals("串串")) 
			  { 
				    str=temp.substring(temp.indexOf("(")+1,temp.indexOf(")"));	
					view1.setText(str);
					view2.setText("¥"+" "+str);
			  }
		  }
	}
	
	class MyButton  implements View.OnClickListener
	{
		public void onClick(View source)
		{
			
			switch(source.getId())
			{

				case R.id.Button5:
		  			if(MyApplication.getInstance().isexistActivity("com.example.synchronization_food.wine"))
					  {
			  			Intent intent1=getIntent();
			  			intent1.putStringArrayListExtra("information", info);
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.yakitoui");
		  			  	data1.putString("package_aim","com.example.synchronization_food.wine");
			  			if(flaghandin)    //修改值
			  			{
			  				intent1.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent1.putStringArrayListExtra("information1", info1);
			  			}
			  			yakitoui.this.setResult(5,intent1);
		        		yakitoui.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(yakitoui.this,wine.class);
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
				case R.id.Button6:
					if(MyApplication.getInstance().isexistActivity("com.example.synchronization_food.Drink"))
					  {
			  			Intent intent1=getIntent();
			  			intent1.putStringArrayListExtra("information", info);
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.yakitoui");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Drink");
			  			if(flaghandin)    //修改值
			  			{
			  				intent1.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent1.putStringArrayListExtra("information1", info1);
			  			}
			  			yakitoui.this.setResult(5,intent1);
		        		yakitoui.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(yakitoui.this,Drink.class);
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
				case R.id.Button4:
					if(MyApplication.getInstance().isexistActivity("com.example.synchronization_food.potdish"))
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
		  			  	data1.putString("package_self","com.example.synchronization_food.yakitoui");
		  			  	data1.putString("package_aim","com.example.synchronization_food.potdish");
		  			  	intent1.putExtras(data1);
		        		yakitoui.this.setResult(5,intent1);
		        		yakitoui.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(yakitoui.this,potdish.class);
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
			  			Intent intent3=getIntent();
			  			if(flaghandin)    //修改值
			  			{
			  				intent3.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent3.putStringArrayListExtra("information1", info1);
			  			}
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.yakitoui");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Staple_food");
		  			  	intent3.putExtras(data1);
		        		yakitoui.this.setResult(5,intent3);
		        		yakitoui.this.finish();
					  }
					  else
					  {
			        	Intent intent3=new Intent(yakitoui.this,Staple_food.class);
			        	intent3.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			  			if(flaghandin)    //修改值
			  			{
			  				intent3.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent3.putStringArrayListExtra("information1", info1);
			  			}
			  			startActivityForResult(intent3,0); 
					  }
					break;
			 	case R.id.Button9:
					 if(MyApplication.getInstance().isexistActivity("com.example.synchronization_food.Plate"))
					  {
			  			Intent intent3=getIntent();
			  			if(flaghandin)    //修改值
			  			{
			  				intent3.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent3.putStringArrayListExtra("information1", info1);
			  			}
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.yakitoui");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Plate");
		  			  	intent3.putExtras(data1);
		        		yakitoui.this.setResult(5,intent3);
		        		yakitoui.this.finish();
					  }
					  else
					  {
			        	Intent intent3=new Intent(yakitoui.this,Plate.class);
			        	intent3.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			  			if(flaghandin)    //修改值
			  			{
			  				intent3.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent3.putStringArrayListExtra("information1", info1);
			  			}
			  			startActivityForResult(intent3,0); 
					  }
			 		break; 
			 	case R.id.Button14:
		 			builder.setTitle("用户你好！");
			 		builder.setMessage("点击确定将提交账单");
			 		builder.setPositiveButton("确定",new OnClickListener(){
			 			public void onClick(DialogInterface dialog,int which)
			 			{
			 				//暂时这么处理
			 				flaghandin=true;
			 				Yakitoui="空";
			 				String str;
			 				for(int i=0;i<info.size();i++)
			 				{
			 					temp=info.get(i);
			 					str=temp.substring(0,temp.indexOf("("));
			 					if(str.equals("串串"))
			 					{
			 						if(Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")))==0.0)
			 						{
			 							break;
			 						}
			 						else
			 						{
			 							Yakitoui=temp;
			 							break;
			 						}
			 					}
			 				}
			 			
			 				Log.d("Yakitoui",Yakitoui);
			 				new SendyakitouiToServer(handler).SendDataToServer(cardNumber,Yakitoui,"有客");
			 			
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
		  			data.putString("package_self","com.example.synchronization_food.yakitoui");
		  			data.putString("package_aim","com.example.synchronization_food.One");
		  			intent.putExtras(data);
		  			yakitoui.this.setResult(5,intent);
	        		yakitoui.this.finish(); 
			}
		}
	}
	
	 class MyButton1 implements View.OnClickListener
	 {
		 public void onClick(View source)
		 {
				switch(source.getId())
				{
			  		case R.id.b10:
			  		  String a;
			  		  a=view1.getText().toString();
			  		  view2.setText("¥"+" "+a);
			  		  for (int i = 0; i < info.size(); i++) 
					  { 
						  temp=info.get(i);
						  String str=temp.substring(0, temp.indexOf("("));
						  if (str.equals("串串")) 
						  { 
							    info.remove(i); 
							    i--; 
							    break;
						  }
					  }
						if(Double.parseDouble(a)==0)
						{
							break;
						}
						else
						{
							info.add("串串"+"("+a+")");
						}
					  InputMethodManager  manager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
					  manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);  
			  		  break;
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
	 public boolean onTouchEvent(android.view.MotionEvent event) {
		 InputMethodManager  manager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
		 if(event.getAction() == MotionEvent.ACTION_DOWN){  
		     if(getCurrentFocus()!=null && getCurrentFocus().getWindowToken()!=null){  
		       manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);  
		     }  
		  }  
		  return super.onTouchEvent(event); 
	 }
}
