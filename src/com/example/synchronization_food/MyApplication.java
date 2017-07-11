package com.example.synchronization_food;

import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.util.Log;

public class MyApplication  extends Application{

	private List<Activity> activityList = new LinkedList<Activity>(); 
	private static MyApplication instance;

	            private MyApplication()
	            {
	            }
	             //单例模式中获取唯一的MyApplication实例 
	             public static MyApplication getInstance()
	             {
	                            if(null == instance)
	                          {
	                             instance = new MyApplication();
	                          }
	                 return instance;             
	             }
	             
	             public void showActivity()
	             {
	            	 for(int i=0;i<activityList.size();i++)
	            	 {
	            		 Log.d("activityList",String.valueOf(activityList.get(i)));
	            	 }
	             }
	             
	             public String lastActivity(String A)
	             {
	            	 String temp="",str="";
	            	 for(int i=0;i<activityList.size();i++)
	            	 {
	            		 temp=String.valueOf(activityList.get(i));
	            		 str=temp.substring(0,temp.indexOf("@"));
	            		 if(A.equals(str))
	            		 {
	            				i--;
	            				temp=String.valueOf(activityList.get(i));
	            				str=temp.substring(0,temp.indexOf("@"));
	            				break;
	            		 }
	            	  }
	            	 return str;
	             }
	             
	             public Boolean isexistActivity(String A)
	             {
	            	 Boolean flag=false;
	            	 String temp="",str="";
	            	 for(int i=0;i<activityList.size();i++)
	            	 {
	            		 temp=String.valueOf(activityList.get(i));
	            		 str=temp.substring(0,temp.indexOf("@"));
	            		 if(A.equals(str))
	            		 {
	            			 flag=true;	
	            			 break;
	            		 }
	            	  }
	            	 return flag;
	             }
	             
	             public void deleteActivity(String A)
	             {
	            	 Boolean flag=true;
	            	 String temp,str;
	            	 for(int i=0;i<activityList.size();i++)
	            	 {
	            		 temp=String.valueOf(activityList.get(i));
	            		 if(flag)
	            		 {
	            			 str=temp.substring(0,temp.indexOf("@"));
	            			 if(A.equals(str))
	            			 {
	            				 flag=false;
	            			 }
	            			 continue;
	            		 }
	            		 else
	            		 {
	            			 activityList.remove(i);
	            			 i--;
	            			 continue;
	            		 }
	            	 }
	            	 for(int i=0;i<activityList.size();i++)
	            	 {
	            		 Log.d("activityList_new",String.valueOf(activityList.get(i)));
	            	 }
	             }
	             //添加Activity到容器中
	             public void addActivity(Activity activity)
	             {
	                            activityList.add(activity);
	             }
	             //遍历所有Activity并finish
	             public void exit()
	             {
	                          for(Activity activity:activityList)
	                         {
	                           activity.finish();
	                         }
	                           System.exit(0);
	            }

}
