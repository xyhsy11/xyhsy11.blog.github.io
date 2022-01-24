package com.cur.garbageClassification;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cur.garbageClassification.dao.MyDataBaseHelper;
import com.cur.garbageClassification.entity.Books;
import com.cur.garbageClassification.utils.RomUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SelfActivity extends AppCompatActivity {

    @BindView(R.id.profile)
     ImageView profile;
    @BindView(R.id.sqlite)
    LinearLayout sqlite;
    @BindView(R.id.add)
    TextView add;
    private MyDataBaseHelper myDataBaseHelper;
    @BindView(R.id.query)
    TextView query;

    public static final String TAG = "SelfActivity";
    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_self);
        ButterKnife.bind(this);

        myDataBaseHelper = new MyDataBaseHelper(this,"BookStore.db",null,1);


        query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = myDataBaseHelper.getWritableDatabase();
                Cursor cursor = db.query("book",null,null,null,null,null,null);
                if(cursor.moveToFirst()){
                    do{
                        String name = cursor.getString(cursor.getColumnIndex("name"));
                        String author = cursor.getString(cursor.getColumnIndex("author"));
                        int pages = cursor.getInt(cursor.getColumnIndex("pages"));
                        double price = cursor.getDouble(cursor.getColumnIndex("price"));
                        Books books = new Books(name,author,pages,price);
                        Log.i(TAG, "onClick: ===="+books.toString());
                        Toast.makeText(SelfActivity.this,books.toString(),Toast.LENGTH_SHORT).show();
                    }while(cursor.moveToNext());
                }
            }
        });
        sqlite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDataBaseHelper.getWritableDatabase();

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = myDataBaseHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put("name","The Da Vinci Code");
                values.put("author","Dan");
                values.put("pages",9);
                values.put("price",0.9);
                db.insert("book",null,values);

                values.clear();
                values.put("name","symbol");
                values.put("author","p");
                values.put("pages",8);
                values.put("price",0.8);
                db.insert("book",null,values);



            }
        });
       profile.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Log.i(TAG, "onClick: ----------------------");

           }
       });


    }

    @Override
    protected void onStart() {
        super.onStart();
        RomUtils.setAndroidNativeLightStatusBar(this,true);
    }
}
