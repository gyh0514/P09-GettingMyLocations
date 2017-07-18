package android.myapplicationdev.com.p09_gettingmylocations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class LocationActivity extends AppCompatActivity {

    TextView tv;
    Button btnRefresh;
    ListView lv;
    ArrayList<String> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        tv = (TextView) findViewById(R.id.tv);
        btnRefresh = (Button) findViewById(R.id.btnRefresh);
        lv = (ListView) findViewById(R.id.lv);

        al = new ArrayList<String>();


        btnRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
