package com.example.synchronization_food;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button bnsynchronization,bn1,bn2,bn3,bn4,bn5,bn6,bn7,bnmenu,bn8,bn9,bn10,bn11,bn12,bn13,bn14,bn15,bn16,bn17,bn18,bn19,bn20,bn21,bn22,bn23,bn24,bn25,bn26;
	ArrayList<String> infoone=new ArrayList<String>();
	String str="";
	Resources resources_green,resources_red;
	Drawable btnDrawable_green,btnDrawable_red;
	long mExitTime=0;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		bnsynchronization=(Button)findViewById(R.id.Button1);
		bn1=(Button)findViewById(R.id.one);
		bn2=(Button)findViewById(R.id.two);
		bn3=(Button)findViewById(R.id.three);
		bn4=(Button)findViewById(R.id.four);
		bn5=(Button)findViewById(R.id.five);
		bn6=(Button)findViewById(R.id.six);
		bn7=(Button)findViewById(R.id.seven);
		bn8=(Button)findViewById(R.id.eight);
		bn9=(Button)findViewById(R.id.nine);
		bn10=(Button)findViewById(R.id.ten);
		bn11=(Button)findViewById(R.id.eleven);
		bn12=(Button)findViewById(R.id.twelve);
		bn13=(Button)findViewById(R.id.thirteen);
		bn14=(Button)findViewById(R.id.fourteen);
		bn15=(Button)findViewById(R.id.fifteen);
		bn16=(Button)findViewById(R.id.sixteen);
		bn17=(Button)findViewById(R.id.seventeen);
		bn18=(Button)findViewById(R.id.eighteen);
		bn19=(Button)findViewById(R.id.nineteen);
		bn20=(Button)findViewById(R.id.twenty);
		bn21=(Button)findViewById(R.id.twentyone);
		bn22=(Button)findViewById(R.id.twentytwo);
		bn23=(Button)findViewById(R.id.twentythree);
		bn24=(Button)findViewById(R.id.twentyfour);
		bn25=(Button)findViewById(R.id.twentyfive);
		bn26=(Button)findViewById(R.id.twentysix);
		
		bnmenu=(Button)findViewById(R.id.Button2);
		bn1.setOnClickListener(new MyButton());	
		bn2.setOnClickListener(new MyButton());	
		bn3.setOnClickListener(new MyButton());	
		bn4.setOnClickListener(new MyButton());
		bn5.setOnClickListener(new MyButton());
		bn6.setOnClickListener(new MyButton());	
		bn7.setOnClickListener(new MyButton());	
		bn8.setOnClickListener(new MyButton());	
		bn9.setOnClickListener(new MyButton());	
		bn10.setOnClickListener(new MyButton());	
		bn11.setOnClickListener(new MyButton());	
		bn12.setOnClickListener(new MyButton());	
		bn13.setOnClickListener(new MyButton());	
		bn14.setOnClickListener(new MyButton());	
		bn15.setOnClickListener(new MyButton());	
		bn16.setOnClickListener(new MyButton());	
		bn17.setOnClickListener(new MyButton());	
		bn18.setOnClickListener(new MyButton());	
		bn19.setOnClickListener(new MyButton());	
		bn20.setOnClickListener(new MyButton());	
		bn21.setOnClickListener(new MyButton());	
		bn22.setOnClickListener(new MyButton());	
		bn23.setOnClickListener(new MyButton());	
		bn24.setOnClickListener(new MyButton());	
		bn25.setOnClickListener(new MyButton());	
		bn26.setOnClickListener(new MyButton());
		bnsynchronization.setOnClickListener(new MyButton());
		bnmenu.setOnClickListener(new MyButton());	
		
		MyApplication.getInstance().addActivity(this);
		MyApplication.getInstance().showActivity();
   
		resources_green = this.getBaseContext().getResources();   
		btnDrawable_green = resources_green.getDrawable(R.drawable.shape);
		
		resources_red = this.getBaseContext().getResources();   
		btnDrawable_red = resources_red.getDrawable(R.drawable.shapered);
	}

	class MyButton implements View.OnClickListener
	{
		public void onClick(View source)
		{
			switch(source.getId())
			{
			    case R.id.Button1:
			    	//Toast.makeText(MainActivity.this, "Êý¾Ý½ÓÊÜÖÐÇë²»ÒªÖØ¸´°´¼ü", Toast.LENGTH_SHORT).show();
	                RecycleGuestFromServer one=new RecycleGuestFromServer(handler1,"1ºÅ"); 
					ExecutorService executor=Executors.newSingleThreadExecutor();
					Future future=executor.submit(one);
					try {
						str=(String)future.get();
						Log.d("str",str);
						String tablenumber[]=str.split("\n");
						for(int i=0;i<tablenumber.length;i++)
						{
							Log.d("tablenumber"+String.valueOf(i),tablenumber[i]);
						}
						
						if(tablenumber[0].equals("0"))
						{
							bn1.setBackground(btnDrawable_green); 
						}
						else
						{
							bn1.setBackground(btnDrawable_red);
						}
						if(tablenumber[1].equals("0"))
						{
							bn2.setBackground(btnDrawable_green); 
						}
						else
						{
							bn2.setBackground(btnDrawable_red);
						}
						if(tablenumber[2].equals("0"))
						{
							bn3.setBackground(btnDrawable_green); 
						}
						else
						{
							bn3.setBackground(btnDrawable_red);
						}
						if(tablenumber[3].equals("0"))
						{
							bn4.setBackground(btnDrawable_green); 
						}
						else
						{
							bn4.setBackground(btnDrawable_red);
						}
						if(tablenumber[4].equals("0"))
						{
							bn5.setBackground(btnDrawable_green); 
						}
						else
						{
							bn5.setBackground(btnDrawable_red);
						}
						if(tablenumber[5].equals("0"))
						{
							bn6.setBackground(btnDrawable_green); 
						}
						else
						{
							bn6.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[6].equals("0"))
						{
							bn7.setBackground(btnDrawable_green); 
						}
						else
						{
							bn7.setBackground(btnDrawable_red);
						}
						if(tablenumber[7].equals("0"))
						{
							bn8.setBackground(btnDrawable_green); 
						}
						else
						{
							bn8.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[8].equals("0"))
						{
							bn9.setBackground(btnDrawable_green); 
						}
						else
						{
							bn9.setBackground(btnDrawable_red);
						}
						if(tablenumber[9].equals("0"))
						{
							bn10.setBackground(btnDrawable_green); 
						}
						else
						{
							bn10.setBackground(btnDrawable_red);
						}
						if(tablenumber[10].equals("0"))
						{
							bn11.setBackground(btnDrawable_green); 
						}
						else
						{
							bn11.setBackground(btnDrawable_red);
						}
						if(tablenumber[11].equals("0"))
						{
							bn12.setBackground(btnDrawable_green); 
						}
						else
						{
							bn12.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[12].equals("0"))
						{
							bn13.setBackground(btnDrawable_green); 
						}
						else
						{
							bn13.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[12].equals("0"))
						{
							bn13.setBackground(btnDrawable_green); 
						}
						else
						{
							bn13.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[13].equals("0"))
						{
							bn14.setBackground(btnDrawable_green); 
						}
						else
						{
							bn14.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[14].equals("0"))
						{
							bn15.setBackground(btnDrawable_green); 
						}
						else
						{
							bn15.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[15].equals("0"))
						{
							bn16.setBackground(btnDrawable_green); 
						}
						else
						{
							bn16.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[16].equals("0"))
						{
							bn17.setBackground(btnDrawable_green); 
						}
						else
						{
							bn17.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[17].equals("0"))
						{
							bn18.setBackground(btnDrawable_green); 
						}
						else
						{
							bn18.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[18].equals("0"))
						{
							bn19.setBackground(btnDrawable_green); 
						}
						else
						{
							bn19.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[19].equals("0"))
						{
							bn20.setBackground(btnDrawable_green); 
						}
						else
						{
							bn20.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[20].equals("0"))
						{
							bn21.setBackground(btnDrawable_green); 
						}
						else
						{
							bn21.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[21].equals("0"))
						{
							bn22.setBackground(btnDrawable_green); 
						}
						else
						{
							bn22.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[22].equals("0"))
						{
							bn23.setBackground(btnDrawable_green); 
						}
						else
						{
							bn23.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[23].equals("0"))
						{
							bn24.setBackground(btnDrawable_green); 
						}
						else
						{
							bn24.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[24].equals("0"))
						{
							bn25.setBackground(btnDrawable_green); 
						}
						else
						{
							bn25.setBackground(btnDrawable_red);
						}
						
						if(tablenumber[25].equals("0"))
						{
							bn26.setBackground(btnDrawable_green); 
						}
						else
						{
							bn26.setBackground(btnDrawable_red);
						}
						
					} 
					catch (Exception e) {
					 e.printStackTrace();
					}
					
					break;
				case R.id.Button2:
	        		Intent Intent6=new Intent(MainActivity.this,menu.class);
	        		Intent6.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	  			  	startActivity(Intent6); 
			 		break;
				case R.id.twentysix:
					infoone.clear();
					dealData("26ºÅ");
					Intent intent26=new Intent(MainActivity.this,One.class);
	 				intent26.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent26.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent26,0); 
	 			    break; 
				case R.id.twentyfive:
					infoone.clear();
					dealData("25ºÅ");
					Intent intent25=new Intent(MainActivity.this,One.class);
	 				intent25.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent25.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent25,0); 
	 			    break; 
				case R.id.twentyfour:
					infoone.clear();
					dealData("24ºÅ");
					Intent intent24=new Intent(MainActivity.this,One.class);
	 				intent24.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent24.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent24,0); 
	 			    break; 
				case R.id.twentythree:
					infoone.clear();
					dealData("23ºÅ");
					Intent intent23=new Intent(MainActivity.this,One.class);
	 				intent23.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent23.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent23,0); 
	 			    break; 
				case R.id.twentytwo:
					infoone.clear();
					dealData("22ºÅ");
					Intent intent22=new Intent(MainActivity.this,One.class);
	 				intent22.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent22.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent22,0); 
	 			    break; 
				case R.id.twentyone:
					infoone.clear();
					dealData("21ºÅ");
					Intent intent21=new Intent(MainActivity.this,One.class);
	 				intent21.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent21.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent21,0); 
	 			    break; 
				case R.id.twenty:
					infoone.clear();
					dealData("20ºÅ");
					Intent intent20=new Intent(MainActivity.this,One.class);
	 				intent20.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent20.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent20,0); 
	 			    break; 
				case R.id.nineteen:
					infoone.clear();
					dealData("19ºÅ");
					Intent intent19=new Intent(MainActivity.this,One.class);
	 				intent19.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent19.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent19,0); 
	 			    break; 
				case R.id.eighteen:
					infoone.clear();
					dealData("18ºÅ");
					Intent intent18=new Intent(MainActivity.this,One.class);
	 				intent18.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent18.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent18,0); 
	 			    break; 
				case R.id.seventeen:
					infoone.clear();
					dealData("17ºÅ");
					Intent intent17=new Intent(MainActivity.this,One.class);
	 				intent17.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent17.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent17,0); 
	 			    break; 
				case R.id.sixteen:
					infoone.clear();
					dealData("16ºÅ");
					Intent intent16=new Intent(MainActivity.this,One.class);
	 				intent16.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent16.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent16,0); 
	 			    break; 
				case R.id.fifteen:
					infoone.clear();
					dealData("15ºÅ");
					Intent intent15=new Intent(MainActivity.this,One.class);
	 				intent15.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent15.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent15,0); 
	 			    break; 
				case R.id.fourteen:
					infoone.clear();
					dealData("14ºÅ");
					Intent intent14=new Intent(MainActivity.this,One.class);
	 				intent14.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent14.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent14,0); 
	 			    break; 
				case R.id.thirteen:
					infoone.clear();
					dealData("13ºÅ");
					Intent intent13=new Intent(MainActivity.this,One.class);
	 				intent13.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent13.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent13,0); 
	 			    break; 
				case R.id.twelve:
					infoone.clear();
					dealData("12ºÅ");
					Intent intent12=new Intent(MainActivity.this,One.class);
	 				intent12.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent12.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent12,0); 
	 			    break; 
				case R.id.eleven:
					infoone.clear();
					dealData("11ºÅ");
					Intent intent11=new Intent(MainActivity.this,One.class);
	 				intent11.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent11.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent11,0); 
	 			    break; 
				case R.id.ten:
					infoone.clear();
					dealData("10ºÅ");
					Intent intent10=new Intent(MainActivity.this,One.class);
	 				intent10.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent10.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent10,0); 
	 			    break; 
				case R.id.nine:
					infoone.clear();
					dealData("9ºÅ");
					Intent intent9=new Intent(MainActivity.this,One.class);
	 				intent9.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent9.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent9,0); 
	 			    break; 
				case R.id.eight:
					infoone.clear();
					dealData("8ºÅ");
					Intent intent8=new Intent(MainActivity.this,One.class);
	 				intent8.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent8.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent8,0); 
	 			    break;  
				case R.id.seven:
					infoone.clear();
					dealData("7ºÅ");
					Intent intent7=new Intent(MainActivity.this,One.class);
	 				intent7.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent7.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent7,0); 
	 			    break;
				case R.id.six:
					infoone.clear();
					dealData("6ºÅ");
					Intent intent6=new Intent(MainActivity.this,One.class);
	 				intent6.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent6.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent6,0); 
	 			    break;
				case R.id.five:
						infoone.clear();
						dealData("5ºÅ");
						Intent intent5=new Intent(MainActivity.this,One.class);
		 				intent5.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		 				intent5.putStringArrayListExtra("information1", infoone);
		 				startActivityForResult(intent5,0); 
		 			    break;
				case R.id.four:
						infoone.clear();
						dealData("4ºÅ");
						Intent intent4=new Intent(MainActivity.this,One.class);
			 			intent4.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			 			intent4.putStringArrayListExtra("information1", infoone);
			 			startActivityForResult(intent4,0); 
			 			break;
				case R.id.three:
					
						infoone.clear();
						dealData("3ºÅ");
						Intent intent3=new Intent(MainActivity.this,One.class);
			 			intent3.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			 			intent3.putStringArrayListExtra("information1", infoone);
			 			startActivityForResult(intent3,0); 
			 			break;
				case R.id.two:
						infoone.clear();
						dealData("2ºÅ");
						Intent intent2=new Intent(MainActivity.this,One.class);
			 			intent2.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			 			intent2.putStringArrayListExtra("information1", infoone);
			 			startActivityForResult(intent2,0); 
			 			break;
				case R.id.one:
					infoone.clear();
					dealData("1ºÅ");
					Intent intent0=new Intent(MainActivity.this,One.class);
		 			intent0.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		 			intent0.putStringArrayListExtra("information1", infoone);
		 			startActivityForResult(intent0,0); 
		 			break;
			}
		}
	}
	
    Handler handler1=new Handler(){  
        public void handleMessage(Message msg) {  
            switch (msg.what) {  
            case SendDateToServer.SEND_SUCCESS:  
                Toast.makeText(MainActivity.this, "Êý¾ÝÌá½»³É¹¦", Toast.LENGTH_SHORT).show();
                break;  
            case SendDateToServer.SEND_FAIL:  
                Toast.makeText(MainActivity.this, "Êý¾ÝÌá½»Ê§°Ü£¬ÇëÖØÐÂ³¢ÊÔ", Toast.LENGTH_SHORT).show();
                break;   
            }  
        };        
    };
	
	public void onActivityResult(int requestCode,int resultCode,Intent intent)
	{
		if(requestCode==0&&resultCode==1)   //¹ø(µú)¶Ô×ÀºÅ1µÄ·´À¡ÐÅÏ¢
		{
			infoone = intent.getStringArrayListExtra("information1");
			Bundle data=intent.getExtras();
			String package_self=data.getString("package_self");
			String package_aim=data.getString("package_aim");
			if(package_aim.equals("com.example.synchronization_food.MainActivity"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.MainActivity");
			}
			for(int i = 0; i < infoone.size(); i++)
			  {
				  Log.d("info_main_tag",infoone.get(i));
			  }
			MyApplication.getInstance().showActivity();

			if(infoone.size()>1) 
			{
				Resources resources = this.getBaseContext().getResources();   
				Drawable btnDrawable = resources.getDrawable(R.drawable.shapered);  
				for(int i=0;i<infoone.size();i++)
				{
					String temp=infoone.get(i);
					str=temp.substring(0,temp.indexOf("("));
					if(str.equals("1ºÅ"))
					{
						bn1.setBackground(btnDrawable);
					}
					if(str.equals("2ºÅ"))
					{
						bn2.setBackground(btnDrawable);
					}
					if(str.equals("3ºÅ"))
					{
						bn3.setBackground(btnDrawable);
					}
					if(str.equals("4ºÅ"))
					{
						bn4.setBackground(btnDrawable);
					}
					if(str.equals("5ºÅ"))
					{
						bn5.setBackground(btnDrawable);
					}
					if(str.equals("6ºÅ"))
					{
						bn6.setBackground(btnDrawable);
					}
					if(str.equals("7ºÅ"))
					{
						bn7.setBackground(btnDrawable);
					}
					if(str.equals("8ºÅ"))
					{
						bn8.setBackground(btnDrawable);
					}			
					if(str.equals("9ºÅ"))
					{
						bn9.setBackground(btnDrawable);
					}
					if(str.equals("10ºÅ"))
					{
						bn10.setBackground(btnDrawable);
					}
					if(str.equals("11ºÅ"))
					{
						bn11.setBackground(btnDrawable);
					}			
					if(str.equals("12ºÅ"))
					{
						bn12.setBackground(btnDrawable);
					}
					if(str.equals("13ºÅ"))
					{
						bn13.setBackground(btnDrawable);
					}
					if(str.equals("14ºÅ"))
					{
						bn14.setBackground(btnDrawable);
					}
					if(str.equals("15ºÅ"))
					{
						bn15.setBackground(btnDrawable);
					}
					if(str.equals("16ºÅ"))
					{
						bn16.setBackground(btnDrawable);
					}
					if(str.equals("17ºÅ"))
					{
						bn17.setBackground(btnDrawable);
					}
					if(str.equals("18ºÅ"))
					{
						bn18.setBackground(btnDrawable);
					}
					if(str.equals("19ºÅ"))
					{
						bn19.setBackground(btnDrawable);
					}
					if(str.equals("20ºÅ"))
					{
						bn20.setBackground(btnDrawable);
					}
					if(str.equals("21ºÅ"))
					{
						bn21.setBackground(btnDrawable);
					}
					if(str.equals("22ºÅ"))
					{
						bn22.setBackground(btnDrawable);
					}
					if(str.equals("23ºÅ"))
					{
						bn23.setBackground(btnDrawable);
					}
					if(str.equals("24ºÅ"))
					{
						bn24.setBackground(btnDrawable);
					}
					if(str.equals("25ºÅ"))
					{
						bn25.setBackground(btnDrawable);
					}
					if(str.equals("26ºÅ"))
					{
						bn26.setBackground(btnDrawable);
					}
					
				}
			}
			else
			{
				Resources resources = this.getBaseContext().getResources();   
				Drawable btnDrawable = resources.getDrawable(R.drawable.shape);   
				for(int i=0;i<infoone.size();i++)
				{
					String temp=infoone.get(i);
					str=temp.substring(0,temp.indexOf("("));
					if(str.equals("1ºÅ"))
					{
						bn1.setBackground(btnDrawable);
					}
					if(str.equals("2ºÅ"))
					{
						bn2.setBackground(btnDrawable);
					}
					if(str.equals("3ºÅ"))
					{
						bn3.setBackground(btnDrawable);
					}
					if(str.equals("4ºÅ"))
					{
						bn4.setBackground(btnDrawable);
					}
					if(str.equals("5ºÅ"))
					{
						bn5.setBackground(btnDrawable);
					}
					if(str.equals("6ºÅ"))
					{
						bn6.setBackground(btnDrawable);
					}
					if(str.equals("7ºÅ"))
					{
						bn7.setBackground(btnDrawable);
					}
					if(str.equals("8ºÅ"))
					{
						bn8.setBackground(btnDrawable);
					}			
					if(str.equals("9ºÅ"))
					{
						bn9.setBackground(btnDrawable);
					}
					if(str.equals("10ºÅ"))
					{
						bn10.setBackground(btnDrawable);
					}
					if(str.equals("11ºÅ"))
					{
						bn11.setBackground(btnDrawable);
					}			
					if(str.equals("12ºÅ"))
					{
						bn12.setBackground(btnDrawable);
					}
					if(str.equals("13ºÅ"))
					{
						bn13.setBackground(btnDrawable);
					}
					if(str.equals("14ºÅ"))
					{
						bn14.setBackground(btnDrawable);
					}
					if(str.equals("15ºÅ"))
					{
						bn15.setBackground(btnDrawable);
					}
					if(str.equals("16ºÅ"))
					{
						bn16.setBackground(btnDrawable);
					}
					if(str.equals("17ºÅ"))
					{
						bn17.setBackground(btnDrawable);
					}
					if(str.equals("18ºÅ"))
					{
						bn18.setBackground(btnDrawable);
					}
					if(str.equals("19ºÅ"))
					{
						bn19.setBackground(btnDrawable);
					}
					if(str.equals("20ºÅ"))
					{
						bn20.setBackground(btnDrawable);
					}
					if(str.equals("21ºÅ"))
					{
						bn21.setBackground(btnDrawable);
					}
					if(str.equals("22ºÅ"))
					{
						bn22.setBackground(btnDrawable);
					}
					if(str.equals("23ºÅ"))
					{
						bn23.setBackground(btnDrawable);
					}
					if(str.equals("24ºÅ"))
					{
						bn24.setBackground(btnDrawable);
					}
					if(str.equals("25ºÅ"))
					{
						bn25.setBackground(btnDrawable);
					}
					if(str.equals("26ºÅ"))
					{
						bn26.setBackground(btnDrawable);
					}
					
				}
			}
		
		}
	
	}
	
	public void dealData(String tnumber)
	{
		try {
			infoone.clear();
			RecycleDataFromServer one=new RecycleDataFromServer(handler1,tnumber); 
			ExecutorService executor=Executors.newSingleThreadExecutor();
			Future future=executor.submit(one);
			str=(String)future.get();
			Log.d("StrStrStr",str);
			String[] totalone=str.split("t");
			String[]   one_pot=totalone[0].split("\n");
			String[]   one_dish=totalone[1].split("\n");
			String[]   one_wine=totalone[2].split("\n");
			String[]   one_drink=totalone[3].split("\n");
			String[]   yakitoui_one=totalone[4].split("\n");
			String[]   one_staple=totalone[5].split("\n");
			String[]   one_plate=totalone[6].split("\n");
			String[]   costone=totalone[7].split("\n");
			int number=0;
			for(int i=0;i<totalone.length;i++)
			{
				Log.d("totalone",totalone[i]);
			}
			Log.d("yakitoui_one",yakitoui_one[0]);
			for(int i=0;i<one_pot.length;i++)
			 {
				 number=0;
				 if(one_pot[i].equals("¿Õ"))
				 {
						 break;
				 }
				 str=one_pot[i].substring(0,one_pot[i].indexOf("("));
				 while(number<Integer.parseInt(one_pot[i].substring(one_pot[i].indexOf("x")+1 ,one_pot[i].indexOf(")") ) ))
				 {
					 if(str.equals("ºì¹øÎ¢À±"))
					 {
						 infoone.add("ºì¹øÎ¢À±(18)");
						 number++;
						 continue;
					 }
					 if(str.equals("ºì¹øÖÐÀ±"))
					 {
						 infoone.add("ºì¹øÖÐÀ±(18)");
						 number++;
						 continue;
					 }
					 if(str.equals("ºì¹øÌØÀ±"))
					 {
						 infoone.add("ºì¹øÌØÀ±(18)");
						 number++;
						 continue;
					 }
					 if(str.equals("Ô§Ñì¹ø"))
					 {
						 infoone.add("Ô§Ñì¹ø(22)");
						 number++;
						 continue;
					 }
				 }
			 }
			
			for(int i=0;i<one_dish.length;i++)
			 {
				number=0; 
				if(one_dish[i].equals("¿Õ"))
				 {
					 break;
				 }
				 number=0;
				 str=one_dish[i].substring(0,one_dish[i].indexOf("("));
				 while(number<Integer.parseInt(one_dish[i].substring(one_dish[i].indexOf("x")+1 ,one_dish[i].indexOf(")") ) ))
				 {
					 if(str.equals("ÓÍµú"))
					 {
						 infoone.add("ÓÍµú(4)");
						 number++;
						 continue;
					 }
					 if(str.equals("¸Éµú"))
					 {
						 infoone.add("¸Éµú(4)");
						 number++;
						 continue;
					 }
				 }
			 }
			
			 for(int i=0;i<one_wine.length;i++)
			 {
				 number=0;
				 if(one_wine[i].equals("¿Õ"))
				  {
						 break;
				  }
				 str=one_wine[i].substring(0,one_wine[i].indexOf("("));
				 while(number<Integer.parseInt(one_wine[i].substring(one_wine[i].indexOf("x")+1 ,one_wine[i].indexOf(")") ) ))
				 {
					 if(str.equals("´¿Éú"))
					 {
						 infoone.add("´¿Éú(12)");
						 number++;
						 continue;
					 }
					 if(str.equals("ÓÂ´³"))
					 {
						 infoone.add("ÓÂ´³(8)");
						 number++;
						 continue;
					 }
					 if(str.equals("¹þ¶û±õ±ù´¿"))
					 {
						 infoone.add("¹þ¶û±õ±ù´¿(8)");
						 number++;
						 continue;
					 }
					 if(str.equals("°ÙÍþ"))
					 {
						 infoone.add("°ÙÍþ(12)");
						 number++;
						 continue;
					 }
					 if(str.equals("Ð¡ÂóÍõ"))
					 {
						 infoone.add("Ð¡ÂóÍõ(12)");
						 number++;
						 continue;
					 }
					 if(str.equals("ÂúÉ½ÅÜ"))
					 {
						 infoone.add("ÂúÉ½ÅÜ(4)");
						 number++;
						 continue;
					 }
					 if(str.equals("Íá×ì"))
					 {
						 infoone.add("Íá×ì(18)");
						 number++;
						 continue;
					 }
					 if(str.equals("¾¢¾Æ"))
					 {
						 infoone.add("¾¢¾Æ(15)");
						 number++;
						 continue;
					 }
					 if(str.equals("¶þ¹øÍ·"))
					 {
						 infoone.add("¶þ¹øÍ·(8)");
						 number++;
						 continue;
					 }
					 if(str.equals("½­Ð¡°×"))
					 {
						 infoone.add("½­Ð¡°×(18)");
						 number++;
						 continue;
					 }
				 }
			 }
			 for(int i=0;i<one_drink.length;i++)
			 {
				 number=0;
				 if(one_drink[i].equals("¿Õ"))
				 {
						 break;
				 }
				 str=one_drink[i].substring(0,one_drink[i].indexOf("("));
				 while(number<Integer.parseInt(one_drink[i].substring(one_drink[i].indexOf("x")+1 ,one_drink[i].indexOf(")") ) ))
						 {
					 		if(str.equals("ÍõÀÏ¼ª"))
					 		{
					 			infoone.add("ÍõÀÏ¼ª(6)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("Ð¡Î¨âù"))
					 		{
					 			infoone.add("Ð¡Î¨âù(4)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("´óÎ¨âù"))
					 		{
					 			infoone.add("´óÎ¨âù(18)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("ÏÊ³È¶à"))
					 		{
					 			infoone.add("ÏÊ³È¶à(12)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("Ñ©±Ì"))
					 		{
					 			infoone.add("Ñ©±Ì(4)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("¿ÉÀÖ"))
					 		{
					 			infoone.add("¿ÉÀÖ(4)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("Ëá½ÇÖ­"))
					 		{
					 			infoone.add("Ëá½ÇÖ­(6)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("Ã¢¹ûÖ­"))
					 		{
					 			infoone.add("Ã¢¹ûÖ­(6)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("èÁèËÔ­½¬"))
					 		{
					 			infoone.add("èÁèËÔ­½¬(6)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("À¶Ý®Ö­"))
							{
					 			infoone.add("À¶Ý®Ö­(8)");
					 			number++;
								continue;
							}
					 		if(str.equals("Î¬Î¬¶¹ÄÌ"))
					 		{
					 			infoone.add("Î¬Î¬¶¹ÄÌ(6)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("´óÍõÀÏ¼ª"))
					 		{
					 			infoone.add("´óÍõÀÏ¼ª(12)");
					 			number++;
					 			continue;
					 		}
						 }
			 }	
			 
			 for(int i=0;i<one_staple.length;i++)
			 {
				 number=0;
				 if(one_staple[i].equals("¿Õ"))
				 {
						 break;
				 }
				 str=one_staple[i].substring(0,one_staple[i].indexOf("("));
				 while(number<Integer.parseInt(one_staple[i].substring(one_staple[i].indexOf("x")+1 ,one_staple[i].indexOf(")") ) ))
				 {
					 if(str.equals("µ°³´·¹"))
					 {
						 infoone.add("µ°³´·¹(4)");
						 number++;
						 continue;
					 }
					 if(str.equals("ºÚÃ×Öà"))
					 {
						 infoone.add("ºÚÃ×Öà(4)");
						 number++;
						 continue;
					 }
					 if(str.equals("Òø¶ú¸þ"))
					 {
						 infoone.add("Òø¶ú¸þ(4)");
						 number++;
						 continue;
					 }
					 if(str.equals("°×Ã×·¹"))
					 {
						 infoone.add("°×Ã×·¹(2)");
						 number++;
						 continue;
					 }
				 }
			 }
			 
			 for(int i=0;i<one_plate.length;i++)
			 {
				 number=0;
				 if(one_plate[i].equals("¿Õ"))
				 {
						 break;
				 }
				 str=one_plate[i].substring(0,one_plate[i].indexOf("("));
				 while(number<Integer.parseInt(one_plate[i].substring(one_plate[i].indexOf("x")+1 ,one_plate[i].indexOf(")") ) ))
				 {
					 if(str.equals("·½ÅÌ"))
					 {
						 infoone.add("·½ÅÌ(12)");
						 number++;
						 continue;
					 }
					 if(str.equals("´óÌõÅÌ"))
					 {
						 infoone.add("´óÌõÅÌ(12)");
						 number++;
						 continue;
					 }
					 if(str.equals("Ð¡ÌõÅÌ"))
					 {
						 infoone.add("Ð¡ÌõÅÌ(5)");
						 number++;
						 continue;
					 }
					 if(str.equals("»¨°êÅÌ"))
					 {
						 infoone.add("»¨°êÅÌ(10)");
						 number++;
						 continue;
					 }
					 if(str.equals("Ã«¶¹"))
					 {
						 infoone.add("Ã«¶¹(5)");
						 number++;
						 continue;
					 }
					 if(str.equals("Ô²Àº"))
					 {
						 infoone.add("Ô²Àº(5)");
						 number++;
						 continue;
					 }
					 if(str.equals("»¨Éú"))
					 {
						 infoone.add("»¨Éú(5)");
						 number++;
						 continue;
					 }
				 }
			 }
			 
			 if(yakitoui_one[0].equals("¿Õ"))
			 {
				 
			 }
			 else
			 {
			 	infoone.add(yakitoui_one[0]);
			 }
			 infoone.add(tnumber+"()");
			 
			 for(int i=0;i<infoone.size();i++)
			 {
				 Log.d("infoone",infoone.get(i));
			 }
		} catch (Exception e) {
			// TODO ×Ô¶¯Éú³ÉµÄ catch ¿é
			e.printStackTrace();
		}
	}
	


	 public boolean onKeyDown(int keyCode, KeyEvent event) {
			
	    	if (keyCode == KeyEvent.KEYCODE_BACK) {
	                if ((System.currentTimeMillis() - mExitTime) > 2000) {
	                        Object mHelperUtils;
	                        Toast.makeText(this, "ÔÙ°´Ò»´ÎÍË³ö³ÌÐò", Toast.LENGTH_SHORT).show();
	                        mExitTime = System.currentTimeMillis();

	                } else {
	                	MyApplication.getInstance().exit();
	                }
	                return true;
	        }
	        return super.onKeyDown(keyCode, event);
	    }
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
