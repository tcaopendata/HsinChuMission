package studio.su.austin.hsinchumission;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class mission_1question_1_task_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_1question_1_task_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        Button mission_task_1_send = (Button)findViewById(R.id.butten_m1_t1_SendAns);
        mission_task_1_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setClass(mission_1question_1_task_1.this  , mission_1.class);
//                startActivity(intent);
                CheckBox _Checkbox_m1_t1_c2 = (CheckBox) findViewById(R.id.checkbox_m1_t1_c2);
                CheckBox _Checkbox_m1_t1_c1 = (CheckBox) findViewById(R.id.checkbox_m1_t1_c1);

                if(_Checkbox_m1_t1_c2.isChecked() && !(_Checkbox_m1_t1_c1.isChecked()))
                {
                    Toast toast = Toast.makeText(mission_1question_1_task_1.this,
                            "答對了", Toast.LENGTH_LONG);
                    //顯示Toast
                    toast.show();
                }
                else
                {
                    Toast toast = Toast.makeText(mission_1question_1_task_1.this,
                            "答錯了", Toast.LENGTH_LONG);
                    //顯示Toast
                    toast.show();
                }
            }
        });


    }

}
