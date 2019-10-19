package com.leknos.wordsgenerator2;

import android.os.Bundle;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TestFragment extends Fragment {
    private TextView word;
    private TextView translateWord;
    private CoordinatorLayout coordinatorLayout;
    private static int wordRandomNumber = 0;
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_test, container, false);
        word = v.findViewById(R.id.word);
        word.setText("");
        translateWord = v.findViewById(R.id.translate_word);
        translateWord.setText("");
        coordinatorLayout = v.findViewById(R.id.testFrag);

        coordinatorLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getActionMasked()) {
                    case MotionEvent.ACTION_DOWN:
                        // check if we want to handle touch events, return true
                        // else don't handle further touch events, return false
                        return true;
                    // ... handle other cases

                    case MotionEvent.ACTION_UP:
                        wordRandomNumber++;
                        word.setText(wordRandomNumber+"");
                        //word.setText(wordsList.get(wordRandomNumber));
                        //translateWord.setText(translateWordsList.get(wordRandomNumber));
                        return true;
                    case MotionEvent.ACTION_CANCEL:
                        // finish handling touch events
                        // note that these methods won't be called if 'false' was returned
                        // from any previous events related to the gesture
                        break;
                }
                return true;
            }
        });

        return v;
    }


}
