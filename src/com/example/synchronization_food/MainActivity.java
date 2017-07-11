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
			    	//Toast.makeText(MainActivity.this, "���ݽ������벻Ҫ�ظ�����", Toast.LENGTH_SHORT).show();
	                RecycleGuestFromServer one=new RecycleGuestFromServer(handler1,"1��"); 
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
					dealData("26��");
					Intent intent26=new Intent(MainActivity.this,One.class);
	 				intent26.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent26.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent26,0); 
	 			    break; 
				case R.id.twentyfive:
					infoone.clear();
					dealData("25��");
					Intent intent25=new Intent(MainActivity.this,One.class);
	 				intent25.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent25.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent25,0); 
	 			    break; 
				case R.id.twentyfour:
					infoone.clear();
					dealData("24��");
					Intent intent24=new Intent(MainActivity.this,One.class);
	 				intent24.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent24.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent24,0); 
	 			    break; 
				case R.id.twentythree:
					infoone.clear();
					dealData("23��");
					Intent intent23=new Intent(MainActivity.this,One.class);
	 				intent23.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent23.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent23,0); 
	 			    break; 
				case R.id.twentytwo:
					infoone.clear();
					dealData("22��");
					Intent intent22=new Intent(MainActivity.this,One.class);
	 				intent22.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent22.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent22,0); 
	 			    break; 
				case R.id.twentyone:
					infoone.clear();
					dealData("21��");
					Intent intent21=new Intent(MainActivity.this,One.class);
	 				intent21.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent21.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent21,0); 
	 			    break; 
				case R.id.twenty:
					infoone.clear();
					dealData("20��");
					Intent intent20=new Intent(MainActivity.this,One.class);
	 				intent20.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent20.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent20,0); 
	 			    break; 
				case R.id.nineteen:
					infoone.clear();
					dealData("19��");
					Intent intent19=new Intent(MainActivity.this,One.class);
	 				intent19.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent19.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent19,0); 
	 			    break; 
				case R.id.eighteen:
					infoone.clear();
					dealData("18��");
					Intent intent18=new Intent(MainActivity.this,One.class);
	 				intent18.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent18.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent18,0); 
	 			    break; 
				case R.id.seventeen:
					infoone.clear();
					dealData("17��");
					Intent intent17=new Intent(MainActivity.this,One.class);
	 				intent17.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent17.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent17,0); 
	 			    break; 
				case R.id.sixteen:
					infoone.clear();
					dealData("16��");
					Intent intent16=new Intent(MainActivity.this,One.class);
	 				intent16.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent16.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent16,0); 
	 			    break; 
				case R.id.fifteen:
					infoone.clear();
					dealData("15��");
					Intent intent15=new Intent(MainActivity.this,One.class);
	 				intent15.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent15.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent15,0); 
	 			    break; 
				case R.id.fourteen:
					infoone.clear();
					dealData("14��");
					Intent intent14=new Intent(MainActivity.this,One.class);
	 				intent14.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent14.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent14,0); 
	 			    break; 
				case R.id.thirteen:
					infoone.clear();
					dealData("13��");
					Intent intent13=new Intent(MainActivity.this,One.class);
	 				intent13.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent13.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent13,0); 
	 			    break; 
				case R.id.twelve:
					infoone.clear();
					dealData("12��");
					Intent intent12=new Intent(MainActivity.this,One.class);
	 				intent12.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent12.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent12,0); 
	 			    break; 
				case R.id.eleven:
					infoone.clear();
					dealData("11��");
					Intent intent11=new Intent(MainActivity.this,One.class);
	 				intent11.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent11.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent11,0); 
	 			    break; 
				case R.id.ten:
					infoone.clear();
					dealData("10��");
					Intent intent10=new Intent(MainActivity.this,One.class);
	 				intent10.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent10.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent10,0); 
	 			    break; 
				case R.id.nine:
					infoone.clear();
					dealData("9��");
					Intent intent9=new Intent(MainActivity.this,One.class);
	 				intent9.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent9.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent9,0); 
	 			    break; 
				case R.id.eight:
					infoone.clear();
					dealData("8��");
					Intent intent8=new Intent(MainActivity.this,One.class);
	 				intent8.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent8.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent8,0); 
	 			    break;  
				case R.id.seven:
					infoone.clear();
					dealData("7��");
					Intent intent7=new Intent(MainActivity.this,One.class);
	 				intent7.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent7.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent7,0); 
	 			    break;
				case R.id.six:
					infoone.clear();
					dealData("6��");
					Intent intent6=new Intent(MainActivity.this,One.class);
	 				intent6.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	 				intent6.putStringArrayListExtra("information1", infoone);
	 				startActivityForResult(intent6,0); 
	 			    break;
				case R.id.five:
						infoone.clear();
						dealData("5��");
						Intent intent5=new Intent(MainActivity.this,One.class);
		 				intent5.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		 				intent5.putStringArrayListExtra("information1", infoone);
		 				startActivityForResult(intent5,0); 
		 			    break;
				case R.id.four:
						infoone.clear();
						dealData("4��");
						Intent intent4=new Intent(MainActivity.this,One.class);
			 			intent4.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			 			intent4.putStringArrayListExtra("information1", infoone);
			 			startActivityForResult(intent4,0); 
			 			break;
				case R.id.three:
					
						infoone.clear();
						dealData("3��");
						Intent intent3=new Intent(MainActivity.this,One.class);
			 			intent3.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			 			intent3.putStringArrayListExtra("information1", infoone);
			 			startActivityForResult(intent3,0); 
			 			break;
				case R.id.two:
						infoone.clear();
						dealData("2��");
						Intent intent2=new Intent(MainActivity.this,One.class);
			 			intent2.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
			 			intent2.putStringArrayListExtra("information1", infoone);
			 			startActivityForResult(intent2,0); 
			 			break;
				case R.id.one:
					infoone.clear();
					dealData("1��");
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
                Toast.makeText(MainActivity.this, "�����ύ�ɹ�", Toast.LENGTH_SHORT).show();
                break;  
            case SendDateToServer.SEND_FAIL:  
                Toast.makeText(MainActivity.this, "�����ύʧ�ܣ������³���", Toast.LENGTH_SHORT).show();
                break;   
            }  
        };        
    };
	
	public void onActivityResult(int requestCode,int resultCode,Intent intent)
	{
		if(requestCode==0&&resultCode==1)   //��(��)������1�ķ�����Ϣ
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
					if(str.equals("1��"))
					{
						bn1.setBackground(btnDrawable);
					}
					if(str.equals("2��"))
					{
						bn2.setBackground(btnDrawable);
					}
					if(str.equals("3��"))
					{
						bn3.setBackground(btnDrawable);
					}
					if(str.equals("4��"))
					{
						bn4.setBackground(btnDrawable);
					}
					if(str.equals("5��"))
					{
						bn5.setBackground(btnDrawable);
					}
					if(str.equals("6��"))
					{
						bn6.setBackground(btnDrawable);
					}
					if(str.equals("7��"))
					{
						bn7.setBackground(btnDrawable);
					}
					if(str.equals("8��"))
					{
						bn8.setBackground(btnDrawable);
					}			
					if(str.equals("9��"))
					{
						bn9.setBackground(btnDrawable);
					}
					if(str.equals("10��"))
					{
						bn10.setBackground(btnDrawable);
					}
					if(str.equals("11��"))
					{
						bn11.setBackground(btnDrawable);
					}			
					if(str.equals("12��"))
					{
						bn12.setBackground(btnDrawable);
					}
					if(str.equals("13��"))
					{
						bn13.setBackground(btnDrawable);
					}
					if(str.equals("14��"))
					{
						bn14.setBackground(btnDrawable);
					}
					if(str.equals("15��"))
					{
						bn15.setBackground(btnDrawable);
					}
					if(str.equals("16��"))
					{
						bn16.setBackground(btnDrawable);
					}
					if(str.equals("17��"))
					{
						bn17.setBackground(btnDrawable);
					}
					if(str.equals("18��"))
					{
						bn18.setBackground(btnDrawable);
					}
					if(str.equals("19��"))
					{
						bn19.setBackground(btnDrawable);
					}
					if(str.equals("20��"))
					{
						bn20.setBackground(btnDrawable);
					}
					if(str.equals("21��"))
					{
						bn21.setBackground(btnDrawable);
					}
					if(str.equals("22��"))
					{
						bn22.setBackground(btnDrawable);
					}
					if(str.equals("23��"))
					{
						bn23.setBackground(btnDrawable);
					}
					if(str.equals("24��"))
					{
						bn24.setBackground(btnDrawable);
					}
					if(str.equals("25��"))
					{
						bn25.setBackground(btnDrawable);
					}
					if(str.equals("26��"))
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
					if(str.equals("1��"))
					{
						bn1.setBackground(btnDrawable);
					}
					if(str.equals("2��"))
					{
						bn2.setBackground(btnDrawable);
					}
					if(str.equals("3��"))
					{
						bn3.setBackground(btnDrawable);
					}
					if(str.equals("4��"))
					{
						bn4.setBackground(btnDrawable);
					}
					if(str.equals("5��"))
					{
						bn5.setBackground(btnDrawable);
					}
					if(str.equals("6��"))
					{
						bn6.setBackground(btnDrawable);
					}
					if(str.equals("7��"))
					{
						bn7.setBackground(btnDrawable);
					}
					if(str.equals("8��"))
					{
						bn8.setBackground(btnDrawable);
					}			
					if(str.equals("9��"))
					{
						bn9.setBackground(btnDrawable);
					}
					if(str.equals("10��"))
					{
						bn10.setBackground(btnDrawable);
					}
					if(str.equals("11��"))
					{
						bn11.setBackground(btnDrawable);
					}			
					if(str.equals("12��"))
					{
						bn12.setBackground(btnDrawable);
					}
					if(str.equals("13��"))
					{
						bn13.setBackground(btnDrawable);
					}
					if(str.equals("14��"))
					{
						bn14.setBackground(btnDrawable);
					}
					if(str.equals("15��"))
					{
						bn15.setBackground(btnDrawable);
					}
					if(str.equals("16��"))
					{
						bn16.setBackground(btnDrawable);
					}
					if(str.equals("17��"))
					{
						bn17.setBackground(btnDrawable);
					}
					if(str.equals("18��"))
					{
						bn18.setBackground(btnDrawable);
					}
					if(str.equals("19��"))
					{
						bn19.setBackground(btnDrawable);
					}
					if(str.equals("20��"))
					{
						bn20.setBackground(btnDrawable);
					}
					if(str.equals("21��"))
					{
						bn21.setBackground(btnDrawable);
					}
					if(str.equals("22��"))
					{
						bn22.setBackground(btnDrawable);
					}
					if(str.equals("23��"))
					{
						bn23.setBackground(btnDrawable);
					}
					if(str.equals("24��"))
					{
						bn24.setBackground(btnDrawable);
					}
					if(str.equals("25��"))
					{
						bn25.setBackground(btnDrawable);
					}
					if(str.equals("26��"))
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
				 if(one_pot[i].equals("��"))
				 {
						 break;
				 }
				 str=one_pot[i].substring(0,one_pot[i].indexOf("("));
				 while(number<Integer.parseInt(one_pot[i].substring(one_pot[i].indexOf("x")+1 ,one_pot[i].indexOf(")") ) ))
				 {
					 if(str.equals("���΢��"))
					 {
						 infoone.add("���΢��(18)");
						 number++;
						 continue;
					 }
					 if(str.equals("�������"))
					 {
						 infoone.add("�������(18)");
						 number++;
						 continue;
					 }
					 if(str.equals("�������"))
					 {
						 infoone.add("�������(18)");
						 number++;
						 continue;
					 }
					 if(str.equals("ԧ���"))
					 {
						 infoone.add("ԧ���(22)");
						 number++;
						 continue;
					 }
				 }
			 }
			
			for(int i=0;i<one_dish.length;i++)
			 {
				number=0; 
				if(one_dish[i].equals("��"))
				 {
					 break;
				 }
				 number=0;
				 str=one_dish[i].substring(0,one_dish[i].indexOf("("));
				 while(number<Integer.parseInt(one_dish[i].substring(one_dish[i].indexOf("x")+1 ,one_dish[i].indexOf(")") ) ))
				 {
					 if(str.equals("�͵�"))
					 {
						 infoone.add("�͵�(4)");
						 number++;
						 continue;
					 }
					 if(str.equals("�ɵ�"))
					 {
						 infoone.add("�ɵ�(4)");
						 number++;
						 continue;
					 }
				 }
			 }
			
			 for(int i=0;i<one_wine.length;i++)
			 {
				 number=0;
				 if(one_wine[i].equals("��"))
				  {
						 break;
				  }
				 str=one_wine[i].substring(0,one_wine[i].indexOf("("));
				 while(number<Integer.parseInt(one_wine[i].substring(one_wine[i].indexOf("x")+1 ,one_wine[i].indexOf(")") ) ))
				 {
					 if(str.equals("����"))
					 {
						 infoone.add("����(12)");
						 number++;
						 continue;
					 }
					 if(str.equals("�´�"))
					 {
						 infoone.add("�´�(8)");
						 number++;
						 continue;
					 }
					 if(str.equals("����������"))
					 {
						 infoone.add("����������(8)");
						 number++;
						 continue;
					 }
					 if(str.equals("����"))
					 {
						 infoone.add("����(12)");
						 number++;
						 continue;
					 }
					 if(str.equals("С����"))
					 {
						 infoone.add("С����(12)");
						 number++;
						 continue;
					 }
					 if(str.equals("��ɽ��"))
					 {
						 infoone.add("��ɽ��(4)");
						 number++;
						 continue;
					 }
					 if(str.equals("����"))
					 {
						 infoone.add("����(18)");
						 number++;
						 continue;
					 }
					 if(str.equals("����"))
					 {
						 infoone.add("����(15)");
						 number++;
						 continue;
					 }
					 if(str.equals("����ͷ"))
					 {
						 infoone.add("����ͷ(8)");
						 number++;
						 continue;
					 }
					 if(str.equals("��С��"))
					 {
						 infoone.add("��С��(18)");
						 number++;
						 continue;
					 }
				 }
			 }
			 for(int i=0;i<one_drink.length;i++)
			 {
				 number=0;
				 if(one_drink[i].equals("��"))
				 {
						 break;
				 }
				 str=one_drink[i].substring(0,one_drink[i].indexOf("("));
				 while(number<Integer.parseInt(one_drink[i].substring(one_drink[i].indexOf("x")+1 ,one_drink[i].indexOf(")") ) ))
						 {
					 		if(str.equals("���ϼ�"))
					 		{
					 			infoone.add("���ϼ�(6)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("СΨ��"))
					 		{
					 			infoone.add("СΨ��(4)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("��Ψ��"))
					 		{
					 			infoone.add("��Ψ��(18)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("�ʳȶ�"))
					 		{
					 			infoone.add("�ʳȶ�(12)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("ѩ��"))
					 		{
					 			infoone.add("ѩ��(4)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("����"))
					 		{
					 			infoone.add("����(4)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("���֭"))
					 		{
					 			infoone.add("���֭(6)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("â��֭"))
					 		{
					 			infoone.add("â��֭(6)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("����ԭ��"))
					 		{
					 			infoone.add("����ԭ��(6)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("��ݮ֭"))
							{
					 			infoone.add("��ݮ֭(8)");
					 			number++;
								continue;
							}
					 		if(str.equals("άά����"))
					 		{
					 			infoone.add("άά����(6)");
					 			number++;
					 			continue;
					 		}
					 		if(str.equals("�����ϼ�"))
					 		{
					 			infoone.add("�����ϼ�(12)");
					 			number++;
					 			continue;
					 		}
						 }
			 }	
			 
			 for(int i=0;i<one_staple.length;i++)
			 {
				 number=0;
				 if(one_staple[i].equals("��"))
				 {
						 break;
				 }
				 str=one_staple[i].substring(0,one_staple[i].indexOf("("));
				 while(number<Integer.parseInt(one_staple[i].substring(one_staple[i].indexOf("x")+1 ,one_staple[i].indexOf(")") ) ))
				 {
					 if(str.equals("������"))
					 {
						 infoone.add("������(4)");
						 number++;
						 continue;
					 }
					 if(str.equals("������"))
					 {
						 infoone.add("������(4)");
						 number++;
						 continue;
					 }
					 if(str.equals("������"))
					 {
						 infoone.add("������(4)");
						 number++;
						 continue;
					 }
					 if(str.equals("���׷�"))
					 {
						 infoone.add("���׷�(2)");
						 number++;
						 continue;
					 }
				 }
			 }
			 
			 for(int i=0;i<one_plate.length;i++)
			 {
				 number=0;
				 if(one_plate[i].equals("��"))
				 {
						 break;
				 }
				 str=one_plate[i].substring(0,one_plate[i].indexOf("("));
				 while(number<Integer.parseInt(one_plate[i].substring(one_plate[i].indexOf("x")+1 ,one_plate[i].indexOf(")") ) ))
				 {
					 if(str.equals("����"))
					 {
						 infoone.add("����(12)");
						 number++;
						 continue;
					 }
					 if(str.equals("������"))
					 {
						 infoone.add("������(12)");
						 number++;
						 continue;
					 }
					 if(str.equals("С����"))
					 {
						 infoone.add("С����(5)");
						 number++;
						 continue;
					 }
					 if(str.equals("������"))
					 {
						 infoone.add("������(10)");
						 number++;
						 continue;
					 }
					 if(str.equals("ë��"))
					 {
						 infoone.add("ë��(5)");
						 number++;
						 continue;
					 }
					 if(str.equals("Բ��"))
					 {
						 infoone.add("Բ��(5)");
						 number++;
						 continue;
					 }
					 if(str.equals("����"))
					 {
						 infoone.add("����(5)");
						 number++;
						 continue;
					 }
				 }
			 }
			 
			 if(yakitoui_one[0].equals("��"))
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	


	 public boolean onKeyDown(int keyCode, KeyEvent event) {
			
	    	if (keyCode == KeyEvent.KEYCODE_BACK) {
	                if ((System.currentTimeMillis() - mExitTime) > 2000) {
	                        Object mHelperUtils;
	                        Toast.makeText(this, "�ٰ�һ���˳�����", Toast.LENGTH_SHORT).show();
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
