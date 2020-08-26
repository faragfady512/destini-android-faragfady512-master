package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
     private TextView mstoryTextView;
     private Button mtopButton;
     private Button mbottomButton;
    private  int mStoryIndex = 1 ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mstoryTextView = (TextView) findViewById(R.id.storyTextView);
        mtopButton = (Button) findViewById(R.id.buttonTop);
        mbottomButton = (Button) findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mtopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( mStoryIndex == 1 ) {
                    mstoryTextView.setText(R.string.T3_Story);
                    mtopButton.setText(R.string.T3_Ans1);
                    mbottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3 || mStoryIndex == 6 ){
                    mstoryTextView.setText(R.string.T6_End);
                    mtopButton.setVisibility(View.GONE);
                    mbottomButton.setVisibility(View.GONE);

                } else  if (mStoryIndex == 2 ){
                    mstoryTextView.setText(R.string.T3_Story);
                    mtopButton.setText(R.string.T3_Ans1);
                    mbottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 6;
                } 



            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mbottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    mstoryTextView.setText(R.string.T2_Story);
                    mtopButton.setText(R.string.T2_Ans1);
                    mbottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2){
                    mstoryTextView.setText(R.string.T4_End);
                    mtopButton.setVisibility(View.GONE);
                    mbottomButton.setVisibility(View.GONE);

                } else if (mStoryIndex == 3 || mStoryIndex == 6 ){
                    mstoryTextView.setText(R.string.T5_End);
                    mtopButton.setVisibility(View.GONE);
                    mbottomButton.setVisibility(View.GONE);
                }
            }
        });


    }


}
