package com.example.gurucares.fragmentclass;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gurucares.R;
import com.example.gurucares.modelclass.chapter_model;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link addchapter#newInstance} factory method to
 * create an instance of this fragment.
 */
public class addchapter extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    int check_for_browsebtn = 1;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ImageView removepdfbtn, pdfpic,browsepic;
    TextView browsebtn, addbtn;
    EditText chapterdescription, chaptertitle;

    String schoolname, sectioncode , gradecode, studentcode, subjectname;

    StorageReference storagereference;
    DatabaseReference databaseReference;


    Uri filepath;



    public addchapter() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment addchapter.
     */
    // TODO: Rename and change types and number of parameters
    public static addchapter newInstance(String param1, String param2) {
        addchapter fragment = new addchapter();
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
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_addchapter, container, false);


        Bundle bundle = this.getArguments();
        schoolname = bundle.getString("schoolname");
        sectioncode = bundle.getString("sectioncode");
        gradecode = bundle.getString("gradecode");
        studentcode = bundle.getString("studentcode");
        subjectname = bundle.getString("subjectname");

        removepdfbtn = (ImageView) v.findViewById(R.id.removepdfbtn);
        pdfpic = (ImageView) v.findViewById(R.id.pdfpic);
        browsepic = (ImageView) v.findViewById(R.id.browsepic);
        browsebtn = (TextView) v.findViewById(R.id.browsebtn);
        chaptertitle = (EditText) v.findViewById(R.id.titlename);
        chapterdescription = (EditText) v.findViewById(R.id.description);
        addbtn = (TextView) v.findViewById(R.id.addbtn);





        browsebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*browsepic.setVisibility(View.GONE);
                removepdfbtn.setVisibility(View.VISIBLE);
                pdfpic.setVisibility(View.VISIBLE);
                browsebtn.setVisibility(View.GONE);*/
                Dexter.withContext(getContext()).withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent i=new Intent();
                                i.setType("application/pdf");
                                i.setAction(Intent.ACTION_GET_CONTENT);
                                startActivityForResult(Intent.createChooser(i,"Select Pdf Files"),101);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                permissionToken.continuePermissionRequest();
                            }
                        }).check();




            }
        });


        removepdfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pdfpic.setVisibility(View.GONE);
                browsepic.setVisibility(View.VISIBLE);
                browsebtn.setVisibility(View.VISIBLE);
                removepdfbtn.setVisibility(View.GONE);

            }
        });
        
        
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //process(filepath);


                if(filepath == null)
                {
                    Toast.makeText(getContext(), "null", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getContext(), "filepath", Toast.LENGTH_SHORT).show();

                    final ProgressDialog pd=new ProgressDialog(getContext());
                    pd.setTitle("File Uploading....!!!");
                    pd.show();

                    StorageReference reference = storagereference.child("uploads/" + System.currentTimeMillis() + " .pdf");
                    reference.putFile(filepath)
                            .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                                @Override
                                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                                    reference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                                        @Override
                                        public void onSuccess(Uri uri) {

                                            chapter_model model = new chapter_model(chaptertitle.getText().toString(), chapterdescription.getText().toString(), uri.toString());
                                            FirebaseDatabase db = FirebaseDatabase.getInstance();
                                            databaseReference = db.getReference().child("schools").child(schoolname).child("100").child(gradecode).child("subjects").child("subjectname").child("chapters");
                                            databaseReference.child("chapter3").setValue(model);

                                            pdfpic.setVisibility(View.GONE);
                                            browsepic.setVisibility(View.VISIBLE);
                                            browsebtn.setVisibility(View.VISIBLE);
                                            removepdfbtn.setVisibility(View.GONE);


                                        }
                                    });



                                }
                            })
                            .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                                @Override
                                public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {

                                    float percent=(100*snapshot.getBytesTransferred())/snapshot.getTotalByteCount();
                                    pd.setMessage("Uploaded :"+(int)percent+"%");



                                }
                            });



                }
                //Putting pdf file on storage of firebase
                /*StorageReference reference = storagereference.child("uploads/" + System.currentTimeMillis() + " .pdf");
                reference.putFile(filepath)
                        .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                            @Override
                            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                                reference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                                    @Override
                                    public void onSuccess(Uri uri) {

                                        chapter_model model = new chapter_model(chaptertitle.getText().toString(), chapterdescription.getText().toString(), uri.toString());
                                        FirebaseDatabase db = FirebaseDatabase.getInstance();
                                        databaseReference = db.getReference().child("schools").child(schoolname).child("100").child(gradecode).child("subjects").child("subjectname").child("chapters");
                                        databaseReference.child("chapter3").setValue(model);

                                        pdfpic.setVisibility(View.GONE);
                                        browsepic.setVisibility(View.VISIBLE);
                                        browsebtn.setVisibility(View.VISIBLE);
                                        removepdfbtn.setVisibility(View.GONE);


                                    }
                                });



                            }
                        })
                        .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                            @Override
                            public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {

                                float percent=(100*snapshot.getBytesTransferred())/snapshot.getTotalByteCount();
                                pd.setMessage("Uploaded :"+(int)percent+"%");



                            }
                        });
*/


                

            }
        });



        return v;
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(filepath == null)
        {
            Toast.makeText(getContext(), "Null filepath", Toast.LENGTH_SHORT).show();
        }


        if(requestCode == 101 && resultCode==getActivity().RESULT_OK)
        {
            //Toast.makeText(getContext(), filepath.toString(), Toast.LENGTH_SHORT).show();
            filepath = data.getData();

            if(filepath == null)
            {
                Toast.makeText(getContext(), "Null filepath", Toast.LENGTH_SHORT).show();
            }
            browsepic.setVisibility(View.GONE);
            removepdfbtn.setVisibility(View.VISIBLE);
            pdfpic.setVisibility(View.VISIBLE);
            browsebtn.setVisibility(View.GONE);
        }
    }

   /* @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
        if(requestCode == 101)
        {
            filepath = intent.getData();
            browsepic.setVisibility(View.GONE);
            removepdfbtn.setVisibility(View.VISIBLE);
            pdfpic.setVisibility(View.VISIBLE);
            browsebtn.setVisibility(View.GONE);
        }


    }*/

    /*public void process(Uri filepath)
    {
        final ProgressDialog pd=new ProgressDialog(getContext());
        pd.setTitle("File Uploading....!!!");
        pd.show();

        //Putting pdf file on storage of firebase
        StorageReference reference = storagereference.child("uploads/" + System.currentTimeMillis() + " .pdf");
        reference.putFile(filepath)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                        reference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {

                                chapter_model model = new chapter_model(chaptertitle.getText().toString(), chapterdescription.getText().toString(), uri.toString());
                                FirebaseDatabase db = FirebaseDatabase.getInstance();
                                databaseReference = db.getReference().child("schools").child(schoolname).child("100").child(gradecode).child("subjects").child("subjectname").child("chapters");
                                databaseReference.child("chapter3").setValue(model);

                                pdfpic.setVisibility(View.GONE);
                                browsepic.setVisibility(View.VISIBLE);
                                browsebtn.setVisibility(View.VISIBLE);
                                removepdfbtn.setVisibility(View.GONE);


                            }
                        });



                    }
                })
                .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {

                        float percent=(100*snapshot.getBytesTransferred())/snapshot.getTotalByteCount();
                        pd.setMessage("Uploaded :"+(int)percent+"%");



                    }
                });
    }*/
}