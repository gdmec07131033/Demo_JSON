package cn.edu.gdmec.s07131033.demo_json;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        /*JSONObject person = new JSONObject();
        
        try {
			person.put("name", "feng");
			person.put("age", 18);
			
			JSONArray phones = new JSONArray();
			
			phones.put("123456").put("456789");
			person.put("phones", phones);
			
			String jsonData = person.toString();
			
			Log.i("info", jsonData);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        String s = null;
        
        try {
			JSONStringer jsonStringer = new JSONStringer();
			jsonStringer.object();
			jsonStringer.key("name").value("lanlan");
			jsonStringer.key("age").value(19);
			
			jsonStringer.key("phones");
			jsonStringer.array();
			jsonStringer.value("963963").value("745874");
			jsonStringer.endArray();
			jsonStringer.endObject();
			
			s =   jsonStringer.toString();
			Log.i("s", s);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			JSONObject person = new JSONObject(s);
			
			String name = person.getString("name");
			int age = person.getInt("age");
			
		 	JSONArray phones =  person.getJSONArray("phones");
		 	String phone1 = phones.getString(0);
		 	String phone2 = phones.getString(1);
		 	
		 	List<String> numbers = new ArrayList<String>();
		 	numbers.add(phone1);
		 	numbers.add(phone2);
		 	
		 	Person p = new Person(age, name, numbers);
		 	
		 	Log.i("info", "生成JAVA对象："+p.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }

    
}
