package fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.my.csresources.R;
import com.my.csresources.WebviewActivity;

/*  A simple {@link Fragment} subclass.
  Use the {@link Sem1Fragment#newInstance} factory method to
  create an instance of this fragment.
 */
public class Sem1Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public Button s1sub1,s1sub2,s1sub3,s1sub4,s1sub5,s1sub6,s1sub7;

   public Sem1Fragment() {

        // Required empty public constructor
    }


  //   * Use this factory method to create a new instance of
    // * this fragment using the provided parameters.

     /** @param param1 Parameter 1.
   @param param2 Parameter 2.
     * @return A new instance of fragment Sem1Fragment.
     */
   // TODO: Rename and change types and number of parameters
    public static Sem1Fragment newInstance(String param1, String param2) {
        Sem1Fragment fragment = new Sem1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

   }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_sem1,container,false);
        s1sub1 =v.findViewById(R.id.s1sub1);

        s1sub1.setOnClickListener(new View.OnClickListener() {
          @Override
        public void onClick(View v) {
             // Toast.makeText(getActivity(),"yupp button is working",Toast.LENGTH_LONG).show();

             String url ="https://drive.google.com/file/d/1sbE9AeFOo-B_XPc0vWZYnBviaKV1R_5E/view?usp=sharing";
                Intent intent =new Intent(getActivity(), WebviewActivity.class);
                intent.putExtra("url",url);
               startActivity(intent);
            }
        });
        s1sub2 = v.findViewById(R.id.s1sub2);

        s1sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/file/d/1RM6BOahcr66Ov0tHJtYl4YikOUbcTh41/view?usp=sharing";
                Intent intent = new Intent(getActivity(),WebviewActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });

        s1sub2 = v.findViewById(R.id.s1sub2);

        s1sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/file/d/1RM6BOahcr66Ov0tHJtYl4YikOUbcTh41/view?usp=sharing";
                Intent intent = new Intent(getActivity(),WebviewActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });

        s1sub3 = v.findViewById(R.id.s1sub3);

        s1sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/file/d/12Ft_Wqxy5sZC6L0PnKWLXfls7MCTtgi9/view?usp=sharing";
                Intent intent = new Intent(getActivity(),WebviewActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });

        s1sub4 = v.findViewById(R.id.s1sub4);

        s1sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/file/d/1QIHfL1O1Y9RaJVAgNkRfVHncxM7f58Al/view?usp=sharing";
                Intent intent = new Intent(getActivity(),WebviewActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });

        s1sub5 = v.findViewById(R.id.s1sub5);

        s1sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/file/d/1MKjYudjvUaCh9x7Eu-X4RpVJ1lS2lSuG/view?usp=sharing";
                Intent intent = new Intent(getActivity(),WebviewActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });
        s1sub6 = v.findViewById(R.id.s1sub6);

        s1sub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/file/d/1vg4hpZHchB0SylX7QfmQbZyxek1Zq0N9/view?usp=sharing";
                Intent intent = new Intent(getActivity(),WebviewActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });
        s1sub7 = v.findViewById(R.id.s1sub7);

        s1sub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/file/d/1tqX5_a-1NdwBp8Hg2inA3BCkm11Ht8_R/view?usp=sharing";
                Intent intent = new Intent(getActivity(),WebviewActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });






        // Inflate the layout for this fragment
   return v;
    }

}







