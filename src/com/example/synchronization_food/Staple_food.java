package com.example.synchronization_food;

import java.util.ArrayList;

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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Staple_food extends Activity{
	String information="";
	TextView view1,view2,view3,Tyeg2,Tbmf2,viewtop;
	String show="1",Staple="空",cardNumber="1号";
	String temp;
	String a="1";
	int b=1;
	String cost;
	
	ArrayList<String> info=new ArrayList<String>();
	ArrayList<String> info1=new ArrayList<String>();
	Boolean flaghandin=false;
	Builder builder;
	long mExitTime;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.staple);
		Button bn4=(Button)findViewById(R.id.Button4);
		Button bn5=(Button)findViewById(R.id.Button5);
		Button bn6=(Button)findViewById(R.id.Button6);
		Button bn8=(Button)findViewById(R.id.Button8 );
		Button bn9=(Button)findViewById(R.id.Button9 );
		Button bn14=(Button)findViewById(R.id.Button14 );
		
		ImageButton bn10=(ImageButton)findViewById(R.id.Button10);
		ImageButton bn11=(ImageButton)findViewById(R.id.Button11);
		ImageButton bn12=(ImageButton)findViewById(R.id.Button12);
		ImageButton bn13=(ImageButton)findViewById(R.id.Button13);
		ImageButton bnyeg=(ImageButton)findViewById(R.id.Byeg);
		ImageButton bnyeg1=(ImageButton)findViewById(R.id.Byeg1);
		ImageButton bnbmf=(ImageButton)findViewById(R.id.Bbmf);
		ImageButton bnbmf1=(ImageButton)findViewById(R.id.Bbmf1);
		ImageButton bn15=(ImageButton)findViewById(R.id.Button15);
		
		bn4.setOnClickListener(new MyButton());
		bn5.setOnClickListener(new MyButton());
		bn6.setOnClickListener(new MyButton());
		bn8.setOnClickListener(new MyButton());
		bn9.setOnClickListener(new MyButton());
		bn15.setOnClickListener(new MyButton());
		bn14.setOnClickListener(new MyButton());
		bn10.setOnClickListener(new MyButton1());
		bn11.setOnClickListener(new MyButton1());
		bn12.setOnClickListener(new MyButton1());
		bn13.setOnClickListener(new MyButton1());
		bnyeg.setOnClickListener(new MyButton1());
		bnyeg1.setOnClickListener(new MyButton1());
		bnbmf.setOnClickListener(new MyButton1());
		bnbmf1.setOnClickListener(new MyButton1());
		
		view1=(TextView)findViewById(R.id.TextView3);
		view2=(TextView)findViewById(R.id.TextView6);
		view3=(TextView)findViewById(R.id.TextView7);
		Tyeg2=(TextView)findViewById(R.id.Tyeg2);
		Tbmf2=(TextView)findViewById(R.id.Tbmf2);
		viewtop=(TextView)findViewById(R.id.TextView1);
		
		MyApplication.getInstance().addActivity(this);
		MyApplication.getInstance().showActivity();
		
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
		
		temp=view1.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("蛋炒饭(4)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		view1.setText(show);
		
		temp=view2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("黑米粥(4)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		view2.setText(show);
		
		temp=Tyeg2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("银耳羹(4)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		Tyeg2.setText(show);
		
		temp=Tbmf2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("白米饭(2)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		Tbmf2.setText(show);
		
		
		cost=view3.getText().toString();
		a=cost.substring(0,2);
		b=Integer.parseInt(cost.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("蛋炒饭(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("黑米粥(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("银耳羹(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("白米饭(2)")) 
			  { 
			    b=b+2;
			  }
		  }
		show=a+String.valueOf(b);
		view3.setText(show); 
	}
	
    Handler handler=new Handler(){  
        public void handleMessage(Message msg) {  
            switch (msg.what) {  
            case SendDateToServer.SEND_SUCCESS:  
                Toast.makeText(Staple_food.this, "数据提交成功", Toast.LENGTH_SHORT).show();
                break;  
            case SendDateToServer.SEND_FAIL:  
                Toast.makeText(Staple_food.this, "数据提交失败，请重新尝试", Toast.LENGTH_SHORT).show();
                break;   
            }  
        };        
    }; 
	
	public void onActivityResult(int requestCode,int resultCode,Intent intent)
	{
		view1.setText("× 0");
		view2.setText("× 0");
		view3.setText("¥ 0");
		Tyeg2.setText("× 0");
		Tbmf2.setText("× 0");
		info = intent.getStringArrayListExtra("information1");
		info1.clear();
		for(int i=0;i<info.size();i++)
		{
			info1.add(info.get(i));
		}
		flaghandin=false;
		
		if(requestCode==0&&resultCode==1)   //碟子对主食的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Staple_food"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Staple_food");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.One"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.wine"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.Drink"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.Plate"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.yakitoui"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==2)   //酒对主食的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Staple_food"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Staple_food");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.One"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.potdish"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.Drink"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.Plate"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.yakitoui"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==3)   //饮料对主食的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Staple_food"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Staple_food");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.One"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.potdish"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.wine"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.Plate"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.yakitoui"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tat",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==5)   //串串对主食的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Staple_food"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Staple_food");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.One"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.potdish"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.wine"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.Drink"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.Plate"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tat",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==6)   //盘子对主食的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Staple_food"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Staple_food");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.One"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.potdish"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.wine"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.Drink"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Staple_food").equals("com.example.synchronization_food.yakitoui"))
				{
					Staple_food.this.setResult(4,intent);
					Staple_food.this.finish();
				}
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tat",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
		}
		
		temp=view1.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("蛋炒饭(4)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		view1.setText(show);
		
		temp=view2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("黑米粥(4)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		view2.setText(show);
		
		temp=Tyeg2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("银耳羹(4)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		Tyeg2.setText(show);
		
		temp=Tbmf2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("白米饭(2)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		Tbmf2.setText(show);
		
		
		cost=view3.getText().toString();
		a=cost.substring(0,2);
		b=Integer.parseInt(cost.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("蛋炒饭(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("黑米粥(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("银耳羹(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("白米饭(2)")) 
			  { 
			    b=b+2;
			  }
		  }
		show=a+String.valueOf(b);
		view3.setText(show); 
		
	}
	
	class MyButton implements View.OnClickListener
	{
		public void onClick(View source)
		{
			
			switch(source.getId())
			{
		 		case R.id.Button14:
		 			builder.setTitle("用户你好！");
			 		builder.setMessage("点击确定将提交账单");
			 		builder.setPositiveButton("确定",new OnClickListener(){
			 			public void onClick(DialogInterface dialog,int which)
			 			{
			 				//暂时这么处理
			 				flaghandin=true;
			 				int staplefood[]={0,0,0,0};
			 				int staplefoodkey[]={1,1,1,1};
			 				Staple="空";
			 				String str;
			 				for(int i=0;i<info.size();i++)
			 				{
			 					temp=info.get(i);
			 					str=temp.substring(0,temp.indexOf("("));
			 					if(str.equals("蛋炒饭"))
			 					{
			 						staplefood[0]++;
			 					    continue;
			 		 			}
			 					if(str.equals("黑米粥"))
			 					{
			 						staplefood[1]++;
			 					    continue;
			 					}
			 					if(str.equals("银耳羹"))
			 					{
			 						staplefood[2]++;
			 					    continue;
			 					}
			 					if(str.equals("白米饭"))
			 					{
			 						staplefood[3]++;
			 					    continue;
			 					}
			 				}
			 				
			 				for(int i=0;i<info.size();i++)
			 				{
			 					temp=info.get(i);
			 					str=temp.substring(0,temp.indexOf("("));
			 					if((str.equals("蛋炒饭"))&&(staplefoodkey[0]==1))
			 					{
			 						staplefoodkey[0]=0;
			 					    if(Staple.equals("空"))
			 					    {
			 					       Staple=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(staplefood[0])+")";
			 					    }
			 					    else
			 					    {
			 					       Staple=Staple+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(staplefood[0])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("黑米粥"))&&(staplefoodkey[1]==1))
			 					{
			 						staplefoodkey[1]=0;
			 					    if(Staple.equals("空"))
			 					    {
			 					       Staple=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(staplefood[1])+")";
			 					    }
			 					    else
			 					    {
			 					       Staple=Staple+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(staplefood[1])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("银耳羹"))&&(staplefoodkey[2]==1))
			 					{
			 						staplefoodkey[2]=0;
			 					    if(Staple.equals("空"))
			 					    {
			 					       Staple=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(staplefood[2])+")";
			 					    }
			 					    else
			 					    {
			 					       Staple=Staple+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(staplefood[2])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("白米饭"))&&(staplefoodkey[3]==1))
			 					{
			 						staplefoodkey[3]=0;
			 					    if(Staple.equals("空"))
			 					    {
			 					       Staple=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(staplefood[3])+")";
			 					    }
			 					    else
			 					    {
			 					       Staple=Staple+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(staplefood[3])+")";
			 					    }
			 					    continue;
			 					}
			 				}
			 				
			 				Log.d("Staple",Staple);
			 				Log.d("show",show);
			 				new SendstapleToServer(handler).SendDataToServer(cardNumber,Staple,show);
			 			
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
	  			  	data1.putString("package_self","com.example.synchronization_food.Staple_food");
	  			  	data1.putString("package_aim","com.example.synchronization_food.potdish");
	  			  	intent1.putExtras(data1);
	        		Staple_food.this.setResult(4,intent1);
	        		Staple_food.this.finish();
				  }
				  else
				  {
		        	Intent intent1=new Intent(Staple_food.this,potdish.class);
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
				case R.id.Button5:
					  if(MyApplication.getInstance().isexistActivity("com.example.synchronization_food.wine"))
					  {
			  			Intent intent2=getIntent();
			  			if(flaghandin)    //修改值
			  			{
			  				intent2.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent2.putStringArrayListExtra("information1", info1);
			  			}
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.Staple_food");
		  			  	data1.putString("package_aim","com.example.synchronization_food.wine");
		  			  	intent2.putExtras(data1);
		        		Staple_food.this.setResult(4,intent2);
		        		Staple_food.this.finish();
					  }
					  else
					  {
			        	Intent intent2=new Intent(Staple_food.this,wine.class);
			        	intent2.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			  			if(flaghandin)    //修改值
			  			{
			  				intent2.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent2.putStringArrayListExtra("information1", info1);
			  			}
			  			startActivityForResult(intent2,0); 
					  }
					break;
				case R.id.Button6:
					  if(MyApplication.getInstance().isexistActivity("com.example.synchronization_food.Drink"))
					  {
			  			Intent intent2=getIntent();
			  			if(flaghandin)    //修改值
			  			{
			  				intent2.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent2.putStringArrayListExtra("information1", info1);
			  			}
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.Staple_food");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Drink");
		  			  	intent2.putExtras(data1);
		        		Staple_food.this.setResult(4,intent2);
		        		Staple_food.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(Staple_food.this,Drink.class);
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
			  			Intent intent2=getIntent();
			  			if(flaghandin)    //修改值
			  			{
			  				intent2.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent2.putStringArrayListExtra("information1", info1);
			  			}
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.Staple_food");
		  			  	data1.putString("package_aim","com.example.synchronization_food.yakitoui");
		  			  	intent2.putExtras(data1);
		        		Staple_food.this.setResult(4,intent2);
		        		Staple_food.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(Staple_food.this,yakitoui.class);
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
			  			Intent intent2=getIntent();
			  			if(flaghandin)    //修改值
			  			{
			  				intent2.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent2.putStringArrayListExtra("information1", info1);
			  			}
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.Staple_food");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Plate");
		  			  	intent2.putExtras(data1);
		        		Staple_food.this.setResult(4,intent2);
		        		Staple_food.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(Staple_food.this,Plate.class);
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
		  			data.putString("package_self","com.example.synchronization_food.Staple_food");
		  			data.putString("package_aim","com.example.synchronization_food.One");
		  			intent.putExtras(data);
		  			Staple_food.this.setResult(4,intent);
	        		Staple_food.this.finish(); 
			 		
			}
		}
	}
	
	class MyButton1 implements View.OnClickListener
	{
		public void onClick(View source)
		{
			
			switch(source.getId())
			{
			  case R.id.Button10:  //减号处理
				  temp=view1.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  view1.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("蛋炒饭(4)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }
					  
					  for(int i = 0; i < info.size(); i++)
					  {
						  Log.d("info_small_Button10",info.get(i));
					  }
					  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-4;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
	              break; 
			
			case R.id.Button11:      //加号的处理  
				  temp=view1.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  view1.setText(show);
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+4;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("蛋炒饭(4)");
				  break;
			  case R.id.Button12:
				  temp=view2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  view2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("黑米粥(4)")) 
						  { 
						    info.remove(i); 
						    i--;   
						    break;
						  }
					  }
					  
					  for(int i = 0; i < info.size(); i++)
					  {
						  Log.d("info_small_Button12",info.get(i));
					  }
					  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-4;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.Button13:
				  temp=view2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  view2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+4;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("黑米粥(4)");
				  break;
				  
			  case R.id.Byeg:
				  temp=Tyeg2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  Tyeg2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("银耳羹(4)")) 
						  { 
						    info.remove(i); 
						    i--;   
						    break;
						  }
					  }
					  
					  for(int i = 0; i < info.size(); i++)
					  {
						  Log.d("info_small_Byeg",info.get(i));
					  }
					  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-4;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.Byeg1:
				  temp=Tyeg2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  Tyeg2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+4;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("银耳羹(4)");
				  break;
				  
				  
			  case R.id.Bbmf:
				  temp=Tbmf2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  Tbmf2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("白米饭(2)")) 
						  { 
						    info.remove(i); 
						    i--;   
						    break;
						  }
					  }
					  
					  for(int i = 0; i < info.size(); i++)
					  {
						  Log.d("info_small_Bbmf",info.get(i));
					  }
					  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-2;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.Bbmf1:
				  temp=Tbmf2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  Tbmf2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+2;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("白米饭(2)");
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
}