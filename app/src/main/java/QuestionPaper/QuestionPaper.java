package QuestionPaper;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.my.csresources.EbookData;
import com.my.csresources.R;

import java.util.ArrayList;
import java.util.List;

public class QuestionPaper extends AppCompatActivity {
    private RecyclerView ebookRecycler;
    private DatabaseReference reference;
    private List<EbookData> list;
    private QuestionPaperAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_paper);

        ebookRecycler = findViewById(R.id.qpRecycler);
        reference = FirebaseDatabase.getInstance().getReference().child("QP");
        getData();
    }
    private void getData() {
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list =new ArrayList<>();
                for  (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    EbookData data =snapshot.getValue(EbookData.class);
                    list.add(data);

                }
                adapter =new QuestionPaperAdapter(QuestionPaper.this,list);
                ebookRecycler.setLayoutManager(new LinearLayoutManager(QuestionPaper.this));
                ebookRecycler.setAdapter(adapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(QuestionPaper.this, error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

}