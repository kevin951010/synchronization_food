 package com.example.synchronization_food;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class One extends Activity{
	ArrayList<String> info=new ArrayList<String>();
	ArrayList<String> TB=new ArrayList<String>();
	int main[]={0,0,0,0};
	int smallplate[]={0,0};
	int wine[]={0,0,0,0,0,0,0,0,0,0};
	int drink[]={0,0,0,0,0,0,0,0,0,0,0,0};
	int staplefood[]={0,0,0,0};
	int plate[]={0,0,0,0,0,0,0};
	int mainkey[]={1,1,1,1};
	int smallplatekey[]={1,1};
	int winekey[]={1,1,1,1,1,1,1,1,1,1};
	int drinkkey[]={1,1,1,1,1,1,1,1,1,1,1,1};
	int staplefoodkey[]={1,1,1,1};
	int platekey[]={1,1,1,1,1,1,1};
	private Spinner spinnerdiscount,spinnerCardNumber;
	String Wine="空",Drink="空",Yakitoui="空",Staple="空",Plate="空", Main="空",Small="空" ,discount="全价" ,show="",temp="",str,Temp="0",time,cardNumber="1号",TempcardNumber;
	Double cost=0.0;
	double amount=0,amount0=0,amounttotal=0;
	TextView view1,view2,viewtop;
	EditText view3;
    Builder builder;
    SQLiteDatabase db;
    Boolean flagaa=true,flagbb=true,flagclear=false;
    private ArrayAdapter<String> adapter;
    ImageButton bn15,bn16,bn18;
    boolean firstspinner=true;
    Button b;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.one);
		view1=(TextView)findViewById(R.id.show);
		view2=(TextView)findViewById(R.id.TextView7);                           //显示账单
		view3=(EditText)findViewById(R.id.number);
		viewtop=(TextView)findViewById(R.id.TextView1);
		
		flagclear=false;
		
		b=(Button)findViewById(R.id.Button14);
		ImageButton bn13=(ImageButton)findViewById(R.id.Button13);
		bn15=(ImageButton)findViewById(R.id.Button15);
		bn16=(ImageButton)findViewById(R.id.Button16);
		bn18=(ImageButton)findViewById(R.id.Button18);
		
		Button bn4=(Button)findViewById(R.id.Button4);
		Button bn5=(Button)findViewById(R.id.Button5);
		Button bn6=(Button)findViewById(R.id.Button6);
		Button bn7=(Button)findViewById(R.id.Button7);
		Button bn8=(Button)findViewById(R.id.Button8);
		Button bn9=(Button)findViewById(R.id.Button9);
		
		builder=new AlertDialog.Builder(this);
		
		info = getIntent().getStringArrayListExtra("information1");
		
		
		for(int i=0;i<info.size();i++)
		{
			temp=info.get(i);
			str=temp.substring(0,temp.indexOf("("));
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
			if(str.equals("串串"))
			{
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"¥"+String.valueOf(cost)+"\n";
				amount0=amount0+cost;
				Yakitoui=temp;
				continue;
			}
			if((str.equals("红锅微辣"))&&(mainkey[0]==1))
			{
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));;
				show=show+temp+"      "+"x"+String.valueOf(main[0])+"\n";
			    amount=amount+cost*main[0];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"      "+"x"+String.valueOf(main[1])+"\n";
			    amount=amount+cost*main[1];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"      "+"x"+String.valueOf(main[2])+"\n";
			    amount=amount+cost*main[2];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"x"+String.valueOf(main[3])+"\n";
			    amount=amount+cost*main[3];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(smallplate[0])+"\n";
			    amount=amount+cost*smallplate[0];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(smallplate[1])+"\n";
			    amount=amount+cost*smallplate[1];
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
			if((str.equals("纯生"))&&(winekey[0]==1))
			{
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"              "+"x"+String.valueOf(wine[0])+"\n";
			    amount=amount+cost*wine[0];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(wine[1])+"\n";
			    amount=amount+cost*wine[1];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"    "+"x"+String.valueOf(wine[2])+"\n";
			    amount=amount+cost*wine[2];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"x"+String.valueOf(wine[3])+"\n";
			    amount=amount+cost*wine[3];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"      "+"x"+String.valueOf(wine[4])+"\n";
			    amount=amount+cost*wine[4];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"              "+"x"+String.valueOf(wine[5])+"\n";
			    amount=amount+cost*wine[5];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"              "+"x"+String.valueOf(wine[6])+"\n";
			    amount=amount+cost*wine[6];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(wine[7])+"\n";
			    amount=amount+cost*wine[7];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"              "+"x"+String.valueOf(wine[8])+"\n";
			    amount=amount+cost*wine[8];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(wine[9])+"\n";
			    amount=amount+cost*wine[9];
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
			if((str.equals("王老吉"))&&(drinkkey[0]==1))
			{
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(drink[0])+"\n";
			    amount=amount+cost*drink[0];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(drink[1])+"\n";
			    amount=amount+cost*drink[1];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"x"+String.valueOf(drink[2])+"\n";
			    amount=amount+cost*drink[2];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"x"+String.valueOf(drink[3])+"\n";
			    amount=amount+cost*drink[3];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(drink[4])+"\n";
			    amount=amount+cost*drink[4];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(drink[5])+"\n";
			    amount=amount+cost*drink[5];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(drink[6])+"\n";
			    amount=amount+cost*drink[6];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(drink[7])+"\n";
			    amount=amount+cost*drink[7];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"        "+"x"+String.valueOf(drink[8])+"\n";
			    amount=amount+cost*drink[8];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(drink[9])+"\n";
			    amount=amount+cost*drink[9];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"        "+"x"+String.valueOf(drink[10])+"\n";
			    amount=amount+cost*drink[10];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"      "+"x"+String.valueOf(drink[11])+"\n";
			    amount=amount+cost*drink[11];
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
			if((str.equals("蛋炒饭"))&&(staplefoodkey[0]==1))
			{
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(staplefood[0])+"\n";
			    amount=amount+cost*staplefood[0];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(staplefood[1])+"\n";
			    amount=amount+cost*staplefood[1];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(staplefood[2])+"\n";
			    amount=amount+cost*staplefood[2];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(staplefood[3])+"\n";
			    amount=amount+cost*staplefood[3];
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
			if((str.equals("方盘"))&&(platekey[0]==1))
			{
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"              "+"x"+String.valueOf(plate[0])+"\n";
			    amount0=amount0+cost*plate[0];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"x"+String.valueOf(plate[1])+"\n";
			    amount0=amount0+cost*plate[1];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"x"+String.valueOf(plate[2])+"\n";
			    amount0=amount0+cost*plate[2];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(plate[3])+"\n";
			    amount0=amount0+cost*plate[3];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(plate[4])+"\n";
			    amount0=amount0+cost*plate[4];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(plate[5])+"\n";
			    amount0=amount0+cost*plate[5];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"              "+"x"+String.valueOf(plate[6])+"\n";
			    amount0=amount0+cost*plate[6];
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
		view1.setText(show);
		Log.d("amount0",String.valueOf(amount0));
		amount=amount+amount0;
		amounttotal=amount;
		
		spinnerdiscount = (Spinner)findViewById(R.id.zhe);
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, One.this.getResources().getStringArray(R.array.spingarr1));
		spinnerdiscount.setOnItemSelectedListener(new OnItemSelectedListener(){
			public void onItemSelected(AdapterView<?> source,View parent,int position,long id){
				  discount = spinnerdiscount.getSelectedItem().toString();
				  //((TextView) parent).setTextSize(20f);
				  Log.d("discount",discount);
					if(discount.equals("全价"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0;
					}
					if(discount.equals("8.8折"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.88);
					}
					if(discount.equals("7.8折"))
					{
						Log.d("amounttotal",String.valueOf(amounttotal));
						Log.d("amount",String.valueOf(amount));
						Log.d("amount0",String.valueOf(amount0));
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.78);
					}
					if(discount.equals("7.5折"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.75);
					}
					if(discount.equals("7折"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.7);
					}
					if(discount.equals("6.8折"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.68);
					}
					if(discount.equals("6.5折"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.65);
					}
					if(discount.equals("5.8折"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.58);
					}
					view2.setText("¥"+" "+String.valueOf((int)amount)+"("+discount+")");
					view3.setText(String.valueOf((int)amount)+"("+discount+")");
					Temp=view3.getText().toString();
					Log.d("Temp",Temp);
			}

			public void onNothingSelected(AdapterView<?> arg0) {
					
			}
		});
		
		view2.setText("¥"+" "+String.valueOf((int)amount)+"("+discount+")");
		view3.setText(String.valueOf((int)amount)+"("+discount+")");
		Temp=view3.getText().toString();
		
		TempcardNumber=cardNumber;                    //赋值语句，给TempcardNumber赋初值
		spinnerCardNumber = (Spinner)findViewById(R.id.zhx);
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,this.getResources().getStringArray(R.array.spingarr));
		//spinnerCardNumber.setAdapter(adapter);
		spinnerCardNumber.setOnItemSelectedListener(new OnItemSelectedListener(){
			public void onItemSelected(AdapterView<?> source,View parent,int position,long id){
				  //((TextView) parent).setTextSize(20f);
				  if(firstspinner)
				  {
					  firstspinner=false;
				  }
				  else
				  {
					  builder.setTitle("用户你好！");
					  builder.setMessage("点击确定将交换桌号");
					  builder.setPositiveButton("确定",new OnClickListener(){
			 			public void onClick(DialogInterface dialog,int which)
			 			{
			 				cardNumber = spinnerCardNumber.getSelectedItem().toString();
							Log.d("TempcardNumber",TempcardNumber);
			 				Log.d("cardNumber",cardNumber);
			 				Log.d("amount",String.valueOf(amount));
			 				Log.d("show",show);
			 				Log.d("Main",Main);
			 				Log.d("Small",Small);
			 				Log.d("Wine",Wine);
			 				Log.d("Drink",Drink);
			 				Log.d("Staple",Staple);
			 				Log.d("Plate",Plate);
			 				Log.d("Yakitoui",Yakitoui);
			 				new ChangeTable(handler,TempcardNumber).SendDataToServer(cardNumber,Main,Small,Wine,Drink,Yakitoui,Staple,Plate,Temp);
			 				}
			 			}); 
			 			builder.setNegativeButton("取消", new OnClickListener()
			 			{
			 				public void onClick(DialogInterface dialog,int which)
			 				{
			 				
			 				}
			 			});
			 			builder.create().show();
				  }
			}

			public void onNothingSelected(AdapterView<?> arg0) {
					
			}
		});
		
		Log.d("Temp",Temp);
		b.setOnClickListener(new MyButton());
		bn13.setOnClickListener(new MyButton1());
		bn15.setOnClickListener(new MyButton());
		bn16.setOnClickListener(new MyButton());
		bn18.setOnClickListener(new MyButton());
		bn4.setOnClickListener(new MyButton1());
		bn5.setOnClickListener(new MyButton1());
		bn6.setOnClickListener(new MyButton1());
		bn7.setOnClickListener(new MyButton1());
		bn8.setOnClickListener(new MyButton1());
		bn9.setOnClickListener(new MyButton1());
		
		MyApplication.getInstance().addActivity(this);
		MyApplication.getInstance().showActivity();
	}
	
	public void onActivityResult(int requestCode,int resultCode,Intent intent)
	{
		info = intent.getStringArrayListExtra("information1");
		Bundle data=intent.getExtras();
		String package_self=data.getString("package_self");
		String package_aim=data.getString("package_aim");
		if(requestCode==0&&resultCode==1)   //锅(碟)对桌号1的反馈信息
		{
			if(package_aim.equals("com.example.synchronization_food.One"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.One");
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tag",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
			
		}
		if(requestCode==0&&resultCode==2)   //酒对桌号1的反馈信息
		{
			if(package_aim.equals("com.example.synchronization_food.One"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.One");
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tag",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==3)   //饮料对桌号1的反馈信息
		{
			if(package_aim.equals("com.example.synchronization_food.One"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.One");
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tag",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==4)   //主食对桌号1的反馈信息
		{
			if(package_aim.equals("com.example.synchronization_food.One"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.One");
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tag",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==5)   //串串对桌号1的反馈信息
		{
			if(package_aim.equals("com.example.synchronization_food.One"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.One");
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tag",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
		}
		if(requestCode==0&&resultCode==6)   //盘子对桌号1的反馈信息
		{
			if(package_aim.equals("com.example.synchronization_food.One"))
			{
				MyApplication.getInstance().deleteActivity("com.example.synchronization_food.One");
			}
			for(int i = 0; i < info.size(); i++)
			  {
				  Log.d("info_main_tag",info.get(i));
			  }
			MyApplication.getInstance().showActivity();
		}
		
		
		int mainkey[]={1,1,1,1};
		int smallplatekey[]={1,1};
		int winekey[]={1,1,1,1,1,1,1,1,1,1};
		int drinkkey[]={1,1,1,1,1,1,1,1,1,1,1,1};
		int staplefoodkey[]={1,1,1,1};
		int platekey[]={1,1,1,1,1,1,1};
		int main[]={0,0,0,0};
		int smallplate[]={0,0};
		int wine[]={0,0,0,0,0,0,0,0,0,0};
		int drink[]={0,0,0,0,0,0,0,0,0,0,0,0};
		int staplefood[]={0,0,0,0};
		int plate[]={0,0,0,0,0,0,0};
		show="";
		Wine="空";
		Drink="空";
		Yakitoui="空";
		Staple="空";
		Plate="空";
		Main="空";
		Small="空";
		amount=0;
		amount0=0;
		amounttotal=0;
		SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd");   
		time=sDateFormat.format(new java.util.Date());
		
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
			if(str.equals("串串"))
			{
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"¥"+String.valueOf(cost)+"\n";
				amount0=amount0+cost;
				Yakitoui=temp;
				continue;
			}
			if((str.equals("红锅微辣"))&&(mainkey[0]==1))
			{
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));;
				show=show+temp+"      "+"x"+String.valueOf(main[0])+"\n";
			    amount=amount+cost*main[0];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"      "+"x"+String.valueOf(main[1])+"\n";
			    amount=amount+cost*main[1];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"      "+"x"+String.valueOf(main[2])+"\n";
			    amount=amount+cost*main[2];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"x"+String.valueOf(main[3])+"\n";
			    amount=amount+cost*main[3];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(smallplate[0])+"\n";
			    amount=amount+cost*smallplate[0];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(smallplate[1])+"\n";
			    amount=amount+cost*smallplate[1];
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
			if((str.equals("纯生"))&&(winekey[0]==1))
			{
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"              "+"x"+String.valueOf(wine[0])+"\n";
			    amount=amount+cost*wine[0];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(wine[1])+"\n";
			    amount=amount+cost*wine[1];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"    "+"x"+String.valueOf(wine[2])+"\n";
			    amount=amount+cost*wine[2];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"x"+String.valueOf(wine[3])+"\n";
			    amount=amount+cost*wine[3];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"      "+"x"+String.valueOf(wine[4])+"\n";
			    amount=amount+cost*wine[4];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"              "+"x"+String.valueOf(wine[5])+"\n";
			    amount=amount+cost*wine[5];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"              "+"x"+String.valueOf(wine[6])+"\n";
			    amount=amount+cost*wine[6];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(wine[7])+"\n";
			    amount=amount+cost*wine[7];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"              "+"x"+String.valueOf(wine[8])+"\n";
			    amount=amount+cost*wine[8];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(wine[9])+"\n";
			    amount=amount+cost*wine[9];
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
			if((str.equals("王老吉"))&&(drinkkey[0]==1))
			{
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(drink[0])+"\n";
			    amount=amount+cost*drink[0];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(drink[1])+"\n";
			    amount=amount+cost*drink[1];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"x"+String.valueOf(drink[2])+"\n";
			    amount=amount+cost*drink[2];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"x"+String.valueOf(drink[3])+"\n";
			    amount=amount+cost*drink[3];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(drink[4])+"\n";
			    amount=amount+cost*drink[4];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(drink[5])+"\n";
			    amount=amount+cost*drink[5];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(drink[6])+"\n";
			    amount=amount+cost*drink[6];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(drink[7])+"\n";
			    amount=amount+cost*drink[7];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"        "+"x"+String.valueOf(drink[8])+"\n";
			    amount=amount+cost*drink[8];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(drink[9])+"\n";
			    amount=amount+cost*drink[9];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"        "+"x"+String.valueOf(drink[10])+"\n";
			    amount=amount+cost*drink[10];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"      "+"x"+String.valueOf(drink[11])+"\n";
			    amount=amount+cost*drink[11];
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
			if((str.equals("蛋炒饭"))&&(staplefoodkey[0]==1))
			{
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(staplefood[0])+"\n";
			    amount=amount+cost*staplefood[0];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(staplefood[1])+"\n";
			    amount=amount+cost*staplefood[1];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(staplefood[2])+"\n";
			    amount=amount+cost*staplefood[2];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(staplefood[3])+"\n";
			    amount=amount+cost*staplefood[3];
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
			if((str.equals("方盘"))&&(platekey[0]==1))
			{
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"              "+"x"+String.valueOf(plate[0])+"\n";
			    amount0=amount0+cost*plate[0];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"x"+String.valueOf(plate[1])+"\n";
			    amount0=amount0+cost*plate[1];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"          "+"x"+String.valueOf(plate[2])+"\n";
			    amount0=amount0+cost*plate[2];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"            "+"x"+String.valueOf(plate[3])+"\n";
			    amount0=amount0+cost*plate[3];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(plate[4])+"\n";
			    amount0=amount0+cost*plate[4];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"                "+"x"+String.valueOf(plate[5])+"\n";
			    amount0=amount0+cost*plate[5];
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
				cost=Double.parseDouble(temp.substring(temp.indexOf("(")+1,temp.indexOf(")")));
				show=show+temp+"              "+"x"+String.valueOf(plate[6])+"\n";
			    amount0=amount0+cost*plate[6];
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
		
		for(int i=0;i<info.size();i++)
		{
			temp=info.get(i);
			str=temp.substring(0,temp.indexOf("("));
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
		
		view1.setText(show);
		amount=amount+amount0;
		amounttotal=amount;
		discount = spinnerdiscount.getSelectedItem().toString();
				  //((TextView) parent).setTextSize(20f);
				  Log.d("discount",discount);
					if(discount.equals("全价"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0;
					}
					if(discount.equals("9折"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.9);
					}
					if(discount.equals("8.8折"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.88);
					}
					if(discount.equals("7.8折"))
					{
						Log.d("amounttotal",String.valueOf(amounttotal));
						Log.d("amount",String.valueOf(amount));
						Log.d("amount0",String.valueOf(amount0));
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.78);
					}
					if(discount.equals("7.5折"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.75);
					}
					if(discount.equals("7折"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.7);
					}
					if(discount.equals("6.8折"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.68);
					}
					if(discount.equals("6.5折"))
					{
						amount=amounttotal;
						amount=(amount-amount0)+amount0*(0.65);
					}
					
					view2.setText("¥"+" "+String.valueOf((int)amount)+"("+discount+")");
					view3.setText(String.valueOf((int)amount)+"("+discount+")");
					Temp=view3.getText().toString();
					Log.d("Temp",Temp);
	
		
		view2.setText("¥"+" "+String.valueOf((int)amount)+"("+discount+")");
		view3.setText(String.valueOf((int)amount)+"("+discount+")");
		Temp=view3.getText().toString();
		
		
	}
	
	class MyButton1 implements View.OnClickListener
	{
		public void onClick(View source)
		{
			switch(source.getId())
			{	
				case R.id.Button4:
		 			Intent intent0=new Intent(One.this,potdish.class);
		 			intent0.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		 			intent0.putStringArrayListExtra("information1", info);
		 			startActivityForResult(intent0,0); 
					break;
				case R.id.Button5:
		 			Intent intent1=new Intent(One.this,wine.class);
		 			intent1.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		 			intent1.putStringArrayListExtra("information1", info);
		 			startActivityForResult(intent1,0); 
					break;
				case R.id.Button6:
		 			Intent intent2=new Intent(One.this,Drink.class);
		 			intent2.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		 			intent2.putStringArrayListExtra("information1", info);
		 			startActivityForResult(intent2,0);
					break;
				case R.id.Button7:
		 			Intent intent3=new Intent(One.this,Staple_food.class);
		 			intent3.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		 			intent3.putStringArrayListExtra("information1", info);
		 			startActivityForResult(intent3,0);
					break;
				case R.id.Button8:
		 			Intent intent4=new Intent(One.this,yakitoui.class);
		 			intent4.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		 			intent4.putStringArrayListExtra("information1", info);
		 			startActivityForResult(intent4,0);
					break;
				case R.id.Button9:
		 			Intent intent5=new Intent(One.this,Plate.class);
		 			intent5.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		 			intent5.putStringArrayListExtra("information1", info);
		 			startActivityForResult(intent5,0);
					break;
				case R.id.Button13:
					Intent intent=getIntent();
					ArrayList<String> infocost=new ArrayList<String>();
					
					intent.putStringArrayListExtra("information1", info);
		 	  		Bundle data=new Bundle();
		  			data.putString("package_self","com.example.synchronization_food.One");
		  			data.putString("package_aim","com.example.synchronization_food.MainActivity");
		  			intent.putExtras(data);
					
		  			One.this.setResult(1,intent);
	        		One.this.finish(); 
		 			break;
			}
		}
	}
	
	class MyButton implements View.OnClickListener
	{
		public void onClick(View source)
		{
			switch(source.getId())
			{
			 	case R.id.Button18:
			 		TB.clear();
			 		firstspinner=true;
			 		RecycleGuestFromServer one=new RecycleGuestFromServer(handler,"1号"); 
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
							TB.add("1号");
						}
						if(tablenumber[1].equals("0"))
						{
							TB.add("2号");
						}
						if(tablenumber[2].equals("0"))
						{
							TB.add("3号");
						}
						if(tablenumber[3].equals("0"))
						{
							TB.add("4号");
						}
						if(tablenumber[4].equals("0"))
						{
							TB.add("5号");
						}
						if(tablenumber[5].equals("0"))
						{
							TB.add("6号"); 
						}
						if(tablenumber[6].equals("0"))
						{
							TB.add("7号");
						}
						if(tablenumber[7].equals("0"))
						{
							TB.add("8号");
						}
						if(tablenumber[8].equals("0"))
						{
							TB.add("9号"); 
						}
						if(tablenumber[9].equals("0"))
						{
							TB.add("10号"); 
						}
						if(tablenumber[10].equals("0"))
						{
							TB.add("11号");  
						}
						if(tablenumber[11].equals("0"))
						{
							TB.add("12号"); 
						}
						if(tablenumber[12].equals("0"))
						{
							TB.add("13号"); 
						}
						if(tablenumber[13].equals("0"))
						{
							TB.add("14号");  
						}
						if(tablenumber[14].equals("0"))
						{
							TB.add("15号"); 
						}
						if(tablenumber[15].equals("0"))
						{
							TB.add("16号");  
						}
						if(tablenumber[16].equals("0"))
						{
							TB.add("17号");   
						}
						if(tablenumber[17].equals("0"))
						{
							TB.add("18号");
						}						
						if(tablenumber[18].equals("0"))
						{
							TB.add("19号"); 
						}
						if(tablenumber[19].equals("0"))
						{
							TB.add("20号"); 
						}
						if(tablenumber[20].equals("0"))
						{
							TB.add("21号"); 
						}
						if(tablenumber[21].equals("0"))
						{
							TB.add("22号"); 
						}
						if(tablenumber[22].equals("0"))
						{
							TB.add("23号");  
						}
						if(tablenumber[23].equals("0"))
						{
							TB.add("24号"); 
						}
						if(tablenumber[24].equals("0"))
						{
							TB.add("25号"); 
						}
						if(tablenumber[25].equals("0"))
						{
							TB.add("26号"); 
						}
					} 
					catch (Exception e) {
					 e.printStackTrace();
					}
					ArrayAdapter adapter=new ArrayAdapter<String>(One.this,android.R.layout.simple_spinner_item,TB);
					spinnerCardNumber.setAdapter(adapter);
					
			 		break;
			 	case R.id.Button14:
					Temp=view3.getText().toString();
				 	if(Temp.indexOf("(")==-1)
				 	{
				 		Toast.makeText(One.this, "数据格式不正确,无法提交", Toast.LENGTH_SHORT).show();
				 	}
				 	else
				 	{
				 		temp=Temp.substring(0,Temp.indexOf("("));
				 		if((Number(temp))&&((Temp.indexOf("(")==2)||(Temp.indexOf("(")==3)||(Temp.indexOf("(")==4)))
				 		{
				 			Log.d("Temp",Temp);
				 			builder.setTitle("用户你好！");
				 			builder.setMessage("点击确定将提交账单");
				 			builder.setPositiveButton("确定",new OnClickListener(){
				 			public void onClick(DialogInterface dialog,int which)
				 			{
				 				SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd");     
				 				time=sDateFormat.format(new java.util.Date());
				 				db=SQLiteDatabase.openOrCreateDatabase(One.this.getFilesDir().toString()+"/my.db3",null);
				 				db.execSQL("create table if not exists food(_id integer primary key autoincrement,time text,table_number text,cost text,dish text)");
				 				db.execSQL("insert into food(time,table_number,cost,dish) values('"+time+"','"+cardNumber+"','"+Temp+"','"+show+"')");
				 				Log.d("time",time);
				 				Log.d("cardNumber",TempcardNumber);
				 				Log.d("amount",String.valueOf(amount));
				 				Log.d("show",show);
				 				Log.d("Main",Main);
				 				Log.d("Small",Small);
				 				Log.d("Wine",Wine);
				 				Log.d("Drink",Drink);
				 				Log.d("Staple",Staple);
				 				Log.d("Plate",Plate);
				 				Log.d("Yakitoui",Yakitoui);
				 				new SendDateToServer(handler).SendDataToServer(time,TempcardNumber,Main,Small,Wine,Drink,Yakitoui,Staple,Plate,Temp);
			 					}
				 			}); 
				 			builder.setNegativeButton("取消", new OnClickListener()
				 			{
				 				public void onClick(DialogInterface dialog,int which)
				 				{
			 				
				 				}
				 			});
				 			builder.create().show();
						}
						else
						{
							Toast.makeText(One.this, "数据格式不正确,无法提交", Toast.LENGTH_SHORT).show();
						}
				 	}
			 		break;
			 	case R.id.Button15:
			 		LinearLayout aa=(LinearLayout)findViewById(R.id.aa);
			 		if(flagaa)
			 		{
			 			aa.setVisibility(source.VISIBLE); 
			 			bn15.setImageResource(R.drawable.dd);
			 			flagaa=false;
			 		}
			 		else
			 		{
			 			aa.setVisibility(source.INVISIBLE); 
			 			bn15.setImageResource(R.drawable.ee);
			 			flagaa=true;
			 		}
			 		break;
			 case R.id.Button16:
			 		LinearLayout bb=(LinearLayout)findViewById(R.id.bb);
			 		if(flagaa)
			 		{
			 			bb.setVisibility(source.VISIBLE); 
			 			bn16.setImageResource(R.drawable.gg);
			 			flagaa=false;
			 		}
			 		else
			 		{
			 			bb.setVisibility(source.INVISIBLE); 
			 			bn16.setImageResource(R.drawable.ff);
			 			flagaa=true;
			 		}
			 		break;
			}
		}
	}
	
    Handler handler=new Handler(){  
        public void handleMessage(Message msg) {  
            switch (msg.what) {  
            case SendDateToServer.SEND_SUCCESS:  
                Toast.makeText(One.this, "数据提交成功", Toast.LENGTH_SHORT).show();
                b.setEnabled(false);
				temp=TempcardNumber+"()";  
                for (int i = 0; i < info.size(); i++) 
				  { 
					    if(temp.equals(info.get(i)))
					    {
					    	
					    }
					    else
					    {
					    	info.remove(i);  
					    	i--;
					    }
				  }
                break;  
            case SendDateToServer.SEND_FAIL:  
                Toast.makeText(One.this, "数据提交失败，请重新尝试", Toast.LENGTH_SHORT).show(); 
                break; 
            case ClearDataToServer.CLEAR_SUCCESS:
            	Toast.makeText(One.this, "数据清除成功", Toast.LENGTH_SHORT).show();
    			temp=TempcardNumber+"()";  
                for (int i = 0; i < info.size(); i++) 
				  { 
					    if(temp.equals(info.get(i)))
					    {
					    	
					    }
					    else
					    {
					    	info.remove(i);  
					    	i--;
					    }
				  }
                break;
            case ClearDataToServer.CLEAR_FAIL:
            	Toast.makeText(One.this, "数据清除失败", Toast.LENGTH_SHORT).show();
            case ChangeTable.CHANGE_SUCCESS:
            	Toast.makeText(One.this, "换桌成功", Toast.LENGTH_SHORT).show();
            	temp=TempcardNumber+"()";
                for (int i = 0; i < info.size(); i++) 
				{ 
					    if(temp.equals(info.get(i)))
					    {
					    	info.remove(i);  
					    	i--;
					    	break;
					    }
				}
                info.add(cardNumber+"()");
                for(int i=0;i<info.size();i++)
                {
                	Log.d("INFO",info.get(i));
                }
               	viewtop.setText(cardNumber+"桌");
                break;
            case ChangeTable.CHANGE_FAIL:
            	Toast.makeText(One.this, "换桌失败", Toast.LENGTH_SHORT).show();
            }  
        };        
    }; 
	 public boolean onKeyDown(int keyCode, KeyEvent event) {
	       
	    	if (keyCode == KeyEvent.KEYCODE_BACK) 
	    	{
				Intent intent=getIntent();
				ArrayList<String> infocost=new ArrayList<String>();
	  				
				intent.putStringArrayListExtra("information1", info);
	 	  		Bundle data=new Bundle();
	  			data.putString("package_self","com.example.synchronization_food.One");
	  			data.putString("package_aim","com.example.synchronization_food.MainActivity");
	  			intent.putExtras(data);
	  			 
	  			One.this.setResult(1,intent);
        		One.this.finish(); 
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
	 
	 public  boolean Number(String temp)
	 {
			try{
				int a=Integer.valueOf(temp);
				return true;
			}catch(Exception e){
				return false;
			}
	 }
}
