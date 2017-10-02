package edu.stevens.hptg.viewpagerpractice;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by hptg on 2017/10/1.
 */

public class PageFragment extends Fragment {


    public static final String KEY_PAGE = "page";

    private TextView textView;

    @NonNull
    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(KEY_PAGE, page);

        PageFragment pagefragment = new PageFragment();
        pagefragment.setArguments(args);
        return pagefragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page_fragment,container,false);
        textView = (TextView) view.findViewById(R.id.text_view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        int page = getArguments().getInt(KEY_PAGE);
        textView.setText("Page" + page);
    }
}
