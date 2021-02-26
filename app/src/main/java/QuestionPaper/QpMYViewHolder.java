package QuestionPaper;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my.csresources.R;

public class QpMYViewHolder  extends RecyclerView.ViewHolder{


public TextView mname;
public Button mDownload;

public QpMYViewHolder(@NonNull View itemView) {
        super(itemView);

        mname =itemView.findViewById(R.id.qpName);
        mDownload =itemView.findViewById(R.id.qpDownload);

        }
        }