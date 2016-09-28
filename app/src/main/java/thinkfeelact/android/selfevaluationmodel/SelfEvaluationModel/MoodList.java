package thinkfeelact.android.selfevaluationmodel.SelfEvaluationModel;

import android.content.res.TypedArray;
import android.widget.ArrayAdapter;

/**
 * Created by viv on 24/08/2016.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MoodList extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] moodText;
    private final TypedArray moodID;
    ImageView imageView;
    public MoodList(Activity context,String[] moodText, TypedArray moodID) {
        super(context, R.layout.list_single, moodText);
        this.context = context;
        this.moodText = moodText;
        this.moodID = moodID;
    }
    @Override
    public View getView(int pos, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(moodText[pos]);

        imageView.setImageResource(moodID.getResourceId(pos, -1));
        return rowView;
    }
}

