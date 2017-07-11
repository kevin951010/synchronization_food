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

public class Plate extends Activity{
	String information="";
	TextView fp2,dtp2,view3,xtp2,hbp2,yl2,hs2,md2,viewtop;
	String show="1",Plate="空",cardNumber="1号";
	String temp;
	String a="1";
	int b=1;
	String cost;
	long mExitTime;
	ArrayList<String> info=new ArrayList<String>();
	ArrayList<String> info1=new ArrayList<String>();
	Boolean flaghandin=false;
	Builder builder;
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.plate);
		flaghandin=false;
		
		Button bn4=(Button)findViewById(R.id.Button4);
		Button bn5=(Button)findViewById(R.id.Button5);
		Button bn6=(Button)findViewById(R.id.Button6);
		Button bn8=(Button)findViewById(R.id.Button8 );
		Button bn7=(Button)findViewById(R.id.Button7 );
		Button bn14=(Button)findViewById(R.id.Button14);
		
		ImageButton bdtp=(ImageButton)findViewById(R.id.bdtp);
		ImageButton bdtp1=(ImageButton)findViewById(R.id.bdtp1);
		ImageButton bfp=(ImageButton)findViewById(R.id.bfp);
		ImageButton bfp1=(ImageButton)findViewById(R.id.bfp1);
		ImageButton bxtp=(ImageButton)findViewById(R.id.bxtp);
		ImageButton bxtp1=(ImageButton)findViewById(R.id.bxtp1);
		ImageButton bhbp=(ImageButton)findViewById(R.id.bhbp);
		ImageButton bhbp1=(ImageButton)findViewById(R.id.bhbp1);
		ImageButton byl=(ImageButton)findViewById(R.id.byl);
		ImageButton byl1=(ImageButton)findViewById(R.id.byl1);
		ImageButton bhs=(ImageButton)findViewById(R.id.bhs);
		ImageButton bhs1=(ImageButton)findViewById(R.id.bhs1);
		ImageButton bmd=(ImageButton)findViewById(R.id.bmd);
		ImageButton bmd1=(ImageButton)findViewById(R.id.bmd1);
		ImageButton bn15=(ImageButton)findViewById(R.id.Button15);

		bn4.setOnClickListener(new MyButton());
		bn5.setOnClickListener(new MyButton());
		bn6.setOnClickListener(new MyButton());
		bn8.setOnClickListener(new MyButton());
		bn7.setOnClickListener(new MyButton());
		bn14.setOnClickListener(new MyButton());
		bfp.setOnClickListener(new MyButton1());
		bfp1.setOnClickListener(new MyButton1());
		bdtp.setOnClickListener(new MyButton1());
		bdtp1.setOnClickListener(new MyButton1());
		bxtp.setOnClickListener(new MyButton1());
		bxtp1.setOnClickListener(new MyButton1());
		bhbp.setOnClickListener(new MyButton1());
		bhbp1.setOnClickListener(new MyButton1());
		byl.setOnClickListener(new MyButton1());
		byl1.setOnClickListener(new MyButton1());
		bmd.setOnClickListener(new MyButton1());
		bmd1.setOnClickListener(new MyButton1());
		bhs.setOnClickListener(new MyButton1());
		bhs1.setOnClickListener(new MyButton1());
		bn15.setOnClickListener(new MyButton());
		
		fp2=(TextView)findViewById(R.id.Tfp2);
		dtp2=(TextView)findViewById(R.id.Tdtp2);
		xtp2=(TextView)findViewById(R.id.Txtp2);
		view3=(TextView)findViewById(R.id.TextView7);
		hbp2=(TextView)findViewById(R.id.Thbp2);
		yl2=(TextView)findViewById(R.id.Tyl2);
		hs2=(TextView)findViewById(R.id.Ths2);
		md2=(TextView)findViewById(R.id.Tmd2);
		viewtop=(TextView)findViewById(R.id.TextView1);
		builder=new AlertDialog.Builder(this);
		
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
		
		temp=fp2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("方盘(12)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		fp2.setText(show);
		
		temp=dtp2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("大条盘(12)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		dtp2.setText(show);
		
		temp=xtp2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("小条盘(5)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		xtp2.setText(show);
		
		temp=hbp2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("花瓣盘(10)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		hbp2.setText(show);
		
		temp=yl2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("圆篮(5)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		yl2.setText(show);
		
		temp=hs2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("花生(5)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		hs2.setText(show);
		
		temp=md2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("毛豆(5)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		md2.setText(show);
			
		cost=view3.getText().toString();
		a=cost.substring(0,2);
		b=Integer.parseInt(cost.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("大条盘(12)")) 
			  { 
			    b=b+12;
			  }
			  if (info.get(i).equals("小条盘(5)")) 
			  { 
			    b=b+5;
			  }
			  if (info.get(i).equals("方盘(12)")) 
			  { 
			    b=b+12;
			  }
			  if (info.get(i).equals("圆篮(5)")) 
			  { 
			    b=b+5;
			  }
			  if (info.get(i).equals("花瓣盘(10)")) 
			  { 
			    b=b+10;
			  }
			  if (info.get(i).equals("花生(5)")) 
			  { 
			    b=b+5;
			  }
			  if (info.get(i).equals("毛豆(5)")) 
			  { 
			    b=b+5;
			  }
		  }
		show=a+String.valueOf(b);
		view3.setText(show);

	}
	
	public void onActivityResult(int requestCode,int resultCode,Intent intent)
	{
		fp2.setText("× 0");
		dtp2.setText("× 0");
		view3.setText("¥ 0");
		xtp2.setText("× 0");
		hbp2.setText("× 0");
		yl2.setText("× 0");
		hs2.setText("× 0");
		md2.setText("× 0");

		info = intent.getStringArrayListExtra("information1");
		info1.clear();
		for(int i=0;i<info.size();i++)
		{
			info1.add(info.get(i));
		}
		flaghandin=false;
		
		if(requestCode==0&&resultCode==1)   //碟子对盘子的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Plate"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Plate");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.One"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.Staple_food"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.wine"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.Drink"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.yakitoui"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
			}

			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==4)   //主食对盘子的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Plate"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Plate");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.One"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.potdish"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.wine"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.Drink"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.yakitoui"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==2)   //酒对盘子的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Plate"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Plate");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.One"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.potdish"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.Staple_food"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.Drink"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.yakitoui"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tat",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==5)   //串串对盘子的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Plate"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Plate");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.One"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.potdish"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.wine"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.Drink"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.Staple_food"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==3)   //饮料对盘子的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Plate"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Plate");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.One"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.potdish"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.Staple_food"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.wine"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Plate").equals("com.example.synchronization_food.yakitoui"))
				{
					Plate.this.setResult(6,intent);
					Plate.this.finish();
				}
			}

			MyApplication.getInstance().showActivity();
		}
		
		temp=fp2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("方盘(12)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		fp2.setText(show);
		
		temp=dtp2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("大条盘(12)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		dtp2.setText(show);
		
		temp=xtp2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("小条盘(5)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		xtp2.setText(show);
		
		temp=hbp2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("花瓣盘(10)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		hbp2.setText(show);
		
		temp=yl2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("圆篮(5)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		yl2.setText(show);
		
		temp=hs2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("花生(5)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		hs2.setText(show);
		
		temp=md2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("毛豆(5)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		md2.setText(show);
			
		cost=view3.getText().toString();
		a=cost.substring(0,2);
		b=Integer.parseInt(cost.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("大条盘(12)")) 
			  { 
			    b=b+12;
			  }
			  if (info.get(i).equals("小条盘(5)")) 
			  { 
			    b=b+5;
			  }
			  if (info.get(i).equals("方盘(12)")) 
			  { 
			    b=b+12;
			  }
			  if (info.get(i).equals("圆篮(5)")) 
			  { 
			    b=b+5;
			  }
			  if (info.get(i).equals("花瓣盘(10)")) 
			  { 
			    b=b+10;
			  }
			  if (info.get(i).equals("花生(5)")) 
			  { 
			    b=b+5;
			  }
			  if (info.get(i).equals("毛豆(5)")) 
			  { 
			    b=b+5;
			  }
		  }
		show=a+String.valueOf(b);
		view3.setText(show);
		
	}
	
    Handler handler=new Handler(){  
        public void handleMessage(Message msg) {  
            switch (msg.what) {  
            case SendDateToServer.SEND_SUCCESS:  
                Toast.makeText(Plate.this, "数据提交成功", Toast.LENGTH_SHORT).show();
                break;  
            case SendDateToServer.SEND_FAIL:  
                Toast.makeText(Plate.this, "数据提交失败，请重新尝试", Toast.LENGTH_SHORT).show();
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
		 		case R.id.Button14:
				    builder.setTitle("用户你好！");
			 		builder.setMessage("点击确定将提交账单");
			 		builder.setPositiveButton("确定",new OnClickListener(){
			 			public void onClick(DialogInterface dialog,int which)
			 			{
			 				//暂时这么处理
			 				flaghandin=true;
			 				int plate[]={0,0,0,0,0,0,0};
			 				int platekey[]={1,1,1,1,1,1,1};
			 				Plate="空";
			 				String str;
			 				for(int i=0;i<info.size();i++)
			 				{
			 					temp=info.get(i);
			 					str=temp.substring(0,temp.indexOf("("));
			 					if(str.equals("方盘"))
			 					{
			 						plate[0]++;
			 					    continue;
			 					}
			 					if(str.equals("大条盘"))
			 					{
			 						plate[1]++;
			 					    continue;
			 					}
			 					if(str.equals("小条盘"))
			 					{
			 						plate[2]++;
			 					    continue;
			 					}
			 					if(str.equals("花瓣盘"))
			 					{
			 						plate[3]++;
			 					    continue;
			 					}
			 					if(str.equals("圆篮"))
			 					{
			 						plate[4]++;
			 					    continue;
			 					}
			 					if(str.equals("花生"))
			 					{
			 						plate[5]++;
			 					    continue;
			 					}
			 					if(str.equals("毛豆"))
			 					{
			 						plate[6]++;
			 					    continue;
			 					}
			 				}
			 				
			 				for(int i=0;i<info.size();i++)
			 				{
			 					temp=info.get(i);
			 					str=temp.substring(0,temp.indexOf("("));
			 					if((str.equals("方盘"))&&(platekey[0]==1))
			 					{
			 					    platekey[0]=0;
			 					    if(Plate.equals("空"))
			 					    {
			 					       Plate=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[0])+")";
			 					    }
			 					    else
			 					    {
			 					       Plate=Plate+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[0])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("大条盘"))&&(platekey[1]==1))
			 					{
			 						platekey[1]=0;
			 					    if(Plate.equals("空"))
			 					    {
			 					       Plate=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[1])+")";
			 					    }
			 					    else
			 					    {
			 					       Plate=Plate+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[1])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("小条盘"))&&(platekey[2]==1))
			 					{
			 						platekey[2]=0;
			 					    if(Plate.equals("空"))
			 					    {
			 					       Plate=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[2])+")";
			 					    }
			 					    else
			 					    {
			 					       Plate=Plate+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[2])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("花瓣盘"))&&(platekey[3]==1))
			 					{
			 						platekey[3]=0;
			 					    if(Plate.equals("空"))
			 					    {
			 					       Plate=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[3])+")";
			 					    }
			 					    else
			 					    {
			 					       Plate=Plate+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[3])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("圆篮"))&&(platekey[4]==1))
			 					{
			 						platekey[4]=0;
			 					    if(Plate.equals("空"))
			 					    {
			 					       Plate=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[4])+")";
			 					    }
			 					    else
			 					    {
			 					       Plate=Plate+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[4])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("花生"))&&(platekey[5]==1))
			 					{
			 						platekey[5]=0;
			 					    if(Plate.equals("空"))
			 					    {
			 					       Plate=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[5])+")";
			 					    }
			 					    else
			 					    {
			 					       Plate=Plate+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[5])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("毛豆"))&&(platekey[6]==1))
			 					{
			 						platekey[6]=0;
			 					    if(Plate.equals("空"))
			 					    {
			 					       Plate=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[6])+")";
			 					    }
			 					    else
			 					    {
			 					       Plate=Plate+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(plate[6])+")";
			 					    }
			 					    continue;
			 					}
			 				}
			 				
			 				Log.d("Plate",Plate);
			 				Log.d("show",show);
			 				new SendplateToServer(handler).SendDataToServer(cardNumber,Plate,show);
			 			
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
		  			  	data1.putString("package_self","com.example.synchronization_food.Plate");
		  			  	data1.putString("package_aim","com.example.synchronization_food.potdish");
		  			  	intent1.putExtras(data1);
		        		Plate.this.setResult(6,intent1);
		        		Plate.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(Plate.this,potdish.class);
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
		  			  	data1.putString("package_self","com.example.synchronization_food.Plate");
		  			  	data1.putString("package_aim","com.example.synchronization_food.wine");
		  			  	intent1.putExtras(data1);
		        		Plate.this.setResult(6,intent1);
		        		Plate.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(Plate.this,wine.class);
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
			  			if(flaghandin)    //修改值
			  			{
			  				intent1.putStringArrayListExtra("information1", info);
			  			}
			  			else
			  			{
			  				intent1.putStringArrayListExtra("information1", info1);
			  			}
			  			Bundle data1=new Bundle();
		  			  	data1.putString("package_self","com.example.synchronization_food.Plate");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Drink");
		  			  	intent1.putExtras(data1);
		        		Plate.this.setResult(6,intent1);
		        		Plate.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(Plate.this,Drink.class);
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
		  			  	data1.putString("package_self","com.example.synchronization_food.Plate");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Staple_food");
		  			  	intent1.putExtras(data1);
		        		Plate.this.setResult(6,intent1);
		        		Plate.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(Plate.this,Staple_food.class);
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
		  			  	data1.putString("package_self","com.example.synchronization_food.Plate");
		  			  	data1.putString("package_aim","com.example.synchronization_food.yakitoui");
		  			  	intent1.putExtras(data1);
		        		Plate.this.setResult(6,intent1);
		        		Plate.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(Plate.this,yakitoui.class);
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
		  				intent.putStringArrayListExtra("information1", info);
		  			}
		  			else
		  			{
		  				intent.putStringArrayListExtra("information1", info1);
		  			}
		  			Bundle data=new Bundle();
		  			data.putString("package_self","com.example.synchronization_food.Plate");
		  			data.putString("package_aim","com.example.synchronization_food.One");
		  			intent.putExtras(data);
		  			Plate.this.setResult(6,intent);
	        		Plate.this.finish(); 
			 		break;
			}
		}
	}
	
	class MyButton1 implements View.OnClickListener
	{
		public void onClick(View source)
		{
			
			switch(source.getId())
			{
			  case R.id.bfp1:      //加号的处理
				  temp=fp2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  fp2.setText(show);
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+12;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("方盘(12)");
				  break;
			  case R.id.bdtp:
				  temp=dtp2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  dtp2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("大条盘(12)")) 
						  { 
						    info.remove(i); 
						    i--;   
						    break;
						  }
					  }
					  
					  for(int i = 0; i < info.size(); i++)
					  {
						  Log.d("info_wine_Button12",info.get(i));
					  }
					  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-12;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bdtp1:
				  temp=dtp2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  dtp2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+12;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("大条盘(12)");
				  break;
			  case R.id.bfp:
				  temp=fp2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  fp2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("方盘(12)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }
					  
					  for(int i = 0; i < info.size(); i++)
					  {
						  Log.d("info_wine_Button10",info.get(i));
					  }
					  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-12;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
	              break;
			  case R.id.bxtp:
				  temp=xtp2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  xtp2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("小条盘(5)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }
					  
					  for(int i = 0; i < info.size(); i++)
					  {
						  Log.d("info_wine_Button10",info.get(i));
					  }
					  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-5;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bxtp1:
				  temp=xtp2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  xtp2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+5;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("小条盘(5)");
				  break;
			  case R.id.bhbp:
				  temp=hbp2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  hbp2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("花瓣盘(10)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }
					  
					  for(int i = 0; i < info.size(); i++)
					  {
						  Log.d("info_wine_Button10",info.get(i));
					  }
					  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-10;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bhbp1:
				  temp=hbp2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  hbp2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+10;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("花瓣盘(10)");
				  break;
			  case R.id.byl:
				  temp=yl2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  yl2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("圆篮(5)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }
					  
					  for(int i = 0; i < info.size(); i++)
					  {
						  Log.d("info_wine_Button10",info.get(i));
					  }
					  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-5;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.byl1:
				  temp=yl2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  yl2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+5;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("圆篮(5)");
				  break;
			  case R.id.bhs:
				  temp=hs2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  hs2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("花生(5)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }
					  
					  for(int i = 0; i < info.size(); i++)
					  {
						  Log.d("info_wine_Button10",info.get(i));
					  }
					  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-5;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bhs1:
				  temp=hs2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  hs2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+5;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("花生(5)");
				  break;
			  case R.id.bmd:
				  temp=md2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  md2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("毛豆(5)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }
					  
					  for(int i = 0; i < info.size(); i++)
					  {
						  Log.d("info_wine_Button10",info.get(i));
					  }
					  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-5;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bmd1:
				  temp=md2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  md2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+5;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("毛豆(5)");
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
