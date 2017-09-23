package in.technos.technosservices;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView r1;
    String s1[];
    MyOwnAdapter ad;
    ViewPager viewPager;
    CustomSwipeAdapter adapter;



   int imageResource[] = {R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer,R.drawable.raman_spectrometer};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);

        r1=(RecyclerView)findViewById(R.id.myRecycler);


        s1=getResources().getStringArray(R.array.pet_name);
        // s2=getResources().getStringArray(R.array.description);

        ad=new MyOwnAdapter(this,s1,imageResource);
        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));

        //r1.setNestedScrollingEnabled(false);
    }
}
