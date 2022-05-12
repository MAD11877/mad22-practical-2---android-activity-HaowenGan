package sg.edu.mad.madpracticalweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "Main Activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        user.setFollow(false);


        Button followBtn = findViewById(R.id.followbtn);
        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (user.isFollow() == false)
                {
                    followBtn.setText("UNFOLLOW");
                    user.setFollow(true);
                }
                else if (user.isFollow() == true)
                {
                    followBtn.setText("FOLLOW");
                    user.setFollow(false);
                }

            }
        });
    }
}