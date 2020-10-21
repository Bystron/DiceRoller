package cat.itb.diceroll;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

     Button roll_button;
     ImageView dau;
     ImageView dau_dos;
     Button reestart_button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll_button = findViewById(R.id.roll_button);
        dau = findViewById(R.id.dau_1);
        dau_dos = findViewById(R.id.dau_2);
        reestart_button = findViewById(R.id.reset_button);

        roll_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int random = 0;
               int random2 =0;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    random = ThreadLocalRandom.current().nextInt(1,6+1);
                    random2 = ThreadLocalRandom.current().nextInt(1,6+1);
                }

                dau.setVisibility(View.VISIBLE);
                dau_dos.setVisibility(View.VISIBLE);

                switch (random){
                    case 1:
                        dau.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        dau.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        dau.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        dau.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        dau.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        dau.setImageResource(R.drawable.dice_6);
                        break;
                }

                switch (random2){
                    case 1:
                        dau_dos.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        dau_dos.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        dau_dos.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        dau_dos.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        dau_dos.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        dau_dos.setImageResource(R.drawable.dice_6);
                        break;
                }

                if (random==6&&random2==6){

                    Toast.makeText(getApplicationContext(),"JACKPOT",Toast.LENGTH_SHORT).show();

                }

            }
        });

        reestart_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dau.setVisibility(View.INVISIBLE);
                dau_dos.setVisibility(View.INVISIBLE);

            }
        });

        dau.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                int random = 0;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    random = ThreadLocalRandom.current().nextInt(1,6+1);}
                dau.setVisibility(View.VISIBLE);
                switch (random){
                    case 1:
                        dau.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        dau.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        dau.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        dau.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        dau.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        dau.setImageResource(R.drawable.dice_6);
                        break;
                }

            }
        });

        dau_dos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                int random = 0;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    random = ThreadLocalRandom.current().nextInt(1,6+1);}
                dau_dos.setVisibility(View.VISIBLE);
                switch (random){
                    case 1:
                        dau_dos.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        dau_dos.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        dau_dos.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        dau_dos.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        dau_dos.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        dau_dos.setImageResource(R.drawable.dice_6);
                        break;
                }

            }
        });
    }
}