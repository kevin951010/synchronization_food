package com.example.synchronization_food;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.example.synchronization_food.MainActivity.MyButton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class Login extends Activity{
	Button cancel,loginin;
	TextView user,password; 
	String suser="",spassword="",recylcepassword="";
	long mExitTime=0;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.login);
		cancel=(Button)findViewById(R.id.cancel);
		loginin=(Button)findViewById(R.id.loginin);
		user=(TextView)findViewById(R.id.user);
		password=(TextView)findViewById(R.id.password);
		loginin.setOnClickListener(new MyButton());
		cancel.setOnClickListener(new MyButton());
		
		MyApplication.getInstance().addActivity(this);
		MyApplication.getInstance().showActivity();
		
		if((getIntent().getFlags() & Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0){
			   finish();
			   return;
			}
	}
	class MyButton implements View.OnClickListener
	{
		public void onClick(View source)
		{
			switch(source.getId())
			{
				case R.id.loginin:
					suser=user.getText().toString();
					spassword=password.getText().toString();
					if(spassword.equals(""))
					{
						Toast.makeText(Login.this, "请输入密码,密码不能为空", Toast.LENGTH_SHORT).show();
					}
					else
					{
						RecyleUserFromServer one=new RecyleUserFromServer(handler1,suser,spassword); 
						ExecutorService executor=Executors.newSingleThreadExecutor();
						Future future=executor.submit(one);
						try {
							recylcepassword=(String)future.get();
						} catch (Exception e) {
					// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}
					break;
				case R.id.cancel:
					user.setText("");
					password.setText("");
					break;
			}
		}
	}
	
    Handler handler1=new Handler(){  
        public void handleMessage(Message msg) {  
            switch (msg.what) {  
            case RecyleUserFromServer.SEND_SUCCESS:  
                 if(spassword.equals(recylcepassword))
                 {
                	 Toast.makeText(Login.this, "登录成功", Toast.LENGTH_SHORT).show();
 	        		 Intent Intent6=new Intent(Login.this,MainActivity.class);
 	        		 Intent6.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
 	  			  	 startActivity(Intent6);
                 }
                 else
                 {
                	 Toast.makeText(Login.this, "账号或密码错误", Toast.LENGTH_SHORT).show();
                 }
                 break;  
            case RecyleUserFromServer.SEND_FAIL:  
                 Toast.makeText(Login.this, "网络有问题，请稍候重试", Toast.LENGTH_SHORT).show();
                 break;   
            }  
        };        
    };
    
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
    
    public void exit() {
        if ((System.currentTimeMillis() - mExitTime) > 2000) {
            Toast.makeText(getApplicationContext(), "再按一次退出程序",
                    Toast.LENGTH_SHORT).show();
            mExitTime = System.currentTimeMillis();
        } else {
            finish();
        }
    }
    
}
