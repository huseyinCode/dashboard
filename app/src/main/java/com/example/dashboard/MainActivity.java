package com.example.dashboard;


import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {


    int[] imagesL ={R.drawable.bulb,R.drawable.bulbempty,};
    int[] texts ={R.string.aktif,R.string.kapali};
    int[] textsKP={R.string.kapali,R.string.a_k};
    ImageView iv,iv1,iv2,iv3,iv4,iv5,iv6,iv7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView ledroom1=findViewById(R.id.textLocation);
        TextView ledroom2=findViewById(R.id.textLocation1);
        TextView ledroom3=findViewById(R.id.textLocation2);
        TextView ledroom4=findViewById(R.id.textLocation3);
        TextView ledroom5=findViewById(R.id.textLocation4);
        TextView ledroom6=findViewById(R.id.textLocation5);
        TextView ledroom7=findViewById(R.id.textLocation6);
        TextView ledroom8=findViewById(R.id.textLocation7);

        TextView peroom1=findViewById(R.id.textLocationp);
        TextView peroom2=findViewById(R.id.textLocation1p);
        TextView peroom3=findViewById(R.id.textLocation2p);
        TextView peroom4=findViewById(R.id.textLocation3p);

        TextView keproom1=findViewById(R.id.textLocationk);
        TextView keproom2=findViewById(R.id.textLocation1k);
        TextView keproom3=findViewById(R.id.textLocation2k);
        TextView keproom4=findViewById(R.id.textLocation3k);
        TextView keproom5=findViewById(R.id.textLocation4k);
        TextView keproom6=findViewById(R.id.textLocation5k);


        Button led = findViewById(R.id.buttonled);
        led.setOnClickListener(new View.OnClickListener() {
            int i=0;
            @Override
            public void onClick(View v) {

                View bulbs =findViewById(R.id.bulbs);
                i++;
                if (i==1){
                    bulbs.setVisibility(View.VISIBLE);
                    i=1;



                }
                if (i==2){
                    bulbs.setVisibility(View.GONE);
                    i=0;


                }

            }




        });
        Button perde = findViewById(R.id.buttonperde);
        perde.setOnClickListener(new View.OnClickListener() {
            int i=0;
            @Override
            public void onClick(View v) {

                View perde =findViewById(R.id.perde);
                i++;
                if (i==1){
                    perde.setVisibility(View.VISIBLE);
                    i=1;

                }
                if (i==2){
                    perde.setVisibility(View.GONE);
                    i=0;

                }

            }




        });
        Button kepenk = findViewById(R.id.buttonkepenk);
        kepenk.setOnClickListener(new View.OnClickListener() {
            int i=0;
            @Override
            public void onClick(View v) {

                View kepenk =findViewById(R.id.kepenk);
                i++;
                if (i==1){
                    kepenk.setVisibility(View.VISIBLE);
                    i=1;





                }
                if (i==2){
                    kepenk.setVisibility(View.GONE);
                    i=0;

                }

            }




        });

        Button led1=findViewById(R.id.led1);
        Button led2=findViewById(R.id.led2);
        Button led3=findViewById(R.id.led3);
        Button led4=findViewById(R.id.led4);
        Button led5=findViewById(R.id.led5);
        Button led6=findViewById(R.id.led6);
        Button led7=findViewById(R.id.led7);
        Button led8=findViewById(R.id.led8);
        iv= findViewById(R.id.bulb1);
        iv1=findViewById(R.id.bulb2);
        iv2=findViewById(R.id.bulb3);
        iv3=findViewById(R.id.bulb4);
        iv4=findViewById(R.id.bulb5);
        iv5=findViewById(R.id.bulb6);
        iv6=findViewById(R.id.bulb7);
        iv7=findViewById(R.id.bulb8);
        TextView active =findViewById(R.id.textAmount1);
        TextView active1=findViewById(R.id.textAmount2);
        TextView active2=findViewById(R.id.textAmount3);
        TextView active3=findViewById(R.id.textAmount4);
        TextView active4=findViewById(R.id.textAmount5);
        TextView active5=findViewById(R.id.textAmount6);
        TextView active6=findViewById(R.id.textAmount7);
        TextView active7=findViewById(R.id.textAmount8);
        led1.setOnClickListener(new View.OnClickListener() {
    int l=0;
    @Override
    public void onClick(View view) {
        iv.setImageResource(imagesL[l]);
        active.setText(texts[l]);
        l++;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference salon_lamba = database.getReference("salon lamba");
        salon_lamba.setValue("1");
        ledroom1.setVisibility(View.VISIBLE);

        if(l==2) {
            salon_lamba.setValue("0");
            l=0;
            ledroom1.setVisibility(View.GONE);
        }

    }
});
        led2.setOnClickListener(new View.OnClickListener() {
            int l=0;
            @Override
            public void onClick(View view) {
                iv1.setImageResource(imagesL[l]);
                active1.setText(texts[l]);
                l++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference mutfak= database.getReference("mutfak lamba");
                mutfak.setValue("1");
                ledroom2.setVisibility(View.VISIBLE);

                if(l==2) {
                    mutfak.setValue("0");
                    l=0;

                    ledroom2.setVisibility(View.GONE);
                }

            }
        });
        led3.setOnClickListener(new View.OnClickListener() {
            int l=0;
            @Override
            public void onClick(View view) {
                iv2.setImageResource(imagesL[l]);
                active2.setText(texts[l]);
                l++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference yatak = database.getReference("yatak odası lamba");
                yatak.setValue("1");
                ledroom3.setVisibility(View.VISIBLE);
                if(l==2) {
                    yatak.setValue("0");
                    l=0;
                    ledroom3.setVisibility(View.GONE);
                }

            }
        });
        led4.setOnClickListener(new View.OnClickListener() {
            int l=0;
            @Override
            public void onClick(View view) {
                iv3.setImageResource(imagesL[l]);
                active3.setText(texts[l]);
                l++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference ambiyans = database.getReference("ambians");
                ambiyans.setValue("1");
                ledroom4.setVisibility(View.VISIBLE);



                if(l==2) {
                    ambiyans.setValue("0");
                    l=0;
                    ledroom4.setVisibility(View.GONE);
                }

            }
        });
        led5.setOnClickListener(new View.OnClickListener() {
            int l=0;
            @Override
            public void onClick(View view) {
                iv4.setImageResource(imagesL[l]);
                active4.setText(texts[l]);
                l++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference garaj = database.getReference("garaj lamba");
                garaj.setValue("1");
                ledroom5.setVisibility(View.VISIBLE);
                if(l==2) {
                    garaj.setValue("0");
                    l=0;
                    ledroom5.setVisibility(View.GONE);
                }

            }
        });
        led6.setOnClickListener(new View.OnClickListener() {
            int l=0;
            @Override
            public void onClick(View view) {
                iv5.setImageResource(imagesL[l]);
                active5.setText(texts[l]);
                l++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference koridor= database.getReference("koridor lamba");
               koridor.setValue("1");
                ledroom6.setVisibility(View.VISIBLE);


                if(l==2) {
                    koridor.setValue("0");
                    l=0;
                    ledroom6.setVisibility(View.GONE);
                }

            }
        });
        led7.setOnClickListener(new View.OnClickListener() {
            int l=0;
            @Override
            public void onClick(View view) {
                iv6.setImageResource(imagesL[l]);
                active6.setText(texts[l]);
                l++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference tuvalet= database.getReference("tuvalet lamba");
                tuvalet.setValue("1");
                ledroom7.setVisibility(View.VISIBLE);
                if(l==2) {
                    tuvalet.setValue("0");
                    l=0;
                    ledroom7.setVisibility(View.GONE);
                }

            }
        });
        led8.setOnClickListener(new View.OnClickListener() {
            int l=0;
            @Override
            public void onClick(View view) {

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference cocuk = database.getReference("çocuk odası lamba");
                active7.setText(texts[l]);
                iv7.setImageResource(imagesL[l]);
                cocuk.setValue("1");
                ledroom8.setVisibility(View.VISIBLE);
                l++;

                if(l==2) {
                    cocuk.setValue("0");
                    l=0;
                    ledroom8.setVisibility(View.GONE);
                }

            }
        });

        //perde alt menü
        Button perde1=findViewById(R.id.perde1);
        Button perde2=findViewById(R.id.perde2);
        Button perde3=findViewById(R.id.perde3);
        Button perde4=findViewById(R.id.perde4);
        TextView active01=  findViewById(R.id.perdeAmount1);
        TextView active02 = findViewById(R.id.perdeAmount2);
        TextView active03 =findViewById(R.id.perdeAmount3);
        TextView active04 =findViewById(R.id.perdeAmount4);

        perde1.setOnClickListener(new View.OnClickListener() {
            int p=0;
            @Override
            public void onClick(View view) {
                active01.setText(textsKP[p]);
                p++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference salon = database.getReference("salon perde");
                salon.setValue("1");
                peroom1.setVisibility(View.VISIBLE);

                if(p==2) {
                    salon.setValue("0");
                    peroom1.setVisibility(View.GONE);
                    p=0;
                }

            }
        });//salon
        perde2.setOnClickListener(new View.OnClickListener() {
            int p=0;
            @Override
            public void onClick(View view) {
                active02.setText(textsKP[p]);
                p++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference cocuk = database.getReference("çocuk odası perde");
                cocuk.setValue("1");
                peroom2.setVisibility(View.VISIBLE);
                if(p==2) {
                    cocuk.setValue("0");
                    peroom2.setVisibility(View.GONE);
                    p=0;
                }

            }
        });//çocuk odası
        perde3.setOnClickListener(new View.OnClickListener() {
            int p=0;
            @Override
            public void onClick(View view) {
                active03.setText(textsKP[p]);
                p++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference mutfak= database.getReference("mutfak perde");
                mutfak.setValue("1");
                peroom3.setVisibility(View.VISIBLE);
                if(p==2) {
                    mutfak.setValue("0");
                    peroom3.setVisibility(View.GONE);
                    p=0;
                }

            }
        });//mutfak
        perde4.setOnClickListener(new View.OnClickListener() {
            int p=0;
            @Override
            public void onClick(View view) {
                active04.setText(textsKP[p]);
                p++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference  yatak= database.getReference("yatak odası perde");
                yatak.setValue("1");
                peroom4.setVisibility(View.VISIBLE);
                if(p==2) {
                    yatak.setValue("0");
                    peroom4.setVisibility(View.GONE);
                    p=0;
                }

            }
        });//yatak odası


        Button kepenk1=findViewById(R.id.kepenk1);
        Button kepenk2=findViewById(R.id.kepenk2);
        Button kepenk3=findViewById(R.id.kepenk3);
        Button kepenk4=findViewById(R.id.kepenk4);
        Button kepenk5=findViewById(R.id.kepenk5);
        Button kepenk6=findViewById(R.id.kepenk6);

        TextView active001 =  findViewById(R.id.kepenkAmount1);
        TextView active002 =  findViewById(R.id.kepenkAmount2);
        TextView active003 =findViewById(R.id.kepenkAmount3);
        TextView active004 =  findViewById(R.id.kepenkAmount4);
        TextView active005 =findViewById(R.id.kepenkAmount5);
        TextView active006 =findViewById(R.id.kepenkAmount6);

        kepenk1.setOnClickListener(new View.OnClickListener() {
            int k=0;
            @Override
            public void onClick(View view) {
                active001.setText(textsKP[k]);
                k++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference garaj = database.getReference("garaj kepenk");
                keproom1.setVisibility(View.VISIBLE);
                garaj.setValue("1");
                if(k==2) { garaj.setValue("0");k=0;keproom1.setVisibility(View.GONE);}

            }
        });//garaj
        kepenk2.setOnClickListener(new View.OnClickListener() {
            int k=0;
            @Override
            public void onClick(View view) {
                active002.setText(textsKP[k]);
                k++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference salon= database.getReference("salon kepenk");
                keproom2.setVisibility(View.VISIBLE);
                salon.setValue("1");
                if(k==2) { salon.setValue("0");k=0;keproom2.setVisibility(View.GONE);}

            }
        });//salon
        kepenk3.setOnClickListener(new View.OnClickListener() {
            int k=0;
            @Override
            public void onClick(View view) {
                active003.setText(textsKP[k]);
                k++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference yatak = database.getReference("yatak odası kepenk");
                keproom3.setVisibility(View.VISIBLE);
                yatak.setValue("1");
                if(k==2) { yatak.setValue("0");k=0;keproom3.setVisibility(View.GONE);}

            }
        });//yatak
        kepenk4.setOnClickListener(new View.OnClickListener() {
            int k=0;
            @Override
            public void onClick(View view) {
                active004.setText(textsKP[k]);
                k++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference ambians= database.getReference("ambians kepenk");
                keproom4.setVisibility(View.VISIBLE);
                ambians.setValue("1");
                if(k==2) { ambians.setValue("0");k=0;keproom4.setVisibility(View.GONE);}

            }
        });//ambians
        kepenk5.setOnClickListener(new View.OnClickListener() {
            int k=0;
            @Override
            public void onClick(View view) {
                active005.setText(textsKP[k]);
                k++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference mutfak = database.getReference("mutfak kepenk");
                keproom5.setVisibility(View.VISIBLE);
                mutfak.setValue("1");
                if(k==2) { mutfak.setValue("0");k=0;keproom5.setVisibility(View.GONE);}

            }
        });//mutfak
        kepenk6.setOnClickListener(new View.OnClickListener() {
            int k=0;
            @Override
            public void onClick(View view) {
                active006.setText(textsKP[k]);
                k++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference cocuk = database.getReference("çocuk odası kepenk");
                keproom6.setVisibility(View.VISIBLE);
                cocuk.setValue("1");
                if(k==2) { cocuk.setValue("0");k=0;keproom6.setVisibility(View.GONE);}

            }
        });//çocuk


        Button cati=findViewById(R.id.çatı);
        TextView active0001=findViewById(R.id.catiAmount);

        cati.setOnClickListener(new View.OnClickListener() {
            int c=0;
            @Override
            public void onClick(View view) {
                active0001.setText(textsKP[c]);
                c++;
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference cati = database.getReference("çatı");
                cati.setValue("1");
                if(c==2) { cati.setValue("0");c=0;}

            }
        });//çatı
        DatabaseReference dereceRef = FirebaseDatabase.getInstance().getReference("sıcaklık");
        TextView derece=findViewById(R.id.derececount);
        dereceRef.addValueEventListener(new ValueEventListener() {
            String data;
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
              data= Objects.requireNonNull(snapshot.getValue()).toString();
              if (snapshot.exists())
                  derece.setText(data);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        DatabaseReference nemRef = FirebaseDatabase.getInstance().getReference("nem");
        TextView nem=findViewById(R.id.nemcount);
        nemRef.addValueEventListener(new ValueEventListener() {
            String data;
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                data= Objects.requireNonNull(snapshot.getValue()).toString();
                if (snapshot.exists())
                    nem.setText(data);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        DatabaseReference isikRef = FirebaseDatabase.getInstance().getReference("ışık");
        TextView isik=findViewById(R.id.ışıkcount);
        isikRef.addValueEventListener(new ValueEventListener() {
            String data;
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                data= Objects.requireNonNull(snapshot.getValue()).toString();
                if (snapshot.exists())
                    isik.setText(data);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

textanimk();
textaniml();
textanimp();


    }

    private void textanimk() {
        View layout1=findViewById(R.id.container_layout);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.in);
        layout1.startAnimation(animation1);
    }
    private void textaniml() {
        View layout2=findViewById(R.id.container_layout1);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.in);
        layout2.startAnimation(animation1);
    }
    private void textanimp() {
        View layout3=findViewById(R.id.container_layout2);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.incut);
        layout3.startAnimation(animation1);
    }
}


