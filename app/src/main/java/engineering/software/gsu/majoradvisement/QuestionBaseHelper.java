package engineering.software.gsu.majoradvisement;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import engineering.software.gsu.majoradvisement.QuestionDbSchema.*;

public class QuestionBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "question.db";

    public QuestionBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.game_master_table +
                        "(" + gamemaster_Table.GameMasterCols.user_name +
                        "," + gamemaster_Table.GameMasterCols.password +
                        "," + gamemaster_Table.GameMasterCols.fun +
                        "," + gamemaster_Table.GameMasterCols.global_ce_score +
                        "," + gamemaster_Table.GameMasterCols.global_cs_score +
                        "," + gamemaster_Table.GameMasterCols.global_is_score +
                        "," + gamemaster_Table.GameMasterCols.global_it_score +
                        "," + gamemaster_Table.GameMasterCols.global_score + ");"

        );

        ContentValues contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.GameMasterCols.user_name, "abc");
        contentValues.put(gamemaster_Table.GameMasterCols.password, "123");
        contentValues.put(gamemaster_Table.GameMasterCols.fun, 0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_score, 0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_cs_score, 0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_it_score, 0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_is_score, 0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_ce_score, 0);
        sqLiteDatabase.insert(gamemaster_Table.game_master_table, null, contentValues);


        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.answer_table +
                        "(" + gamemaster_Table.answer_cols.text +
                        "," + gamemaster_Table.answer_cols.score +
                        "," + gamemaster_Table.answer_cols.csRating +
                        "," + gamemaster_Table.answer_cols.itRating +
                        "," + gamemaster_Table.answer_cols.isRating +
                        "," + gamemaster_Table.answer_cols.ceRating +
                        "," + gamemaster_Table.answer_cols.answer_id + ");"
        );

        ContentValues contentValues1 = new ContentValues();
        contentValues1.put(gamemaster_Table.answer_cols.text, "Java");
        contentValues1.put(gamemaster_Table.answer_cols.score, 0);
        contentValues1.put(gamemaster_Table.answer_cols.score, 0);
        contentValues1.put(gamemaster_Table.answer_cols.csRating, 8);
        contentValues1.put(gamemaster_Table.answer_cols.isRating, 10);
        contentValues1.put(gamemaster_Table.answer_cols.ceRating, 3);
        contentValues1.put(gamemaster_Table.answer_cols.answer_id, 1);


        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(gamemaster_Table.answer_cols.text, "Snake");
        contentValues2.put(gamemaster_Table.answer_cols.score, 10);
        contentValues2.put(gamemaster_Table.answer_cols.score, 10);
        contentValues2.put(gamemaster_Table.answer_cols.csRating, 1);
        contentValues2.put(gamemaster_Table.answer_cols.isRating, 2);
        contentValues2.put(gamemaster_Table.answer_cols.ceRating, 4);
        contentValues2.put(gamemaster_Table.answer_cols.answer_id, 1);

        ContentValues contentValues3 = new ContentValues();
        contentValues3.put(gamemaster_Table.answer_cols.text, "Swift");
        contentValues3.put(gamemaster_Table.answer_cols.score, 0);
        contentValues3.put(gamemaster_Table.answer_cols.score, 0);
        contentValues3.put(gamemaster_Table.answer_cols.csRating, 8);
        contentValues3.put(gamemaster_Table.answer_cols.isRating, 10);
        contentValues3.put(gamemaster_Table.answer_cols.ceRating, 3);
        contentValues3.put(gamemaster_Table.answer_cols.answer_id, 1);


        ContentValues contentValues4 = new ContentValues();
        contentValues4.put(gamemaster_Table.answer_cols.text, "Ruby");
        contentValues4.put(gamemaster_Table.answer_cols.score, 0);
        contentValues4.put(gamemaster_Table.answer_cols.score, 0);
        contentValues4.put(gamemaster_Table.answer_cols.csRating, 8);
        contentValues4.put(gamemaster_Table.answer_cols.isRating, 10);
        contentValues4.put(gamemaster_Table.answer_cols.ceRating, 3);
        contentValues4.put(gamemaster_Table.answer_cols.answer_id, 1);

        ContentValues contentValues5 = new ContentValues();
        contentValues5.put(gamemaster_Table.answer_cols.text, "Linux");
        contentValues5.put(gamemaster_Table.answer_cols.score, 0);
        contentValues5.put(gamemaster_Table.answer_cols.score, 6);
        contentValues5.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues5.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues5.put(gamemaster_Table.answer_cols.ceRating, 1);
        contentValues5.put(gamemaster_Table.answer_cols.answer_id, 2);

        ContentValues contentValues6 = new ContentValues();
        contentValues6.put(gamemaster_Table.answer_cols.text, "Windows");
        contentValues6.put(gamemaster_Table.answer_cols.score, 0);
        contentValues6.put(gamemaster_Table.answer_cols.score, 0);
        contentValues6.put(gamemaster_Table.answer_cols.csRating, 4);
        contentValues6.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues6.put(gamemaster_Table.answer_cols.ceRating, 1);
        contentValues6.put(gamemaster_Table.answer_cols.answer_id, 2);


        ContentValues contentValues7 = new ContentValues();
        contentValues7.put(gamemaster_Table.answer_cols.text, "Firefox");
        contentValues7.put(gamemaster_Table.answer_cols.score, 0);
        contentValues7.put(gamemaster_Table.answer_cols.score, 0);
        contentValues7.put(gamemaster_Table.answer_cols.csRating, 10);
        contentValues7.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues7.put(gamemaster_Table.answer_cols.ceRating, 7);
        contentValues7.put(gamemaster_Table.answer_cols.answer_id, 2);

        ContentValues contentValues8 = new ContentValues();
        contentValues8.put(gamemaster_Table.answer_cols.text, "Unix");
        contentValues8.put(gamemaster_Table.answer_cols.score, 0);
        contentValues8.put(gamemaster_Table.answer_cols.score, 6);
        contentValues8.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues8.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues8.put(gamemaster_Table.answer_cols.ceRating, 1);
        contentValues8.put(gamemaster_Table.answer_cols.answer_id, 2);

        ContentValues contentValues9 = new ContentValues();
        contentValues9.put(gamemaster_Table.answer_cols.text, "Hardware");
        contentValues9.put(gamemaster_Table.answer_cols.score, 6);
        contentValues9.put(gamemaster_Table.answer_cols.score, 6);
        contentValues9.put(gamemaster_Table.answer_cols.csRating, 10);
        contentValues9.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues9.put(gamemaster_Table.answer_cols.ceRating, 1);
        contentValues9.put(gamemaster_Table.answer_cols.answer_id, 3);

        ContentValues contentValues10 = new ContentValues();
        contentValues10.put(gamemaster_Table.answer_cols.text, "Software");
        contentValues10.put(gamemaster_Table.answer_cols.score, 6);
        contentValues10.put(gamemaster_Table.answer_cols.score, 10);
        contentValues10.put(gamemaster_Table.answer_cols.csRating, 4);
        contentValues10.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues10.put(gamemaster_Table.answer_cols.ceRating, 5);
        contentValues10.put(gamemaster_Table.answer_cols.answer_id, 3);

        ContentValues contentValues11 = new ContentValues();
        contentValues11.put(gamemaster_Table.answer_cols.text, "Both");
        contentValues11.put(gamemaster_Table.answer_cols.score, 6);
        contentValues11.put(gamemaster_Table.answer_cols.score, 6);
        contentValues11.put(gamemaster_Table.answer_cols.csRating, 5);
        contentValues11.put(gamemaster_Table.answer_cols.isRating, 6);
        contentValues11.put(gamemaster_Table.answer_cols.ceRating, 10);
        contentValues11.put(gamemaster_Table.answer_cols.answer_id, 3);

        ContentValues contentValues12 = new ContentValues();
        contentValues12.put(gamemaster_Table.answer_cols.text, "Neither");
        contentValues12.put(gamemaster_Table.answer_cols.score, 6);
        contentValues12.put(gamemaster_Table.answer_cols.score, 6);
        contentValues12.put(gamemaster_Table.answer_cols.csRating, 10);
        contentValues12.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues12.put(gamemaster_Table.answer_cols.ceRating, 2);
        contentValues12.put(gamemaster_Table.answer_cols.answer_id, 3);

        ContentValues contentValues13 = new ContentValues();
        contentValues13.put(gamemaster_Table.answer_cols.text, "Memory");
        contentValues13.put(gamemaster_Table.answer_cols.score, 6);
        contentValues13.put(gamemaster_Table.answer_cols.score, 2);
        contentValues13.put(gamemaster_Table.answer_cols.csRating, 8);
        contentValues13.put(gamemaster_Table.answer_cols.isRating, 2);
        contentValues13.put(gamemaster_Table.answer_cols.ceRating, 8);
        contentValues13.put(gamemaster_Table.answer_cols.answer_id, 4);

        ContentValues contentValues14 = new ContentValues();
        contentValues14.put(gamemaster_Table.answer_cols.text, "Storage");
        contentValues14.put(gamemaster_Table.answer_cols.score, 6);
        contentValues14.put(gamemaster_Table.answer_cols.score, 0);
        contentValues14.put(gamemaster_Table.answer_cols.csRating, 6);
        contentValues14.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues14.put(gamemaster_Table.answer_cols.ceRating, 4);
        contentValues14.put(gamemaster_Table.answer_cols.answer_id, 4);

        ContentValues contentValues15 = new ContentValues();
        contentValues15.put(gamemaster_Table.answer_cols.text, "Input");
        contentValues15.put(gamemaster_Table.answer_cols.score, 6);
        contentValues15.put(gamemaster_Table.answer_cols.score, 2);
        contentValues15.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues15.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues15.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues15.put(gamemaster_Table.answer_cols.answer_id, 4);

        ContentValues contentValues16 = new ContentValues();
        contentValues16.put(gamemaster_Table.answer_cols.text, "Output");
        contentValues16.put(gamemaster_Table.answer_cols.score, 10);
        contentValues16.put(gamemaster_Table.answer_cols.score, 2);
        contentValues16.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues16.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues16.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues16.put(gamemaster_Table.answer_cols.answer_id, 4);

        //do an insert statement for each answer for each question
        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.image_table +
                        "(" + gamemaster_Table.image_cols.leftAnswer +
                        "," + gamemaster_Table.image_cols.rightAnswer +
                        "," + gamemaster_Table.image_cols.imgID +
                        "," + gamemaster_Table.image_cols.answers_id +
                        ");"
        );

        // FIXME Ken: add images and also add the corresponding answer to the answer table
        /*sqLiteDatabase.execSQL(

            Insert the values for the image table
        );
        */

        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.swipe_table +
                        "(" + gamemaster_Table.swipe_cols.textLeft +
                        "," + gamemaster_Table.swipe_cols.textRight + ", " +
                        gamemaster_Table.swipe_cols.answers_id + ", " +
                        gamemaster_Table.swipe_cols.fun +
                        ");"
        );

        ContentValues contentValues17 = new ContentValues();
        contentValues17.put(gamemaster_Table.swipe_cols.textLeft, "Computer Science");
        contentValues17.put(gamemaster_Table.swipe_cols.textRight, "Information Technology");
        contentValues17.put(gamemaster_Table.swipe_cols.answers_id, R.raw.code_image);
        contentValues17.put(gamemaster_Table.swipe_cols.fun, R.raw.hardware_image);


        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.ratequestion_table +
                        "(" + gamemaster_Table.ratequestion_cols.text +
                        "," + gamemaster_Table.ratequestion_cols.score +
                        "," + gamemaster_Table.ratequestion_cols.cs +
                        "," + gamemaster_Table.ratequestion_cols.it +
                        "," + gamemaster_Table.ratequestion_cols.is +
                        "," + gamemaster_Table.ratequestion_cols.ce + ", " +
                        gamemaster_Table.ratequestion_cols.fun + "," + gamemaster_Table.ratequestion_cols.focus +
                        ");"
        );

        ContentValues contentValues18 = new ContentValues();
        contentValues18.put(gamemaster_Table.ratequestion_cols.text, "How would you rate your math skills?");
        contentValues18.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues18.put(gamemaster_Table.ratequestion_cols.cs, 7);
        contentValues18.put(gamemaster_Table.ratequestion_cols.it, 3);
        contentValues18.put(gamemaster_Table.ratequestion_cols.is, 0);
        contentValues18.put(gamemaster_Table.ratequestion_cols.ce, 10);
        contentValues18.put(gamemaster_Table.ratequestion_cols.fun, 1);
        contentValues18.put(gamemaster_Table.ratequestion_cols.focus, 1);

        ContentValues contentValues19 = new ContentValues();
        contentValues19.put(gamemaster_Table.ratequestion_cols.text, "How would you rate your critical thinking skills?'");
        contentValues19.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues19.put(gamemaster_Table.ratequestion_cols.cs, 7);
        contentValues19.put(gamemaster_Table.ratequestion_cols.it, 3);
        contentValues19.put(gamemaster_Table.ratequestion_cols.is, 0);
        contentValues19.put(gamemaster_Table.ratequestion_cols.ce, 10);
        contentValues19.put(gamemaster_Table.ratequestion_cols.fun, 1);
        contentValues19.put(gamemaster_Table.ratequestion_cols.focus, 2);

        ContentValues contentValues20 = new ContentValues();
        contentValues20.put(gamemaster_Table.ratequestion_cols.text, "How often do you do you build technology related items?");
        contentValues20.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues20.put(gamemaster_Table.ratequestion_cols.cs, 7);
        contentValues20.put(gamemaster_Table.ratequestion_cols.it, 3);
        contentValues20.put(gamemaster_Table.ratequestion_cols.is, 0);
        contentValues20.put(gamemaster_Table.ratequestion_cols.ce, 10);
        contentValues20.put(gamemaster_Table.ratequestion_cols.fun, 3);
        contentValues20.put(gamemaster_Table.ratequestion_cols.focus, 3);

        ContentValues contentValues21 = new ContentValues();
        contentValues21.put(gamemaster_Table.ratequestion_cols.text, "How often do you program computers?");
        contentValues21.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues21.put(gamemaster_Table.ratequestion_cols.cs, 7);
        contentValues21.put(gamemaster_Table.ratequestion_cols.it, 3);
        contentValues21.put(gamemaster_Table.ratequestion_cols.is, 0);
        contentValues21.put(gamemaster_Table.ratequestion_cols.ce, 10);
        contentValues21.put(gamemaster_Table.ratequestion_cols.fun, 4);
        contentValues21.put(gamemaster_Table.ratequestion_cols.focus, 4);


        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.textquestion_table +
                        "(" + gamemaster_Table.textquestion_cols.text +
                        "," + gamemaster_Table.textquestion_cols.answer_id + ", " +
                        gamemaster_Table.textquestion_cols.fun + ", " + gamemaster_Table.textquestion_cols.focus +
                        ");"
        );


        ContentValues contentValues22 = new ContentValues();
        contentValues22.put(gamemaster_Table.textquestion_cols.text, "Which one of these are not a programming language?");
        contentValues22.put(gamemaster_Table.textquestion_cols.answer_id, 1);
        contentValues22.put(gamemaster_Table.textquestion_cols.fun, 1);
        contentValues22.put(gamemaster_Table.textquestion_cols.focus, 1);


        ContentValues contentValues23 = new ContentValues();
        contentValues23.put(gamemaster_Table.textquestion_cols.text, "Which one of these are not an Operating System?");
        contentValues23.put(gamemaster_Table.textquestion_cols.answer_id, 2);
        contentValues23.put(gamemaster_Table.textquestion_cols.fun, 2);
        contentValues23.put(gamemaster_Table.textquestion_cols.focus, 3);

        ContentValues contentValues24 = new ContentValues();
        contentValues24.put(gamemaster_Table.textquestion_cols.text, "Would you rather work with the hardware or the software components of a computer?");
        contentValues24.put(gamemaster_Table.textquestion_cols.answer_id, 3);
        contentValues24.put(gamemaster_Table.textquestion_cols.fun, 3);
        contentValues24.put(gamemaster_Table.textquestion_cols.focus, 4);

        ContentValues contentValues25 = new ContentValues();
        contentValues25.put(gamemaster_Table.textquestion_cols.text, "____ is the area of a computer that temporarily holds data that is waiting to be processed, stored, or output?");
        contentValues25.put(gamemaster_Table.textquestion_cols.answer_id, 4);
        contentValues25.put(gamemaster_Table.textquestion_cols.fun, 4);
        contentValues25.put(gamemaster_Table.textquestion_cols.focus, 2);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
