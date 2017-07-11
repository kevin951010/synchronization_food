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

public class wine extends Activity{
	String information="";
	TextView view1,view2,view3,bc2,xmw2,hj2,wz2,jj2,egt2,bw2,jxb2,viewtop;
	String show="1",Wine="空",cardNumber="1号";
	String temp;
	String a="1";
	int b=1;
	String cost;
	long mExitTime;
	ArrayList<String> info=new ArrayList<String>();
	ArrayList<String> info1=new ArrayList<String>();
	Builder builder;
	Boolean flaghandin=false;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.wine);
		
		Boolean flaghandin=false;
		Button bn4=(Button)findViewById(R.id.Button4);
		Button bn6=(Button)findViewById(R.id.Button6);
		Button bn7=(Button)findViewById(R.id.Button7);
		Button bn8=(Button)findViewById(R.id.Button8 );
		Button bn9=(Button)findViewById(R.id.Button9 );
		Button bn14=(Button)findViewById(R.id.Button14);
		
		ImageButton bn10=(ImageButton)findViewById(R.id.Bcs);
		ImageButton bn11=(ImageButton)findViewById(R.id.Bcs1);
		ImageButton bn12=(ImageButton)findViewById(R.id.Byc);
		ImageButton bn13=(ImageButton)findViewById(R.id.Byc1);
		ImageButton bbc=(ImageButton)findViewById(R.id.Bbc);
		ImageButton bbc1=(ImageButton)findViewById(R.id.Bbc1);
		ImageButton bxmw=(ImageButton)findViewById(R.id.Bxmw);
		ImageButton bxmw1=(ImageButton)findViewById(R.id.Bxmw1);
		ImageButton bhj=(ImageButton)findViewById(R.id.Bhj);
		ImageButton bhj1=(ImageButton)findViewById(R.id.Bhj1);
		ImageButton bwz=(ImageButton)findViewById(R.id.Bwz);
		ImageButton bwz1=(ImageButton)findViewById(R.id.Bwz1);
		ImageButton bjj=(ImageButton)findViewById(R.id.Bjj);
		ImageButton bjj1=(ImageButton)findViewById(R.id.Bjj1);
		ImageButton begt=(ImageButton)findViewById(R.id.Begt);
		ImageButton begt1=(ImageButton)findViewById(R.id.Begt1);
		ImageButton bbw=(ImageButton)findViewById(R.id.Bbw);
		ImageButton bbw1=(ImageButton)findViewById(R.id.Bbw1);
		ImageButton bjxb=(ImageButton)findViewById(R.id.Bjxb);
		ImageButton bjxb1=(ImageButton)findViewById(R.id.Bjxb1);
		ImageButton bn15=(ImageButton)findViewById(R.id.Button15);
		
		bn4.setOnClickListener(new MyButton());
		bn6.setOnClickListener(new MyButton());
		bn7.setOnClickListener(new MyButton());
		bn8.setOnClickListener(new MyButton());
		bn9.setOnClickListener(new MyButton());
		bn14.setOnClickListener(new MyButton());
		bn15.setOnClickListener(new MyButton());
		bn11.setOnClickListener(new MyButton1());
		bn12.setOnClickListener(new MyButton1());
		bn13.setOnClickListener(new MyButton1());
		bn10.setOnClickListener(new MyButton1());
		bbc.setOnClickListener(new MyButton1());
		bbc1.setOnClickListener(new MyButton1());
		bxmw.setOnClickListener(new MyButton1());
		bxmw1.setOnClickListener(new MyButton1());	
		bhj.setOnClickListener(new MyButton1());
		bhj1.setOnClickListener(new MyButton1());
		bwz.setOnClickListener(new MyButton1());
		bwz1.setOnClickListener(new MyButton1());
		bjj.setOnClickListener(new MyButton1());
		bjj1.setOnClickListener(new MyButton1());
		begt.setOnClickListener(new MyButton1());
		begt1.setOnClickListener(new MyButton1());
		bbw.setOnClickListener(new MyButton1());
		bbw1.setOnClickListener(new MyButton1());
		bjxb.setOnClickListener(new MyButton1());
		bjxb1.setOnClickListener(new MyButton1());
		
		view1=(TextView)findViewById(R.id.Tcs1);
		view2=(TextView)findViewById(R.id.Tyc2);
		view3=(TextView)findViewById(R.id.TextView7);
		bc2=(TextView)findViewById(R.id.Tbc2);
		xmw2=(TextView)findViewById(R.id.Txmw2);
		hj2=(TextView)findViewById(R.id.Thj2);
		wz2=(TextView)findViewById(R.id.Twz2);
		jj2=(TextView)findViewById(R.id.Tjj2);
		egt2=(TextView)findViewById(R.id.Tegt2);
		bw2=(TextView)findViewById(R.id.Tbw2);
		jxb2=(TextView)findViewById(R.id.Tjxb2);
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
		
		temp=view1.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("纯生(12)")) 
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
			  if (info.get(i).equals("勇闯(8)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		view2.setText(show);
		
		temp=bc2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("哈尔滨冰纯(8)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		bc2.setText(show);
		
		temp=xmw2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("小麦王(12)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		xmw2.setText(show);
		
		temp=hj2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("满山跑(4)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		hj2.setText(show);
		
		temp=wz2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("歪嘴(18)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		wz2.setText(show);
		
		temp=jj2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("劲酒(15)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		jj2.setText(show);
		
		temp=egt2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("二锅头(8)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		egt2.setText(show);
		
		temp=bw2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("百威(12)")) 
			  { 
			      b++;
			  }
		  }
		show=a+String.valueOf(b);
		bw2.setText(show);
		
		temp=jxb2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("江小白(18)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		jxb2.setText(show);
		
		cost=view3.getText().toString();
		a=cost.substring(0,2);
		b=Integer.parseInt(cost.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("纯生(12)")) 
			  { 
			    b=b+12;
			  }
			  if (info.get(i).equals("勇闯(8)")) 
			  { 
			    b=b+8;
			  }
			  if (info.get(i).equals("哈尔滨冰纯(8)")) 
			  { 
			    b=b+8;
			  }
			  if (info.get(i).equals("小麦王(12)")) 
			  { 
			    b=b+12;
			  }
			  if (info.get(i).equals("满山跑(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("歪嘴(18)")) 
			  { 
			    b=b+18;
			  }
			  if (info.get(i).equals("劲酒(15)")) 
			  { 
			    b=b+15;
			  }
			  if (info.get(i).equals("二锅头(8)")) 
			  { 
			    b=b+8;
			  }
			  if (info.get(i).equals("百威(12)")) 
			  { 
			    b=b+12;
			  }
			  if (info.get(i).equals("江小白(18)")) 
			  { 
			    b=b+18;
			  }
		  }
		show=a+String.valueOf(b);
		view3.setText(show); 
		
	}
	
    Handler handler=new Handler(){  
        public void handleMessage(Message msg) {  
            switch (msg.what) {  
            case SendDateToServer.SEND_SUCCESS:  
                Toast.makeText(wine.this, "数据提交成功", Toast.LENGTH_SHORT).show();
                break;  
            case SendDateToServer.SEND_FAIL:  
                Toast.makeText(wine.this, "数据提交失败，请重新尝试", Toast.LENGTH_SHORT).show();
                break;   
            }  
        };        
    }; 
	
	public void onActivityResult(int requestCode,int resultCode,Intent intent)
	{
		view1.setText("× 0");
		view2.setText("× 0");
		bc2.setText("× 0");
		xmw2.setText("× 0");
		hj2.setText("× 0");
		wz2.setText("× 0");
		jj2.setText("× 0");
		egt2.setText("× 0");
		bw2.setText("× 0");
		jxb2.setText("× 0"); 
		view3.setText("¥ 0");
		info = intent.getStringArrayListExtra("information1");
		info1.clear();
		for(int i=0;i<info.size();i++)
		{
			info1.add(info.get(i));
		}
		flaghandin=false;
		
		if(requestCode==0&&resultCode==1)   //碟子对酒的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.wine"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.wine");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.One"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.Staple_food"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.Drink"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.Plate"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.yakitoui"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
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
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.wine"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.wine");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.One"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.Staple_food"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.potdish"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.Plate"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.yakitoui"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
			}

			MyApplication.getInstance().showActivity();
		}
		
		if(requestCode==0&&resultCode==4)   //碟子对酒的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.wine"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.wine");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.One"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.Drink"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.potdish"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.Plate"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.yakitoui"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
			}

			MyApplication.getInstance().showActivity();
		}
		
		if(requestCode==0&&resultCode==5)   //碟子对酒的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.wine"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.wine");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.One"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.Drink"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.potdish"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.Plate"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.Staple_food"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
			}

			MyApplication.getInstance().showActivity();
		}
		
		if(requestCode==0&&resultCode==6)   //盘子对酒的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.wine"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.wine");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.One"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.Staple_food"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.potdish"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.Drink"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.wine").equals("com.example.synchronization_food.yakitoui"))
				{
					wine.this.setResult(2,intent);
					wine.this.finish();
				}
			}

			MyApplication.getInstance().showActivity();
		}
		
		temp=view1.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("纯生(12)")) 
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
			  if (info.get(i).equals("勇闯(8)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		view2.setText(show);
		
		temp=bc2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("哈尔滨冰纯(8)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		bc2.setText(show);
		
		temp=xmw2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("小麦王(12)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		xmw2.setText(show);
		
		temp=hj2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("满山跑(4)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		hj2.setText(show);
		
		temp=wz2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("歪嘴(18)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		wz2.setText(show);
		
		temp=jj2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("劲酒(15)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		jj2.setText(show);
		
		temp=egt2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("二锅头(8)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		egt2.setText(show);
		
		temp=bw2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("百威(12)")) 
			  { 
			      b++;
			  }
		  }
		show=a+String.valueOf(b);
		bw2.setText(show);
		
		temp=jxb2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("江小白(18)")) 
			  { 
				  b++;
			  }
		  }
		show=a+String.valueOf(b);
		jxb2.setText(show);
		
		cost=view3.getText().toString();
		a=cost.substring(0,2);
		b=Integer.parseInt(cost.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("纯生(12)")) 
			  { 
			    b=b+12;
			  }
			  if (info.get(i).equals("勇闯(8)")) 
			  { 
			    b=b+8;
			  }
			  if (info.get(i).equals("哈尔滨冰纯(8)")) 
			  { 
			    b=b+8;
			  }
			  if (info.get(i).equals("小麦王(12)")) 
			  { 
			    b=b+12;
			  }
			  if (info.get(i).equals("满山跑(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("歪嘴(18)")) 
			  { 
			    b=b+18;
			  }
			  if (info.get(i).equals("劲酒(15)")) 
			  { 
			    b=b+15;
			  }
			  if (info.get(i).equals("二锅头(8)")) 
			  { 
			    b=b+8;
			  }
			  if (info.get(i).equals("百威(12)")) 
			  { 
			    b=b+12;
			  }
			  if (info.get(i).equals("江小白(18)")) 
			  { 
			    b=b+18;
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
			 				//暂时这么处理
			 				for(int i=0;i<info.size();i++)
			 				{
			 					Log.d("info",info.get(i));
			 				}
			 				
			 				int wine[]={0,0,0,0,0,0,0,0,0,0};
			 				int winekey[]={1,1,1,1,1,1,1,1,1,1};
			 				Wine="空";
			 				String str;
			 				for(int i=0;i<info.size();i++)
			 				{
			 					temp=info.get(i);
			 					str=temp.substring(0,temp.indexOf("("));
			 					if(str.equals("纯生"))
			 					{
			 						wine[0]++;
			 					    continue;
			 					}
			 					if(str.equals("勇闯"))
			 					{
			 						wine[1]++;
			 					    continue;
			 					}
			 					if(str.equals("哈尔滨冰纯"))
			 					{
			 						wine[2]++;
			 					    continue;
			 					}
			 					if(str.equals("小麦王"))
			 					{
			 						wine[3]++;
			 					    continue;
			 					}
			 					if(str.equals("满山跑"))
			 					{
			 						wine[4]++;
			 					    continue;
			 					}
			 					if(str.equals("歪嘴"))
			 					{
			 						wine[5]++;
			 					    continue;
			 					}
			 					if(str.equals("劲酒"))
			 					{
			 						wine[6]++;
			 					    continue;
			 					}
			 					if(str.equals("二锅头"))
			 					{
			 						wine[7]++;
			 					    continue;
			 					}
			 					if(str.equals("百威"))
			 					{
			 						wine[8]++;
			 					    continue;
			 					}
			 					if(str.equals("江小白"))
			 					{
			 						wine[9]++;
			 					    continue;
			 					}
			 				}
			 				
			 				for(int i=0;i<info.size();i++)
			 				{
			 					temp=info.get(i);
			 					str=temp.substring(0,temp.indexOf("("));
			 					if((str.equals("纯生"))&&(winekey[0]==1))
			 					{
			 					    winekey[0]=0;
			 					    if(Wine.equals("空"))
			 					    {
			 					       Wine=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[0])+")";
			 					    }
			 					    else
			 					    {
			 					       Wine=Wine+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[0])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("勇闯"))&&(winekey[1]==1))
			 					{
			 						 winekey[1]=0;
			 					    if(Wine.equals("空"))
			 					    {
			 					       Wine=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[1])+")";
			 					    }
			 					    else
			 					    {
			 					       Wine=Wine+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[1])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("哈尔滨冰纯"))&&(winekey[2]==1))
			 					{
			 						winekey[2]=0;
			 					    if(Wine.equals("空"))
			 					    {
			 					       Wine=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[2])+")";
			 					    }
			 					    else
			 					    {
			 					       Wine=Wine+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[2])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("小麦王"))&&(winekey[3]==1))
			 					{
			 						 winekey[3]=0;
			 					    if(Wine.equals("空"))
			 					    {
			 					       Wine=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[3])+")";
			 					    }
			 					    else
			 					    {
			 					       Wine=Wine+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[3])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("满山跑"))&&(winekey[4]==1))
			 					{
			 						winekey[4]=0;
			 					    if(Wine.equals("空"))
			 					    {
			 					       Wine=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[4])+")";
			 					    }
			 					    else
			 					    {
			 					       Wine=Wine+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[4])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("歪嘴"))&&(winekey[5]==1))
			 					{
			 						winekey[5]=0;
			 					    if(Wine.equals("空"))
			 					    {
			 					       Wine=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[5])+")";
			 					    }
			 					    else
			 					    {
			 					       Wine=Wine+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[5])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("劲酒"))&&(winekey[6]==1))
			 					{
			 						winekey[6]=0;
			 					    if(Wine.equals("空"))
			 					    {
			 					       Wine=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[6])+")";
			 					    }
			 					    else
			 					    {
			 					       Wine=Wine+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[6])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("二锅头"))&&(winekey[7]==1))
			 					{
			 						 winekey[7]=0;
			 					    if(Wine.equals("空"))
			 					    {
			 					       Wine=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[7])+")";
			 					    }
			 					    else
			 					    {
			 					       Wine=Wine+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[7])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("百威"))&&(winekey[8]==1))
			 					{
			 						winekey[8]=0;
			 					    if(Wine.equals("空"))
			 					    {
			 					       Wine=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[8])+")";
			 					    }
			 					    else
			 					    {
			 					       Wine=Wine+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[8])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("江小白"))&&(winekey[9]==1))
			 					{
			 						 winekey[9]=0;
			 					    if(Wine.equals("空"))
			 					    {
			 					       Wine=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[9])+")";
			 					    }
			 					    else
			 					    {
			 					       Wine=Wine+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(wine[9])+")";
			 					    }
			 					    continue;
			 					}
			 				}
			 				
			 				Log.d("Wine",Wine);
			 				Log.d("show",show);
			 				new SendwineToServer(handler).SendDataToServer(cardNumber,Wine,show);
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
		  			  	data1.putString("package_self","com.example.synchronization_food.wine");
		  			  	data1.putString("package_aim","com.example.synchronization_food.potdish");
		  			  	intent1.putExtras(data1);
		        		wine.this.setResult(2,intent1);
		        		wine.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(wine.this,potdish.class);
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
		  				intent.putStringArrayListExtra("information1", info);
		  			}
		  			else
		  			{
		  				intent.putStringArrayListExtra("information1", info1);
		  			}
		  			Bundle data=new Bundle();
		  			data.putString("package_self","com.example.synchronization_food.wine");
		  			data.putString("package_aim","com.example.synchronization_food.One");
		  			intent.putExtras(data);
		  			wine.this.setResult(2,intent);
	        		wine.this.finish(); 
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
		  			  	data1.putString("package_self","com.example.synchronization_food.wine");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Drink");
		  			  	intent1.putExtras(data1);
		        		wine.this.setResult(2,intent1);
		        		wine.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(wine.this,Drink.class);
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
		  			  	data1.putString("package_self","com.example.synchronization_food.wine");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Staple_food");
		  			  	intent1.putExtras(data1);
		        		wine.this.setResult(2,intent1);
		        		wine.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(wine.this,Staple_food.class);
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
		  			  	data1.putString("package_self","com.example.synchronization_food.wine");
		  			  	data1.putString("package_aim","com.example.synchronization_food.yakitoui");
		  			  	intent2.putExtras(data1);
		        		wine.this.setResult(2,intent2);
		        		wine.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(wine.this,yakitoui.class);
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
		  			  	data1.putString("package_self","com.example.synchronization_food.wine");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Plate");
		  			  	intent1.putExtras(data1);
		        		wine.this.setResult(2,intent1);
		        		wine.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(wine.this,Plate.class);
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
			}
		}
	}
	
	class MyButton1 implements View.OnClickListener
	{
		public void onClick(View source)
		{
			
			switch(source.getId())
			{
			  case R.id.Bcs1:      //加号的处理
				  temp=view1.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  view1.setText(show);
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+12;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("纯生(12)");
				  break;
			  case R.id.Byc:
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
						  if (info.get(i).equals("勇闯(8)")) 
						  { 
						    info.remove(i); 
						    i--;   
						    break;
						  }
					  }
					  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-8;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.Byc1:
				  temp=view2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  view2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+8;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("勇闯(8)");
				  break;
			  case R.id.Bcs:
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
						  if (info.get(i).equals("纯生(12)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }

					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-12;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
	              break;
			  case R.id.Bbc: 
				  temp=bc2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  bc2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("哈尔滨冰纯(8)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }
					  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-8;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.Bbc1:
				  temp=bc2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  bc2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+8;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("哈尔滨冰纯(8)");
				  break;
			  case R.id.Bxmw:
				  temp=xmw2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  xmw2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("小麦王(12)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }
		
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-12;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.Bxmw1:  
				  temp=xmw2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  xmw2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+12;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("小麦王(12)");
				  break;
			  case R.id.Bhj:
				  temp=hj2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  hj2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("满山跑(4)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }
  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-4;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.Bhj1:
				  temp=hj2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  hj2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+4;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("满山跑(4)");
				  break;
			  case R.id.Bwz:
				  info = getIntent().getStringArrayListExtra("information1");  
				  temp=wz2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  wz2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("歪嘴(18)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }
		  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-18;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.Bwz1:
				  temp=wz2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  wz2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+18;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("歪嘴(18)");
				  break;
			  case R.id.Bjj:
				  temp=jj2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  jj2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("劲酒(15)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }
		  
					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-15;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.Bjj1:
				  temp=jj2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  jj2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+15;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("劲酒(15)");
				  break;
			  case R.id.Begt:
				  temp=egt2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  egt2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("二锅头(8)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }

					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-8;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.Begt1:
				  temp=egt2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  egt2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+8;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("二锅头(8)");
				  break;
			  case R.id.Bbw:
				  temp=bw2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  bw2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("百威(12)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }

					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-12;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.Bbw1:
				  temp=bw2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  bw2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+12;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("百威(12)");
				  break;
			  case R.id.Bjxb:
				  temp=jxb2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  jxb2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("江小白(18)")) 
						  { 
						    info.remove(i); 
						    i--; 
						    break;
						  }
					  }

					  cost=view3.getText().toString();
					  a=cost.substring(0,2);
					  b=Integer.parseInt(cost.substring(2));
					  b=b-18;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.Bjxb1:
				  temp=jxb2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  jxb2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+18;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("江小白(18)");
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
