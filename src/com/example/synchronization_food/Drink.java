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

public class Drink extends Activity{
	String information="";
	TextView view1,view2,view3,dwy2,xcd2,xb2,kl2,sjz2,mgz2,pp2,ll2,ww2,dwlj2,viewtop;
	String show="1",Drink="空",cardNumber="1号";
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
		setContentView(R.layout.drink);
		Log.d("oncrate_drink","oncreate_drink");
		flaghandin=false;
		
		builder=new AlertDialog.Builder(this);
		Button bn4=(Button)findViewById(R.id.Button4);
		Button bn5=(Button)findViewById(R.id.Button5);
		Button bn7=(Button)findViewById(R.id.Button7);
		Button bn8=(Button)findViewById(R.id.Button8 );
		Button bn9=(Button)findViewById(R.id.Button9 );
		Button bn14=(Button)findViewById(R.id.Button14 );

		ImageButton bwlj=(ImageButton)findViewById(R.id.bwlj);
		ImageButton bwlj1=(ImageButton)findViewById(R.id.bwlj1);
		ImageButton bwy=(ImageButton)findViewById(R.id.bwy);
		ImageButton bwy1=(ImageButton)findViewById(R.id.bwy1);
		ImageButton bdwy=(ImageButton)findViewById(R.id.bdwy);
		ImageButton bdwy1=(ImageButton)findViewById(R.id.bdwy1);
		ImageButton bxcd=(ImageButton)findViewById(R.id.bxcd);
		ImageButton bxcd1=(ImageButton)findViewById(R.id.bxcd1);
		ImageButton bxb=(ImageButton)findViewById(R.id.bxb);
		ImageButton bxb1=(ImageButton)findViewById(R.id.bxb1);
		ImageButton bkl=(ImageButton)findViewById(R.id.bkl);
		ImageButton bkl1=(ImageButton)findViewById(R.id.bkl1);
		ImageButton bsjz=(ImageButton)findViewById(R.id.bsjz);
		ImageButton bsjz1=(ImageButton)findViewById(R.id.bsjz1);
		ImageButton bmgz=(ImageButton)findViewById(R.id.bmgz);
		ImageButton bmgz1=(ImageButton)findViewById(R.id.bmgz1);
		ImageButton bpp=(ImageButton)findViewById(R.id.bpp);
		ImageButton bpp1=(ImageButton)findViewById(R.id.bpp1);
		ImageButton bll=(ImageButton)findViewById(R.id.bll);
		ImageButton bll1=(ImageButton)findViewById(R.id.bll1);
		ImageButton bww=(ImageButton)findViewById(R.id.bww);
		ImageButton bww1=(ImageButton)findViewById(R.id.bww1);
		ImageButton bdwlj=(ImageButton)findViewById(R.id.bdwlj);
		ImageButton bdwlj1=(ImageButton)findViewById(R.id.bdwlj1);
		ImageButton bn15=(ImageButton)findViewById(R.id.Button15);
		
		bn4.setOnClickListener(new MyButton());
		bn5.setOnClickListener(new MyButton());
		bn7.setOnClickListener(new MyButton());
		bn8.setOnClickListener(new MyButton());
		bn9.setOnClickListener(new MyButton());
		bn14.setOnClickListener(new MyButton());
		bn15.setOnClickListener(new MyButton());
		bwlj.setOnClickListener(new MyButton1());
		bwlj1.setOnClickListener(new MyButton1());
		bwy.setOnClickListener(new MyButton1());
		bwy1.setOnClickListener(new MyButton1());
		bdwy.setOnClickListener(new MyButton1());
		bdwy1.setOnClickListener(new MyButton1());
		bxcd.setOnClickListener(new MyButton1());
		bxcd1.setOnClickListener(new MyButton1());
		bxb.setOnClickListener(new MyButton1());
		bxb1.setOnClickListener(new MyButton1());
		bkl.setOnClickListener(new MyButton1());
		bkl1.setOnClickListener(new MyButton1());
		bsjz.setOnClickListener(new MyButton1());
		bsjz1.setOnClickListener(new MyButton1());
		bmgz.setOnClickListener(new MyButton1());
		bmgz1.setOnClickListener(new MyButton1());
		bpp.setOnClickListener(new MyButton1());
		bpp1.setOnClickListener(new MyButton1());
		bll.setOnClickListener(new MyButton1());
		bll1.setOnClickListener(new MyButton1());
		bww.setOnClickListener(new MyButton1());
		bww1.setOnClickListener(new MyButton1());
		bdwlj.setOnClickListener(new MyButton1());
		bdwlj1.setOnClickListener(new MyButton1());
		
		view1=(TextView)findViewById(R.id.Twlj2);
		view2=(TextView)findViewById(R.id.Twy2);
		view3=(TextView)findViewById(R.id.TextView7);
		dwy2=(TextView)findViewById(R.id.Tdwy2);
		xcd2=(TextView)findViewById(R.id.Txcd2);
		xb2=(TextView)findViewById(R.id.Txb2);
		kl2=(TextView)findViewById(R.id.Tkl2);
		sjz2=(TextView)findViewById(R.id.Tsjz2);
		mgz2=(TextView)findViewById(R.id.Tmgz2);
		pp2=(TextView)findViewById(R.id.Tpp2);
		ll2=(TextView)findViewById(R.id.Tll2);
		ww2=(TextView)findViewById(R.id.Tww2);
		dwlj2=(TextView)findViewById(R.id.Tdwlj2);
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
		
		temp=view1.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("王老吉(6)")) 
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
			  if (info.get(i).equals("小唯怡(4)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		view2.setText(show);
		
		temp=dwy2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("大唯怡(18)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		dwy2.setText(show);
		
		temp=xcd2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("鲜橙多(12)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		xcd2.setText(show);
		
		temp=xb2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("雪碧(4)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		xb2.setText(show);
		
		temp=kl2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("可乐(4)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		kl2.setText(show);
		
		temp=sjz2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("酸角汁(6)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		sjz2.setText(show);
		
		temp=mgz2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("芒果汁(6)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		mgz2.setText(show);
		
		temp=pp2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("枇杷原浆(6)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		pp2.setText(show);
		
		temp=ll2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("蓝莓汁(8)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		ll2.setText(show);
		
		temp=ww2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("维维豆奶(6)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		ww2.setText(show);
		
		temp=dwlj2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("大王老吉(12)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		dwlj2.setText(show);
		
		cost=view3.getText().toString();
		a=cost.substring(0,2);
		b=Integer.parseInt(cost.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("王老吉(6)")) 
			  { 
			    b=b+6;
			  }
			  if (info.get(i).equals("小唯怡(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("大唯怡(18)")) 
			  { 
			    b=b+18;
			  }
			  if (info.get(i).equals("鲜橙多(12)")) 
			  { 
			    b=b+12;
			  }
			  if (info.get(i).equals("雪碧(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("可乐(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("酸角汁(6)")) 
			  { 
			    b=b+6;
			  }
			  if (info.get(i).equals("芒果汁(6)")) 
			  { 
			    b=b+6;
			  }
			  if (info.get(i).equals("枇杷原浆(6)")) 
			  { 
			    b=b+6;
			  }
			  if (info.get(i).equals("蓝莓汁(8)")) 
			  { 
			    b=b+8;
			  }
			  if (info.get(i).equals("维维豆奶(6)")) 
			  { 
			    b=b+6;
			  }
			  if (info.get(i).equals("大王老吉(12)")) 
			  { 
			    b=b+12;
			  }
		  }
		show=a+String.valueOf(b);
		view3.setText(show); 
	}
	
	public void onActivityResult(int requestCode,int resultCode,Intent intent)
	{
		view1.setText("× 0");
		view2.setText("× 0");
		view3.setText("¥ 0");
		dwy2.setText("× 0");
		xcd2.setText("× 0");
		xb2.setText("× 0");
		kl2.setText("× 0");
		sjz2.setText("× 0");
		mgz2.setText("× 0");
		pp2.setText("× 0");
		ll2.setText("× 0");
		ww2.setText("× 0");
		dwlj2.setText("× 0");
		info = intent.getStringArrayListExtra("information1");
		info1.clear();
		for(int i=0;i<info.size();i++)
		{
			info1.add(info.get(i));
		}
		flaghandin=false;
		
		if(requestCode==0&&resultCode==1)   //碟子对饮料的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Drink"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Drink");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.One"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.Staple_food"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.wine"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.Plate"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.yakitoui"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==4)   //主食对饮料的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Drink"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Drink");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.One"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.potdish"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.wine"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.Plate"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.yakitoui"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tat",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==2)   //酒对饮料的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Drink"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Drink");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.One"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.potdish"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.Staple_food"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.Plate"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.yakitoui"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==5)   //串串对酒的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.food.Drink"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Drink");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.One"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.potdish"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.Staple_food"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.wine"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.Plate"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==6)   //盘子对酒的反馈信息
		{
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.Drink"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.Drink");
			}
			else
			{
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.One"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.potdish"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.Staple_food"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.wine"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
				if(MyApplication.getInstance().lastActivity("com.example.synchronization_food.Drink").equals("com.example.synchronization_food.yakitoui"))
				{
					Drink.this.setResult(3,intent);
					Drink.this.finish();
				}
			}
			MyApplication.getInstance().showActivity();
		}

		temp=view1.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("王老吉(6)")) 
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
			  if (info.get(i).equals("小唯怡(4)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		view2.setText(show);
		
		temp=dwy2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("大唯怡(18)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		dwy2.setText(show);
		
		temp=xcd2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("鲜橙多(12)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		xcd2.setText(show);
		
		temp=xb2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("雪碧(4)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		xb2.setText(show);
		
		temp=kl2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("可乐(4)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		kl2.setText(show);
		
		temp=sjz2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("酸角汁(6)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		sjz2.setText(show);
		
		temp=mgz2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("芒果汁(6)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		mgz2.setText(show);
		
		temp=pp2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("枇杷原浆(6)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		pp2.setText(show);
		
		temp=ll2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("蓝莓汁(8)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		ll2.setText(show);
		
		temp=ww2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("维维豆奶(6)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		ww2.setText(show);
		
		temp=dwlj2.getText().toString(); 
		a=temp.substring(0,2);
		b=Integer.parseInt(temp.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("大王老吉(12)")) 
			  { 
			    b++;
			  }
		  }
		show=a+String.valueOf(b);
		dwlj2.setText(show);
		
		cost=view3.getText().toString();
		a=cost.substring(0,2);
		b=Integer.parseInt(cost.substring(2));
		  for (int i = 0; i < info.size(); i++) 
		  { 
			  if (info.get(i).equals("王老吉(6)")) 
			  { 
			    b=b+6;
			  }
			  if (info.get(i).equals("小唯怡(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("大唯怡(18)")) 
			  { 
			    b=b+18;
			  }
			  if (info.get(i).equals("鲜橙多(12)")) 
			  { 
			    b=b+12;
			  }
			  if (info.get(i).equals("雪碧(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("可乐(4)")) 
			  { 
			    b=b+4;
			  }
			  if (info.get(i).equals("酸角汁(6)")) 
			  { 
			    b=b+6;
			  }
			  if (info.get(i).equals("芒果汁(6)")) 
			  { 
			    b=b+6;
			  }
			  if (info.get(i).equals("枇杷原浆(6)")) 
			  { 
			    b=b+6;
			  }
			  if (info.get(i).equals("蓝莓汁(8)")) 
			  { 
			    b=b+8;
			  }
			  if (info.get(i).equals("维维豆奶(6)")) 
			  { 
			    b=b+6;
			  }
			  if (info.get(i).equals("大王老吉(12)")) 
			  { 
			    b=b+12;
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
			 				int drink[]={0,0,0,0,0,0,0,0,0,0,0,0};
			 				int drinkkey[]={1,1,1,1,1,1,1,1,1,1,1,1};
			 				Drink="空";
			 				String str;
			 				for(int i=0;i<info.size();i++)
			 				{
			 					temp=info.get(i);
			 					str=temp.substring(0,temp.indexOf("("));
			 					if(str.equals("王老吉"))
			 					{
			 						drink[0]++;
			 					    continue;
			 					}
			 					if(str.equals("小唯怡"))
			 					{
			 						drink[1]++;
			 					    continue;
			 					}
			 					if(str.equals("大唯怡"))
			 					{
			 						drink[2]++;
			 					    continue;
			 					}
			 					if(str.equals("鲜橙多"))
			 					{
			 						drink[3]++;
			 					    continue;
			 					}
			 					if(str.equals("雪碧"))
			 					{
			 						drink[4]++;
			 					    continue;
			 					}
			 					if(str.equals("可乐"))
			 					{
			 						drink[5]++;
			 					    continue;
			 					}
			 					if(str.equals("酸角汁"))
			 					{
			 						drink[6]++;
			 					    continue;
			 					}
			 					if(str.equals("芒果汁"))
			 					{
			 						drink[7]++;
			 					    continue;
			 					}
			 					if(str.equals("枇杷原浆"))
			 					{
			 						drink[8]++;
			 					    continue;
			 					}
			 					if(str.equals("蓝莓汁"))
			 					{
			 						drink[9]++;
			 					    continue;
			 					}
			 					if(str.equals("维维豆奶"))
			 					{
			 						drink[10]++;
			 					    continue;
			 					}
			 					if(str.equals("大王老吉"))
			 					{
			 						drink[11]++;
			 					    continue;
			 					}
			 				}
			 				
			 				for(int i=0;i<info.size();i++)
			 				{
			 					temp=info.get(i);
		 						str=temp.substring(0,temp.indexOf("("));
		 						if((str.equals("王老吉"))&&(drinkkey[0]==1))
		 						{
		 							drinkkey[0]=0;
		 							if(Drink.equals("空"))
		 						    {
		 						       Drink=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[0])+")";
		 						    }
		 						    else
		 						    {
		 						       Drink=Drink+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[0])+")";
		 						    }
		 						    continue;
		 						}
			 					if((str.equals("小唯怡"))&&(drinkkey[1]==1))
			 					{
			 						drinkkey[1]=0;
			 					    if(Drink.equals("空"))
			 					    {
			 					       Drink=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[1])+")";
			 					    }
			 					    else
			 					    {
			 					       Drink=Drink+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[1])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("大唯怡"))&&(drinkkey[2]==1))
			 					{
			 						drinkkey[2]=0;
			 					    if(Drink.equals("空"))
			 					    {
			 					       Drink=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[2])+")";
			 					    }
			 					    else
			 					    {
			 					       Drink=Drink+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[2])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("鲜橙多"))&&(drinkkey[3]==1))
			 					{
			 						 drinkkey[3]=0;
			 					    if(Drink.equals("空"))
			 					    {
			 					       Drink=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[3])+")";
			 					    }
			 					    else
			 					    {
			 					       Drink=Drink+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[3])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("雪碧"))&&(drinkkey[4]==1))
			 					{
			 						drinkkey[4]=0;
			 					    if(Drink.equals("空"))
			 					    {
			 					       Drink=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[4])+")";
			 					    }
			 					    else
			 					    {
			 					       Drink=Drink+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[4])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("可乐"))&&(drinkkey[5]==1))
			 					{
			 						drinkkey[5]=0;
			 					    if(Drink.equals("空"))
			 					    {
			 					       Drink=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[5])+")";
			 					    }
			 					    else
			 					    {
			 					       Drink=Drink+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[5])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("酸角汁"))&&(drinkkey[6]==1))
			 					{
			 						drinkkey[6]=0;
			 					    if(Drink.equals("空"))
			 					    {
			 					       Drink=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[6])+")";
			 					    }
			 					    else
			 					    {
			 					       Drink=Drink+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[6])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("芒果汁"))&&(drinkkey[7]==1))
			 					{
			 						drinkkey[7]=0;
			 					    if(Drink.equals("空"))
			 					    {
			 					       Drink=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[7])+")";
			 					    }
			 					    else
			 					    {
			 					       Drink=Drink+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[7])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("枇杷原浆"))&&(drinkkey[8]==1))
			 					{
			 						drinkkey[8]=0;
			 					    if(Drink.equals("空"))
			 					    {
			 					       Drink=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[8])+")";
			 					    }
			 					    else
			 					    {
			 					       Drink=Drink+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[8])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("蓝莓汁"))&&(drinkkey[9]==1))
			 					{
			 						drinkkey[9]=0;
			 					    if(Drink.equals("空"))
			 					    {
			 					       Drink=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[9])+")";
			 					    }
			 					    else
			 					    {
			 					       Drink=Drink+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[9])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("维维豆奶"))&&(drinkkey[10]==1))
			 					{
			 						drinkkey[10]=0;
			 					    if(Drink.equals("空"))
			 					    {
			 					       Drink=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[10])+")";
			 					    }
			 					    else
			 					    {
			 					       Drink=Drink+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[10])+")";
			 					    }
			 					    continue;
			 					}
			 					if((str.equals("大王老吉"))&&(drinkkey[11]==1))
			 					{
			 						drinkkey[11]=0;
			 					    if(Drink.equals("空"))
			 					    {
			 					       Drink=temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[11])+")";
			 					    }
			 					    else
			 					    {
			 					       Drink=Drink+"\n"+temp.substring(0,temp.indexOf(")"))+"x"+String.valueOf(drink[11])+")";
			 					    }
			 					    continue;
			 					}
			 				}

			 				Log.d("Drink",Drink);
			 				Log.d("show",show);
			 				new SenddrinkToServer(handler).SendDataToServer(cardNumber,Drink,show);
			 			
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
		  			  	data1.putString("package_self","com.example.synchronization_food.Drink");
		  			  	data1.putString("package_aim","com.example.synchronization_food.potdish");
		  			  	intent1.putExtras(data1);
		        		Drink.this.setResult(3,intent1);
		        		Drink.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(Drink.this,potdish.class);
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
		  			  	data1.putString("package_self","com.example.synchronization_food.Drink");
		  			  	data1.putString("package_aim","com.example.synchronization_food.wine");
		  			  	intent1.putExtras(data1);
		        		Drink.this.setResult(3,intent1);
		        		Drink.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(Drink.this,wine.class);
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
		  			  	data1.putString("package_self","com.example.synchronization_food.Drink");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Staple_food");
		  			  	intent1.putExtras(data1);
		        		Drink.this.setResult(3,intent1);
		        		Drink.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(Drink.this,Staple_food.class);
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
		  			  	data1.putString("package_self","com.example.synchronization_food.Drink");
		  			  	data1.putString("package_aim","com.example.synchronization_food.yakitoui");
		  			  	intent1.putExtras(data1);
		        		Drink.this.setResult(3,intent1);
		        		Drink.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(Drink.this,yakitoui.class);
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
		  			  	data1.putString("package_self","com.example.synchronization_food.Drink");
		  			  	data1.putString("package_aim","com.example.synchronization_food.Plate");
		  			  	intent1.putExtras(data1);
		        		Drink.this.setResult(3,intent1);
		        		Drink.this.finish();
					  }
					  else
					  {
			        	Intent intent1=new Intent(Drink.this,Plate.class);
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
		  			data.putString("package_self","com.example.synchronization_food.Drink");
		  			data.putString("package_aim","com.example.synchronization_food.One");
		  			intent.putExtras(data);
		  			Drink.this.setResult(3,intent);
	        		Drink.this.finish(); 
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
			  case R.id.bwlj1:      //加号的处理
				  temp=view1.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  view1.setText(show);
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+6;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("王老吉(6)");
				  break;
			  case R.id.bwy:
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
						  if (info.get(i).equals("小唯怡(4)")) 
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
					  b=b-4;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bwy1:
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
				  info.add("小唯怡(4)");
				  break;
			  case R.id.bwlj:
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
						  if (info.get(i).equals("王老吉(6)")) 
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
					  b=b-6;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
	              break;
			  case R.id.bdwy:
				  temp=dwy2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  dwy2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("大唯怡(18)")) 
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
					  b=b-18;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bdwy1:
				  temp=dwy2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  dwy2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+18;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("大唯怡(18)");
				  break;
			  case R.id.bxcd:
				  temp=xcd2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  xcd2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("鲜橙多(12)")) 
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
			  case R.id.bxcd1:
				  temp=xcd2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  xcd2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+12;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("鲜橙多(12)");
				  break;
			  case R.id.bxb: 
				  temp=xb2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  xb2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("雪碧(4)")) 
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
					  b=b-4;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bxb1:
				  temp=xb2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  xb2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+4;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("雪碧(4)");
				  break;
			  case R.id.bkl:
				  temp=kl2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  kl2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("可乐(4)")) 
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
					  b=b-4;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bkl1:
				  temp=kl2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  kl2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+4;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("可乐(4)");
				  break;
			  case R.id.bsjz:
				  temp=sjz2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  sjz2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("酸角汁(6)")) 
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
					  b=b-6;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bsjz1:
				  temp=sjz2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  sjz2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+6;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("酸角汁(6)");
				  break;
			  case R.id.bmgz:
				  temp=mgz2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  mgz2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("芒果汁(6)")) 
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
					  b=b-6;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bmgz1:
				  temp=mgz2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  mgz2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+6;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("芒果汁(6)");
				  break;
			  case R.id.bpp:
				  temp=pp2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  pp2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("枇杷原浆(6)")) 
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
					  b=b-6;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bpp1:
				  temp=pp2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  pp2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+6;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("枇杷原浆(6)");
				  break;
			  case R.id.bll:
				 temp=ll2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  ll2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("蓝莓汁(8)")) 
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
					  b=b-8;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bll1:
				  temp=ll2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  ll2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+8;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("蓝莓汁(8)");
				  break;
			  case R.id.bww:
				  temp=ww2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  ww2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("维维豆奶(6)")) 
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
					  b=b-6;
					  show=a+String.valueOf(b);
					  view3.setText(show);
				  }
				  break;
			  case R.id.bww1:
				  temp=ww2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  ww2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+6;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("维维豆奶(6)");
				  break;
			  case R.id.bdwlj:
				 temp=dwlj2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  if(b!=0)
				  {
					  b--;
					  show=a+String.valueOf(b);
					  dwlj2.setText(show);
					  for (int i = 0; i < info.size(); i++) 
					  { 
						  if (info.get(i).equals("大王老吉(12)")) 
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
			  case R.id.bdwlj1:
				  temp=dwlj2.getText().toString(); 
				  a=temp.substring(0,2);
				  b=Integer.parseInt(temp.substring(2));
				  b++;
				  show=a+String.valueOf(b);
				  dwlj2.setText(show);
				  
				  cost=view3.getText().toString();
				  a=cost.substring(0,2);
				  b=Integer.parseInt(cost.substring(2));
				  b=b+12;
				  show=a+String.valueOf(b);
				  view3.setText(show);
				  info.add("大王老吉(12)");
				  break;
			}
		}
	}
	
    Handler handler=new Handler(){  
        public void handleMessage(Message msg) {  
            switch (msg.what) {  
            case SendDateToServer.SEND_SUCCESS:  
                Toast.makeText(Drink.this, "数据提交成功", Toast.LENGTH_SHORT).show();
                break;  
            case SendDateToServer.SEND_FAIL:  
                Toast.makeText(Drink.this, "数据提交失败，请重新尝试", Toast.LENGTH_SHORT).show();
                break;   
            }  
        };        
    }; 
	
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
